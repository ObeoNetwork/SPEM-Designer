/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
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
public interface MetricPropertiesEditionPart {

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
	 * @return the presentationName
	 * 
	 */
	public String getPresentationName();

	/**
	 * Defines a new presentationName
	 * @param newValue the new presentationName to set
	 * 
	 */
	public void setPresentationName(String newValue);


	/**
	 * @return the briefDescription
	 * 
	 */
	public String getBriefDescription();

	/**
	 * Defines a new briefDescription
	 * @param newValue the new briefDescription to set
	 * 
	 */
	public void setBriefDescription(String newValue);


	/**
	 * @return the mainDescription
	 * 
	 */
	public String getMainDescription();

	/**
	 * Defines a new mainDescription
	 * @param newValue the new mainDescription to set
	 * 
	 */
	public void setMainDescription(String newValue);


	/**
	 * @return the purpose
	 * 
	 */
	public String getPurpose();

	/**
	 * Defines a new purpose
	 * @param newValue the new purpose to set
	 * 
	 */
	public void setPurpose(String newValue);




	/**
	 * Init the guidance
	 * @param settings settings for the guidance ReferencesTable 
	 */
	public void initGuidance(ReferencesTableSettings settings);

	/**
	 * Update the guidance
	 * @param newValue the guidance to update
	 * 
	 */
	public void updateGuidance();

	/**
	 * Adds the given filter to the guidance edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGuidance(ViewerFilter filter);

	/**
	 * Adds the given filter to the guidance edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGuidance(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the guidance table
	 * 
	 */
	public boolean isContainedInGuidanceTable(EObject element);




	/**
	 * Init the metric
	 * @param settings settings for the metric ReferencesTable 
	 */
	public void initMetric(ReferencesTableSettings settings);

	/**
	 * Update the metric
	 * @param newValue the metric to update
	 * 
	 */
	public void updateMetric();

	/**
	 * Adds the given filter to the metric edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMetric(ViewerFilter filter);

	/**
	 * Adds the given filter to the metric edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMetric(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the metric table
	 * 
	 */
	public boolean isContainedInMetricTable(EObject element);




	/**
	 * Init the category
	 * @param settings settings for the category ReferencesTable 
	 */
	public void initCategory(ReferencesTableSettings settings);

	/**
	 * Update the category
	 * @param newValue the category to update
	 * 
	 */
	public void updateCategory();

	/**
	 * Adds the given filter to the category edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCategory(ViewerFilter filter);

	/**
	 * Adds the given filter to the category edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCategory(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the category table
	 * 
	 */
	public boolean isContainedInCategoryTable(EObject element);


	/**
	 * @return the copyright
	 * 
	 */
	public String getCopyright();

	/**
	 * Defines a new copyright
	 * @param newValue the new copyright to set
	 * 
	 */
	public void setCopyright(String newValue);


	/**
	 * @return the author
	 * 
	 */
	public EList getAuthor();

	/**
	 * Defines a new author
	 * @param newValue the new author to set
	 * 
	 */
	public void setAuthor(EList newValue);

	/**
	 * Add a value to the author multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToAuthor(Object newValue);

	/**
	 * Remove a value to the author multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToAuthor(Object newValue);


	/**
	 * @return the changeDate
	 * 
	 */
	public String getChangeDate();

	/**
	 * Defines a new changeDate
	 * @param newValue the new changeDate to set
	 * 
	 */
	public void setChangeDate(String newValue);


	/**
	 * @return the changeDescription
	 * 
	 */
	public String getChangeDescription();

	/**
	 * Defines a new changeDescription
	 * @param newValue the new changeDescription to set
	 * 
	 */
	public void setChangeDescription(String newValue);


	/**
	 * @return the version
	 * 
	 */
	public String getVersion();

	/**
	 * Defines a new version
	 * @param newValue the new version to set
	 * 
	 */
	public void setVersion(String newValue);


	/**
	 * @return the expression
	 * 
	 */
	public String getExpression();

	/**
	 * Defines a new expression
	 * @param newValue the new expression to set
	 * 
	 */
	public void setExpression(String newValue);





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
