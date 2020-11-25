/**
 */
package pubs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pubs.PubsPackage;
import pubs.author;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pubs.impl.authorImpl#getAu_lname <em>Au lname</em>}</li>
 *   <li>{@link pubs.impl.authorImpl#getAu_fname <em>Au fname</em>}</li>
 *   <li>{@link pubs.impl.authorImpl#getAu_id <em>Au id</em>}</li>
 *   <li>{@link pubs.impl.authorImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link pubs.impl.authorImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link pubs.impl.authorImpl#getCity <em>City</em>}</li>
 *   <li>{@link pubs.impl.authorImpl#getState <em>State</em>}</li>
 *   <li>{@link pubs.impl.authorImpl#getZip <em>Zip</em>}</li>
 *   <li>{@link pubs.impl.authorImpl#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class authorImpl extends MinimalEObjectImpl.Container implements author {
	/**
	 * The default value of the '{@link #getAu_lname() <em>Au lname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAu_lname()
	 * @generated
	 * @ordered
	 */
	protected static final String AU_LNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAu_lname() <em>Au lname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAu_lname()
	 * @generated
	 * @ordered
	 */
	protected String au_lname = AU_LNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAu_fname() <em>Au fname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAu_fname()
	 * @generated
	 * @ordered
	 */
	protected static final String AU_FNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAu_fname() <em>Au fname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAu_fname()
	 * @generated
	 * @ordered
	 */
	protected String au_fname = AU_FNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAu_id() <em>Au id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAu_id()
	 * @generated
	 * @ordered
	 */
	protected static final String AU_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAu_id() <em>Au id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAu_id()
	 * @generated
	 * @ordered
	 */
	protected String au_id = AU_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

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
	 * The default value of the '{@link #getContract() <em>Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTRACT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected int contract = CONTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected authorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubsPackage.Literals.AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAu_lname() {
		return au_lname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAu_lname(String newAu_lname) {
		String oldAu_lname = au_lname;
		au_lname = newAu_lname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.AUTHOR__AU_LNAME, oldAu_lname, au_lname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAu_fname() {
		return au_fname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAu_fname(String newAu_fname) {
		String oldAu_fname = au_fname;
		au_fname = newAu_fname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.AUTHOR__AU_FNAME, oldAu_fname, au_fname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAu_id() {
		return au_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAu_id(String newAu_id) {
		String oldAu_id = au_id;
		au_id = newAu_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.AUTHOR__AU_ID, oldAu_id, au_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.AUTHOR__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.AUTHOR__ADDRESS, oldAddress, address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.AUTHOR__CITY, oldCity, city));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.AUTHOR__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.AUTHOR__ZIP, oldZip, zip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContract(int newContract) {
		int oldContract = contract;
		contract = newContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.AUTHOR__CONTRACT, oldContract, contract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubsPackage.AUTHOR__AU_LNAME:
				return getAu_lname();
			case PubsPackage.AUTHOR__AU_FNAME:
				return getAu_fname();
			case PubsPackage.AUTHOR__AU_ID:
				return getAu_id();
			case PubsPackage.AUTHOR__PHONE:
				return getPhone();
			case PubsPackage.AUTHOR__ADDRESS:
				return getAddress();
			case PubsPackage.AUTHOR__CITY:
				return getCity();
			case PubsPackage.AUTHOR__STATE:
				return getState();
			case PubsPackage.AUTHOR__ZIP:
				return getZip();
			case PubsPackage.AUTHOR__CONTRACT:
				return getContract();
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
			case PubsPackage.AUTHOR__AU_LNAME:
				setAu_lname((String)newValue);
				return;
			case PubsPackage.AUTHOR__AU_FNAME:
				setAu_fname((String)newValue);
				return;
			case PubsPackage.AUTHOR__AU_ID:
				setAu_id((String)newValue);
				return;
			case PubsPackage.AUTHOR__PHONE:
				setPhone((String)newValue);
				return;
			case PubsPackage.AUTHOR__ADDRESS:
				setAddress((String)newValue);
				return;
			case PubsPackage.AUTHOR__CITY:
				setCity((String)newValue);
				return;
			case PubsPackage.AUTHOR__STATE:
				setState((String)newValue);
				return;
			case PubsPackage.AUTHOR__ZIP:
				setZip((String)newValue);
				return;
			case PubsPackage.AUTHOR__CONTRACT:
				setContract((Integer)newValue);
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
			case PubsPackage.AUTHOR__AU_LNAME:
				setAu_lname(AU_LNAME_EDEFAULT);
				return;
			case PubsPackage.AUTHOR__AU_FNAME:
				setAu_fname(AU_FNAME_EDEFAULT);
				return;
			case PubsPackage.AUTHOR__AU_ID:
				setAu_id(AU_ID_EDEFAULT);
				return;
			case PubsPackage.AUTHOR__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case PubsPackage.AUTHOR__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case PubsPackage.AUTHOR__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case PubsPackage.AUTHOR__STATE:
				setState(STATE_EDEFAULT);
				return;
			case PubsPackage.AUTHOR__ZIP:
				setZip(ZIP_EDEFAULT);
				return;
			case PubsPackage.AUTHOR__CONTRACT:
				setContract(CONTRACT_EDEFAULT);
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
			case PubsPackage.AUTHOR__AU_LNAME:
				return AU_LNAME_EDEFAULT == null ? au_lname != null : !AU_LNAME_EDEFAULT.equals(au_lname);
			case PubsPackage.AUTHOR__AU_FNAME:
				return AU_FNAME_EDEFAULT == null ? au_fname != null : !AU_FNAME_EDEFAULT.equals(au_fname);
			case PubsPackage.AUTHOR__AU_ID:
				return AU_ID_EDEFAULT == null ? au_id != null : !AU_ID_EDEFAULT.equals(au_id);
			case PubsPackage.AUTHOR__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case PubsPackage.AUTHOR__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case PubsPackage.AUTHOR__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case PubsPackage.AUTHOR__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case PubsPackage.AUTHOR__ZIP:
				return ZIP_EDEFAULT == null ? zip != null : !ZIP_EDEFAULT.equals(zip);
			case PubsPackage.AUTHOR__CONTRACT:
				return contract != CONTRACT_EDEFAULT;
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
		result.append(" (au_lname: ");
		result.append(au_lname);
		result.append(", au_fname: ");
		result.append(au_fname);
		result.append(", au_id: ");
		result.append(au_id);
		result.append(", phone: ");
		result.append(phone);
		result.append(", address: ");
		result.append(address);
		result.append(", city: ");
		result.append(city);
		result.append(", state: ");
		result.append(state);
		result.append(", zip: ");
		result.append(zip);
		result.append(", contract: ");
		result.append(contract);
		result.append(')');
		return result.toString();
	}

} //authorImpl
