/**
 * malime.de
 */
package de.malime.ecore.webml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.malime.ecore.webml.Web#getMeta <em>Meta</em>}</li>
 *   <li>{@link de.malime.ecore.webml.Web#getMenu <em>Menu</em>}</li>
 *   <li>{@link de.malime.ecore.webml.Web#getTheme <em>Theme</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.malime.ecore.webml.WebmlPackage#getWeb()
 * @model extendedMetaData="name='web' kind='elementOnly'"
 * @generated
 */
public interface Web extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta</b></em>' containment reference list.
	 * The list contents are of type {@link de.malime.ecore.webml.Meta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' containment reference list.
	 * @see de.malime.ecore.webml.WebmlPackage#getWeb_Meta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meta' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Meta> getMeta();

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference list.
	 * The list contents are of type {@link de.malime.ecore.webml.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference list.
	 * @see de.malime.ecore.webml.WebmlPackage#getWeb_Menu()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='menu' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Menu> getMenu();

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see #setTheme(String)
	 * @see de.malime.ecore.webml.WebmlPackage#getWeb_Theme()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='theme'"
	 * @generated
	 */
	String getTheme();

	/**
	 * Sets the value of the '{@link de.malime.ecore.webml.Web#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' attribute.
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(String value);

} // Web
