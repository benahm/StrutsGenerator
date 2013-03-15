/**
 */
package dsml.web;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.web.TextField#getSize <em>Size</em>}</li>
 *   <li>{@link dsml.web.TextField#getMaxlength <em>Maxlength</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.web.WebPackage#getTextField()
 * @model
 * @generated
 */
public interface TextField extends Field {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see dsml.web.WebPackage#getTextField_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link dsml.web.TextField#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxlength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxlength</em>' attribute.
	 * @see #setMaxlength(int)
	 * @see dsml.web.WebPackage#getTextField_Maxlength()
	 * @model
	 * @generated
	 */
	int getMaxlength();

	/**
	 * Sets the value of the '{@link dsml.web.TextField#getMaxlength <em>Maxlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxlength</em>' attribute.
	 * @see #getMaxlength()
	 * @generated
	 */
	void setMaxlength(int value);

} // TextField
