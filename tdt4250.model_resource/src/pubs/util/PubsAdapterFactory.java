/**
 */
package pubs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pubs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pubs.PubsPackage
 * @generated
 */
public class PubsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PubsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PubsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubsSwitch<Adapter> modelSwitch =
		new PubsSwitch<Adapter>() {
			@Override
			public Adapter caseroot(root object) {
				return createrootAdapter();
			}
			@Override
			public Adapter casepublisher(publisher object) {
				return createpublisherAdapter();
			}
			@Override
			public Adapter casepub_info(pub_info object) {
				return createpub_infoAdapter();
			}
			@Override
			public Adapter caseemployee(employee object) {
				return createemployeeAdapter();
			}
			@Override
			public Adapter casetitle(title object) {
				return createtitleAdapter();
			}
			@Override
			public Adapter caseroysched(roysched object) {
				return createroyschedAdapter();
			}
			@Override
			public Adapter casesale(sale object) {
				return createsaleAdapter();
			}
			@Override
			public Adapter caseauthor(author object) {
				return createauthorAdapter();
			}
			@Override
			public Adapter casestore(store object) {
				return createstoreAdapter();
			}
			@Override
			public Adapter casediscount(discount object) {
				return creatediscountAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pubs.root <em>root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pubs.root
	 * @generated
	 */
	public Adapter createrootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pubs.publisher <em>publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pubs.publisher
	 * @generated
	 */
	public Adapter createpublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pubs.pub_info <em>pub info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pubs.pub_info
	 * @generated
	 */
	public Adapter createpub_infoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pubs.employee <em>employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pubs.employee
	 * @generated
	 */
	public Adapter createemployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pubs.title <em>title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pubs.title
	 * @generated
	 */
	public Adapter createtitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pubs.roysched <em>roysched</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pubs.roysched
	 * @generated
	 */
	public Adapter createroyschedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pubs.sale <em>sale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pubs.sale
	 * @generated
	 */
	public Adapter createsaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pubs.author <em>author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pubs.author
	 * @generated
	 */
	public Adapter createauthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pubs.store <em>store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pubs.store
	 * @generated
	 */
	public Adapter createstoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pubs.discount <em>discount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pubs.discount
	 * @generated
	 */
	public Adapter creatediscountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PubsAdapterFactory
