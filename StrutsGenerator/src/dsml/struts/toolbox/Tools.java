package dsml.struts.toolbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import dsml.web.Form;
import dsml.web.Page;
import dsml.web.Website;

public class Tools {

	/**
	 * capitalize the first letter of original
	 * 
	 * @param original
	 * @return
	 */
	public static String capitalize(String original) {
		if (original.length() == 0)
			return original;
		return original.substring(0, 1).toUpperCase() + original.substring(1);
	}

	public static String unCapitalize(String original) {
		if (original.length() == 0)
			return original;
		return original.substring(0, 1).toLowerCase() + original.substring(1);
	}

	/**
	 * get the default value of a given type
	 * 
	 * @param type
	 * @return
	 */
	public static String getDefaultValue(Class<?> type) {
		if (type == boolean.class)
			return "false";
		if (type == byte.class || type == short.class || type == int.class)
			return "0";
		if (type == long.class)
			return "0L";
		if (type == float.class)
			return "0.0f";
		if (type == double.class)
			return "0.0d";
		if (type == char.class)
			return "\u0000";
		else
			return "null";

	}

	public static ArrayList<Form> getFormsFromWebsite(Website website) {
		ArrayList<Form> forms = new ArrayList<Form>();
		EList<Page> pages = website.getPages();
		Form form;
		for (Page page : pages) {
			form = page.getForm();
			if (form != null)
				forms.add(form);
		}
		return forms;
	}

	public static void copyFolder(File src, File dest) throws IOException {

		if (src.isDirectory()) {

			// if directory not exists, create it
			if (!dest.exists()) {
				dest.mkdir();
				System.out.println("Directory copied from " + src + "  to "
						+ dest);
			}

			// list all the directory contents
			String files[] = src.list();

			for (String file : files) {
				System.out.println(file);
				// construct the src and dest file structure
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// recursive copy
				copyFolder(srcFile, destFile);
			}

		} else {
			if(!dest.exists()){
			// if file, then copy it
			// Use bytes stream to support all file types
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}


			in.close();
			out.close();
			System.out.println("File copied from " + src + " to " + dest);
			}
		}
	}
}
