package dsml.struts.test;

import java.util.ArrayList;

public class Errors {
	private  ArrayList<String> errors = new ArrayList<String>();
	public  void add(String error){
		errors.add(error);
	}
	@Override
	public String toString() {
		return errors.toString();
	}
	
	public ArrayList<String> getErrors() {
		return errors;
	}
}
