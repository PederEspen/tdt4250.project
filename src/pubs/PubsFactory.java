/**
 */
package pubs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pubs.PubsPackage
 * @generated
 */
public interface PubsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PubsFactory eINSTANCE = pubs.impl.PubsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>root</em>'.
	 * @generated
	 */
	root createroot();

	/**
	 * Returns a new object of class '<em>publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>publisher</em>'.
	 * @generated
	 */
	publisher createpublisher();

	/**
	 * Returns a new object of class '<em>pub info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>pub info</em>'.
	 * @generated
	 */
	pub_info createpub_info();

	/**
	 * Returns a new object of class '<em>employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>employee</em>'.
	 * @generated
	 */
	employee createemployee();

	/**
	 * Returns a new object of class '<em>title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>title</em>'.
	 * @generated
	 */
	title createtitle();

	/**
	 * Returns a new object of class '<em>roysched</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>roysched</em>'.
	 * @generated
	 */
	roysched createroysched();

	/**
	 * Returns a new object of class '<em>sales</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sales</em>'.
	 * @generated
	 */
	sales createsales();

	/**
	 * Returns a new object of class '<em>author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>author</em>'.
	 * @generated
	 */
	author createauthor();

	/**
	 * Returns a new object of class '<em>store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>store</em>'.
	 * @generated
	 */
	store createstore();

	/**
	 * Returns a new object of class '<em>discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>discount</em>'.
	 * @generated
	 */
	discount creatediscount();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PubsPackage getPubsPackage();

} //PubsFactory
