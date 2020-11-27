/**
 */
package pubs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pubs.PubsFactory
 * @model kind="package"
 * @generated
 */
public interface PubsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pubs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.project/model/pubs.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pubs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PubsPackage eINSTANCE = pubs.impl.PubsPackageImpl.init();

	/**
	 * The meta object id for the '{@link pubs.impl.rootImpl <em>root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pubs.impl.rootImpl
	 * @see pubs.impl.PubsPackageImpl#getroot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Pub id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PUB_ID = 0;

	/**
	 * The feature id for the '<em><b>Stor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__STOR_ID = 1;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PUBLISHERS = 2;

	/**
	 * The feature id for the '<em><b>Stores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__STORES = 3;

	/**
	 * The number of structural features of the '<em>root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pubs.impl.publisherImpl <em>publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pubs.impl.publisherImpl
	 * @see pubs.impl.PubsPackageImpl#getpublisher()
	 * @generated
	 */
	int PUBLISHER = 1;

	/**
	 * The feature id for the '<em><b>Pubname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__PUBNAME = 0;

	/**
	 * The feature id for the '<em><b>Pub id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__PUB_ID = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__CITY = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__STATE = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Pub info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__PUB_INFO = 5;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__EMPLOYEES = 6;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__TITLES = 7;

	/**
	 * The number of structural features of the '<em>publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pubs.impl.pub_infoImpl <em>pub info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pubs.impl.pub_infoImpl
	 * @see pubs.impl.PubsPackageImpl#getpub_info()
	 * @generated
	 */
	int PUB_INFO = 2;

	/**
	 * The feature id for the '<em><b>Pub id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_INFO__PUB_ID = 0;

	/**
	 * The feature id for the '<em><b>Pr info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_INFO__PR_INFO = 1;

	/**
	 * The number of structural features of the '<em>pub info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>pub info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pubs.impl.employeeImpl <em>employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pubs.impl.employeeImpl
	 * @see pubs.impl.PubsPackageImpl#getemployee()
	 * @generated
	 */
	int EMPLOYEE = 3;

	/**
	 * The feature id for the '<em><b>Lname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LNAME = 0;

	/**
	 * The feature id for the '<em><b>Fname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FNAME = 1;

	/**
	 * The feature id for the '<em><b>Emp id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMP_ID = 2;

	/**
	 * The feature id for the '<em><b>Minit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__MINIT = 3;

	/**
	 * The feature id for the '<em><b>Job id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__JOB_ID = 4;

	/**
	 * The feature id for the '<em><b>Job lvl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__JOB_LVL = 5;

	/**
	 * The feature id for the '<em><b>Pub id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PUB_ID = 6;

	/**
	 * The feature id for the '<em><b>Hire date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__HIRE_DATE = 7;

	/**
	 * The feature id for the '<em><b>Job desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__JOB_DESC = 8;

	/**
	 * The number of structural features of the '<em>employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pubs.impl.titleImpl <em>title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pubs.impl.titleImpl
	 * @see pubs.impl.PubsPackageImpl#gettitle()
	 * @generated
	 */
	int TITLE = 4;

	/**
	 * The feature id for the '<em><b>Title id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TITLE_ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Pub id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__PUB_ID = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__ADVANCE = 5;

	/**
	 * The feature id for the '<em><b>Royalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__ROYALTY = 6;

	/**
	 * The feature id for the '<em><b>Ytd sales</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__YTD_SALES = 7;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__NOTES = 8;

	/**
	 * The feature id for the '<em><b>Pubdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__PUBDATE = 9;

	/**
	 * The feature id for the '<em><b>Roysched</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__ROYSCHED = 10;

	/**
	 * The feature id for the '<em><b>Au ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__AU_IDS = 11;

	/**
	 * The feature id for the '<em><b>Sales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__SALES = 12;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__AUTHORS = 13;

	/**
	 * The number of structural features of the '<em>title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pubs.impl.royschedImpl <em>roysched</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pubs.impl.royschedImpl
	 * @see pubs.impl.PubsPackageImpl#getroysched()
	 * @generated
	 */
	int ROYSCHED = 5;

	/**
	 * The feature id for the '<em><b>Title id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROYSCHED__TITLE_ID = 0;

	/**
	 * The feature id for the '<em><b>Lorange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROYSCHED__LORANGE = 1;

	/**
	 * The feature id for the '<em><b>Hirange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROYSCHED__HIRANGE = 2;

	/**
	 * The feature id for the '<em><b>Royalty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROYSCHED__ROYALTY = 3;

	/**
	 * The number of structural features of the '<em>roysched</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROYSCHED_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>roysched</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROYSCHED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pubs.impl.saleImpl <em>sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pubs.impl.saleImpl
	 * @see pubs.impl.PubsPackageImpl#getsale()
	 * @generated
	 */
	int SALE = 6;

	/**
	 * The feature id for the '<em><b>Ord num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__ORD_NUM = 0;

	/**
	 * The feature id for the '<em><b>Stor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__STOR_ID = 1;

	/**
	 * The feature id for the '<em><b>Ord date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__ORD_DATE = 2;

	/**
	 * The feature id for the '<em><b>Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__QTY = 3;

	/**
	 * The feature id for the '<em><b>Payterms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__PAYTERMS = 4;

	/**
	 * The feature id for the '<em><b>Title id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__TITLE_ID = 5;

	/**
	 * The number of structural features of the '<em>sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pubs.impl.authorImpl <em>author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pubs.impl.authorImpl
	 * @see pubs.impl.PubsPackageImpl#getauthor()
	 * @generated
	 */
	int AUTHOR = 7;

	/**
	 * The feature id for the '<em><b>Au lname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__AU_LNAME = 0;

	/**
	 * The feature id for the '<em><b>Au fname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__AU_FNAME = 1;

	/**
	 * The feature id for the '<em><b>Au id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__AU_ID = 2;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__PHONE = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__CITY = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__STATE = 6;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__ZIP = 7;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__CONTRACT = 8;

	/**
	 * The number of structural features of the '<em>author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pubs.impl.storeImpl <em>store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pubs.impl.storeImpl
	 * @see pubs.impl.PubsPackageImpl#getstore()
	 * @generated
	 */
	int STORE = 8;

	/**
	 * The feature id for the '<em><b>Stor name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__STOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Stor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__STOR_ID = 1;

	/**
	 * The feature id for the '<em><b>Stor address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__STOR_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__CITY = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__STATE = 4;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ZIP = 5;

	/**
	 * The feature id for the '<em><b>Sales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SALES = 6;

	/**
	 * The feature id for the '<em><b>Discounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__DISCOUNTS = 7;

	/**
	 * The number of structural features of the '<em>store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pubs.impl.discountImpl <em>discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pubs.impl.discountImpl
	 * @see pubs.impl.PubsPackageImpl#getdiscount()
	 * @generated
	 */
	int DISCOUNT = 9;

	/**
	 * The feature id for the '<em><b>Discounttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__DISCOUNTTYPE = 0;

	/**
	 * The feature id for the '<em><b>Stor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__STOR_ID = 1;

	/**
	 * The feature id for the '<em><b>Lowqty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__LOWQTY = 2;

	/**
	 * The feature id for the '<em><b>Highqty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__HIGHQTY = 3;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__DISCOUNT = 4;

	/**
	 * The number of structural features of the '<em>discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pubs.root <em>root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>root</em>'.
	 * @see pubs.root
	 * @generated
	 */
	EClass getroot();

	/**
	 * Returns the meta object for the attribute '{@link pubs.root#getPub_id <em>Pub id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pub id</em>'.
	 * @see pubs.root#getPub_id()
	 * @see #getroot()
	 * @generated
	 */
	EAttribute getroot_Pub_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.root#getStor_id <em>Stor id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stor id</em>'.
	 * @see pubs.root#getStor_id()
	 * @see #getroot()
	 * @generated
	 */
	EAttribute getroot_Stor_id();

	/**
	 * Returns the meta object for the containment reference list '{@link pubs.root#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publishers</em>'.
	 * @see pubs.root#getPublishers()
	 * @see #getroot()
	 * @generated
	 */
	EReference getroot_Publishers();

	/**
	 * Returns the meta object for the containment reference list '{@link pubs.root#getStores <em>Stores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stores</em>'.
	 * @see pubs.root#getStores()
	 * @see #getroot()
	 * @generated
	 */
	EReference getroot_Stores();

	/**
	 * Returns the meta object for class '{@link pubs.publisher <em>publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>publisher</em>'.
	 * @see pubs.publisher
	 * @generated
	 */
	EClass getpublisher();

	/**
	 * Returns the meta object for the attribute '{@link pubs.publisher#getPubname <em>Pubname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pubname</em>'.
	 * @see pubs.publisher#getPubname()
	 * @see #getpublisher()
	 * @generated
	 */
	EAttribute getpublisher_Pubname();

	/**
	 * Returns the meta object for the attribute '{@link pubs.publisher#getPub_id <em>Pub id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pub id</em>'.
	 * @see pubs.publisher#getPub_id()
	 * @see #getpublisher()
	 * @generated
	 */
	EAttribute getpublisher_Pub_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.publisher#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see pubs.publisher#getCity()
	 * @see #getpublisher()
	 * @generated
	 */
	EAttribute getpublisher_City();

	/**
	 * Returns the meta object for the attribute '{@link pubs.publisher#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see pubs.publisher#getState()
	 * @see #getpublisher()
	 * @generated
	 */
	EAttribute getpublisher_State();

	/**
	 * Returns the meta object for the attribute '{@link pubs.publisher#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see pubs.publisher#getCountry()
	 * @see #getpublisher()
	 * @generated
	 */
	EAttribute getpublisher_Country();

	/**
	 * Returns the meta object for the containment reference '{@link pubs.publisher#getPub_info <em>Pub info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pub info</em>'.
	 * @see pubs.publisher#getPub_info()
	 * @see #getpublisher()
	 * @generated
	 */
	EReference getpublisher_Pub_info();

	/**
	 * Returns the meta object for the containment reference list '{@link pubs.publisher#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see pubs.publisher#getEmployees()
	 * @see #getpublisher()
	 * @generated
	 */
	EReference getpublisher_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link pubs.publisher#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Titles</em>'.
	 * @see pubs.publisher#getTitles()
	 * @see #getpublisher()
	 * @generated
	 */
	EReference getpublisher_Titles();

	/**
	 * Returns the meta object for class '{@link pubs.pub_info <em>pub info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>pub info</em>'.
	 * @see pubs.pub_info
	 * @generated
	 */
	EClass getpub_info();

	/**
	 * Returns the meta object for the attribute '{@link pubs.pub_info#getPub_id <em>Pub id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pub id</em>'.
	 * @see pubs.pub_info#getPub_id()
	 * @see #getpub_info()
	 * @generated
	 */
	EAttribute getpub_info_Pub_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.pub_info#getPr_info <em>Pr info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pr info</em>'.
	 * @see pubs.pub_info#getPr_info()
	 * @see #getpub_info()
	 * @generated
	 */
	EAttribute getpub_info_Pr_info();

	/**
	 * Returns the meta object for class '{@link pubs.employee <em>employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>employee</em>'.
	 * @see pubs.employee
	 * @generated
	 */
	EClass getemployee();

	/**
	 * Returns the meta object for the attribute '{@link pubs.employee#getLname <em>Lname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lname</em>'.
	 * @see pubs.employee#getLname()
	 * @see #getemployee()
	 * @generated
	 */
	EAttribute getemployee_Lname();

	/**
	 * Returns the meta object for the attribute '{@link pubs.employee#getFname <em>Fname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fname</em>'.
	 * @see pubs.employee#getFname()
	 * @see #getemployee()
	 * @generated
	 */
	EAttribute getemployee_Fname();

	/**
	 * Returns the meta object for the attribute '{@link pubs.employee#getEmp_id <em>Emp id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emp id</em>'.
	 * @see pubs.employee#getEmp_id()
	 * @see #getemployee()
	 * @generated
	 */
	EAttribute getemployee_Emp_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.employee#getMinit <em>Minit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minit</em>'.
	 * @see pubs.employee#getMinit()
	 * @see #getemployee()
	 * @generated
	 */
	EAttribute getemployee_Minit();

	/**
	 * Returns the meta object for the attribute '{@link pubs.employee#getJob_id <em>Job id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job id</em>'.
	 * @see pubs.employee#getJob_id()
	 * @see #getemployee()
	 * @generated
	 */
	EAttribute getemployee_Job_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.employee#getJob_lvl <em>Job lvl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job lvl</em>'.
	 * @see pubs.employee#getJob_lvl()
	 * @see #getemployee()
	 * @generated
	 */
	EAttribute getemployee_Job_lvl();

	/**
	 * Returns the meta object for the attribute '{@link pubs.employee#getPub_id <em>Pub id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pub id</em>'.
	 * @see pubs.employee#getPub_id()
	 * @see #getemployee()
	 * @generated
	 */
	EAttribute getemployee_Pub_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.employee#getHire_date <em>Hire date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hire date</em>'.
	 * @see pubs.employee#getHire_date()
	 * @see #getemployee()
	 * @generated
	 */
	EAttribute getemployee_Hire_date();

	/**
	 * Returns the meta object for the attribute '{@link pubs.employee#getJob_desc <em>Job desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job desc</em>'.
	 * @see pubs.employee#getJob_desc()
	 * @see #getemployee()
	 * @generated
	 */
	EAttribute getemployee_Job_desc();

	/**
	 * Returns the meta object for class '{@link pubs.title <em>title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>title</em>'.
	 * @see pubs.title
	 * @generated
	 */
	EClass gettitle();

	/**
	 * Returns the meta object for the attribute '{@link pubs.title#getTitle_id <em>Title id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title id</em>'.
	 * @see pubs.title#getTitle_id()
	 * @see #gettitle()
	 * @generated
	 */
	EAttribute gettitle_Title_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.title#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see pubs.title#getTitle()
	 * @see #gettitle()
	 * @generated
	 */
	EAttribute gettitle_Title();

	/**
	 * Returns the meta object for the attribute '{@link pubs.title#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pubs.title#getType()
	 * @see #gettitle()
	 * @generated
	 */
	EAttribute gettitle_Type();

	/**
	 * Returns the meta object for the attribute '{@link pubs.title#getPub_id <em>Pub id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pub id</em>'.
	 * @see pubs.title#getPub_id()
	 * @see #gettitle()
	 * @generated
	 */
	EAttribute gettitle_Pub_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.title#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see pubs.title#getPrice()
	 * @see #gettitle()
	 * @generated
	 */
	EAttribute gettitle_Price();

	/**
	 * Returns the meta object for the attribute '{@link pubs.title#getAdvance <em>Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advance</em>'.
	 * @see pubs.title#getAdvance()
	 * @see #gettitle()
	 * @generated
	 */
	EAttribute gettitle_Advance();

	/**
	 * Returns the meta object for the attribute '{@link pubs.title#getRoyalty <em>Royalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Royalty</em>'.
	 * @see pubs.title#getRoyalty()
	 * @see #gettitle()
	 * @generated
	 */
	EAttribute gettitle_Royalty();

	/**
	 * Returns the meta object for the attribute '{@link pubs.title#getYtd_sales <em>Ytd sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ytd sales</em>'.
	 * @see pubs.title#getYtd_sales()
	 * @see #gettitle()
	 * @generated
	 */
	EAttribute gettitle_Ytd_sales();

	/**
	 * Returns the meta object for the attribute '{@link pubs.title#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see pubs.title#getNotes()
	 * @see #gettitle()
	 * @generated
	 */
	EAttribute gettitle_Notes();

	/**
	 * Returns the meta object for the attribute '{@link pubs.title#getPubdate <em>Pubdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pubdate</em>'.
	 * @see pubs.title#getPubdate()
	 * @see #gettitle()
	 * @generated
	 */
	EAttribute gettitle_Pubdate();

	/**
	 * Returns the meta object for the containment reference '{@link pubs.title#getRoysched <em>Roysched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roysched</em>'.
	 * @see pubs.title#getRoysched()
	 * @see #gettitle()
	 * @generated
	 */
	EReference gettitle_Roysched();

	/**
	 * Returns the meta object for the attribute list '{@link pubs.title#getAu_ids <em>Au ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Au ids</em>'.
	 * @see pubs.title#getAu_ids()
	 * @see #gettitle()
	 * @generated
	 */
	EAttribute gettitle_Au_ids();

	/**
	 * Returns the meta object for the reference list '{@link pubs.title#getSales <em>Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales</em>'.
	 * @see pubs.title#getSales()
	 * @see #gettitle()
	 * @generated
	 */
	EReference gettitle_Sales();

	/**
	 * Returns the meta object for the containment reference list '{@link pubs.title#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authors</em>'.
	 * @see pubs.title#getAuthors()
	 * @see #gettitle()
	 * @generated
	 */
	EReference gettitle_Authors();

	/**
	 * Returns the meta object for class '{@link pubs.roysched <em>roysched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>roysched</em>'.
	 * @see pubs.roysched
	 * @generated
	 */
	EClass getroysched();

	/**
	 * Returns the meta object for the attribute '{@link pubs.roysched#getTitle_id <em>Title id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title id</em>'.
	 * @see pubs.roysched#getTitle_id()
	 * @see #getroysched()
	 * @generated
	 */
	EAttribute getroysched_Title_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.roysched#getLorange <em>Lorange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lorange</em>'.
	 * @see pubs.roysched#getLorange()
	 * @see #getroysched()
	 * @generated
	 */
	EAttribute getroysched_Lorange();

	/**
	 * Returns the meta object for the attribute '{@link pubs.roysched#getHirange <em>Hirange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hirange</em>'.
	 * @see pubs.roysched#getHirange()
	 * @see #getroysched()
	 * @generated
	 */
	EAttribute getroysched_Hirange();

	/**
	 * Returns the meta object for the attribute '{@link pubs.roysched#getRoyalty <em>Royalty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Royalty</em>'.
	 * @see pubs.roysched#getRoyalty()
	 * @see #getroysched()
	 * @generated
	 */
	EAttribute getroysched_Royalty();

	/**
	 * Returns the meta object for class '{@link pubs.sale <em>sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sale</em>'.
	 * @see pubs.sale
	 * @generated
	 */
	EClass getsale();

	/**
	 * Returns the meta object for the attribute '{@link pubs.sale#getOrd_num <em>Ord num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ord num</em>'.
	 * @see pubs.sale#getOrd_num()
	 * @see #getsale()
	 * @generated
	 */
	EAttribute getsale_Ord_num();

	/**
	 * Returns the meta object for the attribute '{@link pubs.sale#getStor_id <em>Stor id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stor id</em>'.
	 * @see pubs.sale#getStor_id()
	 * @see #getsale()
	 * @generated
	 */
	EAttribute getsale_Stor_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.sale#getOrd_date <em>Ord date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ord date</em>'.
	 * @see pubs.sale#getOrd_date()
	 * @see #getsale()
	 * @generated
	 */
	EAttribute getsale_Ord_date();

	/**
	 * Returns the meta object for the attribute '{@link pubs.sale#getQty <em>Qty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qty</em>'.
	 * @see pubs.sale#getQty()
	 * @see #getsale()
	 * @generated
	 */
	EAttribute getsale_Qty();

	/**
	 * Returns the meta object for the attribute '{@link pubs.sale#getPayterms <em>Payterms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payterms</em>'.
	 * @see pubs.sale#getPayterms()
	 * @see #getsale()
	 * @generated
	 */
	EAttribute getsale_Payterms();

	/**
	 * Returns the meta object for the attribute '{@link pubs.sale#getTitle_id <em>Title id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title id</em>'.
	 * @see pubs.sale#getTitle_id()
	 * @see #getsale()
	 * @generated
	 */
	EAttribute getsale_Title_id();

	/**
	 * Returns the meta object for class '{@link pubs.author <em>author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>author</em>'.
	 * @see pubs.author
	 * @generated
	 */
	EClass getauthor();

	/**
	 * Returns the meta object for the attribute '{@link pubs.author#getAu_lname <em>Au lname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Au lname</em>'.
	 * @see pubs.author#getAu_lname()
	 * @see #getauthor()
	 * @generated
	 */
	EAttribute getauthor_Au_lname();

	/**
	 * Returns the meta object for the attribute '{@link pubs.author#getAu_fname <em>Au fname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Au fname</em>'.
	 * @see pubs.author#getAu_fname()
	 * @see #getauthor()
	 * @generated
	 */
	EAttribute getauthor_Au_fname();

	/**
	 * Returns the meta object for the attribute '{@link pubs.author#getAu_id <em>Au id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Au id</em>'.
	 * @see pubs.author#getAu_id()
	 * @see #getauthor()
	 * @generated
	 */
	EAttribute getauthor_Au_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.author#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see pubs.author#getPhone()
	 * @see #getauthor()
	 * @generated
	 */
	EAttribute getauthor_Phone();

	/**
	 * Returns the meta object for the attribute '{@link pubs.author#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see pubs.author#getAddress()
	 * @see #getauthor()
	 * @generated
	 */
	EAttribute getauthor_Address();

	/**
	 * Returns the meta object for the attribute '{@link pubs.author#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see pubs.author#getCity()
	 * @see #getauthor()
	 * @generated
	 */
	EAttribute getauthor_City();

	/**
	 * Returns the meta object for the attribute '{@link pubs.author#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see pubs.author#getState()
	 * @see #getauthor()
	 * @generated
	 */
	EAttribute getauthor_State();

	/**
	 * Returns the meta object for the attribute '{@link pubs.author#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see pubs.author#getZip()
	 * @see #getauthor()
	 * @generated
	 */
	EAttribute getauthor_Zip();

	/**
	 * Returns the meta object for the attribute '{@link pubs.author#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract</em>'.
	 * @see pubs.author#getContract()
	 * @see #getauthor()
	 * @generated
	 */
	EAttribute getauthor_Contract();

	/**
	 * Returns the meta object for class '{@link pubs.store <em>store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>store</em>'.
	 * @see pubs.store
	 * @generated
	 */
	EClass getstore();

	/**
	 * Returns the meta object for the attribute '{@link pubs.store#getStor_name <em>Stor name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stor name</em>'.
	 * @see pubs.store#getStor_name()
	 * @see #getstore()
	 * @generated
	 */
	EAttribute getstore_Stor_name();

	/**
	 * Returns the meta object for the attribute '{@link pubs.store#getStor_id <em>Stor id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stor id</em>'.
	 * @see pubs.store#getStor_id()
	 * @see #getstore()
	 * @generated
	 */
	EAttribute getstore_Stor_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.store#getStor_address <em>Stor address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stor address</em>'.
	 * @see pubs.store#getStor_address()
	 * @see #getstore()
	 * @generated
	 */
	EAttribute getstore_Stor_address();

	/**
	 * Returns the meta object for the attribute '{@link pubs.store#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see pubs.store#getCity()
	 * @see #getstore()
	 * @generated
	 */
	EAttribute getstore_City();

	/**
	 * Returns the meta object for the attribute '{@link pubs.store#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see pubs.store#getState()
	 * @see #getstore()
	 * @generated
	 */
	EAttribute getstore_State();

	/**
	 * Returns the meta object for the attribute '{@link pubs.store#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see pubs.store#getZip()
	 * @see #getstore()
	 * @generated
	 */
	EAttribute getstore_Zip();

	/**
	 * Returns the meta object for the containment reference list '{@link pubs.store#getSales <em>Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sales</em>'.
	 * @see pubs.store#getSales()
	 * @see #getstore()
	 * @generated
	 */
	EReference getstore_Sales();

	/**
	 * Returns the meta object for the containment reference list '{@link pubs.store#getDiscounts <em>Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discounts</em>'.
	 * @see pubs.store#getDiscounts()
	 * @see #getstore()
	 * @generated
	 */
	EReference getstore_Discounts();

	/**
	 * Returns the meta object for class '{@link pubs.discount <em>discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>discount</em>'.
	 * @see pubs.discount
	 * @generated
	 */
	EClass getdiscount();

	/**
	 * Returns the meta object for the attribute '{@link pubs.discount#getDiscounttype <em>Discounttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discounttype</em>'.
	 * @see pubs.discount#getDiscounttype()
	 * @see #getdiscount()
	 * @generated
	 */
	EAttribute getdiscount_Discounttype();

	/**
	 * Returns the meta object for the attribute '{@link pubs.discount#getStor_id <em>Stor id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stor id</em>'.
	 * @see pubs.discount#getStor_id()
	 * @see #getdiscount()
	 * @generated
	 */
	EAttribute getdiscount_Stor_id();

	/**
	 * Returns the meta object for the attribute '{@link pubs.discount#getLowqty <em>Lowqty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lowqty</em>'.
	 * @see pubs.discount#getLowqty()
	 * @see #getdiscount()
	 * @generated
	 */
	EAttribute getdiscount_Lowqty();

	/**
	 * Returns the meta object for the attribute '{@link pubs.discount#getHighqty <em>Highqty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highqty</em>'.
	 * @see pubs.discount#getHighqty()
	 * @see #getdiscount()
	 * @generated
	 */
	EAttribute getdiscount_Highqty();

	/**
	 * Returns the meta object for the attribute '{@link pubs.discount#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount</em>'.
	 * @see pubs.discount#getDiscount()
	 * @see #getdiscount()
	 * @generated
	 */
	EAttribute getdiscount_Discount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PubsFactory getPubsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pubs.impl.rootImpl <em>root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pubs.impl.rootImpl
		 * @see pubs.impl.PubsPackageImpl#getroot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getroot();

		/**
		 * The meta object literal for the '<em><b>Pub id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__PUB_ID = eINSTANCE.getroot_Pub_id();

		/**
		 * The meta object literal for the '<em><b>Stor id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__STOR_ID = eINSTANCE.getroot_Stor_id();

		/**
		 * The meta object literal for the '<em><b>Publishers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PUBLISHERS = eINSTANCE.getroot_Publishers();

		/**
		 * The meta object literal for the '<em><b>Stores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__STORES = eINSTANCE.getroot_Stores();

		/**
		 * The meta object literal for the '{@link pubs.impl.publisherImpl <em>publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pubs.impl.publisherImpl
		 * @see pubs.impl.PubsPackageImpl#getpublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getpublisher();

		/**
		 * The meta object literal for the '<em><b>Pubname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__PUBNAME = eINSTANCE.getpublisher_Pubname();

		/**
		 * The meta object literal for the '<em><b>Pub id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__PUB_ID = eINSTANCE.getpublisher_Pub_id();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__CITY = eINSTANCE.getpublisher_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__STATE = eINSTANCE.getpublisher_State();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__COUNTRY = eINSTANCE.getpublisher_Country();

		/**
		 * The meta object literal for the '<em><b>Pub info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__PUB_INFO = eINSTANCE.getpublisher_Pub_info();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__EMPLOYEES = eINSTANCE.getpublisher_Employees();

		/**
		 * The meta object literal for the '<em><b>Titles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__TITLES = eINSTANCE.getpublisher_Titles();

		/**
		 * The meta object literal for the '{@link pubs.impl.pub_infoImpl <em>pub info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pubs.impl.pub_infoImpl
		 * @see pubs.impl.PubsPackageImpl#getpub_info()
		 * @generated
		 */
		EClass PUB_INFO = eINSTANCE.getpub_info();

		/**
		 * The meta object literal for the '<em><b>Pub id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUB_INFO__PUB_ID = eINSTANCE.getpub_info_Pub_id();

		/**
		 * The meta object literal for the '<em><b>Pr info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUB_INFO__PR_INFO = eINSTANCE.getpub_info_Pr_info();

		/**
		 * The meta object literal for the '{@link pubs.impl.employeeImpl <em>employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pubs.impl.employeeImpl
		 * @see pubs.impl.PubsPackageImpl#getemployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getemployee();

		/**
		 * The meta object literal for the '<em><b>Lname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__LNAME = eINSTANCE.getemployee_Lname();

		/**
		 * The meta object literal for the '<em><b>Fname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__FNAME = eINSTANCE.getemployee_Fname();

		/**
		 * The meta object literal for the '<em><b>Emp id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMP_ID = eINSTANCE.getemployee_Emp_id();

		/**
		 * The meta object literal for the '<em><b>Minit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__MINIT = eINSTANCE.getemployee_Minit();

		/**
		 * The meta object literal for the '<em><b>Job id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__JOB_ID = eINSTANCE.getemployee_Job_id();

		/**
		 * The meta object literal for the '<em><b>Job lvl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__JOB_LVL = eINSTANCE.getemployee_Job_lvl();

		/**
		 * The meta object literal for the '<em><b>Pub id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__PUB_ID = eINSTANCE.getemployee_Pub_id();

		/**
		 * The meta object literal for the '<em><b>Hire date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__HIRE_DATE = eINSTANCE.getemployee_Hire_date();

		/**
		 * The meta object literal for the '<em><b>Job desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__JOB_DESC = eINSTANCE.getemployee_Job_desc();

		/**
		 * The meta object literal for the '{@link pubs.impl.titleImpl <em>title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pubs.impl.titleImpl
		 * @see pubs.impl.PubsPackageImpl#gettitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.gettitle();

		/**
		 * The meta object literal for the '<em><b>Title id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__TITLE_ID = eINSTANCE.gettitle_Title_id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__TITLE = eINSTANCE.gettitle_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__TYPE = eINSTANCE.gettitle_Type();

		/**
		 * The meta object literal for the '<em><b>Pub id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__PUB_ID = eINSTANCE.gettitle_Pub_id();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__PRICE = eINSTANCE.gettitle_Price();

		/**
		 * The meta object literal for the '<em><b>Advance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__ADVANCE = eINSTANCE.gettitle_Advance();

		/**
		 * The meta object literal for the '<em><b>Royalty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__ROYALTY = eINSTANCE.gettitle_Royalty();

		/**
		 * The meta object literal for the '<em><b>Ytd sales</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__YTD_SALES = eINSTANCE.gettitle_Ytd_sales();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__NOTES = eINSTANCE.gettitle_Notes();

		/**
		 * The meta object literal for the '<em><b>Pubdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__PUBDATE = eINSTANCE.gettitle_Pubdate();

		/**
		 * The meta object literal for the '<em><b>Roysched</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__ROYSCHED = eINSTANCE.gettitle_Roysched();

		/**
		 * The meta object literal for the '<em><b>Au ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__AU_IDS = eINSTANCE.gettitle_Au_ids();

		/**
		 * The meta object literal for the '<em><b>Sales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__SALES = eINSTANCE.gettitle_Sales();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__AUTHORS = eINSTANCE.gettitle_Authors();

		/**
		 * The meta object literal for the '{@link pubs.impl.royschedImpl <em>roysched</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pubs.impl.royschedImpl
		 * @see pubs.impl.PubsPackageImpl#getroysched()
		 * @generated
		 */
		EClass ROYSCHED = eINSTANCE.getroysched();

		/**
		 * The meta object literal for the '<em><b>Title id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROYSCHED__TITLE_ID = eINSTANCE.getroysched_Title_id();

		/**
		 * The meta object literal for the '<em><b>Lorange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROYSCHED__LORANGE = eINSTANCE.getroysched_Lorange();

		/**
		 * The meta object literal for the '<em><b>Hirange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROYSCHED__HIRANGE = eINSTANCE.getroysched_Hirange();

		/**
		 * The meta object literal for the '<em><b>Royalty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROYSCHED__ROYALTY = eINSTANCE.getroysched_Royalty();

		/**
		 * The meta object literal for the '{@link pubs.impl.saleImpl <em>sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pubs.impl.saleImpl
		 * @see pubs.impl.PubsPackageImpl#getsale()
		 * @generated
		 */
		EClass SALE = eINSTANCE.getsale();

		/**
		 * The meta object literal for the '<em><b>Ord num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALE__ORD_NUM = eINSTANCE.getsale_Ord_num();

		/**
		 * The meta object literal for the '<em><b>Stor id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALE__STOR_ID = eINSTANCE.getsale_Stor_id();

		/**
		 * The meta object literal for the '<em><b>Ord date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALE__ORD_DATE = eINSTANCE.getsale_Ord_date();

		/**
		 * The meta object literal for the '<em><b>Qty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALE__QTY = eINSTANCE.getsale_Qty();

		/**
		 * The meta object literal for the '<em><b>Payterms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALE__PAYTERMS = eINSTANCE.getsale_Payterms();

		/**
		 * The meta object literal for the '<em><b>Title id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALE__TITLE_ID = eINSTANCE.getsale_Title_id();

		/**
		 * The meta object literal for the '{@link pubs.impl.authorImpl <em>author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pubs.impl.authorImpl
		 * @see pubs.impl.PubsPackageImpl#getauthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getauthor();

		/**
		 * The meta object literal for the '<em><b>Au lname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__AU_LNAME = eINSTANCE.getauthor_Au_lname();

		/**
		 * The meta object literal for the '<em><b>Au fname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__AU_FNAME = eINSTANCE.getauthor_Au_fname();

		/**
		 * The meta object literal for the '<em><b>Au id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__AU_ID = eINSTANCE.getauthor_Au_id();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__PHONE = eINSTANCE.getauthor_Phone();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__ADDRESS = eINSTANCE.getauthor_Address();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__CITY = eINSTANCE.getauthor_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__STATE = eINSTANCE.getauthor_State();

		/**
		 * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__ZIP = eINSTANCE.getauthor_Zip();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__CONTRACT = eINSTANCE.getauthor_Contract();

		/**
		 * The meta object literal for the '{@link pubs.impl.storeImpl <em>store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pubs.impl.storeImpl
		 * @see pubs.impl.PubsPackageImpl#getstore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getstore();

		/**
		 * The meta object literal for the '<em><b>Stor name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__STOR_NAME = eINSTANCE.getstore_Stor_name();

		/**
		 * The meta object literal for the '<em><b>Stor id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__STOR_ID = eINSTANCE.getstore_Stor_id();

		/**
		 * The meta object literal for the '<em><b>Stor address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__STOR_ADDRESS = eINSTANCE.getstore_Stor_address();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__CITY = eINSTANCE.getstore_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__STATE = eINSTANCE.getstore_State();

		/**
		 * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__ZIP = eINSTANCE.getstore_Zip();

		/**
		 * The meta object literal for the '<em><b>Sales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__SALES = eINSTANCE.getstore_Sales();

		/**
		 * The meta object literal for the '<em><b>Discounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__DISCOUNTS = eINSTANCE.getstore_Discounts();

		/**
		 * The meta object literal for the '{@link pubs.impl.discountImpl <em>discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pubs.impl.discountImpl
		 * @see pubs.impl.PubsPackageImpl#getdiscount()
		 * @generated
		 */
		EClass DISCOUNT = eINSTANCE.getdiscount();

		/**
		 * The meta object literal for the '<em><b>Discounttype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__DISCOUNTTYPE = eINSTANCE.getdiscount_Discounttype();

		/**
		 * The meta object literal for the '<em><b>Stor id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__STOR_ID = eINSTANCE.getdiscount_Stor_id();

		/**
		 * The meta object literal for the '<em><b>Lowqty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__LOWQTY = eINSTANCE.getdiscount_Lowqty();

		/**
		 * The meta object literal for the '<em><b>Highqty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__HIGHQTY = eINSTANCE.getdiscount_Highqty();

		/**
		 * The meta object literal for the '<em><b>Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__DISCOUNT = eINSTANCE.getdiscount_Discount();

	}

} //PubsPackage
