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
public interface MethodPluginPropertiesEditionPart {

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
	 * Init the ownedMethodContentPackage
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedMethodContentPackage(ReferencesTableSettings settings);

	/**
	 * Update the ownedMethodContentPackage
	 * @param newValue the ownedMethodContentPackage to update
	 * 
	 */
	public void updateOwnedMethodContentPackage();

	/**
	 * Adds the given filter to the ownedMethodContentPackage edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedMethodContentPackage(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedMethodContentPackage edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedMethodContentPackage(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedMethodContentPackage table
	 * 
	 */
	public boolean isContainedInOwnedMethodContentPackageTable(EObject element);




	/**
	 * Init the ownedProcessPackage
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedProcessPackage(ReferencesTableSettings settings);

	/**
	 * Update the ownedProcessPackage
	 * @param newValue the ownedProcessPackage to update
	 * 
	 */
	public void updateOwnedProcessPackage();

	/**
	 * Adds the given filter to the ownedProcessPackage edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedProcessPackage(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedProcessPackage edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedProcessPackage(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedProcessPackage table
	 * 
	 */
	public boolean isContainedInOwnedProcessPackageTable(EObject element);




	/**
	 * Init the basePlugin
	 * @param settings settings for the basePlugin ReferencesTable 
	 */
	public void initBasePlugin(ReferencesTableSettings settings);

	/**
	 * Update the basePlugin
	 * @param newValue the basePlugin to update
	 * 
	 */
	public void updateBasePlugin();

	/**
	 * Adds the given filter to the basePlugin edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToBasePlugin(ViewerFilter filter);

	/**
	 * Adds the given filter to the basePlugin edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToBasePlugin(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the basePlugin table
	 * 
	 */
	public boolean isContainedInBasePluginTable(EObject element);





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
