/**
 */
package dsml.web.impl;

import dsml.visitor.Visitor;

import dsml.web.BetweenValidator;
import dsml.web.WebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Between Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.web.impl.BetweenValidatorImpl#getValueL <em>Value L</em>}</li>
 *   <li>{@link dsml.web.impl.BetweenValidatorImpl#getValueG <em>Value G</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BetweenValidatorImpl extends EObjectImpl implements BetweenValidator {
	/**
	 * The default value of the '{@link #getValueL() <em>Value L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueL()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_L_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValueL() <em>Value L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueL()
	 * @generated
	 * @ordered
	 */
	protected int valueL = VALUE_L_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueG() <em>Value G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueG()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_G_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValueG() <em>Value G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueG()
	 * @generated
	 * @ordered
	 */
	protected int valueG = VALUE_G_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BetweenValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.BETWEEN_VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValueL() {
		return valueL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueL(int newValueL) {
		int oldValueL = valueL;
		valueL = newValueL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.BETWEEN_VALIDATOR__VALUE_L, oldValueL, valueL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValueG() {
		return valueG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueG(int newValueG) {
		int oldValueG = valueG;
		valueG = newValueG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.BETWEEN_VALIDATOR__VALUE_G, oldValueG, valueG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String accept(Visitor visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebPackage.BETWEEN_VALIDATOR__VALUE_L:
				return getValueL();
			case WebPackage.BETWEEN_VALIDATOR__VALUE_G:
				return getValueG();
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
			case WebPackage.BETWEEN_VALIDATOR__VALUE_L:
				setValueL((Integer)newValue);
				return;
			case WebPackage.BETWEEN_VALIDATOR__VALUE_G:
				setValueG((Integer)newValue);
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
			case WebPackage.BETWEEN_VALIDATOR__VALUE_L:
				setValueL(VALUE_L_EDEFAULT);
				return;
			case WebPackage.BETWEEN_VALIDATOR__VALUE_G:
				setValueG(VALUE_G_EDEFAULT);
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
			case WebPackage.BETWEEN_VALIDATOR__VALUE_L:
				return valueL != VALUE_L_EDEFAULT;
			case WebPackage.BETWEEN_VALIDATOR__VALUE_G:
				return valueG != VALUE_G_EDEFAULT;
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
		result.append(" (valueL: ");
		result.append(valueL);
		result.append(", valueG: ");
		result.append(valueG);
		result.append(')');
		return result.toString();
	}

} //BetweenValidatorImpl
