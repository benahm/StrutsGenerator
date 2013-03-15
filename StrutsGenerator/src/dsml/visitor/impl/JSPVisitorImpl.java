/**
 */
package dsml.visitor.impl;

import dsml.struts.toolbox.ResourceMap;
import dsml.struts.toolbox.Tools;
import dsml.visitor.JSPVisitor;
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
import dsml.web.TypeValidator;
import dsml.web.URLValidator;
import dsml.web.impl.LabelImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSP Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.visitor.impl.JSPVisitorImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JSPVisitorImpl extends EObjectImpl implements JSPVisitor {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSPVisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitorPackage.Literals.JSP_VISITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitorPackage.JSP_VISITOR__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisitorPackage.JSP_VISITOR__TAG:
				return getTag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisitorPackage.JSP_VISITOR__TAG:
				setTag((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisitorPackage.JSP_VISITOR__TAG:
				setTag(TAG_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisitorPackage.JSP_VISITOR__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	

	private String HtmlTag;

	public JSPVisitorImpl(String HtmlTag) {
		this.HtmlTag = HtmlTag;
	}

	@Override
	public String treatElement(Text element) {
		String value = element.getValue();
		return "\t<h1>"+"<bean:message key=\""+ResourceMap.get(value)+"\" />"+"</h1>";
	}
	
	@Override
	public String treatElement(Link element){
		String value = element.getValue();
		Page linkedPage = element.getLinkedPage();
		String actionDo = (linkedPage==null)?"#":"/"+linkedPage.getName()+".do";
		return "\t<" + HtmlTag + ":link action=\"" +actionDo+"\"><bean:message key=\""+ResourceMap.get(value)+"\"/></"+ HtmlTag + ":link>";
	}

	@Override
	public String treatElement(Form element) {
		StringBuffer form = new StringBuffer();
		form.append("<" + HtmlTag + ":form action=\"/" + element.getAction()+"\" >");
		form.append("\n<table>\n");
		boolean isLabel=false;
		for (FormElement formElement : element.getFormElements()) {
			if(!isLabel)
			form.append("\t<tr>\n");
			form.append("\t\t<td>\n");
			form.append("\t\t\t"+formElement.accept(this));
			form.append("\t\t</td>\n");
			if(formElement.getClass()==LabelImpl.class) isLabel=true;
			else isLabel=false;
			if(!isLabel)
			form.append("\t</tr>\n");
			
		}
		form.append("</table>\n");
		form.append("</" + HtmlTag + ":form>\n");
		return form.toString();
	}

	@Override
	public String treatElement(Label element) {
		String value =element.getValue(); 
		return "<" + "bean" + ":message property=\"" + element.getName()
				+ "\" key=\"" + ResourceMap.get(value) + "\"/>\n";
	}


	@Override
	public String treatElement(TextField element) {
		StringBuffer code = new StringBuffer();
		String name = Tools.unCapitalize(element.getName());
		code.append("<" + HtmlTag + ":text property=\"" + name
				+ "\"  errorStyle=\"background-color: red\"");
		code.append(" />\n");
		return code.toString();
	}

	@Override
	public String treatElement(TextArea element) {
		StringBuffer code = new StringBuffer();
		String name = Tools.unCapitalize(element.getName());
		code.append("<" + HtmlTag + ":textarea property=\"" + name
				+ "\"  errorStyle=\"background-color: red\"");
		code.append(" />\n");
		return code.toString();
	}

	@Override
	public String treatElement(PasswordField element) {
		StringBuffer code = new StringBuffer();
		String name = Tools.unCapitalize(element.getName());
		code.append("<" + HtmlTag + ":password property=\"" + name
				+ "\"  errorStyle=\"background-color: red\"");
		code.append(" />\n");
		return code.toString();
	}

	@Override
	public String treatElement(Hidden element) {
		StringBuffer code = new StringBuffer();
		String name = Tools.unCapitalize(element.getName());
		code.append("<" + HtmlTag + ":hidden property=\"" + name
				+ "\"");
		code.append(" />\n");
		return code.toString();
	}

	@Override
	public String treatElement(SubmitButton element) {
		StringBuffer code = new StringBuffer();
		String name = Tools.unCapitalize(element.getName());
		code.append("<" + HtmlTag + ":submit property=\"" + name
				+ "\"");
		if (element.getValue() != null)
			code.append(" value=\"" + element.getValue() + "\"");
		code.append(" />\n");
		return code.toString();
	}

	@Override
	public String treatElement(CancelButton element) {
		StringBuffer code = new StringBuffer();
		String name = Tools.unCapitalize(element.getName());
		code.append("<" + HtmlTag + ":cancel property=\"" + name
				+ "\"");
		if (element.getValue() != null)
			code.append(" value=\"" + element.getValue() + "\"");
		code.append(" />\n");
		return code.toString();
	}

	@Override
	public String treatElement(ResetButton element) {
		StringBuffer code = new StringBuffer();
		String name = Tools.unCapitalize(element.getName());
		code.append("<" + HtmlTag + ":reset property=\"" + name
				+ "\"");
		if (element.getValue() != null)
			code.append(" value=\"" + element.getValue() + "\"");
		code.append(" />\n");
		return code.toString();
	}

	@Override
	public String treatElement(CheckBox element) {
		StringBuffer code = new StringBuffer();
		code.append("<" + HtmlTag + ":checkbox ");
		String name = Tools.unCapitalize(element.getName());
		code.append("property=\"" + name + "\" ");

		String value = (element.getValue() == null) ? "on" : element.getValue();
		code.append("value=\"" + value + "\" ");
		code.append("/>\n");

		return code.toString();
	}

	@Override
	public String treatElement(RadioButton element) {
		StringBuffer code = new StringBuffer();
		String name = Tools.unCapitalize(element.getName());
		for (Item item : element.getItems()) {
			if(item.getValue()==null) continue;
			code.append("<" + HtmlTag + ":radio ");
			code.append("property=\"" + name + "\" ");
			code.append("value=\"" + item.getValue() + "\" ");
			code.append("/>\n");
		}
		
		return code.toString();
	}

	@Override
	public String treatElement(Select element) {
		StringBuffer code = new StringBuffer();
		String name = Tools.unCapitalize(element.getName());
		code.append("<" + HtmlTag + ":select property=\"" + name
				+ "\" ");
		if (element.getSize() != 0)
			code.append("size=\"" + element.getSize() + "\"");
		code.append(" >\n");
		int i = 0;
		for (Item item : element.getItems()) {
			if(item.getValue()==null) continue;
			code.append("\t\t<html:option value=\"" + i + "\">select "
					+ item.getValue() + "</html:option>\n");
			i++;
		}
		code.append("\t</" + HtmlTag + ":select>\n");

		return code.toString();
	}

	@Override
	public String treatElement(DateValidator element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String treatElement(EmailValidator element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String treatElement(Required element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String treatElement(TimeValidator element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String treatElement(URLValidator element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String treatElement(TypeValidator element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String treatElement(GreaterThanValidator element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String treatElement(LessThanValidator element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String treatElement(BetweenValidator element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String treatElement(RegexValidator element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String treatElement(StringLengthValidator element) {
		// TODO Auto-generated method stub
		return null;
	}

} //JSPVisitorImpl
