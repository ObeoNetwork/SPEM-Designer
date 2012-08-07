/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.uma.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
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
public interface PracticePropertiesEditionPart {

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
	 * @return the variabilityType
	 * 
	 */
	public Enumerator getVariabilityType();

	/**
	 * Init the variabilityType
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initVariabilityType(EEnum eenum, Enumerator current);

	/**
	 * Defines a new variabilityType
	 * @param newValue the new variabilityType to set
	 * 
	 */
	public void setVariabilityType(Enumerator newValue);


	/**
	 * @return the variabilityBasedOnElement
	 * 
	 */
	public EObject getVariabilityBasedOnElement();

	/**
	 * Init the variabilityBasedOnElement
	 * @param settings the combo setting
	 */
	public void initVariabilityBasedOnElement(EObjectFlatComboSettings settings);

	/**
	 * Defines a new variabilityBasedOnElement
	 * @param newValue the new variabilityBasedOnElement to set
	 * 
	 */
	public void setVariabilityBasedOnElement(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setVariabilityBasedOnElementButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the variabilityBasedOnElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToVariabilityBasedOnElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the variabilityBasedOnElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToVariabilityBasedOnElement(ViewerFilter filter);


	/**
	 * @return the methodContentKind
	 * 
	 */
	public EObject getMethodContentKind();

	/**
	 * Init the methodContentKind
	 * @param settings the combo setting
	 */
	public void initMethodContentKind(EObjectFlatComboSettings settings);

	/**
	 * Defines a new methodContentKind
	 * @param newValue the new methodContentKind to set
	 * 
	 */
	public void setMethodContentKind(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMethodContentKindButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the methodContentKind edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMethodContentKind(ViewerFilter filter);

	/**
	 * Adds the given filter to the methodContentKind edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMethodContentKind(ViewerFilter filter);




	/**
	 * Init the referencedActivity
	 * @param settings settings for the referencedActivity ReferencesTable 
	 */
	public void initReferencedActivity(ReferencesTableSettings settings);

	/**
	 * Update the referencedActivity
	 * @param newValue the referencedActivity to update
	 * 
	 */
	public void updateReferencedActivity();

	/**
	 * Adds the given filter to the referencedActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencedActivity(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencedActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencedActivity(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the referencedActivity table
	 * 
	 */
	public boolean isContainedInReferencedActivityTable(EObject element);




	/**
	 * Init the contentReference
	 * @param settings settings for the contentReference ReferencesTable 
	 */
	public void initContentReference(ReferencesTableSettings settings);

	/**
	 * Update the contentReference
	 * @param newValue the contentReference to update
	 * 
	 */
	public void updateContentReference();

	/**
	 * Adds the given filter to the contentReference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContentReference(ViewerFilter filter);

	/**
	 * Adds the given filter to the contentReference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContentReference(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the contentReference table
	 * 
	 */
	public boolean isContainedInContentReferenceTable(EObject element);


	/**
	 * @return the additionalInfo
	 * 
	 */
	public String getAdditionalInfo();

	/**
	 * Defines a new additionalInfo
	 * @param newValue the new additionalInfo to set
	 * 
	 */
	public void setAdditionalInfo(String newValue);


	/**
	 * @return the application
	 * 
	 */
	public String getApplication();

	/**
	 * Defines a new application
	 * @param newValue the new application to set
	 * 
	 */
	public void setApplication(String newValue);


	/**
	 * @return the background
	 * 
	 */
	public String getBackground();

	/**
	 * Defines a new background
	 * @param newValue the new background to set
	 * 
	 */
	public void setBackground(String newValue);


	/**
	 * @return the goal
	 * 
	 */
	public EList getGoal();

	/**
	 * Defines a new goal
	 * @param newValue the new goal to set
	 * 
	 */
	public void setGoal(EList newValue);

	/**
	 * Add a value to the goal multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToGoal(Object newValue);

	/**
	 * Remove a value to the goal multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToGoal(Object newValue);


	/**
	 * @return the levelOfAdoption
	 * 
	 */
	public EList getLevelOfAdoption();

	/**
	 * Defines a new levelOfAdoption
	 * @param newValue the new levelOfAdoption to set
	 * 
	 */
	public void setLevelOfAdoption(EList newValue);

	/**
	 * Add a value to the levelOfAdoption multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToLevelOfAdoption(Object newValue);

	/**
	 * Remove a value to the levelOfAdoption multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToLevelOfAdoption(Object newValue);


	/**
	 * @return the problem
	 * 
	 */
	public String getProblem();

	/**
	 * Defines a new problem
	 * @param newValue the new problem to set
	 * 
	 */
	public void setProblem(String newValue);





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
