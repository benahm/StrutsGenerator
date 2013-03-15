/**
 */
package dsml.web;

import dsml.visitor.Visitor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see dsml.web.WebPackage#getValidator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Validator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String accept(Visitor visitor);

} // Validator
