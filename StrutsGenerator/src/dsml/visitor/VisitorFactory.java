/**
 */
package dsml.visitor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dsml.visitor.VisitorPackage
 * @generated
 */
public interface VisitorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisitorFactory eINSTANCE = dsml.visitor.impl.VisitorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JSP Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Visitor</em>'.
	 * @generated
	 */
	JSPVisitor createJSPVisitor();

	/**
	 * Returns a new object of class '<em>Resource Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Visitor</em>'.
	 * @generated
	 */
	ResourceVisitor createResourceVisitor();

	/**
	 * Returns a new object of class '<em>POJO Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POJO Visitor</em>'.
	 * @generated
	 */
	POJOVisitor createPOJOVisitor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VisitorPackage getVisitorPackage();

} //VisitorFactory
