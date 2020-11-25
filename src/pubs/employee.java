/**
 */
package pubs;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pubs.employee#getLname <em>Lname</em>}</li>
 *   <li>{@link pubs.employee#getFname <em>Fname</em>}</li>
 *   <li>{@link pubs.employee#getEmp_id <em>Emp id</em>}</li>
 *   <li>{@link pubs.employee#getMinit <em>Minit</em>}</li>
 *   <li>{@link pubs.employee#getJob_id <em>Job id</em>}</li>
 *   <li>{@link pubs.employee#getJob_lvl <em>Job lvl</em>}</li>
 *   <li>{@link pubs.employee#getPub_id <em>Pub id</em>}</li>
 *   <li>{@link pubs.employee#getHire_date <em>Hire date</em>}</li>
 *   <li>{@link pubs.employee#getJob_desc <em>Job desc</em>}</li>
 * </ul>
 *
 * @see pubs.PubsPackage#getemployee()
 * @model
 * @generated
 */
public interface employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Lname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lname</em>' attribute.
	 * @see #setLname(String)
	 * @see pubs.PubsPackage#getemployee_Lname()
	 * @model
	 * @generated
	 */
	String getLname();

	/**
	 * Sets the value of the '{@link pubs.employee#getLname <em>Lname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lname</em>' attribute.
	 * @see #getLname()
	 * @generated
	 */
	void setLname(String value);

	/**
	 * Returns the value of the '<em><b>Fname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fname</em>' attribute.
	 * @see #setFname(String)
	 * @see pubs.PubsPackage#getemployee_Fname()
	 * @model
	 * @generated
	 */
	String getFname();

	/**
	 * Sets the value of the '{@link pubs.employee#getFname <em>Fname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fname</em>' attribute.
	 * @see #getFname()
	 * @generated
	 */
	void setFname(String value);

	/**
	 * Returns the value of the '<em><b>Emp id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emp id</em>' attribute.
	 * @see #setEmp_id(String)
	 * @see pubs.PubsPackage#getemployee_Emp_id()
	 * @model
	 * @generated
	 */
	String getEmp_id();

	/**
	 * Sets the value of the '{@link pubs.employee#getEmp_id <em>Emp id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emp id</em>' attribute.
	 * @see #getEmp_id()
	 * @generated
	 */
	void setEmp_id(String value);

	/**
	 * Returns the value of the '<em><b>Minit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minit</em>' attribute.
	 * @see #setMinit(String)
	 * @see pubs.PubsPackage#getemployee_Minit()
	 * @model
	 * @generated
	 */
	String getMinit();

	/**
	 * Sets the value of the '{@link pubs.employee#getMinit <em>Minit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minit</em>' attribute.
	 * @see #getMinit()
	 * @generated
	 */
	void setMinit(String value);

	/**
	 * Returns the value of the '<em><b>Job id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job id</em>' attribute.
	 * @see #setJob_id(int)
	 * @see pubs.PubsPackage#getemployee_Job_id()
	 * @model
	 * @generated
	 */
	int getJob_id();

	/**
	 * Sets the value of the '{@link pubs.employee#getJob_id <em>Job id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job id</em>' attribute.
	 * @see #getJob_id()
	 * @generated
	 */
	void setJob_id(int value);

	/**
	 * Returns the value of the '<em><b>Job lvl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job lvl</em>' attribute.
	 * @see #setJob_lvl(int)
	 * @see pubs.PubsPackage#getemployee_Job_lvl()
	 * @model
	 * @generated
	 */
	int getJob_lvl();

	/**
	 * Sets the value of the '{@link pubs.employee#getJob_lvl <em>Job lvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job lvl</em>' attribute.
	 * @see #getJob_lvl()
	 * @generated
	 */
	void setJob_lvl(int value);

	/**
	 * Returns the value of the '<em><b>Pub id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub id</em>' attribute.
	 * @see #setPub_id(String)
	 * @see pubs.PubsPackage#getemployee_Pub_id()
	 * @model
	 * @generated
	 */
	String getPub_id();

	/**
	 * Sets the value of the '{@link pubs.employee#getPub_id <em>Pub id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub id</em>' attribute.
	 * @see #getPub_id()
	 * @generated
	 */
	void setPub_id(String value);

	/**
	 * Returns the value of the '<em><b>Hire date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hire date</em>' attribute.
	 * @see #setHire_date(Date)
	 * @see pubs.PubsPackage#getemployee_Hire_date()
	 * @model
	 * @generated
	 */
	Date getHire_date();

	/**
	 * Sets the value of the '{@link pubs.employee#getHire_date <em>Hire date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hire date</em>' attribute.
	 * @see #getHire_date()
	 * @generated
	 */
	void setHire_date(Date value);

	/**
	 * Returns the value of the '<em><b>Job desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job desc</em>' attribute.
	 * @see #setJob_desc(String)
	 * @see pubs.PubsPackage#getemployee_Job_desc()
	 * @model
	 * @generated
	 */
	String getJob_desc();

	/**
	 * Sets the value of the '{@link pubs.employee#getJob_desc <em>Job desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job desc</em>' attribute.
	 * @see #getJob_desc()
	 * @generated
	 */
	void setJob_desc(String value);

} // employee
