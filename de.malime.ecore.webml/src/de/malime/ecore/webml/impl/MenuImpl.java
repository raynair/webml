/**
 * malime.de
 */
package de.malime.ecore.webml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.malime.ecore.webml.Menu;
import de.malime.ecore.webml.Page;
import de.malime.ecore.webml.Submenu;
import de.malime.ecore.webml.WebmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.malime.ecore.webml.impl.MenuImpl#getSubmenu <em>Submenu</em>}</li>
 *   <li>{@link de.malime.ecore.webml.impl.MenuImpl#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends PageImpl implements Menu {
	/**
	 * The cached value of the '{@link #getSubmenu() <em>Submenu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmenu()
	 * @generated
	 * @ordered
	 */
	protected EList<Submenu> submenu;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebmlPackage.Literals.MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Submenu> getSubmenu() {
		if (submenu == null) {
			submenu = new EObjectContainmentEList<Submenu>(Submenu.class, this, WebmlPackage.MENU__SUBMENU);
		}
		return submenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<Page>(Page.class, this, WebmlPackage.MENU__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebmlPackage.MENU__SUBMENU:
				return ((InternalEList<?>)getSubmenu()).basicRemove(otherEnd, msgs);
			case WebmlPackage.MENU__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebmlPackage.MENU__SUBMENU:
				return getSubmenu();
			case WebmlPackage.MENU__PAGE:
				return getPage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebmlPackage.MENU__SUBMENU:
				getSubmenu().clear();
				getSubmenu().addAll((Collection<? extends Submenu>)newValue);
				return;
			case WebmlPackage.MENU__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends Page>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebmlPackage.MENU__SUBMENU:
				getSubmenu().clear();
				return;
			case WebmlPackage.MENU__PAGE:
				getPage().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebmlPackage.MENU__SUBMENU:
				return submenu != null && !submenu.isEmpty();
			case WebmlPackage.MENU__PAGE:
				return page != null && !page.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MenuImpl
