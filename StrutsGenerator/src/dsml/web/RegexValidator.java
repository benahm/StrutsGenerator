/**
 */
package dsml.web;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regex Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.web.RegexValidator#getRegex <em>Regex</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.web.WebPackage#getRegexValidator()
 * @model
 * @generated
 */
public interface RegexValidator extends Validator {
	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see dsml.web.WebPackage#getRegexValidator_Regex()
	 * @model
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link dsml.web.RegexValidator#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

} // RegexValidator
