/**
 * malime.de
 */
package de.malime.ecore.webml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.malime.ecore.webml.Menu#getSubmenu <em>Submenu</em>}</li>
 *   <li>{@link de.malime.ecore.webml.Menu#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.malime.ecore.webml.WebmlPackage#getMenu()
 * @model extendedMetaData="name='menu' kind='elementOnly'"
 * @generated
 */
public interface Menu extends Page {
	/**
	 * Returns the value of the '<em><b>Submenu</b></em>' containment reference list.
	 * The list contents are of type {@link de.malime.ecore.webml.Submenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submenu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submenu</em>' containment reference list.
	 * @see de.malime.ecore.webml.WebmlPackage#getMenu_Submenu()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='submenu' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Submenu> getSubmenu();

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link de.malime.ecore.webml.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see de.malime.ecore.webml.WebmlPackage#getMenu_Page()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Page> getPage();

} // Menu
