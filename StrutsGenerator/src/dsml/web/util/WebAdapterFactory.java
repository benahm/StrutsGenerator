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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dsml.web.WebPackage
 * @generated
 */
public class WebAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WebPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSwitch<Adapter> modelSwitch =
		new WebSwitch<Adapter>() {
			@Override
			public Adapter caseWebsite(Website object) {
				return createWebsiteAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseTextField(TextField object) {
				return createTextFieldAdapter();
			}
			@Override
			public Adapter casePasswordField(PasswordField object) {
				return createPasswordFieldAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseRadioButton(RadioButton object) {
				return createRadioButtonAdapter();
			}
			@Override
			public Adapter caseCheckBox(CheckBox object) {
				return createCheckBoxAdapter();
			}
			@Override
			public Adapter caseSubmitButton(SubmitButton object) {
				return createSubmitButtonAdapter();
			}
			@Override
			public Adapter caseCancelButton(CancelButton object) {
				return createCancelButtonAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseSelect(Select object) {
				return createSelectAdapter();
			}
			@Override
			public Adapter caseListField(ListField object) {
				return createListFieldAdapter();
			}
			@Override
			public Adapter caseTextArea(TextArea object) {
				return createTextAreaAdapter();
			}
			@Override
			public Adapter caseResetButton(ResetButton object) {
				return createResetButtonAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseFormElement(FormElement object) {
				return createFormElementAdapter();
			}
			@Override
			public Adapter caseHidden(Hidden object) {
				return createHiddenAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseValidator(Validator object) {
				return createValidatorAdapter();
			}
			@Override
			public Adapter caseDateValidator(DateValidator object) {
				return createDateValidatorAdapter();
			}
			@Override
			public Adapter caseEmailValidator(EmailValidator object) {
				return createEmailValidatorAdapter();
			}
			@Override
			public Adapter caseRequired(Required object) {
				return createRequiredAdapter();
			}
			@Override
			public Adapter caseTimeValidator(TimeValidator object) {
				return createTimeValidatorAdapter();
			}
			@Override
			public Adapter caseURLValidator(URLValidator object) {
				return createURLValidatorAdapter();
			}
			@Override
			public Adapter caseTypeValidator(TypeValidator object) {
				return createTypeValidatorAdapter();
			}
			@Override
			public Adapter caseGreaterThanValidator(GreaterThanValidator object) {
				return createGreaterThanValidatorAdapter();
			}
			@Override
			public Adapter caseLessThanValidator(LessThanValidator object) {
				return createLessThanValidatorAdapter();
			}
			@Override
			public Adapter caseBetweenValidator(BetweenValidator object) {
				return createBetweenValidatorAdapter();
			}
			@Override
			public Adapter caseRegexValidator(RegexValidator object) {
				return createRegexValidatorAdapter();
			}
			@Override
			public Adapter caseStringLengthValidator(StringLengthValidator object) {
				return createStringLengthValidatorAdapter();
			}
			@Override
			public Adapter caseSuccess(Success object) {
				return createSuccessAdapter();
			}
			@Override
			public Adapter caseError(dsml.web.Error object) {
				return createErrorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Website <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Website
	 * @generated
	 */
	public Adapter createWebsiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.TextField
	 * @generated
	 */
	public Adapter createTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.PasswordField <em>Password Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.PasswordField
	 * @generated
	 */
	public Adapter createPasswordFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.RadioButton
	 * @generated
	 */
	public Adapter createRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.CheckBox
	 * @generated
	 */
	public Adapter createCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.SubmitButton <em>Submit Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.SubmitButton
	 * @generated
	 */
	public Adapter createSubmitButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.CancelButton <em>Cancel Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.CancelButton
	 * @generated
	 */
	public Adapter createCancelButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Select
	 * @generated
	 */
	public Adapter createSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.ListField <em>List Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.ListField
	 * @generated
	 */
	public Adapter createListFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.TextArea
	 * @generated
	 */
	public Adapter createTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.ResetButton <em>Reset Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.ResetButton
	 * @generated
	 */
	public Adapter createResetButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.FormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.FormElement
	 * @generated
	 */
	public Adapter createFormElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Hidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Hidden
	 * @generated
	 */
	public Adapter createHiddenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Validator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Validator
	 * @generated
	 */
	public Adapter createValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.DateValidator <em>Date Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.DateValidator
	 * @generated
	 */
	public Adapter createDateValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.EmailValidator <em>Email Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.EmailValidator
	 * @generated
	 */
	public Adapter createEmailValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Required <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Required
	 * @generated
	 */
	public Adapter createRequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.TimeValidator <em>Time Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.TimeValidator
	 * @generated
	 */
	public Adapter createTimeValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.URLValidator <em>URL Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.URLValidator
	 * @generated
	 */
	public Adapter createURLValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.TypeValidator <em>Type Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.TypeValidator
	 * @generated
	 */
	public Adapter createTypeValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.GreaterThanValidator <em>Greater Than Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.GreaterThanValidator
	 * @generated
	 */
	public Adapter createGreaterThanValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.LessThanValidator <em>Less Than Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.LessThanValidator
	 * @generated
	 */
	public Adapter createLessThanValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.BetweenValidator <em>Between Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.BetweenValidator
	 * @generated
	 */
	public Adapter createBetweenValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.RegexValidator <em>Regex Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.RegexValidator
	 * @generated
	 */
	public Adapter createRegexValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.StringLengthValidator <em>String Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.StringLengthValidator
	 * @generated
	 */
	public Adapter createStringLengthValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Success <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Success
	 * @generated
	 */
	public Adapter createSuccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsml.web.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsml.web.Error
	 * @generated
	 */
	public Adapter createErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WebAdapterFactory
