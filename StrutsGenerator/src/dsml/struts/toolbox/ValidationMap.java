package dsml.struts.toolbox;

import java.util.HashMap;
/**
 * Contient tout les validations
 * @author ahmed
 *
 */
public class ValidationMap {
	private static HashMap<String, Validation> ObjectValidations = new HashMap<String, Validation>();

	public static void add(String objectName, Validation validation) {
		ObjectValidations.put(objectName, validation);
	}

	public static Validation get(String objectName) {
		return ObjectValidations.get(objectName);
	}

}
