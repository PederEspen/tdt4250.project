/**
 */
package pubs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>pub info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pubs.pub_info#getPub_id <em>Pub id</em>}</li>
 *   <li>{@link pubs.pub_info#getPr_info <em>Pr info</em>}</li>
 * </ul>
 *
 * @see pubs.PubsPackage#getpub_info()
 * @model
 * @generated
 */
public interface pub_info extends EObject {
	/**
	 * Returns the value of the '<em><b>Pub id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub id</em>' attribute.
	 * @see #setPub_id(String)
	 * @see pubs.PubsPackage#getpub_info_Pub_id()
	 * @model
	 * @generated
	 */
	String getPub_id();

	/**
	 * Sets the value of the '{@link pubs.pub_info#getPub_id <em>Pub id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub id</em>' attribute.
	 * @see #getPub_id()
	 * @generated
	 */
	void setPub_id(String value);

	/**
	 * Returns the value of the '<em><b>Pr info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pr info</em>' attribute.
	 * @see #setPr_info(String)
	 * @see pubs.PubsPackage#getpub_info_Pr_info()
	 * @model
	 * @generated
	 */
	String getPr_info();

	/**
	 * Sets the value of the '{@link pubs.pub_info#getPr_info <em>Pr info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pr info</em>' attribute.
	 * @see #getPr_info()
	 * @generated
	 */
	void setPr_info(String value);

} // pub_info
