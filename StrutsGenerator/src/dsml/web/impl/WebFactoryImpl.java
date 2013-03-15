/**
 */
package dsml.web.impl;

import dsml.web.BetweenValidator;
import dsml.web.CancelButton;
import dsml.web.CheckBox;
import dsml.web.DateValidator;
import dsml.web.EmailValidator;
import dsml.web.Form;
import dsml.web.GreaterThanValidator;
import dsml.web.Hidden;
import dsml.web.Item;
import dsml.web.Label;
import dsml.web.LessThanValidator;
import dsml.web.Link;
import dsml.web.Page;
import dsml.web.PasswordField;
import dsml.web.RadioButton;
import dsml.web.RegexValidator;
import dsml.web.Required;
import dsml.web.ResetButton;
import dsml.web.Select;
import dsml.web.StringLengthValidator;
import dsml.web.SubmitButton;
import dsml.web.Success;
import dsml.web.Text;
import dsml.web.TextArea;
import dsml.web.TextField;
import dsml.web.TimeValidator;
import dsml.web.Type;
import dsml.web.TypeValidator;
import dsml.web.URLValidator;
import dsml.web.WebFactory;
import dsml.web.WebPackage;
import dsml.web.Website;
import dsml.web.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class WebFactoryImpl extends EFactoryImpl implements WebFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebFactory init() {
		try {
			WebFactory theWebFactory = (WebFactory)EPackage.Registry.INSTANCE.getEFactory("dsml.web"); 
			if (theWebFactory != null) {
				return theWebFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebFactoryImpl() {
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
			case WebPackage.WEBSITE: return createWebsite();
			case WebPackage.PAGE: return createPage();
			case WebPackage.TEXT_FIELD: return createTextField();
			case WebPackage.PASSWORD_FIELD: return createPasswordField();
			case WebPackage.LABEL: return createLabel();
			case WebPackage.RADIO_BUTTON: return createRadioButton();
			case WebPackage.CHECK_BOX: return createCheckBox();
			case WebPackage.SUBMIT_BUTTON: return createSubmitButton();
			case WebPackage.CANCEL_BUTTON: return createCancelButton();
			case WebPackage.ITEM: return createItem();
			case WebPackage.SELECT: return createSelect();
			case WebPackage.TEXT_AREA: return createTextArea();
			case WebPackage.RESET_BUTTON: return createResetButton();
			case WebPackage.LINK: return createLink();
			case WebPackage.HIDDEN: return createHidden();
			case WebPackage.FORM: return createForm();
			case WebPackage.TEXT: return createText();
			case WebPackage.DATE_VALIDATOR: return createDateValidator();
			case WebPackage.EMAIL_VALIDATOR: return createEmailValidator();
			case WebPackage.REQUIRED: return createRequired();
			case WebPackage.TIME_VALIDATOR: return createTimeValidator();
			case WebPackage.URL_VALIDATOR: return createURLValidator();
			case WebPackage.TYPE_VALIDATOR: return createTypeValidator();
			case WebPackage.GREATER_THAN_VALIDATOR: return createGreaterThanValidator();
			case WebPackage.LESS_THAN_VALIDATOR: return createLessThanValidator();
			case WebPackage.BETWEEN_VALIDATOR: return createBetweenValidator();
			case WebPackage.REGEX_VALIDATOR: return createRegexValidator();
			case WebPackage.STRING_LENGTH_VALIDATOR: return createStringLengthValidator();
			case WebPackage.SUCCESS: return createSuccess();
			case WebPackage.ERROR: return createError();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WebPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WebPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Website createWebsite() {
		WebsiteImpl website = new WebsiteImpl();
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField createTextField() {
		TextFieldImpl textField = new TextFieldImpl();
		return textField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordField createPasswordField() {
		PasswordFieldImpl passwordField = new PasswordFieldImpl();
		return passwordField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitButton createSubmitButton() {
		SubmitButtonImpl submitButton = new SubmitButtonImpl();
		return submitButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelButton createCancelButton() {
		CancelButtonImpl cancelButton = new CancelButtonImpl();
		return cancelButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextArea createTextArea() {
		TextAreaImpl textArea = new TextAreaImpl();
		return textArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetButton createResetButton() {
		ResetButtonImpl resetButton = new ResetButtonImpl();
		return resetButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hidden createHidden() {
		HiddenImpl hidden = new HiddenImpl();
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateValidator createDateValidator() {
		DateValidatorImpl dateValidator = new DateValidatorImpl();
		return dateValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailValidator createEmailValidator() {
		EmailValidatorImpl emailValidator = new EmailValidatorImpl();
		return emailValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Required createRequired() {
		RequiredImpl required = new RequiredImpl();
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValidator createTimeValidator() {
		TimeValidatorImpl timeValidator = new TimeValidatorImpl();
		return timeValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLValidator createURLValidator() {
		URLValidatorImpl urlValidator = new URLValidatorImpl();
		return urlValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeValidator createTypeValidator() {
		TypeValidatorImpl typeValidator = new TypeValidatorImpl();
		return typeValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanValidator createGreaterThanValidator() {
		GreaterThanValidatorImpl greaterThanValidator = new GreaterThanValidatorImpl();
		return greaterThanValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessThanValidator createLessThanValidator() {
		LessThanValidatorImpl lessThanValidator = new LessThanValidatorImpl();
		return lessThanValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BetweenValidator createBetweenValidator() {
		BetweenValidatorImpl betweenValidator = new BetweenValidatorImpl();
		return betweenValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegexValidator createRegexValidator() {
		RegexValidatorImpl regexValidator = new RegexValidatorImpl();
		return regexValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLengthValidator createStringLengthValidator() {
		StringLengthValidatorImpl stringLengthValidator = new StringLengthValidatorImpl();
		return stringLengthValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Success createSuccess() {
		SuccessImpl success = new SuccessImpl();
		return success;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dsml.web.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebPackage getWebPackage() {
		return (WebPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebPackage getPackage() {
		return WebPackage.eINSTANCE;
	}

} //WebFactoryImpl
