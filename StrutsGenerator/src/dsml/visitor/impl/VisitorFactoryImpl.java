/**
 */
package dsml.visitor.impl;

import dsml.visitor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisitorFactoryImpl extends EFactoryImpl implements VisitorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VisitorFactory init() {
		try {
			VisitorFactory theVisitorFactory = (VisitorFactory)EPackage.Registry.INSTANCE.getEFactory("dsml.visitor"); 
			if (theVisitorFactory != null) {
				return theVisitorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VisitorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisitorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VisitorPackage.JSP_VISITOR: return createJSPVisitor();
			case VisitorPackage.RESOURCE_VISITOR: return createResourceVisitor();
			case VisitorPackage.POJO_VISITOR: return createPOJOVisitor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPVisitor createJSPVisitor() {
		JSPVisitorImpl jspVisitor = new JSPVisitorImpl();
		return jspVisitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVisitor createResourceVisitor() {
		ResourceVisitorImpl resourceVisitor = new ResourceVisitorImpl();
		return resourceVisitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POJOVisitor createPOJOVisitor() {
		POJOVisitorImpl pojoVisitor = new POJOVisitorImpl();
		return pojoVisitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisitorPackage getVisitorPackage() {
		return (VisitorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VisitorPackage getPackage() {
		return VisitorPackage.eINSTANCE;
	}

} //VisitorFactoryImpl
