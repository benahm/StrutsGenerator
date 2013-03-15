/**
 */
package dsml.web.impl;

import dsml.web.Page;
import dsml.web.WebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.web.impl.ErrorImpl#getErrorPage <em>Error Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorImpl extends EObjectImpl implements dsml.web.Error {
	/**
	 * The cached value of the '{@link #getErrorPage() <em>Error Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPage()
	 * @generated
	 * @ordered
	 */
	protected Page errorPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.ERROR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getErrorPage() {
		if (errorPage != null && errorPage.eIsProxy()) {
			InternalEObject oldErrorPage = (InternalEObject)errorPage;
			errorPage = (Page)eResolveProxy(oldErrorPage);
			if (errorPage != oldErrorPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebPackage.ERROR__ERROR_PAGE, oldErrorPage, errorPage));
			}
		}
		return errorPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetErrorPage() {
		return errorPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorPage(Page newErrorPage) {
		Page oldErrorPage = errorPage;
		errorPage = newErrorPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.ERROR__ERROR_PAGE, oldErrorPage, errorPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebPackage.ERROR__ERROR_PAGE:
				if (resolve) return getErrorPage();
				return basicGetErrorPage();
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
			case WebPackage.ERROR__ERROR_PAGE:
				setErrorPage((Page)newValue);
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
			case WebPackage.ERROR__ERROR_PAGE:
				setErrorPage((Page)null);
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
			case WebPackage.ERROR__ERROR_PAGE:
				return errorPage != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorImpl
