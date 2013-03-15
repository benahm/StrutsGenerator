/**
 */
package dsml.visitor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import dsml.struts.toolbox.ResourceMap;
import dsml.struts.toolbox.Tools;
import dsml.struts.toolbox.Validation;
import dsml.struts.toolbox.ValidationMap;
import dsml.visitor.POJOVisitor;
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
import dsml.web.Text;
import dsml.web.TextArea;
import dsml.web.TextField;
import dsml.web.TimeValidator;
import dsml.web.Type;
import dsml.web.TypeValidator;
import dsml.web.URLValidator;
import dsml.web.Validator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>POJO Visitor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.visitor.impl.POJOVisitorImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class POJOVisitorImpl extends EObjectImpl implements POJOVisitor {
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
	protected POJOVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitorPackage.Literals.POJO_VISITOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisitorPackage.POJO_VISITOR__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisitorPackage.POJO_VISITOR__TAG:
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
			case VisitorPackage.POJO_VISITOR__TAG:
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
			case VisitorPackage.POJO_VISITOR__TAG:
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
			case VisitorPackage.POJO_VISITOR__TAG:
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

	private String gen;
	private Validation validation;

	public POJOVisitorImpl(String tag) {
		this.tag = tag;
	}

	@Override
	public String treatElement(Text element) {
		return "";
	}

	@Override
	public String treatElement(Link element) {
		return "";
	}

	@Override
	public String treatElement(Form element) {
		StringBuffer form = new StringBuffer();
		validation = new Validation();
		// field
		gen = "field";
		form.append("\n//Fields\n");
		for (FormElement formElement : element.getFormElements()) {
			form.append(formElement.accept(this));
			form.append("\n");
		}
		// setters
		gen = "set";
		form.append("\n//Setters\n");
		for (FormElement formElement : element.getFormElements()) {
			form.append(formElement.accept(this));
			form.append("\n");
		}
		// getters
		gen = "get";
		form.append("\n//Getters\n");
		for (FormElement formElement : element.getFormElements()) {
			form.append(formElement.accept(this));
			form.append("\n");
		}
		ValidationMap.add(Tools.capitalize(element.getAction()), validation);
		return form.toString();
	}

	@Override
	public String treatElement(Label element) {
		return "";
	}

	@Override
	public String treatElement(TextField element) {
		String name = Tools.unCapitalize(element.getName());
		if (gen == "field") {
			EList<Validator> validators = element.getValidator();
			for (Validator validator : validators) {
				validation.add(validator.accept(this).replace("$", name));
			}
			return "private String " + name + ";\n";
		}
		if (gen == "set")
			return "public void set" + Tools.capitalize(name) + "(String "
					+ name + "Arg){\n" + "	this." + name + "=" + name
					+ "Arg;\n" + "}\n";
		if (gen == "get")
			return "public String get" + Tools.capitalize(name) + "(){\n"
					+ "	return " + name + ";\n" + "}\n";
		return "";
	}

	@Override
	public String treatElement(TextArea element) {
		String name = Tools.unCapitalize(element.getName());
		if (gen == "field") {
			EList<Validator> validators = element.getValidator();
			for (Validator validator : validators) {
				validation.add(validator.accept(this).replace("$", name));
			}
			return "private String " + name + ";\n";
		}
		if (gen == "set")
			return "public void set" + Tools.capitalize(name) + "(String "
					+ name + "Arg){\n" + "	this." + name + "=" + name
					+ "Arg;\n" + "}\n";
		if (gen == "get")
			return "public String get" + Tools.capitalize(name) + "(){\n"
					+ "	return " + name + ";\n" + "}\n";
		return "";
	}

	@Override
	public String treatElement(PasswordField element) {
		String name = Tools.unCapitalize(element.getName());
		if (gen == "field") {
			EList<Validator> validators = element.getValidator();
			for (Validator validator : validators) {
				validation.add(validator.accept(this).replace("$", name));
			}
			return "private String " + name + ";\n";
		}
		if (gen == "set")
			return "public void set" + Tools.capitalize(name) + "(String "
					+ name + "Arg){\n" + "	this." + name + "=" + name
					+ "Arg;\n" + "}\n";
		if (gen == "get")
			return "public String get" + Tools.capitalize(name) + "(){\n"
					+ "	return " + name + ";\n" + "}\n";
		return "";
	}

	@Override
	public String treatElement(Hidden element) {
		String name = Tools.unCapitalize(element.getName());
		if (gen == "field")
			return "private String " + name + ";\n";
		if (gen == "set")
			return "public void set" + Tools.capitalize(name) + "(String "
					+ name + "Arg){\n" + "	this." + name + "=" + name
					+ "Arg;\n" + "}\n";
		if (gen == "get")
			return "public String get" + Tools.capitalize(name) + "(){\n"
					+ "	return " + name + ";\n" + "}\n";
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
		String name = Tools.unCapitalize(element.getName());
		if (gen == "field")
			return "private boolean " + name + ";\n";
		if (gen == "set")
			return "public void set" + Tools.capitalize(name) + "(boolean "
					+ name + "Arg){\n" + "	this." + name + "=" + name
					+ "Arg;\n" + "}\n";
		if (gen == "get")
			return "public boolean get" + Tools.capitalize(name) + "(){\n"
					+ "	return " + name + ";\n" + "}\n";
		return "";
	}

	@Override
	public String treatElement(RadioButton element) {
		StringBuffer s = new StringBuffer();
		String name = Tools.unCapitalize(element.getName());
		s.append("public enum radioEnum" + Tools.capitalize(name) + " { ");
		for (Item i : element.getItems()) {
			if (i.getValue() != null)
				s.append(i.getValue() + ",");
		}
		s.delete(s.length() - 1, s.length());
		s.append("}\n");
		s.append("private radioEnum" + Tools.capitalize(name) + " " + name
				+ ";\n");
		if (gen == "field")
			return s.toString();
		if (gen == "set")
			return "public void set" + Tools.capitalize(name) + "(String" + " "
					+ name + "Arg){\n" + "	this." + name + "=" + "radioEnum"
					+ Tools.capitalize(name) + ".valueOf(" + name + "Arg);\n "
					+ "}\n";
		if (gen == "get")
			return "public " + "radioEnum" + Tools.capitalize(name) + " get"
					+ Tools.capitalize(name) + "(){\n" + "	return " + name
					+ ";\n" + "}\n";
		return "";
	}

	@Override
	public String treatElement(Select element) {
		StringBuffer s = new StringBuffer();
		String name = Tools.unCapitalize(element.getName());
		s.append("public enum selectEnum" + Tools.capitalize(name) + " { ");
		for (Item i : element.getItems()) {
			if (i.getValue() != null)
				s.append(i.getValue() + ",");
		}
		s.delete(s.length() - 1, s.length());
		s.append("}\n");
		s.append("private selectEnum" + Tools.capitalize(name) + " " + name
				+ ";\n");
		if (gen == "field")
			return s.toString();
		if (gen == "set")
			return "public void set" + Tools.capitalize(name) + "(String" + " "
					+ name + "Arg){\n" + "	this." + name + "=" + "selectEnum"
					+ Tools.capitalize(name) + ".valueOf(" + name + "Arg);\n"
					+ "}\n";
		if (gen == "get")
			return "public " + "selectEnum" + Tools.capitalize(name) + " get"
					+ Tools.capitalize(name) + "(){\n" + "	return " + name
					+ ";\n" + "}\n";
		return "";
	}

	/**
	 * Validations
	 */

	@Override
	public String treatElement(DateValidator element) {
		StringBuffer validator = new StringBuffer();
		validator
				.append("		DateValidator dateValidator$=DateValidator.getInstance();\n		"
						+ "if(!dateValidator$.isValid(this.$, \"dd/MM/yyyy\", false))\n			errors.add(\"$\",new ActionMessage(\"errors.$.date\",\"$\"));\n	");
		return validator.toString();
	}

	@Override
	public String treatElement(EmailValidator element) {
		StringBuffer validator = new StringBuffer();
		validator
				.append("		EmailValidator emailValidator$=EmailValidator.getInstance();\n		"
						+ "if(!emailValidator$.isValid(this.$))\n			"
						+ "errors.add(\"$\",new ActionMessage(\"errors.$.email\",\"$\"));\n");
		return validator.toString();
	}

	@Override
	public String treatElement(Required element) {
		StringBuffer validator = new StringBuffer();
		validator
				.append("		if(this.$ == null || this.$.trim().equals(\"\"))\n"
						+ "			errors.add(\"$\", new ActionMessage(\"errors.$.required\",\"$\"));\n");
		return validator.toString();
	}

	@Override
	public String treatElement(TimeValidator element) {

		StringBuffer validator = new StringBuffer();
		validator
				.append("		TimeValidator timeValidator$=new TimeValidator();\n		"
						+ "if(timeValidator$.validate(this.$, \"H:m\")==null)\n			"
						+ "errors.add(\"$\",new ActionMessage(\"errors.$.time\",\"$\"));\n");
		return validator.toString();
	}

	@Override
	public String treatElement(URLValidator element) {
		StringBuffer validator = new StringBuffer();
		validator
				.append("		String[] schemes = {\"http\",\"https\"};\n"
						+ "		UrlValidator urlValidator$ = new UrlValidator(schemes);\n		"
						+ "if (!urlValidator$.isValid(this.$)) {\n			"
						+ "errors.add(\"$\",new ActionMessage(\"errors.$.url\",\"$\"));\n		"
						+ "}\n");
		return validator.toString();
	}

	@Override
	public String treatElement(TypeValidator element) {
		StringBuffer validator = new StringBuffer();
		if (element.getType() == Type.INT) {
			validator
					.append("		try {\n"
							+ "			Integer.parseInt(this.$);\n"
							+ "		} catch (NumberFormatException e) {\n"
							+ "			errors.add(\"$\", new ActionMessage(\"errors.$.type.int\",\"$\"));\n		}");
			return validator.toString();
		}
		if (element.getType() == Type.FLOAT) {
			validator
					.append("		try {\n"
							+ "			Double.parseDouble(this.$);\n"
							+ "		} catch (NumberFormatException e) {\n"
							+ "			errors.add(\"$\", new ActionMessage(\"errors.$.type.float\",\"$\"));\n		}");
			return validator.toString();
		}
		return "";

	}

	@Override
	public String treatElement(GreaterThanValidator element) {
		StringBuffer validator = new StringBuffer();
		validator
				.append("		try{\n"
						+ "		if(Double.parseDouble(this.$)<"
						+ element.getValue()
						+ ")\n"
						+ "			errors.add(\"$\",new ActionMessage(\"errors.$.greaterthan\",\"$\"));\n"
						+ "		}catch(NumberFormatException e){\n"
						+ "			errors.add(\"$\",new ActionMessage(\"errors.$.type.float\",\"$\"));\n"
						+ "		}\n	");
		return validator.toString();
	}

	@Override
	public String treatElement(LessThanValidator element) {
		StringBuffer validator = new StringBuffer();
		validator
				.append("		try{\n"
						+ "		if(Double.parseDouble(this.$)>"
						+ element.getValue()
						+ ")\n"
						+ "			errors.add(\"$\",new ActionMessage(\"errors.$.lessthan\",\"$\"));\n"
						+ "		}catch(NumberFormatException e){\n"
						+ "			errors.add(\"$\",new ActionMessage(\"errors.$.type.float\",\"$\"));\n"
						+ "		}\n	");
		return validator.toString();
	}

	@Override
	public String treatElement(BetweenValidator element) {
		StringBuffer validator = new StringBuffer();
		validator
				.append("		try{\n"
						+ "		if(Double.parseDouble(this.$)<"
						+ element.getValueL()
						+ " || "
						+ "Integer.parseInt(this.$)>"
						+ element.getValueG()
						+ ")\n"
						+ "			errors.add(\"$\",new ActionMessage(\"errors.$.between\",\"$\"));\n"
						+ "		}catch(NumberFormatException e){\n"
						+ "			errors.add(\"$\",new ActionMessage(\"errors.$.type.float\",\"$\"));\n"
						+ "		}\n	");
		return validator.toString();
	}

	@Override
	public String treatElement(RegexValidator element) {
		StringBuffer validator = new StringBuffer();
		validator
				.append("		RegexValidator regexValidator$=new RegexValidator(\""
						+ element.getRegex()
						+ "\");\n		"
						+ "if(!regexValidator$.isValid(this.$))\n			"
						+ "errors.add(\"$\",new ActionMessage(\"errors.$.regex\",\"$\"));");
		return validator.toString();
	}

	@Override
	public String treatElement(StringLengthValidator element) {
		StringBuffer validator = new StringBuffer();
		validator
				.append("		if(this.$.length()<="
						+ element.getMin()
						+ "|| this.$.length()>="
						+ element.getMax()
						+ ")\n"
						+ "			errors.add(\"$\",new ActionMessage(\"errors.$.stringlength\",\"$\"));\n	");
		return validator.toString();
	}

} // POJOVisitorImpl
