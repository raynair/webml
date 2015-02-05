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

import de.malime.ecore.webml.Page;
import de.malime.ecore.webml.Submenu;
import de.malime.ecore.webml.Subsubmenu;
import de.malime.ecore.webml.WebmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submenu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.malime.ecore.webml.impl.SubmenuImpl#getSubsubmenu <em>Subsubmenu</em>}</li>
 *   <li>{@link de.malime.ecore.webml.impl.SubmenuImpl#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubmenuImpl extends PageImpl implements Submenu {
	/**
	 * The cached value of the '{@link #getSubsubmenu() <em>Subsubmenu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsubmenu()
	 * @generated
	 * @ordered
	 */
	protected EList<Subsubmenu> subsubmenu;

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
	protected SubmenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebmlPackage.Literals.SUBMENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subsubmenu> getSubsubmenu() {
		if (subsubmenu == null) {
			subsubmenu = new EObjectContainmentEList<Subsubmenu>(Subsubmenu.class, this, WebmlPackage.SUBMENU__SUBSUBMENU);
		}
		return subsubmenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<Page>(Page.class, this, WebmlPackage.SUBMENU__PAGE);
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
			case WebmlPackage.SUBMENU__SUBSUBMENU:
				return ((InternalEList<?>)getSubsubmenu()).basicRemove(otherEnd, msgs);
			case WebmlPackage.SUBMENU__PAGE:
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
			case WebmlPackage.SUBMENU__SUBSUBMENU:
				return getSubsubmenu();
			case WebmlPackage.SUBMENU__PAGE:
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
			case WebmlPackage.SUBMENU__SUBSUBMENU:
				getSubsubmenu().clear();
				getSubsubmenu().addAll((Collection<? extends Subsubmenu>)newValue);
				return;
			case WebmlPackage.SUBMENU__PAGE:
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
			case WebmlPackage.SUBMENU__SUBSUBMENU:
				getSubsubmenu().clear();
				return;
			case WebmlPackage.SUBMENU__PAGE:
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
			case WebmlPackage.SUBMENU__SUBSUBMENU:
				return subsubmenu != null && !subsubmenu.isEmpty();
			case WebmlPackage.SUBMENU__PAGE:
				return page != null && !page.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubmenuImpl
