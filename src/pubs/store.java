/**
 */
package pubs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pubs.store#getStor_name <em>Stor name</em>}</li>
 *   <li>{@link pubs.store#getStor_id <em>Stor id</em>}</li>
 *   <li>{@link pubs.store#getStor_address <em>Stor address</em>}</li>
 *   <li>{@link pubs.store#getCity <em>City</em>}</li>
 *   <li>{@link pubs.store#getState <em>State</em>}</li>
 *   <li>{@link pubs.store#getZip <em>Zip</em>}</li>
 *   <li>{@link pubs.store#getSales <em>Sales</em>}</li>
 *   <li>{@link pubs.store#getDiscounts <em>Discounts</em>}</li>
 * </ul>
 *
 * @see pubs.PubsPackage#getstore()
 * @model
 * @generated
 */
public interface store extends EObject {
	/**
	 * Returns the value of the '<em><b>Stor name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stor name</em>' attribute.
	 * @see #setStor_name(String)
	 * @see pubs.PubsPackage#getstore_Stor_name()
	 * @model
	 * @generated
	 */
	String getStor_name();

	/**
	 * Sets the value of the '{@link pubs.store#getStor_name <em>Stor name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stor name</em>' attribute.
	 * @see #getStor_name()
	 * @generated
	 */
	void setStor_name(String value);

	/**
	 * Returns the value of the '<em><b>Stor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stor id</em>' attribute.
	 * @see #setStor_id(String)
	 * @see pubs.PubsPackage#getstore_Stor_id()
	 * @model
	 * @generated
	 */
	String getStor_id();

	/**
	 * Sets the value of the '{@link pubs.store#getStor_id <em>Stor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stor id</em>' attribute.
	 * @see #getStor_id()
	 * @generated
	 */
	void setStor_id(String value);

	/**
	 * Returns the value of the '<em><b>Stor address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stor address</em>' attribute.
	 * @see #setStor_address(String)
	 * @see pubs.PubsPackage#getstore_Stor_address()
	 * @model
	 * @generated
	 */
	String getStor_address();

	/**
	 * Sets the value of the '{@link pubs.store#getStor_address <em>Stor address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stor address</em>' attribute.
	 * @see #getStor_address()
	 * @generated
	 */
	void setStor_address(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see pubs.PubsPackage#getstore_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link pubs.store#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see pubs.PubsPackage#getstore_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link pubs.store#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #setZip(String)
	 * @see pubs.PubsPackage#getstore_Zip()
	 * @model
	 * @generated
	 */
	String getZip();

	/**
	 * Sets the value of the '{@link pubs.store#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip</em>' attribute.
	 * @see #getZip()
	 * @generated
	 */
	void setZip(String value);

	/**
	 * Returns the value of the '<em><b>Sales</b></em>' containment reference list.
	 * The list contents are of type {@link pubs.sales}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales</em>' containment reference list.
	 * @see pubs.PubsPackage#getstore_Sales()
	 * @model containment="true"
	 * @generated
	 */
	EList<sales> getSales();

	/**
	 * Returns the value of the '<em><b>Discounts</b></em>' containment reference list.
	 * The list contents are of type {@link pubs.discount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discounts</em>' containment reference list.
	 * @see pubs.PubsPackage#getstore_Discounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<discount> getDiscounts();

} // store
