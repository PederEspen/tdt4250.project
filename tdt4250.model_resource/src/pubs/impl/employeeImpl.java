/**
 */
package pubs.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pubs.PubsPackage;
import pubs.employee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pubs.impl.employeeImpl#getLname <em>Lname</em>}</li>
 *   <li>{@link pubs.impl.employeeImpl#getFname <em>Fname</em>}</li>
 *   <li>{@link pubs.impl.employeeImpl#getEmp_id <em>Emp id</em>}</li>
 *   <li>{@link pubs.impl.employeeImpl#getMinit <em>Minit</em>}</li>
 *   <li>{@link pubs.impl.employeeImpl#getJob_id <em>Job id</em>}</li>
 *   <li>{@link pubs.impl.employeeImpl#getJob_lvl <em>Job lvl</em>}</li>
 *   <li>{@link pubs.impl.employeeImpl#getPub_id <em>Pub id</em>}</li>
 *   <li>{@link pubs.impl.employeeImpl#getHire_date <em>Hire date</em>}</li>
 *   <li>{@link pubs.impl.employeeImpl#getJob_desc <em>Job desc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class employeeImpl extends MinimalEObjectImpl.Container implements employee {
	/**
	 * The default value of the '{@link #getLname() <em>Lname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLname()
	 * @generated
	 * @ordered
	 */
	protected static final String LNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLname() <em>Lname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLname()
	 * @generated
	 * @ordered
	 */
	protected String lname = LNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFname() <em>Fname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFname()
	 * @generated
	 * @ordered
	 */
	protected static final String FNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFname() <em>Fname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFname()
	 * @generated
	 * @ordered
	 */
	protected String fname = FNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmp_id() <em>Emp id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmp_id()
	 * @generated
	 * @ordered
	 */
	protected static final String EMP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmp_id() <em>Emp id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmp_id()
	 * @generated
	 * @ordered
	 */
	protected String emp_id = EMP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinit() <em>Minit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinit()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinit() <em>Minit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinit()
	 * @generated
	 * @ordered
	 */
	protected String minit = MINIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getJob_id() <em>Job id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob_id()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJob_id() <em>Job id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob_id()
	 * @generated
	 * @ordered
	 */
	protected int job_id = JOB_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJob_lvl() <em>Job lvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob_lvl()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_LVL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJob_lvl() <em>Job lvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob_lvl()
	 * @generated
	 * @ordered
	 */
	protected int job_lvl = JOB_LVL_EDEFAULT;

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
	 * The default value of the '{@link #getHire_date() <em>Hire date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHire_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date HIRE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHire_date() <em>Hire date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHire_date()
	 * @generated
	 * @ordered
	 */
	protected Date hire_date = HIRE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJob_desc() <em>Job desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob_desc()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJob_desc() <em>Job desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob_desc()
	 * @generated
	 * @ordered
	 */
	protected String job_desc = JOB_DESC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected employeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubsPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLname() {
		return lname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLname(String newLname) {
		String oldLname = lname;
		lname = newLname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.EMPLOYEE__LNAME, oldLname, lname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFname() {
		return fname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFname(String newFname) {
		String oldFname = fname;
		fname = newFname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.EMPLOYEE__FNAME, oldFname, fname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmp_id() {
		return emp_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmp_id(String newEmp_id) {
		String oldEmp_id = emp_id;
		emp_id = newEmp_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.EMPLOYEE__EMP_ID, oldEmp_id, emp_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMinit() {
		return minit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinit(String newMinit) {
		String oldMinit = minit;
		minit = newMinit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.EMPLOYEE__MINIT, oldMinit, minit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getJob_id() {
		return job_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJob_id(int newJob_id) {
		int oldJob_id = job_id;
		job_id = newJob_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.EMPLOYEE__JOB_ID, oldJob_id, job_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getJob_lvl() {
		return job_lvl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJob_lvl(int newJob_lvl) {
		int oldJob_lvl = job_lvl;
		job_lvl = newJob_lvl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.EMPLOYEE__JOB_LVL, oldJob_lvl, job_lvl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.EMPLOYEE__PUB_ID, oldPub_id, pub_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getHire_date() {
		return hire_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHire_date(Date newHire_date) {
		Date oldHire_date = hire_date;
		hire_date = newHire_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.EMPLOYEE__HIRE_DATE, oldHire_date, hire_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJob_desc() {
		return job_desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJob_desc(String newJob_desc) {
		String oldJob_desc = job_desc;
		job_desc = newJob_desc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.EMPLOYEE__JOB_DESC, oldJob_desc, job_desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubsPackage.EMPLOYEE__LNAME:
				return getLname();
			case PubsPackage.EMPLOYEE__FNAME:
				return getFname();
			case PubsPackage.EMPLOYEE__EMP_ID:
				return getEmp_id();
			case PubsPackage.EMPLOYEE__MINIT:
				return getMinit();
			case PubsPackage.EMPLOYEE__JOB_ID:
				return getJob_id();
			case PubsPackage.EMPLOYEE__JOB_LVL:
				return getJob_lvl();
			case PubsPackage.EMPLOYEE__PUB_ID:
				return getPub_id();
			case PubsPackage.EMPLOYEE__HIRE_DATE:
				return getHire_date();
			case PubsPackage.EMPLOYEE__JOB_DESC:
				return getJob_desc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PubsPackage.EMPLOYEE__LNAME:
				setLname((String)newValue);
				return;
			case PubsPackage.EMPLOYEE__FNAME:
				setFname((String)newValue);
				return;
			case PubsPackage.EMPLOYEE__EMP_ID:
				setEmp_id((String)newValue);
				return;
			case PubsPackage.EMPLOYEE__MINIT:
				setMinit((String)newValue);
				return;
			case PubsPackage.EMPLOYEE__JOB_ID:
				setJob_id((Integer)newValue);
				return;
			case PubsPackage.EMPLOYEE__JOB_LVL:
				setJob_lvl((Integer)newValue);
				return;
			case PubsPackage.EMPLOYEE__PUB_ID:
				setPub_id((String)newValue);
				return;
			case PubsPackage.EMPLOYEE__HIRE_DATE:
				setHire_date((Date)newValue);
				return;
			case PubsPackage.EMPLOYEE__JOB_DESC:
				setJob_desc((String)newValue);
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
			case PubsPackage.EMPLOYEE__LNAME:
				setLname(LNAME_EDEFAULT);
				return;
			case PubsPackage.EMPLOYEE__FNAME:
				setFname(FNAME_EDEFAULT);
				return;
			case PubsPackage.EMPLOYEE__EMP_ID:
				setEmp_id(EMP_ID_EDEFAULT);
				return;
			case PubsPackage.EMPLOYEE__MINIT:
				setMinit(MINIT_EDEFAULT);
				return;
			case PubsPackage.EMPLOYEE__JOB_ID:
				setJob_id(JOB_ID_EDEFAULT);
				return;
			case PubsPackage.EMPLOYEE__JOB_LVL:
				setJob_lvl(JOB_LVL_EDEFAULT);
				return;
			case PubsPackage.EMPLOYEE__PUB_ID:
				setPub_id(PUB_ID_EDEFAULT);
				return;
			case PubsPackage.EMPLOYEE__HIRE_DATE:
				setHire_date(HIRE_DATE_EDEFAULT);
				return;
			case PubsPackage.EMPLOYEE__JOB_DESC:
				setJob_desc(JOB_DESC_EDEFAULT);
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
			case PubsPackage.EMPLOYEE__LNAME:
				return LNAME_EDEFAULT == null ? lname != null : !LNAME_EDEFAULT.equals(lname);
			case PubsPackage.EMPLOYEE__FNAME:
				return FNAME_EDEFAULT == null ? fname != null : !FNAME_EDEFAULT.equals(fname);
			case PubsPackage.EMPLOYEE__EMP_ID:
				return EMP_ID_EDEFAULT == null ? emp_id != null : !EMP_ID_EDEFAULT.equals(emp_id);
			case PubsPackage.EMPLOYEE__MINIT:
				return MINIT_EDEFAULT == null ? minit != null : !MINIT_EDEFAULT.equals(minit);
			case PubsPackage.EMPLOYEE__JOB_ID:
				return job_id != JOB_ID_EDEFAULT;
			case PubsPackage.EMPLOYEE__JOB_LVL:
				return job_lvl != JOB_LVL_EDEFAULT;
			case PubsPackage.EMPLOYEE__PUB_ID:
				return PUB_ID_EDEFAULT == null ? pub_id != null : !PUB_ID_EDEFAULT.equals(pub_id);
			case PubsPackage.EMPLOYEE__HIRE_DATE:
				return HIRE_DATE_EDEFAULT == null ? hire_date != null : !HIRE_DATE_EDEFAULT.equals(hire_date);
			case PubsPackage.EMPLOYEE__JOB_DESC:
				return JOB_DESC_EDEFAULT == null ? job_desc != null : !JOB_DESC_EDEFAULT.equals(job_desc);
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
		result.append(" (lname: ");
		result.append(lname);
		result.append(", fname: ");
		result.append(fname);
		result.append(", emp_id: ");
		result.append(emp_id);
		result.append(", minit: ");
		result.append(minit);
		result.append(", job_id: ");
		result.append(job_id);
		result.append(", job_lvl: ");
		result.append(job_lvl);
		result.append(", pub_id: ");
		result.append(pub_id);
		result.append(", hire_date: ");
		result.append(hire_date);
		result.append(", job_desc: ");
		result.append(job_desc);
		result.append(')');
		return result.toString();
	}

} //employeeImpl
