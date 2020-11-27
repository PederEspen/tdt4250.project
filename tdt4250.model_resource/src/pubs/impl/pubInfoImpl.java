/**
 */
package pubs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pubs.PubsPackage;
import pubs.pubInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>pub info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pubs.impl.pubInfoImpl#getPub_id <em>Pub id</em>}</li>
 *   <li>{@link pubs.impl.pubInfoImpl#getPr_info <em>Pr info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class pubInfoImpl extends MinimalEObjectImpl.Container implements pubInfo {
	/**
	 * The default value of the '{@link #getPub_id() <em>Pub id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPub_id()
	 * @generated
	 * @ordered
	 */
	protected static final String PUB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPub_id() <em>Pub id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPub_id()
	 * @generated
	 * @ordered
	 */
	protected String pub_id = PUB_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPr_info() <em>Pr info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPr_info()
	 * @generated
	 * @ordered
	 */
	protected static final String PR_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPr_info() <em>Pr info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPr_info()
	 * @generated
	 * @ordered
	 */
	protected String pr_info = PR_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected pubInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubsPackage.Literals.PUB_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPub_id() {
		return pub_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPub_id(String newPub_id) {
		String oldPub_id = pub_id;
		pub_id = newPub_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.PUB_INFO__PUB_ID, oldPub_id, pub_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPr_info() {
		return pr_info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPr_info(String newPr_info) {
		String oldPr_info = pr_info;
		pr_info = newPr_info;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.PUB_INFO__PR_INFO, oldPr_info, pr_info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubsPackage.PUB_INFO__PUB_ID:
				return getPub_id();
			case PubsPackage.PUB_INFO__PR_INFO:
				return getPr_info();
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
			case PubsPackage.PUB_INFO__PUB_ID:
				setPub_id((String)newValue);
				return;
			case PubsPackage.PUB_INFO__PR_INFO:
				setPr_info((String)newValue);
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
			case PubsPackage.PUB_INFO__PUB_ID:
				setPub_id(PUB_ID_EDEFAULT);
				return;
			case PubsPackage.PUB_INFO__PR_INFO:
				setPr_info(PR_INFO_EDEFAULT);
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
			case PubsPackage.PUB_INFO__PUB_ID:
				return PUB_ID_EDEFAULT == null ? pub_id != null : !PUB_ID_EDEFAULT.equals(pub_id);
			case PubsPackage.PUB_INFO__PR_INFO:
				return PR_INFO_EDEFAULT == null ? pr_info != null : !PR_INFO_EDEFAULT.equals(pr_info);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pub_id: ");
		result.append(pub_id);
		result.append(", pr_info: ");
		result.append(pr_info);
		result.append(')');
		return result.toString();
	}

} //pub_infoImpl
