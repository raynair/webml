/**
 * malime.de
 */
package de.malime.ecore.webml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submenu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.malime.ecore.webml.Submenu#getSubsubmenu <em>Subsubmenu</em>}</li>
 *   <li>{@link de.malime.ecore.webml.Submenu#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.malime.ecore.webml.WebmlPackage#getSubmenu()
 * @model extendedMetaData="name='submenu' kind='elementOnly'"
 * @generated
 */
public interface Submenu extends Page {
	/**
	 * Returns the value of the '<em><b>Subsubmenu</b></em>' containment reference list.
	 * The list contents are of type {@link de.malime.ecore.webml.Subsubmenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsubmenu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsubmenu</em>' containment reference list.
	 * @see de.malime.ecore.webml.WebmlPackage#getSubmenu_Subsubmenu()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subsubmenu' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Subsubmenu> getSubsubmenu();

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
	 * @see de.malime.ecore.webml.WebmlPackage#getSubmenu_Page()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Page> getPage();

} // Submenu
