/**
 */
package pubs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pubs.root#getPub_id <em>Pub id</em>}</li>
 *   <li>{@link pubs.root#getStor_id <em>Stor id</em>}</li>
 *   <li>{@link pubs.root#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link pubs.root#getStores <em>Stores</em>}</li>
 *   <li>{@link pubs.root#getAuthors <em>Authors</em>}</li>
 * </ul>
 *
 * @see pubs.PubsPackage#getroot()
 * @model
 * @generated
 */
public interface root extends EObject {
	/**
	 * Returns the value of the '<em><b>Pub id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub id</em>' attribute.
	 * @see #setPub_id(String)
	 * @see pubs.PubsPackage#getroot_Pub_id()
	 * @model
	 * @generated
	 */
	String getPub_id();

	/**
	 * Sets the value of the '{@link pubs.root#getPub_id <em>Pub id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub id</em>' attribute.
	 * @see #getPub_id()
	 * @generated
	 */
	void setPub_id(String value);

	/**
	 * Returns the value of the '<em><b>Stor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stor id</em>' attribute.
	 * @see #setStor_id(String)
	 * @see pubs.PubsPackage#getroot_Stor_id()
	 * @model
	 * @generated
	 */
	String getStor_id();

	/**
	 * Sets the value of the '{@link pubs.root#getStor_id <em>Stor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stor id</em>' attribute.
	 * @see #getStor_id()
	 * @generated
	 */
	void setStor_id(String value);

	/**
	 * Returns the value of the '<em><b>Publishers</b></em>' containment reference list.
	 * The list contents are of type {@link pubs.publisher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishers</em>' containment reference list.
	 * @see pubs.PubsPackage#getroot_Publishers()
	 * @model containment="true"
	 * @generated
	 */
	EList<publisher> getPublishers();

	/**
	 * Returns the value of the '<em><b>Stores</b></em>' containment reference list.
	 * The list contents are of type {@link pubs.store}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stores</em>' containment reference list.
	 * @see pubs.PubsPackage#getroot_Stores()
	 * @model containment="true"
	 * @generated
	 */
	EList<store> getStores();

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
	 * The list contents are of type {@link pubs.author}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see pubs.PubsPackage#getroot_Authors()
	 * @model containment="true"
	 * @generated
	 */
	EList<author> getAuthors();

} // root
