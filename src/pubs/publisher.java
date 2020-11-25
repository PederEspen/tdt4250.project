/**
 */
package pubs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pubs.publisher#getPubname <em>Pubname</em>}</li>
 *   <li>{@link pubs.publisher#getPub_id <em>Pub id</em>}</li>
 *   <li>{@link pubs.publisher#getCity <em>City</em>}</li>
 *   <li>{@link pubs.publisher#getState <em>State</em>}</li>
 *   <li>{@link pubs.publisher#getCountry <em>Country</em>}</li>
 *   <li>{@link pubs.publisher#getPub_info <em>Pub info</em>}</li>
 *   <li>{@link pubs.publisher#getEmployees <em>Employees</em>}</li>
 *   <li>{@link pubs.publisher#getTitles <em>Titles</em>}</li>
 * </ul>
 *
 * @see pubs.PubsPackage#getpublisher()
 * @model
 * @generated
 */
public interface publisher extends EObject {
	/**
	 * Returns the value of the '<em><b>Pubname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pubname</em>' attribute.
	 * @see #setPubname(String)
	 * @see pubs.PubsPackage#getpublisher_Pubname()
	 * @model
	 * @generated
	 */
	String getPubname();

	/**
	 * Sets the value of the '{@link pubs.publisher#getPubname <em>Pubname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pubname</em>' attribute.
	 * @see #getPubname()
	 * @generated
	 */
	void setPubname(String value);

	/**
	 * Returns the value of the '<em><b>Pub id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub id</em>' attribute.
	 * @see #setPub_id(String)
	 * @see pubs.PubsPackage#getpublisher_Pub_id()
	 * @model
	 * @generated
	 */
	String getPub_id();

	/**
	 * Sets the value of the '{@link pubs.publisher#getPub_id <em>Pub id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub id</em>' attribute.
	 * @see #getPub_id()
	 * @generated
	 */
	void setPub_id(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see pubs.PubsPackage#getpublisher_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link pubs.publisher#getCity <em>City</em>}' attribute.
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
	 * @see pubs.PubsPackage#getpublisher_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link pubs.publisher#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see pubs.PubsPackage#getpublisher_Country()
	 * @model
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link pubs.publisher#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Pub info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub info</em>' containment reference.
	 * @see #setPub_info(pub_info)
	 * @see pubs.PubsPackage#getpublisher_Pub_info()
	 * @model containment="true"
	 * @generated
	 */
	pub_info getPub_info();

	/**
	 * Sets the value of the '{@link pubs.publisher#getPub_info <em>Pub info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub info</em>' containment reference.
	 * @see #getPub_info()
	 * @generated
	 */
	void setPub_info(pub_info value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' reference list.
	 * The list contents are of type {@link pubs.employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' reference list.
	 * @see pubs.PubsPackage#getpublisher_Employees()
	 * @model
	 * @generated
	 */
	EList<employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Titles</b></em>' containment reference list.
	 * The list contents are of type {@link pubs.title}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titles</em>' containment reference list.
	 * @see pubs.PubsPackage#getpublisher_Titles()
	 * @model containment="true"
	 * @generated
	 */
	EList<title> getTitles();

} // publisher
