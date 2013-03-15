/**
 */
package dsml.web;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greater Than Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.web.GreaterThanValidator#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.web.WebPackage#getGreaterThanValidator()
 * @model
 * @generated
 */
public interface GreaterThanValidator extends Validator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see dsml.web.WebPackage#getGreaterThanValidator_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link dsml.web.GreaterThanValidator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // GreaterThanValidator
