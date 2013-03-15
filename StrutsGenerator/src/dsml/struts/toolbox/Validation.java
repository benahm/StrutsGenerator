package dsml.struts.toolbox;

import java.util.*;
/**
 * regroupe tout les validations d'un action form donnée
 * @author ahmed
 *
 */
public class Validation {
	private  ArrayList<String> validations =new ArrayList<String>();

	public  void add(String validation) {
		validations.add(validation);
	}

	public  String getAll() {
		StringBuffer allValidations = new StringBuffer();
		for (String val : validations) {
			allValidations.append(val);
			allValidations.append("\n");
		}
		return allValidations.toString();
	}
}
