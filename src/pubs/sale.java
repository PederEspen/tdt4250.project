/**
 */
package pubs;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pubs.sale#getOrd_num <em>Ord num</em>}</li>
 *   <li>{@link pubs.sale#getStor_id <em>Stor id</em>}</li>
 *   <li>{@link pubs.sale#getOrd_date <em>Ord date</em>}</li>
 *   <li>{@link pubs.sale#getQty <em>Qty</em>}</li>
 *   <li>{@link pubs.sale#getPayterms <em>Payterms</em>}</li>
 *   <li>{@link pubs.sale#getTitle_id <em>Title id</em>}</li>
 * </ul>
 *
 * @see pubs.PubsPackage#getsale()
 * @model
 * @generated
 */
public interface sale extends EObject {
	/**
	 * Returns the value of the '<em><b>Ord num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ord num</em>' attribute.
	 * @see #setOrd_num(String)
	 * @see pubs.PubsPackage#getsale_Ord_num()
	 * @model
	 * @generated
	 */
	String getOrd_num();

	/**
	 * Sets the value of the '{@link pubs.sale#getOrd_num <em>Ord num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ord num</em>' attribute.
	 * @see #getOrd_num()
	 * @generated
	 */
	void setOrd_num(String value);

	/**
	 * Returns the value of the '<em><b>Stor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stor id</em>' attribute.
	 * @see #setStor_id(String)
	 * @see pubs.PubsPackage#getsale_Stor_id()
	 * @model
	 * @generated
	 */
	String getStor_id();

	/**
	 * Sets the value of the '{@link pubs.sale#getStor_id <em>Stor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stor id</em>' attribute.
	 * @see #getStor_id()
	 * @generated
	 */
	void setStor_id(String value);

	/**
	 * Returns the value of the '<em><b>Ord date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ord date</em>' attribute.
	 * @see #setOrd_date(Date)
	 * @see pubs.PubsPackage#getsale_Ord_date()
	 * @model
	 * @generated
	 */
	Date getOrd_date();

	/**
	 * Sets the value of the '{@link pubs.sale#getOrd_date <em>Ord date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ord date</em>' attribute.
	 * @see #getOrd_date()
	 * @generated
	 */
	void setOrd_date(Date value);

	/**
	 * Returns the value of the '<em><b>Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qty</em>' attribute.
	 * @see #setQty(int)
	 * @see pubs.PubsPackage#getsale_Qty()
	 * @model
	 * @generated
	 */
	int getQty();

	/**
	 * Sets the value of the '{@link pubs.sale#getQty <em>Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qty</em>' attribute.
	 * @see #getQty()
	 * @generated
	 */
	void setQty(int value);

	/**
	 * Returns the value of the '<em><b>Payterms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payterms</em>' attribute.
	 * @see #setPayterms(String)
	 * @see pubs.PubsPackage#getsale_Payterms()
	 * @model
	 * @generated
	 */
	String getPayterms();

	/**
	 * Sets the value of the '{@link pubs.sale#getPayterms <em>Payterms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payterms</em>' attribute.
	 * @see #getPayterms()
	 * @generated
	 */
	void setPayterms(String value);

	/**
	 * Returns the value of the '<em><b>Title id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title id</em>' attribute.
	 * @see #setTitle_id(String)
	 * @see pubs.PubsPackage#getsale_Title_id()
	 * @model
	 * @generated
	 */
	String getTitle_id();

	/**
	 * Sets the value of the '{@link pubs.sale#getTitle_id <em>Title id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title id</em>' attribute.
	 * @see #getTitle_id()
	 * @generated
	 */
	void setTitle_id(String value);

} // sale
