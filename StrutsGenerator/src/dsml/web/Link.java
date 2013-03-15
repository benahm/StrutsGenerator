/**
 */
package dsml.web;

import dsml.visitor.Visitor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.web.Link#getLinkedPage <em>Linked Page</em>}</li>
 *   <li>{@link dsml.web.Link#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.web.WebPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Linked Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Page</em>' reference.
	 * @see #setLinkedPage(Page)
	 * @see dsml.web.WebPackage#getLink_LinkedPage()
	 * @model
	 * @generated
	 */
	Page getLinkedPage();

	/**
	 * Sets the value of the '{@link dsml.web.Link#getLinkedPage <em>Linked Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Page</em>' reference.
	 * @see #getLinkedPage()
	 * @generated
	 */
	void setLinkedPage(Page value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dsml.web.WebPackage#getLink_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dsml.web.Link#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String accept(Visitor visitor);

} // Link
