/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface KindPropertiesEditionPart {

	/**
	 * @return the kind
	 * 
	 */
	public EObject getKind();

	/**
	 * Init the kind
	 * @param settings the combo setting
	 */
	public void initKind(EObjectFlatComboSettings settings);

	/**
	 * Defines a new kind
	 * @param newValue the new kind to set
	 * 
	 */
	public void setKind(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setKindButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the kind edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToKind(ViewerFilter filter);

	/**
	 * Adds the given filter to the kind edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToKind(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
