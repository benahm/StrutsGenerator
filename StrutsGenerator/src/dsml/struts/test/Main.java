package dsml.struts.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import dsml.web.WebPackage;

public class Main {

	/**
	 * @param args
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(String[] args){
			


	
	
		WebPackage.eINSTANCE.eClass();
		
		try {
			System.out.println(codeToString(readFileAsString("src/dsml/struts/test/file.txt")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String codeToString(String src){
		return src.replace("\"", "\\\"").replace("\n", "\\n");
	}
    /** @param filePath the name of the file to open. Not sure if it can accept URLs or just filenames. Path handling could be better, and buffer sizes are hardcoded
    */ 
    private static String readFileAsString(String filePath)
    throws java.io.IOException{
        StringBuffer fileData = new StringBuffer(1000);
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
        return fileData.toString();
    }

// insert code here..

}
