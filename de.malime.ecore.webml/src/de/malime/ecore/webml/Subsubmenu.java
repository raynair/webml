/**
 * malime.de
 */
package de.malime.ecore.webml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subsubmenu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.malime.ecore.webml.Subsubmenu#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.malime.ecore.webml.WebmlPackage#getSubsubmenu()
 * @model extendedMetaData="name='subsubmenu' kind='elementOnly'"
 * @generated
 */
public interface Subsubmenu extends Page {
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
	 * @see de.malime.ecore.webml.WebmlPackage#getSubsubmenu_Page()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Page> getPage();

} // Subsubmenu
