/**
 */
package pubs;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pubs.title#getTitle_id <em>Title id</em>}</li>
 *   <li>{@link pubs.title#getTitle <em>Title</em>}</li>
 *   <li>{@link pubs.title#getType <em>Type</em>}</li>
 *   <li>{@link pubs.title#getPub_id <em>Pub id</em>}</li>
 *   <li>{@link pubs.title#getPrice <em>Price</em>}</li>
 *   <li>{@link pubs.title#getAdvance <em>Advance</em>}</li>
 *   <li>{@link pubs.title#getRoyalty <em>Royalty</em>}</li>
 *   <li>{@link pubs.title#getYtd_sales <em>Ytd sales</em>}</li>
 *   <li>{@link pubs.title#getNotes <em>Notes</em>}</li>
 *   <li>{@link pubs.title#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link pubs.title#getRoysched <em>Roysched</em>}</li>
 *   <li>{@link pubs.title#getAu_id <em>Au id</em>}</li>
 *   <li>{@link pubs.title#getSales <em>Sales</em>}</li>
 *   <li>{@link pubs.title#getAuthors <em>Authors</em>}</li>
 * </ul>
 *
 * @see pubs.PubsPackage#gettitle()
 * @model
 * @generated
 */
public interface title extends EObject {
	/**
	 * Returns the value of the '<em><b>Title id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title id</em>' attribute.
	 * @see #setTitle_id(String)
	 * @see pubs.PubsPackage#gettitle_Title_id()
	 * @model
	 * @generated
	 */
	String getTitle_id();

	/**
	 * Sets the value of the '{@link pubs.title#getTitle_id <em>Title id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title id</em>' attribute.
	 * @see #getTitle_id()
	 * @generated
	 */
	void setTitle_id(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see pubs.PubsPackage#gettitle_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link pubs.title#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see pubs.PubsPackage#gettitle_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link pubs.title#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Pub id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub id</em>' attribute.
	 * @see #setPub_id(String)
	 * @see pubs.PubsPackage#gettitle_Pub_id()
	 * @model
	 * @generated
	 */
	String getPub_id();

	/**
	 * Sets the value of the '{@link pubs.title#getPub_id <em>Pub id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub id</em>' attribute.
	 * @see #getPub_id()
	 * @generated
	 */
	void setPub_id(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see pubs.PubsPackage#gettitle_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link pubs.title#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advance</em>' attribute.
	 * @see #setAdvance(float)
	 * @see pubs.PubsPackage#gettitle_Advance()
	 * @model
	 * @generated
	 */
	float getAdvance();

	/**
	 * Sets the value of the '{@link pubs.title#getAdvance <em>Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advance</em>' attribute.
	 * @see #getAdvance()
	 * @generated
	 */
	void setAdvance(float value);

	/**
	 * Returns the value of the '<em><b>Royalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Royalty</em>' attribute.
	 * @see #setRoyalty(int)
	 * @see pubs.PubsPackage#gettitle_Royalty()
	 * @model
	 * @generated
	 */
	int getRoyalty();

	/**
	 * Sets the value of the '{@link pubs.title#getRoyalty <em>Royalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Royalty</em>' attribute.
	 * @see #getRoyalty()
	 * @generated
	 */
	void setRoyalty(int value);

	/**
	 * Returns the value of the '<em><b>Ytd sales</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ytd sales</em>' attribute.
	 * @see #setYtd_sales(int)
	 * @see pubs.PubsPackage#gettitle_Ytd_sales()
	 * @model
	 * @generated
	 */
	int getYtd_sales();

	/**
	 * Sets the value of the '{@link pubs.title#getYtd_sales <em>Ytd sales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ytd sales</em>' attribute.
	 * @see #getYtd_sales()
	 * @generated
	 */
	void setYtd_sales(int value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see pubs.PubsPackage#gettitle_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link pubs.title#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Pubdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pubdate</em>' attribute.
	 * @see #setPubdate(Date)
	 * @see pubs.PubsPackage#gettitle_Pubdate()
	 * @model
	 * @generated
	 */
	Date getPubdate();

	/**
	 * Sets the value of the '{@link pubs.title#getPubdate <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pubdate</em>' attribute.
	 * @see #getPubdate()
	 * @generated
	 */
	void setPubdate(Date value);

	/**
	 * Returns the value of the '<em><b>Roysched</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roysched</em>' containment reference.
	 * @see #setRoysched(roysched)
	 * @see pubs.PubsPackage#gettitle_Roysched()
	 * @model containment="true"
	 * @generated
	 */
	roysched getRoysched();

	/**
	 * Sets the value of the '{@link pubs.title#getRoysched <em>Roysched</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roysched</em>' containment reference.
	 * @see #getRoysched()
	 * @generated
	 */
	void setRoysched(roysched value);

	/**
	 * Returns the value of the '<em><b>Au id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Au id</em>' attribute.
	 * @see #setAu_id(String)
	 * @see pubs.PubsPackage#gettitle_Au_id()
	 * @model
	 * @generated
	 */
	String getAu_id();

	/**
	 * Sets the value of the '{@link pubs.title#getAu_id <em>Au id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Au id</em>' attribute.
	 * @see #getAu_id()
	 * @generated
	 */
	void setAu_id(String value);

	/**
	 * Returns the value of the '<em><b>Sales</b></em>' containment reference list.
	 * The list contents are of type {@link pubs.sales}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales</em>' containment reference list.
	 * @see pubs.PubsPackage#gettitle_Sales()
	 * @model containment="true"
	 * @generated
	 */
	EList<sales> getSales();

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
	 * The list contents are of type {@link pubs.author}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see pubs.PubsPackage#gettitle_Authors()
	 * @model containment="true"
	 * @generated
	 */
	EList<author> getAuthors();

} // title
