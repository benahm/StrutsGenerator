/**
 */
package dsml.visitor;

import org.eclipse.emf.ecore.EObject;

import dsml.web.BetweenValidator;
import dsml.web.CancelButton;
import dsml.web.CheckBox;
import dsml.web.DateValidator;
import dsml.web.EmailValidator;
import dsml.web.Form;
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
import dsml.web.TypeValidator;
import dsml.web.URLValidator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.visitor.Visitor#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.visitor.VisitorPackage#getVisitor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Visitor extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see dsml.visitor.VisitorPackage#getVisitor_Tag()
	 * @model
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link dsml.visitor.Visitor#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);
	
		//text
		public String treatElement(Text element);
		
		//link
		public String treatElement(Link element);
		
		//Form
		public String treatElement(Form element);
		
		//Label
		public String treatElement(Label element);
		
		//Field
		public String treatElement(TextField element);
		public String treatElement(TextArea element);
		public String treatElement(PasswordField element);
		public String treatElement(Hidden element);
		
		//Button
		public String treatElement(SubmitButton element);
		public String treatElement(CancelButton element);
		public String treatElement(ResetButton element);
		
		//ListField
		public String treatElement(CheckBox element);
		public String treatElement(RadioButton element);
		public String treatElement(Select element);
		
		// validator
		public String treatElement(DateValidator element);
		public String treatElement(EmailValidator element);
		public String treatElement(Required element);
		public String treatElement(TimeValidator element);
		public String treatElement(URLValidator element);
		public String treatElement(TypeValidator element);
		public String treatElement(GreaterThanValidator element);
		public String treatElement(LessThanValidator element);
		public String treatElement(BetweenValidator element);
		public String treatElement(RegexValidator element);
		public String treatElement(StringLengthValidator element);

} // Visitor
