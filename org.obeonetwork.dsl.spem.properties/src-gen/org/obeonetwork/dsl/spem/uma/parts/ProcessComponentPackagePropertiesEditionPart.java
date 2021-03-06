/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.uma.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ProcessComponentPackagePropertiesEditionPart {

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
	 * Init the ownedProcessMember
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedProcessMember(ReferencesTableSettings settings);

	/**
	 * Update the ownedProcessMember
	 * @param newValue the ownedProcessMember to update
	 * 
	 */
	public void updateOwnedProcessMember();

	/**
	 * Adds the given filter to the ownedProcessMember edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnedProcessMember(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedProcessMember edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnedProcessMember(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedProcessMember table
	 * 
	 */
	public boolean isContainedInOwnedProcessMemberTable(EObject element);





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
