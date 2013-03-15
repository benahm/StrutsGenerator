/**
 */
package dsml.web;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see dsml.web.WebFactory
 * @model kind="package"
 * @generated
 */
public interface WebPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "web";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsml.web";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebPackage eINSTANCE = dsml.web.impl.WebPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsml.web.impl.WebsiteImpl <em>Website</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.WebsiteImpl
	 * @see dsml.web.impl.WebPackageImpl#getWebsite()
	 * @generated
	 */
	int WEBSITE = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__PAGES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Website</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSITE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsml.web.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.PageImpl
	 * @see dsml.web.impl.WebPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FORM = 1;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TEXTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LINKS = 4;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link dsml.web.FormElement <em>Form Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.FormElement
	 * @see dsml.web.impl.WebPackageImpl#getFormElement()
	 * @generated
	 */
	int FORM_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Form Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsml.web.Field <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.Field
	 * @see dsml.web.impl.WebPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = FORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = FORM_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALIDATOR = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.web.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.TextFieldImpl
	 * @see dsml.web.impl.WebPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__VALUE = FIELD__VALUE;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__VALIDATOR = FIELD__VALIDATOR;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__SIZE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MAXLENGTH = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.web.impl.PasswordFieldImpl <em>Password Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.PasswordFieldImpl
	 * @see dsml.web.impl.WebPackageImpl#getPasswordField()
	 * @generated
	 */
	int PASSWORD_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FIELD__VALUE = FIELD__VALUE;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FIELD__VALIDATOR = FIELD__VALIDATOR;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FIELD__SIZE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FIELD__MAXLENGTH = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Password Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.web.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.LabelImpl
	 * @see dsml.web.impl.WebPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = FORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__VALUE = FORM_ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.Button <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.Button
	 * @see dsml.web.impl.WebPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = FORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__VALUE = FORM_ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.ListField <em>List Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.ListField
	 * @see dsml.web.impl.WebPackageImpl#getListField()
	 * @generated
	 */
	int LIST_FIELD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD__NAME = FORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD__VALUE = FORM_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD__ITEMS = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FIELD_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.web.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.RadioButtonImpl
	 * @see dsml.web.impl.WebPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__NAME = LIST_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__VALUE = LIST_FIELD__VALUE;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ITEMS = LIST_FIELD__ITEMS;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = LIST_FIELD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.CheckBoxImpl
	 * @see dsml.web.impl.WebPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = FORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__VALUE = FORM_ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.SubmitButtonImpl <em>Submit Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.SubmitButtonImpl
	 * @see dsml.web.impl.WebPackageImpl#getSubmitButton()
	 * @generated
	 */
	int SUBMIT_BUTTON = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON__VALUE = BUTTON__VALUE;

	/**
	 * The number of structural features of the '<em>Submit Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMIT_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.CancelButtonImpl <em>Cancel Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.CancelButtonImpl
	 * @see dsml.web.impl.WebPackageImpl#getCancelButton()
	 * @generated
	 */
	int CANCEL_BUTTON = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_BUTTON__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_BUTTON__VALUE = BUTTON__VALUE;

	/**
	 * The number of structural features of the '<em>Cancel Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.ItemImpl
	 * @see dsml.web.impl.WebPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsml.web.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.SelectImpl
	 * @see dsml.web.impl.WebPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__NAME = LIST_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VALUE = LIST_FIELD__VALUE;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__ITEMS = LIST_FIELD__ITEMS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__SIZE = LIST_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = LIST_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.web.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.TextAreaImpl
	 * @see dsml.web.impl.WebPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__VALUE = FIELD__VALUE;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__VALIDATOR = FIELD__VALIDATOR;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__COLS = FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ROWS = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.web.impl.ResetButtonImpl <em>Reset Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.ResetButtonImpl
	 * @see dsml.web.impl.WebPackageImpl#getResetButton()
	 * @generated
	 */
	int RESET_BUTTON = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON__VALUE = BUTTON__VALUE;

	/**
	 * The number of structural features of the '<em>Reset Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.LinkImpl
	 * @see dsml.web.impl.WebPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 16;

	/**
	 * The feature id for the '<em><b>Linked Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINKED_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsml.web.impl.HiddenImpl <em>Hidden</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.HiddenImpl
	 * @see dsml.web.impl.WebPackageImpl#getHidden()
	 * @generated
	 */
	int HIDDEN = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN__NAME = FORM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN__VALUE = FORM_ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Hidden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.FormImpl
	 * @see dsml.web.impl.WebPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 19;

	/**
	 * The feature id for the '<em><b>Form Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__FORM_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Success</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SUCCESS = 2;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ERROR = 3;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link dsml.web.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.TextImpl
	 * @see dsml.web.impl.WebPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsml.web.Validator <em>Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.Validator
	 * @see dsml.web.impl.WebPackageImpl#getValidator()
	 * @generated
	 */
	int VALIDATOR = 21;

	/**
	 * The number of structural features of the '<em>Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.DateValidatorImpl <em>Date Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.DateValidatorImpl
	 * @see dsml.web.impl.WebPackageImpl#getDateValidator()
	 * @generated
	 */
	int DATE_VALIDATOR = 22;

	/**
	 * The number of structural features of the '<em>Date Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.EmailValidatorImpl <em>Email Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.EmailValidatorImpl
	 * @see dsml.web.impl.WebPackageImpl#getEmailValidator()
	 * @generated
	 */
	int EMAIL_VALIDATOR = 23;

	/**
	 * The number of structural features of the '<em>Email Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.RequiredImpl <em>Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.RequiredImpl
	 * @see dsml.web.impl.WebPackageImpl#getRequired()
	 * @generated
	 */
	int REQUIRED = 24;

	/**
	 * The number of structural features of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.TimeValidatorImpl <em>Time Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.TimeValidatorImpl
	 * @see dsml.web.impl.WebPackageImpl#getTimeValidator()
	 * @generated
	 */
	int TIME_VALIDATOR = 25;

	/**
	 * The number of structural features of the '<em>Time Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.URLValidatorImpl <em>URL Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.URLValidatorImpl
	 * @see dsml.web.impl.WebPackageImpl#getURLValidator()
	 * @generated
	 */
	int URL_VALIDATOR = 26;

	/**
	 * The number of structural features of the '<em>URL Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.web.impl.TypeValidatorImpl <em>Type Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.TypeValidatorImpl
	 * @see dsml.web.impl.WebPackageImpl#getTypeValidator()
	 * @generated
	 */
	int TYPE_VALIDATOR = 27;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VALIDATOR__TYPE = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.web.impl.GreaterThanValidatorImpl <em>Greater Than Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.GreaterThanValidatorImpl
	 * @see dsml.web.impl.WebPackageImpl#getGreaterThanValidator()
	 * @generated
	 */
	int GREATER_THAN_VALIDATOR = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_VALIDATOR__VALUE = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Greater Than Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.web.impl.LessThanValidatorImpl <em>Less Than Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.LessThanValidatorImpl
	 * @see dsml.web.impl.WebPackageImpl#getLessThanValidator()
	 * @generated
	 */
	int LESS_THAN_VALIDATOR = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_VALIDATOR__VALUE = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Less Than Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.web.impl.BetweenValidatorImpl <em>Between Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.BetweenValidatorImpl
	 * @see dsml.web.impl.WebPackageImpl#getBetweenValidator()
	 * @generated
	 */
	int BETWEEN_VALIDATOR = 30;

	/**
	 * The feature id for the '<em><b>Value L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN_VALIDATOR__VALUE_L = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN_VALIDATOR__VALUE_G = VALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Between Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.web.impl.RegexValidatorImpl <em>Regex Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.RegexValidatorImpl
	 * @see dsml.web.impl.WebPackageImpl#getRegexValidator()
	 * @generated
	 */
	int REGEX_VALIDATOR = 31;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_VALIDATOR__REGEX = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regex Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.web.impl.StringLengthValidatorImpl <em>String Length Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.StringLengthValidatorImpl
	 * @see dsml.web.impl.WebPackageImpl#getStringLengthValidator()
	 * @generated
	 */
	int STRING_LENGTH_VALIDATOR = 32;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LENGTH_VALIDATOR__MIN = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LENGTH_VALIDATOR__MAX = VALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Length Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LENGTH_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.web.impl.SuccessImpl <em>Success</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.SuccessImpl
	 * @see dsml.web.impl.WebPackageImpl#getSuccess()
	 * @generated
	 */
	int SUCCESS = 33;

	/**
	 * The feature id for the '<em><b>Success Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS__SUCCESS_PAGE = 0;

	/**
	 * The number of structural features of the '<em>Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsml.web.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.impl.ErrorImpl
	 * @see dsml.web.impl.WebPackageImpl#getError()
	 * @generated
	 */
	int ERROR = 34;

	/**
	 * The feature id for the '<em><b>Error Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ERROR_PAGE = 0;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsml.web.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.web.Type
	 * @see dsml.web.impl.WebPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 35;


	/**
	 * Returns the meta object for class '{@link dsml.web.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Website</em>'.
	 * @see dsml.web.Website
	 * @generated
	 */
	EClass getWebsite();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.web.Website#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see dsml.web.Website#getPages()
	 * @see #getWebsite()
	 * @generated
	 */
	EReference getWebsite_Pages();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.Website#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsml.web.Website#getName()
	 * @see #getWebsite()
	 * @generated
	 */
	EAttribute getWebsite_Name();

	/**
	 * Returns the meta object for class '{@link dsml.web.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see dsml.web.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsml.web.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the containment reference '{@link dsml.web.Page#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form</em>'.
	 * @see dsml.web.Page#getForm()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Form();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.web.Page#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Texts</em>'.
	 * @see dsml.web.Page#getTexts()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Texts();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsml.web.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.web.Page#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see dsml.web.Page#getLinks()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Links();

	/**
	 * Returns the meta object for class '{@link dsml.web.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see dsml.web.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.web.Field#getValidator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validator</em>'.
	 * @see dsml.web.Field#getValidator()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Validator();

	/**
	 * Returns the meta object for class '{@link dsml.web.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see dsml.web.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.TextField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see dsml.web.TextField#getSize()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Size();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.TextField#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see dsml.web.TextField#getMaxlength()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Maxlength();

	/**
	 * Returns the meta object for class '{@link dsml.web.PasswordField <em>Password Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password Field</em>'.
	 * @see dsml.web.PasswordField
	 * @generated
	 */
	EClass getPasswordField();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.PasswordField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see dsml.web.PasswordField#getSize()
	 * @see #getPasswordField()
	 * @generated
	 */
	EAttribute getPasswordField_Size();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.PasswordField#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see dsml.web.PasswordField#getMaxlength()
	 * @see #getPasswordField()
	 * @generated
	 */
	EAttribute getPasswordField_Maxlength();

	/**
	 * Returns the meta object for class '{@link dsml.web.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see dsml.web.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link dsml.web.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see dsml.web.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link dsml.web.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see dsml.web.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for class '{@link dsml.web.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see dsml.web.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for class '{@link dsml.web.SubmitButton <em>Submit Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submit Button</em>'.
	 * @see dsml.web.SubmitButton
	 * @generated
	 */
	EClass getSubmitButton();

	/**
	 * Returns the meta object for class '{@link dsml.web.CancelButton <em>Cancel Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel Button</em>'.
	 * @see dsml.web.CancelButton
	 * @generated
	 */
	EClass getCancelButton();

	/**
	 * Returns the meta object for class '{@link dsml.web.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see dsml.web.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.Item#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsml.web.Item#getValue()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Value();

	/**
	 * Returns the meta object for class '{@link dsml.web.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see dsml.web.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.Select#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see dsml.web.Select#getSize()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Size();

	/**
	 * Returns the meta object for class '{@link dsml.web.ListField <em>List Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Field</em>'.
	 * @see dsml.web.ListField
	 * @generated
	 */
	EClass getListField();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.web.ListField#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see dsml.web.ListField#getItems()
	 * @see #getListField()
	 * @generated
	 */
	EReference getListField_Items();

	/**
	 * Returns the meta object for class '{@link dsml.web.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see dsml.web.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.TextArea#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cols</em>'.
	 * @see dsml.web.TextArea#getCols()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Cols();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.TextArea#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see dsml.web.TextArea#getRows()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Rows();

	/**
	 * Returns the meta object for class '{@link dsml.web.ResetButton <em>Reset Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Button</em>'.
	 * @see dsml.web.ResetButton
	 * @generated
	 */
	EClass getResetButton();

	/**
	 * Returns the meta object for class '{@link dsml.web.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see dsml.web.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link dsml.web.Link#getLinkedPage <em>Linked Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Page</em>'.
	 * @see dsml.web.Link#getLinkedPage()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_LinkedPage();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.Link#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsml.web.Link#getValue()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Value();

	/**
	 * Returns the meta object for class '{@link dsml.web.FormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Element</em>'.
	 * @see dsml.web.FormElement
	 * @generated
	 */
	EClass getFormElement();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.FormElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsml.web.FormElement#getName()
	 * @see #getFormElement()
	 * @generated
	 */
	EAttribute getFormElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.FormElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsml.web.FormElement#getValue()
	 * @see #getFormElement()
	 * @generated
	 */
	EAttribute getFormElement_Value();

	/**
	 * Returns the meta object for class '{@link dsml.web.Hidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hidden</em>'.
	 * @see dsml.web.Hidden
	 * @generated
	 */
	EClass getHidden();

	/**
	 * Returns the meta object for class '{@link dsml.web.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see dsml.web.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.web.Form#getFormElements <em>Form Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form Elements</em>'.
	 * @see dsml.web.Form#getFormElements()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_FormElements();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.Form#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see dsml.web.Form#getAction()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Action();

	/**
	 * Returns the meta object for the containment reference '{@link dsml.web.Form#getSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Success</em>'.
	 * @see dsml.web.Form#getSuccess()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Success();

	/**
	 * Returns the meta object for the containment reference '{@link dsml.web.Form#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see dsml.web.Form#getError()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Error();

	/**
	 * Returns the meta object for class '{@link dsml.web.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see dsml.web.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsml.web.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

	/**
	 * Returns the meta object for class '{@link dsml.web.Validator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validator</em>'.
	 * @see dsml.web.Validator
	 * @generated
	 */
	EClass getValidator();

	/**
	 * Returns the meta object for class '{@link dsml.web.DateValidator <em>Date Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Validator</em>'.
	 * @see dsml.web.DateValidator
	 * @generated
	 */
	EClass getDateValidator();

	/**
	 * Returns the meta object for class '{@link dsml.web.EmailValidator <em>Email Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Validator</em>'.
	 * @see dsml.web.EmailValidator
	 * @generated
	 */
	EClass getEmailValidator();

	/**
	 * Returns the meta object for class '{@link dsml.web.Required <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required</em>'.
	 * @see dsml.web.Required
	 * @generated
	 */
	EClass getRequired();

	/**
	 * Returns the meta object for class '{@link dsml.web.TimeValidator <em>Time Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Validator</em>'.
	 * @see dsml.web.TimeValidator
	 * @generated
	 */
	EClass getTimeValidator();

	/**
	 * Returns the meta object for class '{@link dsml.web.URLValidator <em>URL Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Validator</em>'.
	 * @see dsml.web.URLValidator
	 * @generated
	 */
	EClass getURLValidator();

	/**
	 * Returns the meta object for class '{@link dsml.web.TypeValidator <em>Type Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Validator</em>'.
	 * @see dsml.web.TypeValidator
	 * @generated
	 */
	EClass getTypeValidator();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.TypeValidator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsml.web.TypeValidator#getType()
	 * @see #getTypeValidator()
	 * @generated
	 */
	EAttribute getTypeValidator_Type();

	/**
	 * Returns the meta object for class '{@link dsml.web.GreaterThanValidator <em>Greater Than Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Validator</em>'.
	 * @see dsml.web.GreaterThanValidator
	 * @generated
	 */
	EClass getGreaterThanValidator();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.GreaterThanValidator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsml.web.GreaterThanValidator#getValue()
	 * @see #getGreaterThanValidator()
	 * @generated
	 */
	EAttribute getGreaterThanValidator_Value();

	/**
	 * Returns the meta object for class '{@link dsml.web.LessThanValidator <em>Less Than Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Validator</em>'.
	 * @see dsml.web.LessThanValidator
	 * @generated
	 */
	EClass getLessThanValidator();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.LessThanValidator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsml.web.LessThanValidator#getValue()
	 * @see #getLessThanValidator()
	 * @generated
	 */
	EAttribute getLessThanValidator_Value();

	/**
	 * Returns the meta object for class '{@link dsml.web.BetweenValidator <em>Between Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Between Validator</em>'.
	 * @see dsml.web.BetweenValidator
	 * @generated
	 */
	EClass getBetweenValidator();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.BetweenValidator#getValueL <em>Value L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value L</em>'.
	 * @see dsml.web.BetweenValidator#getValueL()
	 * @see #getBetweenValidator()
	 * @generated
	 */
	EAttribute getBetweenValidator_ValueL();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.BetweenValidator#getValueG <em>Value G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value G</em>'.
	 * @see dsml.web.BetweenValidator#getValueG()
	 * @see #getBetweenValidator()
	 * @generated
	 */
	EAttribute getBetweenValidator_ValueG();

	/**
	 * Returns the meta object for class '{@link dsml.web.RegexValidator <em>Regex Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regex Validator</em>'.
	 * @see dsml.web.RegexValidator
	 * @generated
	 */
	EClass getRegexValidator();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.RegexValidator#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see dsml.web.RegexValidator#getRegex()
	 * @see #getRegexValidator()
	 * @generated
	 */
	EAttribute getRegexValidator_Regex();

	/**
	 * Returns the meta object for class '{@link dsml.web.StringLengthValidator <em>String Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Length Validator</em>'.
	 * @see dsml.web.StringLengthValidator
	 * @generated
	 */
	EClass getStringLengthValidator();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.StringLengthValidator#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see dsml.web.StringLengthValidator#getMin()
	 * @see #getStringLengthValidator()
	 * @generated
	 */
	EAttribute getStringLengthValidator_Min();

	/**
	 * Returns the meta object for the attribute '{@link dsml.web.StringLengthValidator#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see dsml.web.StringLengthValidator#getMax()
	 * @see #getStringLengthValidator()
	 * @generated
	 */
	EAttribute getStringLengthValidator_Max();

	/**
	 * Returns the meta object for class '{@link dsml.web.Success <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success</em>'.
	 * @see dsml.web.Success
	 * @generated
	 */
	EClass getSuccess();

	/**
	 * Returns the meta object for the reference '{@link dsml.web.Success#getSuccessPage <em>Success Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Success Page</em>'.
	 * @see dsml.web.Success#getSuccessPage()
	 * @see #getSuccess()
	 * @generated
	 */
	EReference getSuccess_SuccessPage();

	/**
	 * Returns the meta object for class '{@link dsml.web.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see dsml.web.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for the reference '{@link dsml.web.Error#getErrorPage <em>Error Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Page</em>'.
	 * @see dsml.web.Error#getErrorPage()
	 * @see #getError()
	 * @generated
	 */
	EReference getError_ErrorPage();

	/**
	 * Returns the meta object for enum '{@link dsml.web.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see dsml.web.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebFactory getWebFactory();

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
		 * The meta object literal for the '{@link dsml.web.impl.WebsiteImpl <em>Website</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.WebsiteImpl
		 * @see dsml.web.impl.WebPackageImpl#getWebsite()
		 * @generated
		 */
		EClass WEBSITE = eINSTANCE.getWebsite();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBSITE__PAGES = eINSTANCE.getWebsite_Pages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSITE__NAME = eINSTANCE.getWebsite_Name();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.PageImpl
		 * @see dsml.web.impl.WebPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__FORM = eINSTANCE.getPage_Form();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__TEXTS = eINSTANCE.getPage_Texts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__LINKS = eINSTANCE.getPage_Links();

		/**
		 * The meta object literal for the '{@link dsml.web.Field <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.Field
		 * @see dsml.web.impl.WebPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Validator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__VALIDATOR = eINSTANCE.getField_Validator();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.TextFieldImpl
		 * @see dsml.web.impl.WebPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__SIZE = eINSTANCE.getTextField_Size();

		/**
		 * The meta object literal for the '<em><b>Maxlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__MAXLENGTH = eINSTANCE.getTextField_Maxlength();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.PasswordFieldImpl <em>Password Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.PasswordFieldImpl
		 * @see dsml.web.impl.WebPackageImpl#getPasswordField()
		 * @generated
		 */
		EClass PASSWORD_FIELD = eINSTANCE.getPasswordField();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSWORD_FIELD__SIZE = eINSTANCE.getPasswordField_Size();

		/**
		 * The meta object literal for the '<em><b>Maxlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSWORD_FIELD__MAXLENGTH = eINSTANCE.getPasswordField_Maxlength();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.LabelImpl
		 * @see dsml.web.impl.WebPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link dsml.web.Button <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.Button
		 * @see dsml.web.impl.WebPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.RadioButtonImpl
		 * @see dsml.web.impl.WebPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.CheckBoxImpl
		 * @see dsml.web.impl.WebPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.SubmitButtonImpl <em>Submit Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.SubmitButtonImpl
		 * @see dsml.web.impl.WebPackageImpl#getSubmitButton()
		 * @generated
		 */
		EClass SUBMIT_BUTTON = eINSTANCE.getSubmitButton();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.CancelButtonImpl <em>Cancel Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.CancelButtonImpl
		 * @see dsml.web.impl.WebPackageImpl#getCancelButton()
		 * @generated
		 */
		EClass CANCEL_BUTTON = eINSTANCE.getCancelButton();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.ItemImpl
		 * @see dsml.web.impl.WebPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__VALUE = eINSTANCE.getItem_Value();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.SelectImpl
		 * @see dsml.web.impl.WebPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__SIZE = eINSTANCE.getSelect_Size();

		/**
		 * The meta object literal for the '{@link dsml.web.ListField <em>List Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.ListField
		 * @see dsml.web.impl.WebPackageImpl#getListField()
		 * @generated
		 */
		EClass LIST_FIELD = eINSTANCE.getListField();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_FIELD__ITEMS = eINSTANCE.getListField_Items();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.TextAreaImpl
		 * @see dsml.web.impl.WebPackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__COLS = eINSTANCE.getTextArea_Cols();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__ROWS = eINSTANCE.getTextArea_Rows();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.ResetButtonImpl <em>Reset Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.ResetButtonImpl
		 * @see dsml.web.impl.WebPackageImpl#getResetButton()
		 * @generated
		 */
		EClass RESET_BUTTON = eINSTANCE.getResetButton();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.LinkImpl
		 * @see dsml.web.impl.WebPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Linked Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LINKED_PAGE = eINSTANCE.getLink_LinkedPage();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__VALUE = eINSTANCE.getLink_Value();

		/**
		 * The meta object literal for the '{@link dsml.web.FormElement <em>Form Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.FormElement
		 * @see dsml.web.impl.WebPackageImpl#getFormElement()
		 * @generated
		 */
		EClass FORM_ELEMENT = eINSTANCE.getFormElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_ELEMENT__NAME = eINSTANCE.getFormElement_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_ELEMENT__VALUE = eINSTANCE.getFormElement_Value();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.HiddenImpl <em>Hidden</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.HiddenImpl
		 * @see dsml.web.impl.WebPackageImpl#getHidden()
		 * @generated
		 */
		EClass HIDDEN = eINSTANCE.getHidden();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.FormImpl
		 * @see dsml.web.impl.WebPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Form Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__FORM_ELEMENTS = eINSTANCE.getForm_FormElements();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__ACTION = eINSTANCE.getForm_Action();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__SUCCESS = eINSTANCE.getForm_Success();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__ERROR = eINSTANCE.getForm_Error();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.TextImpl
		 * @see dsml.web.impl.WebPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

		/**
		 * The meta object literal for the '{@link dsml.web.Validator <em>Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.Validator
		 * @see dsml.web.impl.WebPackageImpl#getValidator()
		 * @generated
		 */
		EClass VALIDATOR = eINSTANCE.getValidator();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.DateValidatorImpl <em>Date Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.DateValidatorImpl
		 * @see dsml.web.impl.WebPackageImpl#getDateValidator()
		 * @generated
		 */
		EClass DATE_VALIDATOR = eINSTANCE.getDateValidator();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.EmailValidatorImpl <em>Email Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.EmailValidatorImpl
		 * @see dsml.web.impl.WebPackageImpl#getEmailValidator()
		 * @generated
		 */
		EClass EMAIL_VALIDATOR = eINSTANCE.getEmailValidator();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.RequiredImpl <em>Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.RequiredImpl
		 * @see dsml.web.impl.WebPackageImpl#getRequired()
		 * @generated
		 */
		EClass REQUIRED = eINSTANCE.getRequired();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.TimeValidatorImpl <em>Time Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.TimeValidatorImpl
		 * @see dsml.web.impl.WebPackageImpl#getTimeValidator()
		 * @generated
		 */
		EClass TIME_VALIDATOR = eINSTANCE.getTimeValidator();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.URLValidatorImpl <em>URL Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.URLValidatorImpl
		 * @see dsml.web.impl.WebPackageImpl#getURLValidator()
		 * @generated
		 */
		EClass URL_VALIDATOR = eINSTANCE.getURLValidator();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.TypeValidatorImpl <em>Type Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.TypeValidatorImpl
		 * @see dsml.web.impl.WebPackageImpl#getTypeValidator()
		 * @generated
		 */
		EClass TYPE_VALIDATOR = eINSTANCE.getTypeValidator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_VALIDATOR__TYPE = eINSTANCE.getTypeValidator_Type();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.GreaterThanValidatorImpl <em>Greater Than Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.GreaterThanValidatorImpl
		 * @see dsml.web.impl.WebPackageImpl#getGreaterThanValidator()
		 * @generated
		 */
		EClass GREATER_THAN_VALIDATOR = eINSTANCE.getGreaterThanValidator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREATER_THAN_VALIDATOR__VALUE = eINSTANCE.getGreaterThanValidator_Value();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.LessThanValidatorImpl <em>Less Than Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.LessThanValidatorImpl
		 * @see dsml.web.impl.WebPackageImpl#getLessThanValidator()
		 * @generated
		 */
		EClass LESS_THAN_VALIDATOR = eINSTANCE.getLessThanValidator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LESS_THAN_VALIDATOR__VALUE = eINSTANCE.getLessThanValidator_Value();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.BetweenValidatorImpl <em>Between Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.BetweenValidatorImpl
		 * @see dsml.web.impl.WebPackageImpl#getBetweenValidator()
		 * @generated
		 */
		EClass BETWEEN_VALIDATOR = eINSTANCE.getBetweenValidator();

		/**
		 * The meta object literal for the '<em><b>Value L</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BETWEEN_VALIDATOR__VALUE_L = eINSTANCE.getBetweenValidator_ValueL();

		/**
		 * The meta object literal for the '<em><b>Value G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BETWEEN_VALIDATOR__VALUE_G = eINSTANCE.getBetweenValidator_ValueG();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.RegexValidatorImpl <em>Regex Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.RegexValidatorImpl
		 * @see dsml.web.impl.WebPackageImpl#getRegexValidator()
		 * @generated
		 */
		EClass REGEX_VALIDATOR = eINSTANCE.getRegexValidator();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEX_VALIDATOR__REGEX = eINSTANCE.getRegexValidator_Regex();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.StringLengthValidatorImpl <em>String Length Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.StringLengthValidatorImpl
		 * @see dsml.web.impl.WebPackageImpl#getStringLengthValidator()
		 * @generated
		 */
		EClass STRING_LENGTH_VALIDATOR = eINSTANCE.getStringLengthValidator();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LENGTH_VALIDATOR__MIN = eINSTANCE.getStringLengthValidator_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LENGTH_VALIDATOR__MAX = eINSTANCE.getStringLengthValidator_Max();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.SuccessImpl <em>Success</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.SuccessImpl
		 * @see dsml.web.impl.WebPackageImpl#getSuccess()
		 * @generated
		 */
		EClass SUCCESS = eINSTANCE.getSuccess();

		/**
		 * The meta object literal for the '<em><b>Success Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS__SUCCESS_PAGE = eINSTANCE.getSuccess_SuccessPage();

		/**
		 * The meta object literal for the '{@link dsml.web.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.impl.ErrorImpl
		 * @see dsml.web.impl.WebPackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

		/**
		 * The meta object literal for the '<em><b>Error Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR__ERROR_PAGE = eINSTANCE.getError_ErrorPage();

		/**
		 * The meta object literal for the '{@link dsml.web.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.web.Type
		 * @see dsml.web.impl.WebPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //WebPackage
