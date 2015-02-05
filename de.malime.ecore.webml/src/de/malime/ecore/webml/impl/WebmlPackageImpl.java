/**
 * malime.de
 */
package de.malime.ecore.webml.impl;

import de.malime.ecore.webml.Menu;
import de.malime.ecore.webml.Meta;
import de.malime.ecore.webml.Page;
import de.malime.ecore.webml.Submenu;
import de.malime.ecore.webml.Subsubmenu;
import de.malime.ecore.webml.Web;
import de.malime.ecore.webml.WebmlFactory;
import de.malime.ecore.webml.WebmlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebmlPackageImpl extends EPackageImpl implements WebmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsubmenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.malime.ecore.webml.WebmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebmlPackageImpl() {
		super(eNS_URI, WebmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WebmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebmlPackage init() {
		if (isInited) return (WebmlPackage)EPackage.Registry.INSTANCE.getEPackage(WebmlPackage.eNS_URI);

		// Obtain or create and register package
		WebmlPackageImpl theWebmlPackage = (WebmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebmlPackage.createPackageContents();

		// Initialize created meta-data
		theWebmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWebmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebmlPackage.eNS_URI, theWebmlPackage);
		return theWebmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Submenu() {
		return (EReference)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Page() {
		return (EReference)menuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeta() {
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Name() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeta_Value() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Meta() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_File() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Name() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmenu() {
		return submenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmenu_Subsubmenu() {
		return (EReference)submenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmenu_Page() {
		return (EReference)submenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsubmenu() {
		return subsubmenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsubmenu_Page() {
		return (EReference)subsubmenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeb() {
		return webEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeb_Meta() {
		return (EReference)webEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeb_Menu() {
		return (EReference)webEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeb_Theme() {
		return (EAttribute)webEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebmlFactory getWebmlFactory() {
		return (WebmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		metaEClass = createEClass(META);
		createEAttribute(metaEClass, META__NAME);
		createEAttribute(metaEClass, META__VALUE);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__META);
		createEAttribute(pageEClass, PAGE__FILE);
		createEAttribute(pageEClass, PAGE__NAME);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__SUBMENU);
		createEReference(menuEClass, MENU__PAGE);

		submenuEClass = createEClass(SUBMENU);
		createEReference(submenuEClass, SUBMENU__SUBSUBMENU);
		createEReference(submenuEClass, SUBMENU__PAGE);

		subsubmenuEClass = createEClass(SUBSUBMENU);
		createEReference(subsubmenuEClass, SUBSUBMENU__PAGE);

		webEClass = createEClass(WEB);
		createEReference(webEClass, WEB__META);
		createEReference(webEClass, WEB__MENU);
		createEAttribute(webEClass, WEB__THEME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		menuEClass.getESuperTypes().add(this.getPage());
		submenuEClass.getESuperTypes().add(this.getPage());
		subsubmenuEClass.getESuperTypes().add(this.getPage());

		// Initialize classes and features; add operations and parameters
		initEClass(metaEClass, Meta.class, "Meta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeta_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Meta(), this.getMeta(), null, "meta", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_File(), theXMLTypePackage.getString(), "file", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_Submenu(), this.getSubmenu(), null, "submenu", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMenu_Page(), this.getPage(), null, "page", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submenuEClass, Submenu.class, "Submenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmenu_Subsubmenu(), this.getSubsubmenu(), null, "subsubmenu", null, 0, -1, Submenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmenu_Page(), this.getPage(), null, "page", null, 0, -1, Submenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subsubmenuEClass, Subsubmenu.class, "Subsubmenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubsubmenu_Page(), this.getPage(), null, "page", null, 0, -1, Subsubmenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webEClass, Web.class, "Web", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeb_Meta(), this.getMeta(), null, "meta", null, 0, -1, Web.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeb_Menu(), this.getMenu(), null, "menu", null, 1, -1, Web.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWeb_Theme(), theXMLTypePackage.getString(), "theme", null, 0, 1, Web.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (metaEClass, 
		   source, 
		   new String[] {
			 "name", "meta",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getMeta_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getMeta_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (pageEClass, 
		   source, 
		   new String[] {
			 "name", "page",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPage_Meta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "meta",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPage_File(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file"
		   });	
		addAnnotation
		  (getPage_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (menuEClass, 
		   source, 
		   new String[] {
			 "name", "menu",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMenu_Submenu(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "submenu",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMenu_Page(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (submenuEClass, 
		   source, 
		   new String[] {
			 "name", "submenu",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSubmenu_Subsubmenu(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "subsubmenu",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubmenu_Page(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (subsubmenuEClass, 
		   source, 
		   new String[] {
			 "name", "subsubmenu",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSubsubmenu_Page(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (webEClass, 
		   source, 
		   new String[] {
			 "name", "web",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getWeb_Meta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "meta",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWeb_Menu(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "menu",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getWeb_Theme(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "theme"
		   });
	}

} //WebmlPackageImpl
