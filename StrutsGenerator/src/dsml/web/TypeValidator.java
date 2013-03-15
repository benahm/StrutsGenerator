/**
 */
package dsml.web;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.web.TypeValidator#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.web.WebPackage#getTypeValidator()
 * @model
 * @generated
 */
public interface TypeValidator extends Validator {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dsml.web.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dsml.web.Type
	 * @see #setType(Type)
	 * @see dsml.web.WebPackage#getTypeValidator_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link dsml.web.TypeValidator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dsml.web.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // TypeValidator
