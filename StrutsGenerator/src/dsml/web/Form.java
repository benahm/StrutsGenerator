/**
 */
package dsml.web;

import dsml.visitor.Visitor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.web.Form#getFormElements <em>Form Elements</em>}</li>
 *   <li>{@link dsml.web.Form#getAction <em>Action</em>}</li>
 *   <li>{@link dsml.web.Form#getSuccess <em>Success</em>}</li>
 *   <li>{@link dsml.web.Form#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.web.WebPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Form Elements</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.web.FormElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Elements</em>' containment reference list.
	 * @see dsml.web.WebPackage#getForm_FormElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormElement> getFormElements();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see dsml.web.WebPackage#getForm_Action()
	 * @model required="true"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link dsml.web.Form#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Success</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success</em>' containment reference.
	 * @see #setSuccess(Success)
	 * @see dsml.web.WebPackage#getForm_Success()
	 * @model containment="true"
	 * @generated
	 */
	Success getSuccess();

	/**
	 * Sets the value of the '{@link dsml.web.Form#getSuccess <em>Success</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success</em>' containment reference.
	 * @see #getSuccess()
	 * @generated
	 */
	void setSuccess(Success value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference.
	 * @see #setError(dsml.web.Error)
	 * @see dsml.web.WebPackage#getForm_Error()
	 * @model containment="true"
	 * @generated
	 */
	dsml.web.Error getError();

	/**
	 * Sets the value of the '{@link dsml.web.Form#getError <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' containment reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(dsml.web.Error value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String accept(Visitor visitor);

} // Form
