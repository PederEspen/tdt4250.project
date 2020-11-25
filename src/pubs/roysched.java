/**
 */
package pubs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>roysched</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pubs.roysched#getTitle_id <em>Title id</em>}</li>
 *   <li>{@link pubs.roysched#getLorange <em>Lorange</em>}</li>
 *   <li>{@link pubs.roysched#getHirange <em>Hirange</em>}</li>
 *   <li>{@link pubs.roysched#getRoyalty <em>Royalty</em>}</li>
 * </ul>
 *
 * @see pubs.PubsPackage#getroysched()
 * @model
 * @generated
 */
public interface roysched extends EObject {
	/**
	 * Returns the value of the '<em><b>Title id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title id</em>' attribute.
	 * @see #setTitle_id(String)
	 * @see pubs.PubsPackage#getroysched_Title_id()
	 * @model
	 * @generated
	 */
	String getTitle_id();

	/**
	 * Sets the value of the '{@link pubs.roysched#getTitle_id <em>Title id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title id</em>' attribute.
	 * @see #getTitle_id()
	 * @generated
	 */
	void setTitle_id(String value);

	/**
	 * Returns the value of the '<em><b>Lorange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lorange</em>' attribute.
	 * @see #setLorange(int)
	 * @see pubs.PubsPackage#getroysched_Lorange()
	 * @model
	 * @generated
	 */
	int getLorange();

	/**
	 * Sets the value of the '{@link pubs.roysched#getLorange <em>Lorange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lorange</em>' attribute.
	 * @see #getLorange()
	 * @generated
	 */
	void setLorange(int value);

	/**
	 * Returns the value of the '<em><b>Hirange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hirange</em>' attribute.
	 * @see #setHirange(int)
	 * @see pubs.PubsPackage#getroysched_Hirange()
	 * @model
	 * @generated
	 */
	int getHirange();

	/**
	 * Sets the value of the '{@link pubs.roysched#getHirange <em>Hirange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hirange</em>' attribute.
	 * @see #getHirange()
	 * @generated
	 */
	void setHirange(int value);

	/**
	 * Returns the value of the '<em><b>Royalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Royalty</em>' attribute.
	 * @see #setRoyalty(int)
	 * @see pubs.PubsPackage#getroysched_Royalty()
	 * @model
	 * @generated
	 */
	int getRoyalty();

	/**
	 * Sets the value of the '{@link pubs.roysched#getRoyalty <em>Royalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Royalty</em>' attribute.
	 * @see #getRoyalty()
	 * @generated
	 */
	void setRoyalty(int value);

} // roysched
