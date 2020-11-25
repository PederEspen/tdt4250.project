/**
 */
package pubs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pubs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pubs.PubsPackage
 * @generated
 */
public class PubsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PubsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubsSwitch() {
		if (modelPackage == null) {
			modelPackage = PubsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PubsPackage.ROOT: {
				root root = (root)theEObject;
				T result = caseroot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubsPackage.PUBLISHER: {
				publisher publisher = (publisher)theEObject;
				T result = casepublisher(publisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubsPackage.PUB_INFO: {
				pub_info pub_info = (pub_info)theEObject;
				T result = casepub_info(pub_info);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubsPackage.EMPLOYEE: {
				employee employee = (employee)theEObject;
				T result = caseemployee(employee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubsPackage.TITLE: {
				title title = (title)theEObject;
				T result = casetitle(title);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubsPackage.ROYSCHED: {
				roysched roysched = (roysched)theEObject;
				T result = caseroysched(roysched);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubsPackage.SALES: {
				sales sales = (sales)theEObject;
				T result = casesales(sales);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubsPackage.AUTHOR: {
				author author = (author)theEObject;
				T result = caseauthor(author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubsPackage.STORE: {
				store store = (store)theEObject;
				T result = casestore(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubsPackage.DISCOUNT: {
				discount discount = (discount)theEObject;
				T result = casediscount(discount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseroot(root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepublisher(publisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>pub info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>pub info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepub_info(pub_info object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseemployee(employee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetitle(title object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>roysched</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>roysched</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseroysched(roysched object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sales</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sales</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesales(sales object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseauthor(author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestore(store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>discount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>discount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casediscount(discount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PubsSwitch
