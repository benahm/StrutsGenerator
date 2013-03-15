/**
 */
package dsml.web;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Between Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.web.BetweenValidator#getValueL <em>Value L</em>}</li>
 *   <li>{@link dsml.web.BetweenValidator#getValueG <em>Value G</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.web.WebPackage#getBetweenValidator()
 * @model
 * @generated
 */
public interface BetweenValidator extends Validator {
	/**
	 * Returns the value of the '<em><b>Value L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value L</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value L</em>' attribute.
	 * @see #setValueL(int)
	 * @see dsml.web.WebPackage#getBetweenValidator_ValueL()
	 * @model
	 * @generated
	 */
	int getValueL();

	/**
	 * Sets the value of the '{@link dsml.web.BetweenValidator#getValueL <em>Value L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value L</em>' attribute.
	 * @see #getValueL()
	 * @generated
	 */
	void setValueL(int value);

	/**
	 * Returns the value of the '<em><b>Value G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value G</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value G</em>' attribute.
	 * @see #setValueG(int)
	 * @see dsml.web.WebPackage#getBetweenValidator_ValueG()
	 * @model
	 * @generated
	 */
	int getValueG();

	/**
	 * Sets the value of the '{@link dsml.web.BetweenValidator#getValueG <em>Value G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value G</em>' attribute.
	 * @see #getValueG()
	 * @generated
	 */
	void setValueG(int value);

} // BetweenValidator
