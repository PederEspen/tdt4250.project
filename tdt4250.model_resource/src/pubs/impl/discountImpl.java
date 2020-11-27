/**
 */
package pubs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pubs.PubsPackage;
import pubs.discount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>discount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pubs.impl.discountImpl#getDiscounttype <em>Discounttype</em>}</li>
 *   <li>{@link pubs.impl.discountImpl#getStor_id <em>Stor id</em>}</li>
 *   <li>{@link pubs.impl.discountImpl#getLowqty <em>Lowqty</em>}</li>
 *   <li>{@link pubs.impl.discountImpl#getHighqty <em>Highqty</em>}</li>
 *   <li>{@link pubs.impl.discountImpl#getDiscount <em>Discount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class discountImpl extends MinimalEObjectImpl.Container implements discount {
	/**
	 * The default value of the '{@link #getDiscounttype() <em>Discounttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscounttype()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOUNTTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscounttype() <em>Discounttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscounttype()
	 * @generated
	 * @ordered
	 */
	protected String discounttype = DISCOUNTTYPE_EDEFAULT;

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
	 * The default value of the '{@link #getLowqty() <em>Lowqty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowqty()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWQTY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowqty() <em>Lowqty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowqty()
	 * @generated
	 * @ordered
	 */
	protected int lowqty = LOWQTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighqty() <em>Highqty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighqty()
	 * @generated
	 * @ordered
	 */
	protected static final int HIGHQTY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHighqty() <em>Highqty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighqty()
	 * @generated
	 * @ordered
	 */
	protected int highqty = HIGHQTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final float DISCOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected float discount = DISCOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected discountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubsPackage.Literals.DISCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscounttype() {
		return discounttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscounttype(String newDiscounttype) {
		String oldDiscounttype = discounttype;
		discounttype = newDiscounttype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.DISCOUNT__DISCOUNTTYPE, oldDiscounttype, discounttype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.DISCOUNT__STOR_ID, oldStor_id, stor_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLowqty() {
		return lowqty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowqty(int newLowqty) {
		int oldLowqty = lowqty;
		lowqty = newLowqty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.DISCOUNT__LOWQTY, oldLowqty, lowqty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHighqty() {
		return highqty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighqty(int newHighqty) {
		int oldHighqty = highqty;
		highqty = newHighqty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.DISCOUNT__HIGHQTY, oldHighqty, highqty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscount(float newDiscount) {
		float oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.DISCOUNT__DISCOUNT, oldDiscount, discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubsPackage.DISCOUNT__DISCOUNTTYPE:
				return getDiscounttype();
			case PubsPackage.DISCOUNT__STOR_ID:
				return getStor_id();
			case PubsPackage.DISCOUNT__LOWQTY:
				return getLowqty();
			case PubsPackage.DISCOUNT__HIGHQTY:
				return getHighqty();
			case PubsPackage.DISCOUNT__DISCOUNT:
				return getDiscount();
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
			case PubsPackage.DISCOUNT__DISCOUNTTYPE:
				setDiscounttype((String)newValue);
				return;
			case PubsPackage.DISCOUNT__STOR_ID:
				setStor_id((String)newValue);
				return;
			case PubsPackage.DISCOUNT__LOWQTY:
				setLowqty((Integer)newValue);
				return;
			case PubsPackage.DISCOUNT__HIGHQTY:
				setHighqty((Integer)newValue);
				return;
			case PubsPackage.DISCOUNT__DISCOUNT:
				setDiscount((Float)newValue);
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
			case PubsPackage.DISCOUNT__DISCOUNTTYPE:
				setDiscounttype(DISCOUNTTYPE_EDEFAULT);
				return;
			case PubsPackage.DISCOUNT__STOR_ID:
				setStor_id(STOR_ID_EDEFAULT);
				return;
			case PubsPackage.DISCOUNT__LOWQTY:
				setLowqty(LOWQTY_EDEFAULT);
				return;
			case PubsPackage.DISCOUNT__HIGHQTY:
				setHighqty(HIGHQTY_EDEFAULT);
				return;
			case PubsPackage.DISCOUNT__DISCOUNT:
				setDiscount(DISCOUNT_EDEFAULT);
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
			case PubsPackage.DISCOUNT__DISCOUNTTYPE:
				return DISCOUNTTYPE_EDEFAULT == null ? discounttype != null : !DISCOUNTTYPE_EDEFAULT.equals(discounttype);
			case PubsPackage.DISCOUNT__STOR_ID:
				return STOR_ID_EDEFAULT == null ? stor_id != null : !STOR_ID_EDEFAULT.equals(stor_id);
			case PubsPackage.DISCOUNT__LOWQTY:
				return lowqty != LOWQTY_EDEFAULT;
			case PubsPackage.DISCOUNT__HIGHQTY:
				return highqty != HIGHQTY_EDEFAULT;
			case PubsPackage.DISCOUNT__DISCOUNT:
				return discount != DISCOUNT_EDEFAULT;
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
		result.append(" (discounttype: ");
		result.append(discounttype);
		result.append(", stor_id: ");
		result.append(stor_id);
		result.append(", lowqty: ");
		result.append(lowqty);
		result.append(", highqty: ");
		result.append(highqty);
		result.append(", discount: ");
		result.append(discount);
		result.append(')');
		return result.toString();
	}

} //discountImpl
