/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface MethodLibraryPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);




	/**
	 * Init the ownedMethodPlugin
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedMethodPlugin(ReferencesTableSettings settings);

	/**
	 * Update the ownedMethodPlugin
	 * @param newValue the ownedMethodPlugin to update
	 * 
	 */
	public void updateOwnedMethodPlugin();

	/**
	 * Adds the given filter to the ownedMethodPlugin edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedMethodPlugin(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedMethodPlugin edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedMethodPlugin(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedMethodPlugin table
	 * 
	 */
	public boolean isContainedInOwnedMethodPluginTable(EObject element);




	/**
	 * Init the predefinedConfiguration
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initPredefinedConfiguration(ReferencesTableSettings settings);

	/**
	 * Update the predefinedConfiguration
	 * @param newValue the predefinedConfiguration to update
	 * 
	 */
	public void updatePredefinedConfiguration();

	/**
	 * Adds the given filter to the predefinedConfiguration edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPredefinedConfiguration(ViewerFilter filter);

	/**
	 * Adds the given filter to the predefinedConfiguration edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPredefinedConfiguration(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the predefinedConfiguration table
	 * 
	 */
	public boolean isContainedInPredefinedConfigurationTable(EObject element);





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
