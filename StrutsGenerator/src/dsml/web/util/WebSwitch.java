/**
 */
package dsml.web.util;

import dsml.web.BetweenValidator;
import dsml.web.Button;
import dsml.web.CancelButton;
import dsml.web.CheckBox;
import dsml.web.DateValidator;
import dsml.web.EmailValidator;
import dsml.web.Field;
import dsml.web.Form;
import dsml.web.FormElement;
import dsml.web.GreaterThanValidator;
import dsml.web.Hidden;
import dsml.web.Item;
import dsml.web.Label;
import dsml.web.LessThanValidator;
import dsml.web.Link;
import dsml.web.ListField;
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
import dsml.web.TypeValidator;
import dsml.web.URLValidator;
import dsml.web.Validator;
import dsml.web.WebPackage;
import dsml.web.Website;
import dsml.web.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dsml.web.WebPackage
 * @generated
 */
public class WebSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebSwitch() {
		if (modelPackage == null) {
			modelPackage = WebPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WebPackage.WEBSITE: {
				Website website = (Website)theEObject;
				T result = caseWebsite(website);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseFormElement(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.TEXT_FIELD: {
				TextField textField = (TextField)theEObject;
				T result = caseTextField(textField);
				if (result == null) result = caseField(textField);
				if (result == null) result = caseFormElement(textField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.PASSWORD_FIELD: {
				PasswordField passwordField = (PasswordField)theEObject;
				T result = casePasswordField(passwordField);
				if (result == null) result = caseField(passwordField);
				if (result == null) result = caseFormElement(passwordField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseFormElement(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseFormElement(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.RADIO_BUTTON: {
				RadioButton radioButton = (RadioButton)theEObject;
				T result = caseRadioButton(radioButton);
				if (result == null) result = caseListField(radioButton);
				if (result == null) result = caseFormElement(radioButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.CHECK_BOX: {
				CheckBox checkBox = (CheckBox)theEObject;
				T result = caseCheckBox(checkBox);
				if (result == null) result = caseFormElement(checkBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.SUBMIT_BUTTON: {
				SubmitButton submitButton = (SubmitButton)theEObject;
				T result = caseSubmitButton(submitButton);
				if (result == null) result = caseButton(submitButton);
				if (result == null) result = caseFormElement(submitButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.CANCEL_BUTTON: {
				CancelButton cancelButton = (CancelButton)theEObject;
				T result = caseCancelButton(cancelButton);
				if (result == null) result = caseButton(cancelButton);
				if (result == null) result = caseFormElement(cancelButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.SELECT: {
				Select select = (Select)theEObject;
				T result = caseSelect(select);
				if (result == null) result = caseListField(select);
				if (result == null) result = caseFormElement(select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.LIST_FIELD: {
				ListField listField = (ListField)theEObject;
				T result = caseListField(listField);
				if (result == null) result = caseFormElement(listField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.TEXT_AREA: {
				TextArea textArea = (TextArea)theEObject;
				T result = caseTextArea(textArea);
				if (result == null) result = caseField(textArea);
				if (result == null) result = caseFormElement(textArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.RESET_BUTTON: {
				ResetButton resetButton = (ResetButton)theEObject;
				T result = caseResetButton(resetButton);
				if (result == null) result = caseButton(resetButton);
				if (result == null) result = caseFormElement(resetButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.FORM_ELEMENT: {
				FormElement formElement = (FormElement)theEObject;
				T result = caseFormElement(formElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.HIDDEN: {
				Hidden hidden = (Hidden)theEObject;
				T result = caseHidden(hidden);
				if (result == null) result = caseFormElement(hidden);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.VALIDATOR: {
				Validator validator = (Validator)theEObject;
				T result = caseValidator(validator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.DATE_VALIDATOR: {
				DateValidator dateValidator = (DateValidator)theEObject;
				T result = caseDateValidator(dateValidator);
				if (result == null) result = caseValidator(dateValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.EMAIL_VALIDATOR: {
				EmailValidator emailValidator = (EmailValidator)theEObject;
				T result = caseEmailValidator(emailValidator);
				if (result == null) result = caseValidator(emailValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.REQUIRED: {
				Required required = (Required)theEObject;
				T result = caseRequired(required);
				if (result == null) result = caseValidator(required);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.TIME_VALIDATOR: {
				TimeValidator timeValidator = (TimeValidator)theEObject;
				T result = caseTimeValidator(timeValidator);
				if (result == null) result = caseValidator(timeValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.URL_VALIDATOR: {
				URLValidator urlValidator = (URLValidator)theEObject;
				T result = caseURLValidator(urlValidator);
				if (result == null) result = caseValidator(urlValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.TYPE_VALIDATOR: {
				TypeValidator typeValidator = (TypeValidator)theEObject;
				T result = caseTypeValidator(typeValidator);
				if (result == null) result = caseValidator(typeValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.GREATER_THAN_VALIDATOR: {
				GreaterThanValidator greaterThanValidator = (GreaterThanValidator)theEObject;
				T result = caseGreaterThanValidator(greaterThanValidator);
				if (result == null) result = caseValidator(greaterThanValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.LESS_THAN_VALIDATOR: {
				LessThanValidator lessThanValidator = (LessThanValidator)theEObject;
				T result = caseLessThanValidator(lessThanValidator);
				if (result == null) result = caseValidator(lessThanValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.BETWEEN_VALIDATOR: {
				BetweenValidator betweenValidator = (BetweenValidator)theEObject;
				T result = caseBetweenValidator(betweenValidator);
				if (result == null) result = caseValidator(betweenValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.REGEX_VALIDATOR: {
				RegexValidator regexValidator = (RegexValidator)theEObject;
				T result = caseRegexValidator(regexValidator);
				if (result == null) result = caseValidator(regexValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.STRING_LENGTH_VALIDATOR: {
				StringLengthValidator stringLengthValidator = (StringLengthValidator)theEObject;
				T result = caseStringLengthValidator(stringLengthValidator);
				if (result == null) result = caseValidator(stringLengthValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.SUCCESS: {
				Success success = (Success)theEObject;
				T result = caseSuccess(success);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebPackage.ERROR: {
				dsml.web.Error error = (dsml.web.Error)theEObject;
				T result = caseError(error);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Website</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Website</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebsite(Website object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextField(TextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasswordField(PasswordField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioButton(RadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckBox(CheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submit Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submit Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmitButton(SubmitButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelButton(CancelButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelect(Select object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListField(ListField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextArea(TextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetButton(ResetButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormElement(FormElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hidden</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hidden</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHidden(Hidden object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidator(Validator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateValidator(DateValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailValidator(EmailValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequired(Required object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeValidator(TimeValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLValidator(URLValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeValidator(TypeValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanValidator(GreaterThanValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThanValidator(LessThanValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Between Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Between Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBetweenValidator(BetweenValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regex Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regex Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegexValidator(RegexValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Length Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Length Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLengthValidator(StringLengthValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccess(Success object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseError(dsml.web.Error object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WebSwitch
