/**
 * malime.de
 */
package de.malime.ecore.webml;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.malime.ecore.webml.WebmlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel copyrightText='malime.de' editDirectory='/de.malime.ecore.webml.edit/src' editPluginID='de.malime.ecore.webml.edit' editorDirectory='/de.malime.ecore.webml.editor/src' editorPluginID='de.malime.ecore.webml.editor' basePackage='de.malime.ecore'"
 * @generated
 */
public interface WebmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.malime.de/webml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebmlPackage eINSTANCE = de.malime.ecore.webml.impl.WebmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.malime.ecore.webml.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.malime.ecore.webml.impl.MenuImpl
	 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 2;

	/**
	 * The meta object id for the '{@link de.malime.ecore.webml.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.malime.ecore.webml.impl.MetaImpl
	 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getMeta()
	 * @generated
	 */
	int META = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.malime.ecore.webml.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.malime.ecore.webml.impl.PageImpl
	 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__META = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FILE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__META = PAGE__META;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__FILE = PAGE__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Submenu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__SUBMENU = PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__PAGE = PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = PAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.malime.ecore.webml.impl.SubmenuImpl <em>Submenu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.malime.ecore.webml.impl.SubmenuImpl
	 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getSubmenu()
	 * @generated
	 */
	int SUBMENU = 3;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU__META = PAGE__META;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU__FILE = PAGE__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Subsubmenu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU__SUBSUBMENU = PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU__PAGE = PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Submenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMENU_FEATURE_COUNT = PAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.malime.ecore.webml.impl.SubsubmenuImpl <em>Subsubmenu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.malime.ecore.webml.impl.SubsubmenuImpl
	 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getSubsubmenu()
	 * @generated
	 */
	int SUBSUBMENU = 4;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBMENU__META = PAGE__META;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBMENU__FILE = PAGE__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBMENU__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBMENU__PAGE = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subsubmenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBMENU_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.malime.ecore.webml.impl.WebImpl <em>Web</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.malime.ecore.webml.impl.WebImpl
	 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getWeb()
	 * @generated
	 */
	int WEB = 5;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__META = 0;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__MENU = 1;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB__THEME = 2;

	/**
	 * The number of structural features of the '<em>Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link de.malime.ecore.webml.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see de.malime.ecore.webml.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link de.malime.ecore.webml.Menu#getSubmenu <em>Submenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submenu</em>'.
	 * @see de.malime.ecore.webml.Menu#getSubmenu()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Submenu();

	/**
	 * Returns the meta object for the containment reference list '{@link de.malime.ecore.webml.Menu#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see de.malime.ecore.webml.Menu#getPage()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Page();

	/**
	 * Returns the meta object for class '{@link de.malime.ecore.webml.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see de.malime.ecore.webml.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the attribute '{@link de.malime.ecore.webml.Meta#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.malime.ecore.webml.Meta#getName()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.malime.ecore.webml.Meta#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.malime.ecore.webml.Meta#getValue()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Value();

	/**
	 * Returns the meta object for class '{@link de.malime.ecore.webml.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see de.malime.ecore.webml.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.malime.ecore.webml.Page#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see de.malime.ecore.webml.Page#getMeta()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Meta();

	/**
	 * Returns the meta object for the attribute '{@link de.malime.ecore.webml.Page#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see de.malime.ecore.webml.Page#getFile()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_File();

	/**
	 * Returns the meta object for the attribute '{@link de.malime.ecore.webml.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.malime.ecore.webml.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for class '{@link de.malime.ecore.webml.Submenu <em>Submenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submenu</em>'.
	 * @see de.malime.ecore.webml.Submenu
	 * @generated
	 */
	EClass getSubmenu();

	/**
	 * Returns the meta object for the containment reference list '{@link de.malime.ecore.webml.Submenu#getSubsubmenu <em>Subsubmenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsubmenu</em>'.
	 * @see de.malime.ecore.webml.Submenu#getSubsubmenu()
	 * @see #getSubmenu()
	 * @generated
	 */
	EReference getSubmenu_Subsubmenu();

	/**
	 * Returns the meta object for the containment reference list '{@link de.malime.ecore.webml.Submenu#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see de.malime.ecore.webml.Submenu#getPage()
	 * @see #getSubmenu()
	 * @generated
	 */
	EReference getSubmenu_Page();

	/**
	 * Returns the meta object for class '{@link de.malime.ecore.webml.Subsubmenu <em>Subsubmenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsubmenu</em>'.
	 * @see de.malime.ecore.webml.Subsubmenu
	 * @generated
	 */
	EClass getSubsubmenu();

	/**
	 * Returns the meta object for the containment reference list '{@link de.malime.ecore.webml.Subsubmenu#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see de.malime.ecore.webml.Subsubmenu#getPage()
	 * @see #getSubsubmenu()
	 * @generated
	 */
	EReference getSubsubmenu_Page();

	/**
	 * Returns the meta object for class '{@link de.malime.ecore.webml.Web <em>Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web</em>'.
	 * @see de.malime.ecore.webml.Web
	 * @generated
	 */
	EClass getWeb();

	/**
	 * Returns the meta object for the containment reference list '{@link de.malime.ecore.webml.Web#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see de.malime.ecore.webml.Web#getMeta()
	 * @see #getWeb()
	 * @generated
	 */
	EReference getWeb_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link de.malime.ecore.webml.Web#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu</em>'.
	 * @see de.malime.ecore.webml.Web#getMenu()
	 * @see #getWeb()
	 * @generated
	 */
	EReference getWeb_Menu();

	/**
	 * Returns the meta object for the attribute '{@link de.malime.ecore.webml.Web#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see de.malime.ecore.webml.Web#getTheme()
	 * @see #getWeb()
	 * @generated
	 */
	EAttribute getWeb_Theme();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebmlFactory getWebmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.malime.ecore.webml.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.malime.ecore.webml.impl.MenuImpl
		 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Submenu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__SUBMENU = eINSTANCE.getMenu_Submenu();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__PAGE = eINSTANCE.getMenu_Page();

		/**
		 * The meta object literal for the '{@link de.malime.ecore.webml.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.malime.ecore.webml.impl.MetaImpl
		 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__NAME = eINSTANCE.getMeta_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__VALUE = eINSTANCE.getMeta_Value();

		/**
		 * The meta object literal for the '{@link de.malime.ecore.webml.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.malime.ecore.webml.impl.PageImpl
		 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__META = eINSTANCE.getPage_Meta();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__FILE = eINSTANCE.getPage_File();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '{@link de.malime.ecore.webml.impl.SubmenuImpl <em>Submenu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.malime.ecore.webml.impl.SubmenuImpl
		 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getSubmenu()
		 * @generated
		 */
		EClass SUBMENU = eINSTANCE.getSubmenu();

		/**
		 * The meta object literal for the '<em><b>Subsubmenu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMENU__SUBSUBMENU = eINSTANCE.getSubmenu_Subsubmenu();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMENU__PAGE = eINSTANCE.getSubmenu_Page();

		/**
		 * The meta object literal for the '{@link de.malime.ecore.webml.impl.SubsubmenuImpl <em>Subsubmenu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.malime.ecore.webml.impl.SubsubmenuImpl
		 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getSubsubmenu()
		 * @generated
		 */
		EClass SUBSUBMENU = eINSTANCE.getSubsubmenu();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSUBMENU__PAGE = eINSTANCE.getSubsubmenu_Page();

		/**
		 * The meta object literal for the '{@link de.malime.ecore.webml.impl.WebImpl <em>Web</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.malime.ecore.webml.impl.WebImpl
		 * @see de.malime.ecore.webml.impl.WebmlPackageImpl#getWeb()
		 * @generated
		 */
		EClass WEB = eINSTANCE.getWeb();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB__META = eINSTANCE.getWeb_Meta();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB__MENU = eINSTANCE.getWeb_Menu();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB__THEME = eINSTANCE.getWeb_Theme();

	}

} //WebmlPackage
