/**
 */
package pubs.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pubs.PubsPackage;
import pubs.author;
import pubs.roysched;
import pubs.sales;
import pubs.title;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>title</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pubs.impl.titleImpl#getTitle_id <em>Title id</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getType <em>Type</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getPub_id <em>Pub id</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getAdvance <em>Advance</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getRoyalty <em>Royalty</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getYtd_sales <em>Ytd sales</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getRoysched <em>Roysched</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getAu_id <em>Au id</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getSales <em>Sales</em>}</li>
 *   <li>{@link pubs.impl.titleImpl#getAuthors <em>Authors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class titleImpl extends MinimalEObjectImpl.Container implements title {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdvance() <em>Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvance()
	 * @generated
	 * @ordered
	 */
	protected static final float ADVANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAdvance() <em>Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvance()
	 * @generated
	 * @ordered
	 */
	protected float advance = ADVANCE_EDEFAULT;

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
	 * The default value of the '{@link #getYtd_sales() <em>Ytd sales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYtd_sales()
	 * @generated
	 * @ordered
	 */
	protected static final int YTD_SALES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYtd_sales() <em>Ytd sales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYtd_sales()
	 * @generated
	 * @ordered
	 */
	protected int ytd_sales = YTD_SALES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPubdate() <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PUBDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPubdate() <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubdate()
	 * @generated
	 * @ordered
	 */
	protected Date pubdate = PUBDATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoysched() <em>Roysched</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoysched()
	 * @generated
	 * @ordered
	 */
	protected roysched roysched;

	/**
	 * The default value of the '{@link #getAu_id() <em>Au id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAu_id()
	 * @generated
	 * @ordered
	 */
	protected static final String AU_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAu_id() <em>Au id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAu_id()
	 * @generated
	 * @ordered
	 */
	protected String au_id = AU_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSales() <em>Sales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSales()
	 * @generated
	 * @ordered
	 */
	protected EList<sales> sales;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<author> authors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected titleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubsPackage.Literals.TITLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__TITLE_ID, oldTitle_id, title_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__PUB_ID, oldPub_id, pub_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAdvance() {
		return advance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdvance(float newAdvance) {
		float oldAdvance = advance;
		advance = newAdvance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__ADVANCE, oldAdvance, advance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__ROYALTY, oldRoyalty, royalty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYtd_sales() {
		return ytd_sales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYtd_sales(int newYtd_sales) {
		int oldYtd_sales = ytd_sales;
		ytd_sales = newYtd_sales;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__YTD_SALES, oldYtd_sales, ytd_sales));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPubdate() {
		return pubdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPubdate(Date newPubdate) {
		Date oldPubdate = pubdate;
		pubdate = newPubdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__PUBDATE, oldPubdate, pubdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public roysched getRoysched() {
		return roysched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoysched(roysched newRoysched, NotificationChain msgs) {
		roysched oldRoysched = roysched;
		roysched = newRoysched;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__ROYSCHED, oldRoysched, newRoysched);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoysched(roysched newRoysched) {
		if (newRoysched != roysched) {
			NotificationChain msgs = null;
			if (roysched != null)
				msgs = ((InternalEObject)roysched).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PubsPackage.TITLE__ROYSCHED, null, msgs);
			if (newRoysched != null)
				msgs = ((InternalEObject)newRoysched).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PubsPackage.TITLE__ROYSCHED, null, msgs);
			msgs = basicSetRoysched(newRoysched, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__ROYSCHED, newRoysched, newRoysched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAu_id() {
		return au_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAu_id(String newAu_id) {
		String oldAu_id = au_id;
		au_id = newAu_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubsPackage.TITLE__AU_ID, oldAu_id, au_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<sales> getSales() {
		if (sales == null) {
			sales = new EObjectContainmentEList<sales>(sales.class, this, PubsPackage.TITLE__SALES);
		}
		return sales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<author> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<author>(author.class, this, PubsPackage.TITLE__AUTHORS);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PubsPackage.TITLE__ROYSCHED:
				return basicSetRoysched(null, msgs);
			case PubsPackage.TITLE__SALES:
				return ((InternalEList<?>)getSales()).basicRemove(otherEnd, msgs);
			case PubsPackage.TITLE__AUTHORS:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubsPackage.TITLE__TITLE_ID:
				return getTitle_id();
			case PubsPackage.TITLE__TITLE:
				return getTitle();
			case PubsPackage.TITLE__TYPE:
				return getType();
			case PubsPackage.TITLE__PUB_ID:
				return getPub_id();
			case PubsPackage.TITLE__PRICE:
				return getPrice();
			case PubsPackage.TITLE__ADVANCE:
				return getAdvance();
			case PubsPackage.TITLE__ROYALTY:
				return getRoyalty();
			case PubsPackage.TITLE__YTD_SALES:
				return getYtd_sales();
			case PubsPackage.TITLE__NOTES:
				return getNotes();
			case PubsPackage.TITLE__PUBDATE:
				return getPubdate();
			case PubsPackage.TITLE__ROYSCHED:
				return getRoysched();
			case PubsPackage.TITLE__AU_ID:
				return getAu_id();
			case PubsPackage.TITLE__SALES:
				return getSales();
			case PubsPackage.TITLE__AUTHORS:
				return getAuthors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PubsPackage.TITLE__TITLE_ID:
				setTitle_id((String)newValue);
				return;
			case PubsPackage.TITLE__TITLE:
				setTitle((String)newValue);
				return;
			case PubsPackage.TITLE__TYPE:
				setType((String)newValue);
				return;
			case PubsPackage.TITLE__PUB_ID:
				setPub_id((String)newValue);
				return;
			case PubsPackage.TITLE__PRICE:
				setPrice((Float)newValue);
				return;
			case PubsPackage.TITLE__ADVANCE:
				setAdvance((Float)newValue);
				return;
			case PubsPackage.TITLE__ROYALTY:
				setRoyalty((Integer)newValue);
				return;
			case PubsPackage.TITLE__YTD_SALES:
				setYtd_sales((Integer)newValue);
				return;
			case PubsPackage.TITLE__NOTES:
				setNotes((String)newValue);
				return;
			case PubsPackage.TITLE__PUBDATE:
				setPubdate((Date)newValue);
				return;
			case PubsPackage.TITLE__ROYSCHED:
				setRoysched((roysched)newValue);
				return;
			case PubsPackage.TITLE__AU_ID:
				setAu_id((String)newValue);
				return;
			case PubsPackage.TITLE__SALES:
				getSales().clear();
				getSales().addAll((Collection<? extends sales>)newValue);
				return;
			case PubsPackage.TITLE__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends author>)newValue);
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
			case PubsPackage.TITLE__TITLE_ID:
				setTitle_id(TITLE_ID_EDEFAULT);
				return;
			case PubsPackage.TITLE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PubsPackage.TITLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PubsPackage.TITLE__PUB_ID:
				setPub_id(PUB_ID_EDEFAULT);
				return;
			case PubsPackage.TITLE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case PubsPackage.TITLE__ADVANCE:
				setAdvance(ADVANCE_EDEFAULT);
				return;
			case PubsPackage.TITLE__ROYALTY:
				setRoyalty(ROYALTY_EDEFAULT);
				return;
			case PubsPackage.TITLE__YTD_SALES:
				setYtd_sales(YTD_SALES_EDEFAULT);
				return;
			case PubsPackage.TITLE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case PubsPackage.TITLE__PUBDATE:
				setPubdate(PUBDATE_EDEFAULT);
				return;
			case PubsPackage.TITLE__ROYSCHED:
				setRoysched((roysched)null);
				return;
			case PubsPackage.TITLE__AU_ID:
				setAu_id(AU_ID_EDEFAULT);
				return;
			case PubsPackage.TITLE__SALES:
				getSales().clear();
				return;
			case PubsPackage.TITLE__AUTHORS:
				getAuthors().clear();
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
			case PubsPackage.TITLE__TITLE_ID:
				return TITLE_ID_EDEFAULT == null ? title_id != null : !TITLE_ID_EDEFAULT.equals(title_id);
			case PubsPackage.TITLE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PubsPackage.TITLE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case PubsPackage.TITLE__PUB_ID:
				return PUB_ID_EDEFAULT == null ? pub_id != null : !PUB_ID_EDEFAULT.equals(pub_id);
			case PubsPackage.TITLE__PRICE:
				return price != PRICE_EDEFAULT;
			case PubsPackage.TITLE__ADVANCE:
				return advance != ADVANCE_EDEFAULT;
			case PubsPackage.TITLE__ROYALTY:
				return royalty != ROYALTY_EDEFAULT;
			case PubsPackage.TITLE__YTD_SALES:
				return ytd_sales != YTD_SALES_EDEFAULT;
			case PubsPackage.TITLE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case PubsPackage.TITLE__PUBDATE:
				return PUBDATE_EDEFAULT == null ? pubdate != null : !PUBDATE_EDEFAULT.equals(pubdate);
			case PubsPackage.TITLE__ROYSCHED:
				return roysched != null;
			case PubsPackage.TITLE__AU_ID:
				return AU_ID_EDEFAULT == null ? au_id != null : !AU_ID_EDEFAULT.equals(au_id);
			case PubsPackage.TITLE__SALES:
				return sales != null && !sales.isEmpty();
			case PubsPackage.TITLE__AUTHORS:
				return authors != null && !authors.isEmpty();
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
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		result.append(type);
		result.append(", pub_id: ");
		result.append(pub_id);
		result.append(", price: ");
		result.append(price);
		result.append(", advance: ");
		result.append(advance);
		result.append(", royalty: ");
		result.append(royalty);
		result.append(", ytd_sales: ");
		result.append(ytd_sales);
		result.append(", notes: ");
		result.append(notes);
		result.append(", pubdate: ");
		result.append(pubdate);
		result.append(", au_id: ");
		result.append(au_id);
		result.append(')');
		return result.toString();
	}

} //titleImpl
