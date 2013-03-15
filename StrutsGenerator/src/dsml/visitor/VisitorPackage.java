/**
 */
package dsml.visitor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dsml.visitor.VisitorFactory
 * @model kind="package"
 * @generated
 */
public interface VisitorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "visitor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsml.visitor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "visitor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisitorPackage eINSTANCE = dsml.visitor.impl.VisitorPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsml.visitor.Visitor <em>Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.visitor.Visitor
	 * @see dsml.visitor.impl.VisitorPackageImpl#getVisitor()
	 * @generated
	 */
	int VISITOR = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__TAG = 0;

	/**
	 * The number of structural features of the '<em>Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsml.visitor.impl.JSPVisitorImpl <em>JSP Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.visitor.impl.JSPVisitorImpl
	 * @see dsml.visitor.impl.VisitorPackageImpl#getJSPVisitor()
	 * @generated
	 */
	int JSP_VISITOR = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_VISITOR__TAG = VISITOR__TAG;

	/**
	 * The number of structural features of the '<em>JSP Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_VISITOR_FEATURE_COUNT = VISITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.visitor.impl.ResourceVisitorImpl <em>Resource Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.visitor.impl.ResourceVisitorImpl
	 * @see dsml.visitor.impl.VisitorPackageImpl#getResourceVisitor()
	 * @generated
	 */
	int RESOURCE_VISITOR = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VISITOR__TAG = VISITOR__TAG;

	/**
	 * The number of structural features of the '<em>Resource Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VISITOR_FEATURE_COUNT = VISITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.visitor.impl.POJOVisitorImpl <em>POJO Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.visitor.impl.POJOVisitorImpl
	 * @see dsml.visitor.impl.VisitorPackageImpl#getPOJOVisitor()
	 * @generated
	 */
	int POJO_VISITOR = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_VISITOR__TAG = VISITOR__TAG;

	/**
	 * The number of structural features of the '<em>POJO Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_VISITOR_FEATURE_COUNT = VISITOR_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link dsml.visitor.JSPVisitor <em>JSP Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP Visitor</em>'.
	 * @see dsml.visitor.JSPVisitor
	 * @generated
	 */
	EClass getJSPVisitor();

	/**
	 * Returns the meta object for class '{@link dsml.visitor.Visitor <em>Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visitor</em>'.
	 * @see dsml.visitor.Visitor
	 * @generated
	 */
	EClass getVisitor();

	/**
	 * Returns the meta object for the attribute '{@link dsml.visitor.Visitor#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see dsml.visitor.Visitor#getTag()
	 * @see #getVisitor()
	 * @generated
	 */
	EAttribute getVisitor_Tag();

	/**
	 * Returns the meta object for class '{@link dsml.visitor.ResourceVisitor <em>Resource Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Visitor</em>'.
	 * @see dsml.visitor.ResourceVisitor
	 * @generated
	 */
	EClass getResourceVisitor();

	/**
	 * Returns the meta object for class '{@link dsml.visitor.POJOVisitor <em>POJO Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POJO Visitor</em>'.
	 * @see dsml.visitor.POJOVisitor
	 * @generated
	 */
	EClass getPOJOVisitor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisitorFactory getVisitorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dsml.visitor.impl.JSPVisitorImpl <em>JSP Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.visitor.impl.JSPVisitorImpl
		 * @see dsml.visitor.impl.VisitorPackageImpl#getJSPVisitor()
		 * @generated
		 */
		EClass JSP_VISITOR = eINSTANCE.getJSPVisitor();

		/**
		 * The meta object literal for the '{@link dsml.visitor.Visitor <em>Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.visitor.Visitor
		 * @see dsml.visitor.impl.VisitorPackageImpl#getVisitor()
		 * @generated
		 */
		EClass VISITOR = eINSTANCE.getVisitor();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISITOR__TAG = eINSTANCE.getVisitor_Tag();

		/**
		 * The meta object literal for the '{@link dsml.visitor.impl.ResourceVisitorImpl <em>Resource Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.visitor.impl.ResourceVisitorImpl
		 * @see dsml.visitor.impl.VisitorPackageImpl#getResourceVisitor()
		 * @generated
		 */
		EClass RESOURCE_VISITOR = eINSTANCE.getResourceVisitor();

		/**
		 * The meta object literal for the '{@link dsml.visitor.impl.POJOVisitorImpl <em>POJO Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.visitor.impl.POJOVisitorImpl
		 * @see dsml.visitor.impl.VisitorPackageImpl#getPOJOVisitor()
		 * @generated
		 */
		EClass POJO_VISITOR = eINSTANCE.getPOJOVisitor();

	}

} //VisitorPackage
