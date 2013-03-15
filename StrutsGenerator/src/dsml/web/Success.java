/**
 */
package dsml.web;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Success</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.web.Success#getSuccessPage <em>Success Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.web.WebPackage#getSuccess()
 * @model
 * @generated
 */
public interface Success extends EObject {
	/**
	 * Returns the value of the '<em><b>Success Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Page</em>' reference.
	 * @see #setSuccessPage(Page)
	 * @see dsml.web.WebPackage#getSuccess_SuccessPage()
	 * @model
	 * @generated
	 */
	Page getSuccessPage();

	/**
	 * Sets the value of the '{@link dsml.web.Success#getSuccessPage <em>Success Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Page</em>' reference.
	 * @see #getSuccessPage()
	 * @generated
	 */
	void setSuccessPage(Page value);

} // Success
