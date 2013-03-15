/**
 */
package dsml.web.impl;

import dsml.web.Page;
import dsml.web.Success;
import dsml.web.WebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Success</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.web.impl.SuccessImpl#getSuccessPage <em>Success Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SuccessImpl extends EObjectImpl implements Success {
	/**
	 * The cached value of the '{@link #getSuccessPage() <em>Success Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessPage()
	 * @generated
	 * @ordered
	 */
	protected Page successPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.SUCCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getSuccessPage() {
		if (successPage != null && successPage.eIsProxy()) {
			InternalEObject oldSuccessPage = (InternalEObject)successPage;
			successPage = (Page)eResolveProxy(oldSuccessPage);
			if (successPage != oldSuccessPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebPackage.SUCCESS__SUCCESS_PAGE, oldSuccessPage, successPage));
			}
		}
		return successPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetSuccessPage() {
		return successPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessPage(Page newSuccessPage) {
		Page oldSuccessPage = successPage;
		successPage = newSuccessPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.SUCCESS__SUCCESS_PAGE, oldSuccessPage, successPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebPackage.SUCCESS__SUCCESS_PAGE:
				if (resolve) return getSuccessPage();
				return basicGetSuccessPage();
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
			case WebPackage.SUCCESS__SUCCESS_PAGE:
				setSuccessPage((Page)newValue);
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
			case WebPackage.SUCCESS__SUCCESS_PAGE:
				setSuccessPage((Page)null);
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
			case WebPackage.SUCCESS__SUCCESS_PAGE:
				return successPage != null;
		}
		return super.eIsSet(featureID);
	}

} //SuccessImpl
