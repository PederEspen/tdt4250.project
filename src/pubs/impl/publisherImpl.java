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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pubs.PubsPackage;
import pubs.employee;
import pubs.pub_info;
import pubs.publisher;
import pubs.title;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pubs.impl.publisherImpl#getPubname <em>Pubname</em>}</li>
 *   <li>{@link pubs.impl.publisherImpl#getPub_id <em>Pub id</em>}</li>
 *   <li>{@link pubs.impl.publisherImpl#getCity <em>City</em>}</li>
 *   <li>{@link pubs.impl.publisherImpl#getState <em>State</em>}</li>
 *   <li>{@link pubs.impl.publisherImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link pubs.impl.publisherImpl#getPub_info <em>Pub info</em>}</li>
 *   <li>{@link pubs.impl.publisherImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link pubs.impl.publisherImpl#getTitles <em>Titles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class publisherImpl extends MinimalEObjectImpl.Container implements publisher {
	/**
	 * The default value of the '{@link #getPubname() <em>Pubname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubname()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPubname() <em>Pubname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubname()
	 * @generated
	 * @ordered
	 */
	protected String pubname = PUBNAME_EDEFAULT;

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
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPub_info() <em>Pub info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPub_info()
	 * @generated
	 * @ordered
	 */
	protected pub_info pub_info;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<employee> employees;

	/**
	 * The cached value of the '{@link #getTitles() <em>Titles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitles()
	 * @generated
	 * @ordered
	 */
	protected EList<title> titles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected publisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubsPackage.Literals.PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPubname() {
		return pubname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPubname(String newPubname) {
		String oldPubname = pubname;
		pubname = newPubname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.PUBLISHER__PUBNAME, oldPubname, pubname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.PUBLISHER__PUB_ID, oldPub_id, pub_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.PUBLISHER__CITY, oldCity, city));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.PUBLISHER__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.PUBLISHER__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public pub_info getPub_info() {
		return pub_info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPub_info(pub_info newPub_info, NotificationChain msgs) {
		pub_info oldPub_info = pub_info;
		pub_info = newPub_info;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PubsPackage.PUBLISHER__PUB_INFO, oldPub_info, newPub_info);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPub_info(pub_info newPub_info) {
		if (newPub_info != pub_info) {
			NotificationChain msgs = null;
			if (pub_info != null)
				msgs = ((InternalEObject)pub_info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PubsPackage.PUBLISHER__PUB_INFO, null, msgs);
			if (newPub_info != null)
				msgs = ((InternalEObject)newPub_info).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PubsPackage.PUBLISHER__PUB_INFO, null, msgs);
			msgs = basicSetPub_info(newPub_info, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.PUBLISHER__PUB_INFO, newPub_info, newPub_info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectResolvingEList<employee>(employee.class, this, PubsPackage.PUBLISHER__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<title> getTitles() {
		if (titles == null) {
			titles = new EObjectContainmentEList<title>(title.class, this, PubsPackage.PUBLISHER__TITLES);
		}
		return titles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PubsPackage.PUBLISHER__PUB_INFO:
				return basicSetPub_info(null, msgs);
			case PubsPackage.PUBLISHER__TITLES:
				return ((InternalEList<?>)getTitles()).basicRemove(otherEnd, msgs);
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
			case PubsPackage.PUBLISHER__PUBNAME:
				return getPubname();
			case PubsPackage.PUBLISHER__PUB_ID:
				return getPub_id();
			case PubsPackage.PUBLISHER__CITY:
				return getCity();
			case PubsPackage.PUBLISHER__STATE:
				return getState();
			case PubsPackage.PUBLISHER__COUNTRY:
				return getCountry();
			case PubsPackage.PUBLISHER__PUB_INFO:
				return getPub_info();
			case PubsPackage.PUBLISHER__EMPLOYEES:
				return getEmployees();
			case PubsPackage.PUBLISHER__TITLES:
				return getTitles();
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
			case PubsPackage.PUBLISHER__PUBNAME:
				setPubname((String)newValue);
				return;
			case PubsPackage.PUBLISHER__PUB_ID:
				setPub_id((String)newValue);
				return;
			case PubsPackage.PUBLISHER__CITY:
				setCity((String)newValue);
				return;
			case PubsPackage.PUBLISHER__STATE:
				setState((String)newValue);
				return;
			case PubsPackage.PUBLISHER__COUNTRY:
				setCountry((String)newValue);
				return;
			case PubsPackage.PUBLISHER__PUB_INFO:
				setPub_info((pub_info)newValue);
				return;
			case PubsPackage.PUBLISHER__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends employee>)newValue);
				return;
			case PubsPackage.PUBLISHER__TITLES:
				getTitles().clear();
				getTitles().addAll((Collection<? extends title>)newValue);
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
			case PubsPackage.PUBLISHER__PUBNAME:
				setPubname(PUBNAME_EDEFAULT);
				return;
			case PubsPackage.PUBLISHER__PUB_ID:
				setPub_id(PUB_ID_EDEFAULT);
				return;
			case PubsPackage.PUBLISHER__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case PubsPackage.PUBLISHER__STATE:
				setState(STATE_EDEFAULT);
				return;
			case PubsPackage.PUBLISHER__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case PubsPackage.PUBLISHER__PUB_INFO:
				setPub_info((pub_info)null);
				return;
			case PubsPackage.PUBLISHER__EMPLOYEES:
				getEmployees().clear();
				return;
			case PubsPackage.PUBLISHER__TITLES:
				getTitles().clear();
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
			case PubsPackage.PUBLISHER__PUBNAME:
				return PUBNAME_EDEFAULT == null ? pubname != null : !PUBNAME_EDEFAULT.equals(pubname);
			case PubsPackage.PUBLISHER__PUB_ID:
				return PUB_ID_EDEFAULT == null ? pub_id != null : !PUB_ID_EDEFAULT.equals(pub_id);
			case PubsPackage.PUBLISHER__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case PubsPackage.PUBLISHER__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case PubsPackage.PUBLISHER__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case PubsPackage.PUBLISHER__PUB_INFO:
				return pub_info != null;
			case PubsPackage.PUBLISHER__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case PubsPackage.PUBLISHER__TITLES:
				return titles != null && !titles.isEmpty();
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
		result.append(" (pubname: ");
		result.append(pubname);
		result.append(", pub_id: ");
		result.append(pub_id);
		result.append(", city: ");
		result.append(city);
		result.append(", state: ");
		result.append(state);
		result.append(", country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} //publisherImpl
