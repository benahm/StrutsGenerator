package dsml.struts.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

import javax.management.IntrospectionException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;

import dsml.struts.templates.ActionFormTemplate;
import dsml.struts.templates.ActionTemplate;
import dsml.struts.templates.ConcretDAOTemplate;
import dsml.struts.templates.ConnectionFactoryTemplate;
import dsml.struts.templates.DAOFactoryTemplate;
import dsml.struts.templates.DAOTemplate;
import dsml.struts.templates.DTOListTemplate;
import dsml.struts.templates.POJOTemplate;
import dsml.struts.templates.PageTemplate;
import dsml.struts.templates.ResourcesTemplate;
import dsml.struts.templates.StrutsConfigTemplate;
import dsml.struts.templates.WebTemplate;
import dsml.struts.toolbox.Tools;
import dsml.struts.toolbox.XMI;
import dsml.web.Form;
import dsml.web.Page;
import dsml.web.Website;

public class Generator {
	private Website website;
	private String projectPath = "../testDrive";
	private String packageName = "src/dsml/struts";
	private String packagePath = projectPath + "/" + packageName;
	private String filePath = "model/My.web";
	private Class<?>[] classes;

	public Generator(String filePath, String projectPath) {
		this.filePath = filePath;
		this.projectPath = projectPath;
		this.packagePath = projectPath + "/" + packageName;
	}

	public void generateDBPart() {

		try {
			website = XMI.loadWebsite(new File(filePath));
			if (website == null)
				return;
			ArrayList<Form> forms = Tools.getFormsFromWebsite(website);

			// gen POJO
			for (Form form : forms) {
				generatePOJO(form);
			}

			// Load POJO classes
			if (forms.size() != 0) {
				classes = loadClasses();

				// gen ConnectionFactory
				generateConnectionFactory();

				// gen DAO
				generateAbstractDAO();

				// gen DAOFactory
				generateDAOFactory(classes);

				// gen Concret DAO
				for (Class<?> clazz : classes) {
					generateConcretDAO(clazz);

				}
				// gen DTOList
				for (Class<?> clazz : classes) {
					generateDTOList(clazz);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}

	public void generateStrutsPart() {
		try {
			copyJars();
			if (website == null)
				return;
			EList<Page> pages = website.getPages();
			generateWebXML(website.getName());

			generateStrutsConfig();

			if (classes != null) {
				for (Class<?> clazz : classes) {
					generateActionForm(clazz);
					generateAction(clazz);
				}
			}
			generateRessources();
			for (Page page : pages) {
				generatePage(page);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void copyJars() throws IOException {
		File file = new File(projectPath + "/WebContent/WEB-INF/lib");
		file.mkdirs();
		Tools.copyFolder(getResources("lib"), new File(projectPath
				+ "/WebContent/WEB-INF/lib"));
		// Tools.copyFolder(new File("lib"), new File(projectPath+
		// "/WebContent/WEB-INF/lib"));
	}

	private void generateConnectionFactory() throws IOException {
		ConnectionFactoryTemplate connection = ConnectionFactoryTemplate
				.create("\n");
		String path = packagePath + "/domain/dao/ConnectionFactory.java";
		File file = new File(packagePath + "/domain/dao");
		file.mkdirs();
		FileWriter connectionFactoryWriter = new FileWriter(path);
		connectionFactoryWriter.write(connection.generate(null));
		connectionFactoryWriter.close();
	}

	private void generateStrutsConfig() throws IOException {
		StrutsConfigTemplate struts_configTemp = StrutsConfigTemplate
				.create("\n");
		String path = projectPath + "/WebContent/WEB-INF/struts-config.xml";
		File file = new File(projectPath + "/WebContent/WEB-INF");
		file.mkdirs();
		FileWriter struts_configWriter = new FileWriter(path);
		struts_configWriter.write(struts_configTemp.generate(website));
		struts_configWriter.close();
	}

	private void generateDTOList(Class<?> clazz) throws IOException {
		String path = packagePath + "/domain/dao/" + "DTOList"
				+ clazz.getSimpleName() + ".java";
		File file = new File(packagePath + "/domain/dao");
		if (file.exists()) {
			FileWriter concretDAOWriter = new FileWriter(path);
			if (file.exists()) {
				DTOListTemplate concretDAO = DTOListTemplate.create("\n");
				concretDAOWriter.write(concretDAO.generate(clazz));
				concretDAOWriter.close();
			}
		}
	}

	private void generateDAOFactory(Class<?>[] classes) throws IOException {
		DAOFactoryTemplate fac = DAOFactoryTemplate.create("\n");
		String path = packagePath + "/domain/dao/DAOFactory.java";
		File file = new File(packagePath + "/domain/dao");
		file.mkdirs();
		FileWriter DAOFactoryWriter = new FileWriter(path);
		DAOFactoryWriter.write(fac.generate(classes));
		DAOFactoryWriter.close();
	}

	private void generateConcretDAO(Class<?> clazz) throws IOException {
		String path = packagePath + "/domain/dao/" + clazz.getSimpleName()
				+ "DAO.java";
		File file = new File(packagePath + "/domain/dao");
		if (file.exists()) {
			FileWriter concretDAOWriter = new FileWriter(path);
			if (file.exists()) {
				ConcretDAOTemplate concretDAO = ConcretDAOTemplate.create("\n");
				concretDAOWriter.write(concretDAO.generate(clazz));
				concretDAOWriter.close();
			}
		}
	}

	private Class<?>[] loadClasses() {
		ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
		try {
			File classpath = new File(projectPath + "/build/classes/");
			// convert the file to URL format
			URL url = classpath.toURI().toURL();

			// load this folder into Class loader
			ClassLoader cl = ClassLoader.getSystemClassLoader();
			// load the Address class in 'c:\\other_classes\\'
			File[] files = new File(packagePath + "/domain").listFiles();
			for (File file : files) {
				String aPath = file.getPath();
				System.out.println(aPath);
				if (aPath.endsWith(".java")) {
					addURL(url);
					compile(aPath);
					System.out.println("---------------");
					aPath = aPath.substring(aPath.lastIndexOf("/") + 1,
							aPath.lastIndexOf("."));
					System.out.println(aPath);
					printClassPath();
					Class<?> loadClass = cl.loadClass("dsml.struts.domain."
							+ aPath);
					classes.add(loadClass);
					System.out.println("aClass.getName() = "
							+ loadClass.getName());
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return classes.toArray(new Class<?>[classes.size()]);
	}

	private void generateAbstractDAO() throws IOException {
		String path = packagePath + "/domain/dao/DAO.java";
		File file = new File(packagePath + "/domain/dao");
		file.mkdirs();
		FileWriter DAOWriter = new FileWriter(path);
		DAOTemplate dao = DAOTemplate.create("\n");
		DAOWriter.write(dao.generate(null));
		DAOWriter.close();
	}

	private void generatePOJO(Form form) throws IOException {
		String path = packagePath + "/domain" + "/"
				+ Tools.capitalize(form.getAction()) + ".java";
		File file = new File(packagePath + "/domain");
		file.mkdirs();
		FileWriter POJOWriter = new FileWriter(path);
		POJOTemplate gen = POJOTemplate.create("\n");
		POJOWriter.write(gen.generate(form));
		POJOWriter.close();
	}

	public static void main(String[] args) {
		Generator gen = new Generator("model/struts.dsml",
				"/home/ahmed/workspace/runtime-EclipseApplication/TestDrive");
		gen.generateDBPart();
		gen.generateStrutsPart();
	}

	// struts generation

	private void generateWebXML(String name) throws IOException {
		WebTemplate pageTemp = WebTemplate.create("\n");
		String path = projectPath + "/WebContent/WEB-INF/web.xml";
		File file = new File(projectPath + "/WebContent/WEB-INF");
		file.mkdirs();
		FileWriter WebWriter = new FileWriter(path);
		WebWriter.write(pageTemp.generate(name));
		WebWriter.close();
	}

	private void generateAction(Class<?> clazz) throws IOException {
		String path = packagePath + "/servletAction/" + clazz.getSimpleName()
				+ "Action.java";
		File file = new File(packagePath + "/servletAction");
		if (!file.exists())
			file.mkdirs();
		FileWriter DAOWriter = new FileWriter(path);
		ActionTemplate actionF = ActionTemplate.create("\n");
		DAOWriter.write(actionF.generate(clazz));
		DAOWriter.close();
	}

	private void generateActionForm(Class<?> clazz) throws IOException {
		String path = packagePath + "/actionForm/" + clazz.getSimpleName()
				+ "ActionForm.java";
		File file = new File(packagePath + "/actionForm/");
		if (!file.exists())
			file.mkdirs();
		FileWriter DAOWriter = new FileWriter(path);
		ActionFormTemplate actionF = ActionFormTemplate.create("\n");
		DAOWriter.write(actionF.generate(clazz));
		DAOWriter.close();
	}

	private void generateRessources() throws IOException {
		ResourcesTemplate resource = ResourcesTemplate.create("\n");
		String path = projectPath + "/src/Resources.properties";

		FileWriter ResourceWriter = new FileWriter(path);
		ResourceWriter.write(resource.generate(website));
		ResourceWriter.close();
	}

	private void generatePage(Page page) throws IOException {
		PageTemplate pageTemp = PageTemplate.create("\n");
		String path = projectPath + "/WebContent/pages/" + page.getName()
				+ ".jsp";
		File file = new File(projectPath + "/WebContent/pages");
		file.mkdirs();
		FileWriter JSPWriter = new FileWriter(path);
		JSPWriter.write(pageTemp.generate(page));
		JSPWriter.close();
	}

	private void addURL(URL url) throws IntrospectionException {
		URLClassLoader systemClassLoader = (URLClassLoader) ClassLoader
				.getSystemClassLoader();
		Class<URLClassLoader> classLoaderClass = URLClassLoader.class;

		try {
			Method method = classLoaderClass.getDeclaredMethod("addURL",
					new Class[] { URL.class });
			method.setAccessible(true);
			method.invoke(systemClassLoader, new Object[] { url });
		} catch (Throwable t) {
			t.printStackTrace();
			throw new IntrospectionException(
					"Error when adding url to system ClassLoader ");
		}
	}

	private void compile(String path) throws IOException {
		Runtime run = Runtime.getRuntime();
		File file = new File(projectPath + "/build/classes/");
		file.mkdirs();
		// compile
		Process process = run.exec("javac -d " + projectPath
				+ "/build/classes/" + " " + path);
		try {
			process.waitFor();
			System.out.println(process.exitValue() + "++++++++++++++");
		} catch (InterruptedException e) {}
	}

	private void printClassPath() {

		// Get the System Classloader
		ClassLoader sysClassLoader = ClassLoader.getSystemClassLoader();

		// Get the URLs
		URL[] urls = ((URLClassLoader) sysClassLoader).getURLs();

		for (int i = 0; i < urls.length; i++) {
			System.out.println(urls[i].getFile());
		}

	}

	private File getResources(String filePath) {
		URL bundleRoot = Platform.getBundle("StrutsProjectNew").getEntry(
				filePath);
		URL fileURL;
		File file = null;
		try {
			fileURL = FileLocator.toFileURL(bundleRoot);
			file = new java.io.File(fileURL.toURI());
			System.out.println("+++++++++" + file.getPath());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return file;
	}

}
