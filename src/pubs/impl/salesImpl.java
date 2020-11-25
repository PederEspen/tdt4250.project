/**
 */
package pubs.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pubs.PubsPackage;
import pubs.sales;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sales</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pubs.impl.salesImpl#getOrd_num <em>Ord num</em>}</li>
 *   <li>{@link pubs.impl.salesImpl#getStor_id <em>Stor id</em>}</li>
 *   <li>{@link pubs.impl.salesImpl#getOrd_date <em>Ord date</em>}</li>
 *   <li>{@link pubs.impl.salesImpl#getQty <em>Qty</em>}</li>
 *   <li>{@link pubs.impl.salesImpl#getPayterms <em>Payterms</em>}</li>
 *   <li>{@link pubs.impl.salesImpl#getTitle_id <em>Title id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class salesImpl extends MinimalEObjectImpl.Container implements sales {
	/**
	 * The default value of the '{@link #getOrd_num() <em>Ord num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrd_num()
	 * @generated
	 * @ordered
	 */
	protected static final String ORD_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrd_num() <em>Ord num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrd_num()
	 * @generated
	 * @ordered
	 */
	protected String ord_num = ORD_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getStor_id() <em>Stor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStor_id()
	 * @generated
	 * @ordered
	 */
	protected static final String STOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStor_id() <em>Stor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStor_id()
	 * @generated
	 * @ordered
	 */
	protected String stor_id = STOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrd_date() <em>Ord date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrd_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date ORD_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrd_date() <em>Ord date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrd_date()
	 * @generated
	 * @ordered
	 */
	protected Date ord_date = ORD_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQty() <em>Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQty()
	 * @generated
	 * @ordered
	 */
	protected static final int QTY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQty() <em>Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQty()
	 * @generated
	 * @ordered
	 */
	protected int qty = QTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayterms() <em>Payterms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayterms()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYTERMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayterms() <em>Payterms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayterms()
	 * @generated
	 * @ordered
	 */
	protected String payterms = PAYTERMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle_id() <em>Title id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_id()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle_id() <em>Title id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_id()
	 * @generated
	 * @ordered
	 */
	protected String title_id = TITLE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected salesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubsPackage.Literals.SALES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrd_num() {
		return ord_num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrd_num(String newOrd_num) {
		String oldOrd_num = ord_num;
		ord_num = newOrd_num;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.SALES__ORD_NUM, oldOrd_num, ord_num));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStor_id() {
		return stor_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStor_id(String newStor_id) {
		String oldStor_id = stor_id;
		stor_id = newStor_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.SALES__STOR_ID, oldStor_id, stor_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOrd_date() {
		return ord_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrd_date(Date newOrd_date) {
		Date oldOrd_date = ord_date;
		ord_date = newOrd_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.SALES__ORD_DATE, oldOrd_date, ord_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQty() {
		return qty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQty(int newQty) {
		int oldQty = qty;
		qty = newQty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.SALES__QTY, oldQty, qty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPayterms() {
		return payterms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayterms(String newPayterms) {
		String oldPayterms = payterms;
		payterms = newPayterms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.SALES__PAYTERMS, oldPayterms, payterms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle_id() {
		return title_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle_id(String newTitle_id) {
		String oldTitle_id = title_id;
		title_id = newTitle_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.SALES__TITLE_ID, oldTitle_id, title_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubsPackage.SALES__ORD_NUM:
				return getOrd_num();
			case PubsPackage.SALES__STOR_ID:
				return getStor_id();
			case PubsPackage.SALES__ORD_DATE:
				return getOrd_date();
			case PubsPackage.SALES__QTY:
				return getQty();
			case PubsPackage.SALES__PAYTERMS:
				return getPayterms();
			case PubsPackage.SALES__TITLE_ID:
				return getTitle_id();
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
			case PubsPackage.SALES__ORD_NUM:
				setOrd_num((String)newValue);
				return;
			case PubsPackage.SALES__STOR_ID:
				setStor_id((String)newValue);
				return;
			case PubsPackage.SALES__ORD_DATE:
				setOrd_date((Date)newValue);
				return;
			case PubsPackage.SALES__QTY:
				setQty((Integer)newValue);
				return;
			case PubsPackage.SALES__PAYTERMS:
				setPayterms((String)newValue);
				return;
			case PubsPackage.SALES__TITLE_ID:
				setTitle_id((String)newValue);
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
			case PubsPackage.SALES__ORD_NUM:
				setOrd_num(ORD_NUM_EDEFAULT);
				return;
			case PubsPackage.SALES__STOR_ID:
				setStor_id(STOR_ID_EDEFAULT);
				return;
			case PubsPackage.SALES__ORD_DATE:
				setOrd_date(ORD_DATE_EDEFAULT);
				return;
			case PubsPackage.SALES__QTY:
				setQty(QTY_EDEFAULT);
				return;
			case PubsPackage.SALES__PAYTERMS:
				setPayterms(PAYTERMS_EDEFAULT);
				return;
			case PubsPackage.SALES__TITLE_ID:
				setTitle_id(TITLE_ID_EDEFAULT);
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
			case PubsPackage.SALES__ORD_NUM:
				return ORD_NUM_EDEFAULT == null ? ord_num != null : !ORD_NUM_EDEFAULT.equals(ord_num);
			case PubsPackage.SALES__STOR_ID:
				return STOR_ID_EDEFAULT == null ? stor_id != null : !STOR_ID_EDEFAULT.equals(stor_id);
			case PubsPackage.SALES__ORD_DATE:
				return ORD_DATE_EDEFAULT == null ? ord_date != null : !ORD_DATE_EDEFAULT.equals(ord_date);
			case PubsPackage.SALES__QTY:
				return qty != QTY_EDEFAULT;
			case PubsPackage.SALES__PAYTERMS:
				return PAYTERMS_EDEFAULT == null ? payterms != null : !PAYTERMS_EDEFAULT.equals(payterms);
			case PubsPackage.SALES__TITLE_ID:
				return TITLE_ID_EDEFAULT == null ? title_id != null : !TITLE_ID_EDEFAULT.equals(title_id);
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
		result.append(" (ord_num: ");
		result.append(ord_num);
		result.append(", stor_id: ");
		result.append(stor_id);
		result.append(", ord_date: ");
		result.append(ord_date);
		result.append(", qty: ");
		result.append(qty);
		result.append(", payterms: ");
		result.append(payterms);
		result.append(", title_id: ");
		result.append(title_id);
		result.append(')');
		return result.toString();
	}

} //salesImpl
