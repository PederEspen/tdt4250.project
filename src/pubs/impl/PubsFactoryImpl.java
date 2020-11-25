/**
 */
package pubs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pubs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PubsFactoryImpl extends EFactoryImpl implements PubsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PubsFactory init() {
		try {
			PubsFactory thePubsFactory = (PubsFactory)EPackage.Registry.INSTANCE.getEFactory(PubsPackage.eNS_URI);
			if (thePubsFactory != null) {
				return thePubsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PubsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PubsPackage.ROOT: return createroot();
			case PubsPackage.PUBLISHER: return createpublisher();
			case PubsPackage.PUB_INFO: return createpub_info();
			case PubsPackage.EMPLOYEE: return createemployee();
			case PubsPackage.TITLE: return createtitle();
			case PubsPackage.ROYSCHED: return createroysched();
			case PubsPackage.SALES: return createsales();
			case PubsPackage.AUTHOR: return createauthor();
			case PubsPackage.STORE: return createstore();
			case PubsPackage.DISCOUNT: return creatediscount();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public root createroot() {
		rootImpl root = new rootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public publisher createpublisher() {
		publisherImpl publisher = new publisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public pub_info createpub_info() {
		pub_infoImpl pub_info = new pub_infoImpl();
		return pub_info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public employee createemployee() {
		employeeImpl employee = new employeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public title createtitle() {
		titleImpl title = new titleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public roysched createroysched() {
		royschedImpl roysched = new royschedImpl();
		return roysched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public sales createsales() {
		salesImpl sales = new salesImpl();
		return sales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public author createauthor() {
		authorImpl author = new authorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public store createstore() {
		storeImpl store = new storeImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public discount creatediscount() {
		discountImpl discount = new discountImpl();
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubsPackage getPubsPackage() {
		return (PubsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PubsPackage getPackage() {
		return PubsPackage.eINSTANCE;
	}

} //PubsFactoryImpl
