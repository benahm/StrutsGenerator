/**
 */
package dsml.web;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.web.Error#getErrorPage <em>Error Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.web.WebPackage#getError()
 * @model
 * @generated
 */
public interface Error extends EObject {
	/**
	 * Returns the value of the '<em><b>Error Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Page</em>' reference.
	 * @see #setErrorPage(Page)
	 * @see dsml.web.WebPackage#getError_ErrorPage()
	 * @model
	 * @generated
	 */
	Page getErrorPage();

	/**
	 * Sets the value of the '{@link dsml.web.Error#getErrorPage <em>Error Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Page</em>' reference.
	 * @see #getErrorPage()
	 * @generated
	 */
	void setErrorPage(Page value);

} // Error
