/**
 */
package pubs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pubs.PubsPackage;
import pubs.roysched;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>roysched</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pubs.impl.royschedImpl#getTitle_id <em>Title id</em>}</li>
 *   <li>{@link pubs.impl.royschedImpl#getLorange <em>Lorange</em>}</li>
 *   <li>{@link pubs.impl.royschedImpl#getHirange <em>Hirange</em>}</li>
 *   <li>{@link pubs.impl.royschedImpl#getRoyalty <em>Royalty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class royschedImpl extends MinimalEObjectImpl.Container implements roysched {
	/**
	 * The default value of the '{@link #getTitle_id() <em>Title id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_id()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle_id() <em>Title id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_id()
	 * @generated
	 * @ordered
	 */
	protected String title_id = TITLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLorange() <em>Lorange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLorange()
	 * @generated
	 * @ordered
	 */
	protected static final int LORANGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLorange() <em>Lorange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLorange()
	 * @generated
	 * @ordered
	 */
	protected int lorange = LORANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHirange() <em>Hirange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHirange()
	 * @generated
	 * @ordered
	 */
	protected static final int HIRANGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHirange() <em>Hirange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHirange()
	 * @generated
	 * @ordered
	 */
	protected int hirange = HIRANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoyalty() <em>Royalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoyalty()
	 * @generated
	 * @ordered
	 */
	protected static final int ROYALTY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoyalty() <em>Royalty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoyalty()
	 * @generated
	 * @ordered
	 */
	protected int royalty = ROYALTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected royschedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubsPackage.Literals.ROYSCHED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle_id() {
		return title_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle_id(String newTitle_id) {
		String oldTitle_id = title_id;
		title_id = newTitle_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.ROYSCHED__TITLE_ID, oldTitle_id, title_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLorange() {
		return lorange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLorange(int newLorange) {
		int oldLorange = lorange;
		lorange = newLorange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.ROYSCHED__LORANGE, oldLorange, lorange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHirange() {
		return hirange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHirange(int newHirange) {
		int oldHirange = hirange;
		hirange = newHirange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.ROYSCHED__HIRANGE, oldHirange, hirange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRoyalty() {
		return royalty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoyalty(int newRoyalty) {
		int oldRoyalty = royalty;
		royalty = newRoyalty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.ROYSCHED__ROYALTY, oldRoyalty, royalty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubsPackage.ROYSCHED__TITLE_ID:
				return getTitle_id();
			case PubsPackage.ROYSCHED__LORANGE:
				return getLorange();
			case PubsPackage.ROYSCHED__HIRANGE:
				return getHirange();
			case PubsPackage.ROYSCHED__ROYALTY:
				return getRoyalty();
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
			case PubsPackage.ROYSCHED__TITLE_ID:
				setTitle_id((String)newValue);
				return;
			case PubsPackage.ROYSCHED__LORANGE:
				setLorange((Integer)newValue);
				return;
			case PubsPackage.ROYSCHED__HIRANGE:
				setHirange((Integer)newValue);
				return;
			case PubsPackage.ROYSCHED__ROYALTY:
				setRoyalty((Integer)newValue);
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
			case PubsPackage.ROYSCHED__TITLE_ID:
				setTitle_id(TITLE_ID_EDEFAULT);
				return;
			case PubsPackage.ROYSCHED__LORANGE:
				setLorange(LORANGE_EDEFAULT);
				return;
			case PubsPackage.ROYSCHED__HIRANGE:
				setHirange(HIRANGE_EDEFAULT);
				return;
			case PubsPackage.ROYSCHED__ROYALTY:
				setRoyalty(ROYALTY_EDEFAULT);
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
			case PubsPackage.ROYSCHED__TITLE_ID:
				return TITLE_ID_EDEFAULT == null ? title_id != null : !TITLE_ID_EDEFAULT.equals(title_id);
			case PubsPackage.ROYSCHED__LORANGE:
				return lorange != LORANGE_EDEFAULT;
			case PubsPackage.ROYSCHED__HIRANGE:
				return hirange != HIRANGE_EDEFAULT;
			case PubsPackage.ROYSCHED__ROYALTY:
				return royalty != ROYALTY_EDEFAULT;
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
		result.append(" (title_id: ");
		result.append(title_id);
		result.append(", lorange: ");
		result.append(lorange);
		result.append(", hirange: ");
		result.append(hirange);
		result.append(", royalty: ");
		result.append(royalty);
		result.append(')');
		return result.toString();
	}

} //royschedImpl
