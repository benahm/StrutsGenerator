/**
 */
package dsml.visitor.impl;

import dsml.struts.toolbox.ResourceMap;
import dsml.struts.toolbox.Tools;
import dsml.visitor.ResourceVisitor;
import dsml.visitor.VisitorPackage;
import dsml.web.BetweenValidator;
import dsml.web.CancelButton;
import dsml.web.CheckBox;
import dsml.web.DateValidator;
import dsml.web.EmailValidator;
import dsml.web.Form;
import dsml.web.FormElement;
import dsml.web.GreaterThanValidator;
import dsml.web.Hidden;
import dsml.web.Label;
import dsml.web.LessThanValidator;
import dsml.web.Link;
import dsml.web.PasswordField;
import dsml.web.RadioButton;
import dsml.web.RegexValidator;
import dsml.web.Required;
import dsml.web.ResetButton;
import dsml.web.Select;
import dsml.web.StringLengthValidator;
import dsml.web.SubmitButton;
import dsml.web.Text;
import dsml.web.TextArea;
import dsml.web.TextField;
import dsml.web.TimeValidator;
import dsml.web.Type;
import dsml.web.TypeValidator;
import dsml.web.URLValidator;
import dsml.web.Validator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource Visitor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.visitor.impl.ResourceVisitorImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceVisitorImpl extends EObjectImpl implements ResourceVisitor {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitorPackage.Literals.RESOURCE_VISITOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitorPackage.RESOURCE_VISITOR__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisitorPackage.RESOURCE_VISITOR__TAG:
				return getTag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisitorPackage.RESOURCE_VISITOR__TAG:
				setTag((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisitorPackage.RESOURCE_VISITOR__TAG:
				setTag(TAG_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisitorPackage.RESOURCE_VISITOR__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

	public ResourceVisitorImpl(String tag) {
		this.tag = tag;
	}

	int indexText = 0;
	int indexLink = 0;

	@Override
	public String treatElement(Text element) {
		String entry = "text" + (indexText++) + "=" + element.getValue();
		if (tag != TAG_EDEFAULT)
			entry = tag + "." + entry;
		ResourceMap.add(entry);
		return entry + "\n";
	}
	
	@Override
	public String treatElement(Link element){
		String entry = "link" + (indexLink++) + "=" + element.getValue();
		if (tag != TAG_EDEFAULT)
			entry = tag + "." + entry;
		ResourceMap.add(entry);
		return entry + "\n";
	}

	@Override
	public String treatElement(Form element) {
		StringBuffer form = new StringBuffer();
		String accept, action;
		for (FormElement formElement : element.getFormElements()) {
			action = element.getAction();
			accept = formElement.accept(this);
			if (!accept.startsWith("errors")) {
				if (action != "" && action != null)
					accept = action + "." + accept;
				if (tag != TAG_EDEFAULT)
					accept = tag + "." + accept;
			}
			if (accept != null && accept.contains("=")) {
				form.append(accept);
				ResourceMap.add(accept);
				form.append("\n");
			}

		}

		return form.toString();
	}

	@Override
	public String treatElement(Label element) {
		return element.getName() + "=" + element.getValue();
	}

	@Override
	public String treatElement(TextField element) {
		StringBuffer validations = new StringBuffer();
		EList<Validator> validators = element.getValidator();
		for (Validator validator : validators) {
			String name = Tools.unCapitalize(element.getName());
			validations.append(validator.accept(this).replace("$", name));
			validations.append("\n");
		}
		return validations.toString();
	}

	@Override
	public String treatElement(TextArea element) {
		StringBuffer validations = new StringBuffer();
		EList<Validator> validators = element.getValidator();
		for (Validator validator : validators) {
			String name = Tools.unCapitalize(element.getName());
			validations.append(validator.accept(this).replace("$", name));
			validations.append("\n");
		}
		return validations.toString();
	}

	@Override
	public String treatElement(PasswordField element) {
		StringBuffer validations = new StringBuffer();
		EList<Validator> validators = element.getValidator();
		for (Validator validator : validators) {
			String name = Tools.unCapitalize(element.getName());
			validations.append(validator.accept(this).replace("$", name));
			validations.append("\n");
		}
		return validations.toString();
	}

	@Override
	public String treatElement(Hidden element) {
		return "";
	}

	@Override
	public String treatElement(SubmitButton element) {
		return "";
	}

	@Override
	public String treatElement(CancelButton element) {
		return "";
	}

	@Override
	public String treatElement(ResetButton element) {
		return "";
	}

	@Override
	public String treatElement(CheckBox element) {
		return "";
	}

	@Override
	public String treatElement(RadioButton element) {
		return "";
	}

	@Override
	public String treatElement(Select element) {
		return "";
	}

	@Override
	public String treatElement(DateValidator element) {
		return "errors.$.date= $ must be a date";
	}

	@Override
	public String treatElement(EmailValidator element) {
		return "errors.$.email= $ must be an Email ";
	}

	@Override
	public String treatElement(Required element) {
		return "errors.$.required= $ is required ";
	}

	@Override
	public String treatElement(TimeValidator element) {
		return "errors.$.time= $ must be a time HH:MM ";
	}

	@Override
	public String treatElement(URLValidator element) {
		// TODO Auto-generated method stub
		return "errors.$.url= $ must a URL ";
	}

	@Override
	public String treatElement(TypeValidator element) {
		if (element.getType() == Type.INT)
			return "errors.$.type.int= $ must be integer ";
		else
			return "errors.$.type.float= $ must be float ";
	}

	@Override
	public String treatElement(GreaterThanValidator element) {
		return "errors.$.greaterthan= $ must be greater than :"+element.getValue()+" ";
	}

	@Override
	public String treatElement(LessThanValidator element) {
		return "errors.$.lessthan= $ must be less than :"+element.getValue()+" ";
	}

	@Override
	public String treatElement(BetweenValidator element) {
		return "errors.$.between= $ must be between :"+element.getValueL()+ " and "+element.getValueG()+" " ;
	}

	@Override
	public String treatElement(RegexValidator element) {
		return "errors.$.regex= $ must match the pattern :"+element.getRegex();
	}

	@Override
	public String treatElement(StringLengthValidator element) {
		if(element.getMin()<element.getMax())
		return "errors.$.stringlength= $ length must be between  :"+ element.getMin()+" and "+element.getMax()+" ";
		return "";
	}

} // ResourceVisitorImpl
