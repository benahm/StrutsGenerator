/**
 */
package dsml.visitor.impl;

import dsml.visitor.JSPVisitor;
import dsml.visitor.POJOVisitor;
import dsml.visitor.ResourceVisitor;
import dsml.visitor.Visitor;
import dsml.visitor.VisitorFactory;
import dsml.visitor.VisitorPackage;

import dsml.web.WebPackage;

import dsml.web.impl.WebPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisitorPackageImpl extends EPackageImpl implements VisitorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jspVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pojoVisitorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dsml.visitor.VisitorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisitorPackageImpl() {
		super(eNS_URI, VisitorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VisitorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisitorPackage init() {
		if (isInited) return (VisitorPackage)EPackage.Registry.INSTANCE.getEPackage(VisitorPackage.eNS_URI);

		// Obtain or create and register package
		VisitorPackageImpl theVisitorPackage = (VisitorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisitorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisitorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		WebPackageImpl theWebPackage = (WebPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WebPackage.eNS_URI) instanceof WebPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WebPackage.eNS_URI) : WebPackage.eINSTANCE);

		// Create package meta-data objects
		theVisitorPackage.createPackageContents();
		theWebPackage.createPackageContents();

		// Initialize created meta-data
		theVisitorPackage.initializePackageContents();
		theWebPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVisitorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisitorPackage.eNS_URI, theVisitorPackage);
		return theVisitorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSPVisitor() {
		return jspVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisitor() {
		return visitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisitor_Tag() {
		return (EAttribute)visitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceVisitor() {
		return resourceVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOJOVisitor() {
		return pojoVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisitorFactory getVisitorFactory() {
		return (VisitorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jspVisitorEClass = createEClass(JSP_VISITOR);

		visitorEClass = createEClass(VISITOR);
		createEAttribute(visitorEClass, VISITOR__TAG);

		resourceVisitorEClass = createEClass(RESOURCE_VISITOR);

		pojoVisitorEClass = createEClass(POJO_VISITOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jspVisitorEClass.getESuperTypes().add(this.getVisitor());
		resourceVisitorEClass.getESuperTypes().add(this.getVisitor());
		pojoVisitorEClass.getESuperTypes().add(this.getVisitor());

		// Initialize classes and features; add operations and parameters
		initEClass(jspVisitorEClass, JSPVisitor.class, "JSPVisitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visitorEClass, Visitor.class, "Visitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisitor_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Visitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceVisitorEClass, ResourceVisitor.class, "ResourceVisitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pojoVisitorEClass, POJOVisitor.class, "POJOVisitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //VisitorPackageImpl
