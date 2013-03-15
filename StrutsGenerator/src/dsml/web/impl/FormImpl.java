/**
 */
package dsml.web.impl;

import dsml.visitor.Visitor;

import dsml.web.Form;
import dsml.web.FormElement;
import dsml.web.Success;
import dsml.web.Page;
import dsml.web.WebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.web.impl.FormImpl#getFormElements <em>Form Elements</em>}</li>
 *   <li>{@link dsml.web.impl.FormImpl#getAction <em>Action</em>}</li>
 *   <li>{@link dsml.web.impl.FormImpl#getSuccess <em>Success</em>}</li>
 *   <li>{@link dsml.web.impl.FormImpl#getError <em>Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends EObjectImpl implements Form {
	/**
	 * The cached value of the '{@link #getFormElements() <em>Form Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FormElement> formElements;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuccess() <em>Success</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccess()
	 * @generated
	 * @ordered
	 */
	protected Success success;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected dsml.web.Error error;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormElement> getFormElements() {
		if (formElements == null) {
			formElements = new EObjectContainmentEList<FormElement>(FormElement.class, this, WebPackage.FORM__FORM_ELEMENTS);
		}
		return formElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.FORM__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Success getSuccess() {
		return success;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccess(Success newSuccess, NotificationChain msgs) {
		Success oldSuccess = success;
		success = newSuccess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebPackage.FORM__SUCCESS, oldSuccess, newSuccess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccess(Success newSuccess) {
		if (newSuccess != success) {
			NotificationChain msgs = null;
			if (success != null)
				msgs = ((InternalEObject)success).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebPackage.FORM__SUCCESS, null, msgs);
			if (newSuccess != null)
				msgs = ((InternalEObject)newSuccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebPackage.FORM__SUCCESS, null, msgs);
			msgs = basicSetSuccess(newSuccess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.FORM__SUCCESS, newSuccess, newSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dsml.web.Error getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetError(dsml.web.Error newError, NotificationChain msgs) {
		dsml.web.Error oldError = error;
		error = newError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebPackage.FORM__ERROR, oldError, newError);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(dsml.web.Error newError) {
		if (newError != error) {
			NotificationChain msgs = null;
			if (error != null)
				msgs = ((InternalEObject)error).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebPackage.FORM__ERROR, null, msgs);
			if (newError != null)
				msgs = ((InternalEObject)newError).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebPackage.FORM__ERROR, null, msgs);
			msgs = basicSetError(newError, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.FORM__ERROR, newError, newError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String accept(Visitor visitor) {
		return visitor.treatElement(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebPackage.FORM__FORM_ELEMENTS:
				return ((InternalEList<?>)getFormElements()).basicRemove(otherEnd, msgs);
			case WebPackage.FORM__SUCCESS:
				return basicSetSuccess(null, msgs);
			case WebPackage.FORM__ERROR:
				return basicSetError(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebPackage.FORM__FORM_ELEMENTS:
				return getFormElements();
			case WebPackage.FORM__ACTION:
				return getAction();
			case WebPackage.FORM__SUCCESS:
				return getSuccess();
			case WebPackage.FORM__ERROR:
				return getError();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebPackage.FORM__FORM_ELEMENTS:
				getFormElements().clear();
				getFormElements().addAll((Collection<? extends FormElement>)newValue);
				return;
			case WebPackage.FORM__ACTION:
				setAction((String)newValue);
				return;
			case WebPackage.FORM__SUCCESS:
				setSuccess((Success)newValue);
				return;
			case WebPackage.FORM__ERROR:
				setError((dsml.web.Error)newValue);
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
			case WebPackage.FORM__FORM_ELEMENTS:
				getFormElements().clear();
				return;
			case WebPackage.FORM__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case WebPackage.FORM__SUCCESS:
				setSuccess((Success)null);
				return;
			case WebPackage.FORM__ERROR:
				setError((dsml.web.Error)null);
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
			case WebPackage.FORM__FORM_ELEMENTS:
				return formElements != null && !formElements.isEmpty();
			case WebPackage.FORM__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case WebPackage.FORM__SUCCESS:
				return success != null;
			case WebPackage.FORM__ERROR:
				return error != null;
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
		result.append(" (action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //FormImpl
