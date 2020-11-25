/**
 */
package pubs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pubs.discount#getDiscounttype <em>Discounttype</em>}</li>
 *   <li>{@link pubs.discount#getStor_id <em>Stor id</em>}</li>
 *   <li>{@link pubs.discount#getLowqty <em>Lowqty</em>}</li>
 *   <li>{@link pubs.discount#getHighqty <em>Highqty</em>}</li>
 *   <li>{@link pubs.discount#getDiscount <em>Discount</em>}</li>
 * </ul>
 *
 * @see pubs.PubsPackage#getdiscount()
 * @model
 * @generated
 */
public interface discount extends EObject {
	/**
	 * Returns the value of the '<em><b>Discounttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discounttype</em>' attribute.
	 * @see #setDiscounttype(String)
	 * @see pubs.PubsPackage#getdiscount_Discounttype()
	 * @model
	 * @generated
	 */
	String getDiscounttype();

	/**
	 * Sets the value of the '{@link pubs.discount#getDiscounttype <em>Discounttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discounttype</em>' attribute.
	 * @see #getDiscounttype()
	 * @generated
	 */
	void setDiscounttype(String value);

	/**
	 * Returns the value of the '<em><b>Stor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stor id</em>' attribute.
	 * @see #setStor_id(String)
	 * @see pubs.PubsPackage#getdiscount_Stor_id()
	 * @model
	 * @generated
	 */
	String getStor_id();

	/**
	 * Sets the value of the '{@link pubs.discount#getStor_id <em>Stor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stor id</em>' attribute.
	 * @see #getStor_id()
	 * @generated
	 */
	void setStor_id(String value);

	/**
	 * Returns the value of the '<em><b>Lowqty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lowqty</em>' attribute.
	 * @see #setLowqty(int)
	 * @see pubs.PubsPackage#getdiscount_Lowqty()
	 * @model
	 * @generated
	 */
	int getLowqty();

	/**
	 * Sets the value of the '{@link pubs.discount#getLowqty <em>Lowqty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lowqty</em>' attribute.
	 * @see #getLowqty()
	 * @generated
	 */
	void setLowqty(int value);

	/**
	 * Returns the value of the '<em><b>Highqty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highqty</em>' attribute.
	 * @see #setHighqty(int)
	 * @see pubs.PubsPackage#getdiscount_Highqty()
	 * @model
	 * @generated
	 */
	int getHighqty();

	/**
	 * Sets the value of the '{@link pubs.discount#getHighqty <em>Highqty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highqty</em>' attribute.
	 * @see #getHighqty()
	 * @generated
	 */
	void setHighqty(int value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' attribute.
	 * @see #setDiscount(float)
	 * @see pubs.PubsPackage#getdiscount_Discount()
	 * @model
	 * @generated
	 */
	float getDiscount();

	/**
	 * Sets the value of the '{@link pubs.discount#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(float value);

} // discount
