/**
 */
package pubs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pubs.PubsPackage;
import pubs.discount;
import pubs.sale;
import pubs.store;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pubs.impl.storeImpl#getStor_name <em>Stor name</em>}</li>
 *   <li>{@link pubs.impl.storeImpl#getStor_id <em>Stor id</em>}</li>
 *   <li>{@link pubs.impl.storeImpl#getStor_address <em>Stor address</em>}</li>
 *   <li>{@link pubs.impl.storeImpl#getCity <em>City</em>}</li>
 *   <li>{@link pubs.impl.storeImpl#getState <em>State</em>}</li>
 *   <li>{@link pubs.impl.storeImpl#getZip <em>Zip</em>}</li>
 *   <li>{@link pubs.impl.storeImpl#getSales <em>Sales</em>}</li>
 *   <li>{@link pubs.impl.storeImpl#getDiscounts <em>Discounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class storeImpl extends MinimalEObjectImpl.Container implements store {
	/**
	 * The default value of the '{@link #getStor_name() <em>Stor name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStor_name()
	 * @generated
	 * @ordered
	 */
	protected static final String STOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStor_name() <em>Stor name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStor_name()
	 * @generated
	 * @ordered
	 */
	protected String stor_name = STOR_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getStor_address() <em>Stor address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStor_address()
	 * @generated
	 * @ordered
	 */
	protected static final String STOR_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStor_address() <em>Stor address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStor_address()
	 * @generated
	 * @ordered
	 */
	protected String stor_address = STOR_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected String zip = ZIP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSales() <em>Sales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSales()
	 * @generated
	 * @ordered
	 */
	protected EList<sale> sales;

	/**
	 * The cached value of the '{@link #getDiscounts() <em>Discounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscounts()
	 * @generated
	 * @ordered
	 */
	protected EList<discount> discounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected storeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubsPackage.Literals.STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStor_name() {
		return stor_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStor_name(String newStor_name) {
		String oldStor_name = stor_name;
		stor_name = newStor_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.STORE__STOR_NAME, oldStor_name, stor_name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.STORE__STOR_ID, oldStor_id, stor_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStor_address() {
		return stor_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStor_address(String newStor_address) {
		String oldStor_address = stor_address;
		stor_address = newStor_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.STORE__STOR_ADDRESS, oldStor_address, stor_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.STORE__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.STORE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZip() {
		return zip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZip(String newZip) {
		String oldZip = zip;
		zip = newZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.STORE__ZIP, oldZip, zip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<sale> getSales() {
		if (sales == null) {
			sales = new EObjectContainmentEList<sale>(sale.class, this, PubsPackage.STORE__SALES);
		}
		return sales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<discount> getDiscounts() {
		if (discounts == null) {
			discounts = new EObjectContainmentEList<discount>(discount.class, this, PubsPackage.STORE__DISCOUNTS);
		}
		return discounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PubsPackage.STORE__SALES:
				return ((InternalEList<?>)getSales()).basicRemove(otherEnd, msgs);
			case PubsPackage.STORE__DISCOUNTS:
				return ((InternalEList<?>)getDiscounts()).basicRemove(otherEnd, msgs);
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
			case PubsPackage.STORE__STOR_NAME:
				return getStor_name();
			case PubsPackage.STORE__STOR_ID:
				return getStor_id();
			case PubsPackage.STORE__STOR_ADDRESS:
				return getStor_address();
			case PubsPackage.STORE__CITY:
				return getCity();
			case PubsPackage.STORE__STATE:
				return getState();
			case PubsPackage.STORE__ZIP:
				return getZip();
			case PubsPackage.STORE__SALES:
				return getSales();
			case PubsPackage.STORE__DISCOUNTS:
				return getDiscounts();
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
			case PubsPackage.STORE__STOR_NAME:
				setStor_name((String)newValue);
				return;
			case PubsPackage.STORE__STOR_ID:
				setStor_id((String)newValue);
				return;
			case PubsPackage.STORE__STOR_ADDRESS:
				setStor_address((String)newValue);
				return;
			case PubsPackage.STORE__CITY:
				setCity((String)newValue);
				return;
			case PubsPackage.STORE__STATE:
				setState((String)newValue);
				return;
			case PubsPackage.STORE__ZIP:
				setZip((String)newValue);
				return;
			case PubsPackage.STORE__SALES:
				getSales().clear();
				getSales().addAll((Collection<? extends sale>)newValue);
				return;
			case PubsPackage.STORE__DISCOUNTS:
				getDiscounts().clear();
				getDiscounts().addAll((Collection<? extends discount>)newValue);
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
			case PubsPackage.STORE__STOR_NAME:
				setStor_name(STOR_NAME_EDEFAULT);
				return;
			case PubsPackage.STORE__STOR_ID:
				setStor_id(STOR_ID_EDEFAULT);
				return;
			case PubsPackage.STORE__STOR_ADDRESS:
				setStor_address(STOR_ADDRESS_EDEFAULT);
				return;
			case PubsPackage.STORE__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case PubsPackage.STORE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case PubsPackage.STORE__ZIP:
				setZip(ZIP_EDEFAULT);
				return;
			case PubsPackage.STORE__SALES:
				getSales().clear();
				return;
			case PubsPackage.STORE__DISCOUNTS:
				getDiscounts().clear();
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
			case PubsPackage.STORE__STOR_NAME:
				return STOR_NAME_EDEFAULT == null ? stor_name != null : !STOR_NAME_EDEFAULT.equals(stor_name);
			case PubsPackage.STORE__STOR_ID:
				return STOR_ID_EDEFAULT == null ? stor_id != null : !STOR_ID_EDEFAULT.equals(stor_id);
			case PubsPackage.STORE__STOR_ADDRESS:
				return STOR_ADDRESS_EDEFAULT == null ? stor_address != null : !STOR_ADDRESS_EDEFAULT.equals(stor_address);
			case PubsPackage.STORE__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case PubsPackage.STORE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case PubsPackage.STORE__ZIP:
				return ZIP_EDEFAULT == null ? zip != null : !ZIP_EDEFAULT.equals(zip);
			case PubsPackage.STORE__SALES:
				return sales != null && !sales.isEmpty();
			case PubsPackage.STORE__DISCOUNTS:
				return discounts != null && !discounts.isEmpty();
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
		result.append(" (stor_name: ");
		result.append(stor_name);
		result.append(", stor_id: ");
		result.append(stor_id);
		result.append(", stor_address: ");
		result.append(stor_address);
		result.append(", city: ");
		result.append(city);
		result.append(", state: ");
		result.append(state);
		result.append(", zip: ");
		result.append(zip);
		result.append(')');
		return result.toString();
	}

} //storeImpl
