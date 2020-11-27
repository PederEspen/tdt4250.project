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
import pubs.author;
import pubs.publisher;
import pubs.root;
import pubs.store;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pubs.impl.rootImpl#getPub_id <em>Pub id</em>}</li>
 *   <li>{@link pubs.impl.rootImpl#getStor_id <em>Stor id</em>}</li>
 *   <li>{@link pubs.impl.rootImpl#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link pubs.impl.rootImpl#getStores <em>Stores</em>}</li>
 *   <li>{@link pubs.impl.rootImpl#getAuthors <em>Authors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class rootImpl extends MinimalEObjectImpl.Container implements root {
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
	 * The cached value of the '{@link #getPublishers() <em>Publishers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishers()
	 * @generated
	 * @ordered
	 */
	protected EList<publisher> publishers;

	/**
	 * The cached value of the '{@link #getStores() <em>Stores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStores()
	 * @generated
	 * @ordered
	 */
	protected EList<store> stores;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<author> authors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected rootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubsPackage.Literals.ROOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.ROOT__PUB_ID, oldPub_id, pub_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.ROOT__STOR_ID, oldStor_id, stor_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<publisher> getPublishers() {
		if (publishers == null) {
			publishers = new EObjectContainmentEList<publisher>(publisher.class, this, PubsPackage.ROOT__PUBLISHERS);
		}
		return publishers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<store> getStores() {
		if (stores == null) {
			stores = new EObjectContainmentEList<store>(store.class, this, PubsPackage.ROOT__STORES);
		}
		return stores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<author> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<author>(author.class, this, PubsPackage.ROOT__AUTHORS);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PubsPackage.ROOT__PUBLISHERS:
				return ((InternalEList<?>)getPublishers()).basicRemove(otherEnd, msgs);
			case PubsPackage.ROOT__STORES:
				return ((InternalEList<?>)getStores()).basicRemove(otherEnd, msgs);
			case PubsPackage.ROOT__AUTHORS:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
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
			case PubsPackage.ROOT__PUB_ID:
				return getPub_id();
			case PubsPackage.ROOT__STOR_ID:
				return getStor_id();
			case PubsPackage.ROOT__PUBLISHERS:
				return getPublishers();
			case PubsPackage.ROOT__STORES:
				return getStores();
			case PubsPackage.ROOT__AUTHORS:
				return getAuthors();
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
			case PubsPackage.ROOT__PUB_ID:
				setPub_id((String)newValue);
				return;
			case PubsPackage.ROOT__STOR_ID:
				setStor_id((String)newValue);
				return;
			case PubsPackage.ROOT__PUBLISHERS:
				getPublishers().clear();
				getPublishers().addAll((Collection<? extends publisher>)newValue);
				return;
			case PubsPackage.ROOT__STORES:
				getStores().clear();
				getStores().addAll((Collection<? extends store>)newValue);
				return;
			case PubsPackage.ROOT__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends author>)newValue);
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
			case PubsPackage.ROOT__PUB_ID:
				setPub_id(PUB_ID_EDEFAULT);
				return;
			case PubsPackage.ROOT__STOR_ID:
				setStor_id(STOR_ID_EDEFAULT);
				return;
			case PubsPackage.ROOT__PUBLISHERS:
				getPublishers().clear();
				return;
			case PubsPackage.ROOT__STORES:
				getStores().clear();
				return;
			case PubsPackage.ROOT__AUTHORS:
				getAuthors().clear();
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
			case PubsPackage.ROOT__PUB_ID:
				return PUB_ID_EDEFAULT == null ? pub_id != null : !PUB_ID_EDEFAULT.equals(pub_id);
			case PubsPackage.ROOT__STOR_ID:
				return STOR_ID_EDEFAULT == null ? stor_id != null : !STOR_ID_EDEFAULT.equals(stor_id);
			case PubsPackage.ROOT__PUBLISHERS:
				return publishers != null && !publishers.isEmpty();
			case PubsPackage.ROOT__STORES:
				return stores != null && !stores.isEmpty();
			case PubsPackage.ROOT__AUTHORS:
				return authors != null && !authors.isEmpty();
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
		result.append(", stor_id: ");
		result.append(stor_id);
		result.append(')');
		return result.toString();
	}

} //rootImpl
