package dsml.struts.toolbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import javax.xml.crypto.Data;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dsml.web.WebPackage;
import dsml.web.Website;

public class XMI {
	public static  void saveData(String fileName, Data data) throws IOException {  
		  Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		  Map<String, Object> m = reg.getExtensionToFactoryMap();
		  m.put("daform", new XMIResourceFactoryImpl());
		 
		  ResourceSet resSet = new ResourceSetImpl();
		  Resource resource = resSet.createResource(URI.createFileURI(fileName));
		  resource.getContents().add((EObject) data);
		  resource.save(Collections.EMPTY_MAP);
		}
	public static Website loadWebsite(File fileName) throws FileNotFoundException, IOException {
		// init
		WebPackage.eINSTANCE.eClass();
		
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register the default resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(fileName.getAbsolutePath());
		// Demand load the resource for this file.
		Resource resource = resourceSet.getResource(fileURI, true);
		// Print the contents of the resource to System.out.
		Website website=(Website) resource.getContents().get(0);
		return website;

		}
}
