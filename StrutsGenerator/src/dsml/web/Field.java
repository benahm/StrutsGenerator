/**
 */
package dsml.web;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.web.Field#getValidator <em>Validator</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.web.WebPackage#getField()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Field extends FormElement {
	/**
	 * Returns the value of the '<em><b>Validator</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.web.Validator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator</em>' containment reference list.
	 * @see dsml.web.WebPackage#getField_Validator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Validator> getValidator();

} // Field
