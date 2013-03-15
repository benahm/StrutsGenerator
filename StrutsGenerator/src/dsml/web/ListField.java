/**
 */
package dsml.web;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.web.ListField#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.web.WebPackage#getListField()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ListField extends FormElement {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.web.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see dsml.web.WebPackage#getListField_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // ListField
