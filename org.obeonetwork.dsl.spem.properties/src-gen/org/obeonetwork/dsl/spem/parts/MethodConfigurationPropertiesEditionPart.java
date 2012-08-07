/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface MethodConfigurationPropertiesEditionPart {

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
	 * Init the baseConfiguration
	 * @param settings settings for the baseConfiguration ReferencesTable 
	 */
	public void initBaseConfiguration(ReferencesTableSettings settings);

	/**
	 * Update the baseConfiguration
	 * @param newValue the baseConfiguration to update
	 * 
	 */
	public void updateBaseConfiguration();

	/**
	 * Adds the given filter to the baseConfiguration edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToBaseConfiguration(ViewerFilter filter);

	/**
	 * Adds the given filter to the baseConfiguration edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToBaseConfiguration(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the baseConfiguration table
	 * 
	 */
	public boolean isContainedInBaseConfigurationTable(EObject element);




	/**
	 * Init the processPackageSelection
	 * @param settings settings for the processPackageSelection ReferencesTable 
	 */
	public void initProcessPackageSelection(ReferencesTableSettings settings);

	/**
	 * Update the processPackageSelection
	 * @param newValue the processPackageSelection to update
	 * 
	 */
	public void updateProcessPackageSelection();

	/**
	 * Adds the given filter to the processPackageSelection edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcessPackageSelection(ViewerFilter filter);

	/**
	 * Adds the given filter to the processPackageSelection edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcessPackageSelection(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the processPackageSelection table
	 * 
	 */
	public boolean isContainedInProcessPackageSelectionTable(EObject element);




	/**
	 * Init the contentPackageSelection
	 * @param settings settings for the contentPackageSelection ReferencesTable 
	 */
	public void initContentPackageSelection(ReferencesTableSettings settings);

	/**
	 * Update the contentPackageSelection
	 * @param newValue the contentPackageSelection to update
	 * 
	 */
	public void updateContentPackageSelection();

	/**
	 * Adds the given filter to the contentPackageSelection edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContentPackageSelection(ViewerFilter filter);

	/**
	 * Adds the given filter to the contentPackageSelection edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContentPackageSelection(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the contentPackageSelection table
	 * 
	 */
	public boolean isContainedInContentPackageSelectionTable(EObject element);




	/**
	 * Init the substractedCategory
	 * @param settings settings for the substractedCategory ReferencesTable 
	 */
	public void initSubstractedCategory(ReferencesTableSettings settings);

	/**
	 * Update the substractedCategory
	 * @param newValue the substractedCategory to update
	 * 
	 */
	public void updateSubstractedCategory();

	/**
	 * Adds the given filter to the substractedCategory edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSubstractedCategory(ViewerFilter filter);

	/**
	 * Adds the given filter to the substractedCategory edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSubstractedCategory(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the substractedCategory table
	 * 
	 */
	public boolean isContainedInSubstractedCategoryTable(EObject element);


	/**
	 * @return the defaultView
	 * 
	 */
	public EObject getDefaultView();

	/**
	 * Init the defaultView
	 * @param settings the combo setting
	 */
	public void initDefaultView(EObjectFlatComboSettings settings);

	/**
	 * Defines a new defaultView
	 * @param newValue the new defaultView to set
	 * 
	 */
	public void setDefaultView(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDefaultViewButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the defaultView edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDefaultView(ViewerFilter filter);

	/**
	 * Adds the given filter to the defaultView edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDefaultView(ViewerFilter filter);




	/**
	 * Init the processView
	 * @param settings settings for the processView ReferencesTable 
	 */
	public void initProcessView(ReferencesTableSettings settings);

	/**
	 * Update the processView
	 * @param newValue the processView to update
	 * 
	 */
	public void updateProcessView();

	/**
	 * Adds the given filter to the processView edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcessView(ViewerFilter filter);

	/**
	 * Adds the given filter to the processView edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcessView(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the processView table
	 * 
	 */
	public boolean isContainedInProcessViewTable(EObject element);





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
