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
public interface TaskUsePropertiesEditionPart {

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
	 * @return the hasMultipleOccurrences
	 * 
	 */
	public Boolean getHasMultipleOccurrences();

	/**
	 * Defines a new hasMultipleOccurrences
	 * @param newValue the new hasMultipleOccurrences to set
	 * 
	 */
	public void setHasMultipleOccurrences(Boolean newValue);


	/**
	 * @return the isOptional
	 * 
	 */
	public Boolean getIsOptional();

	/**
	 * Defines a new isOptional
	 * @param newValue the new isOptional to set
	 * 
	 */
	public void setIsOptional(Boolean newValue);


	/**
	 * @return the isPlanned
	 * 
	 */
	public Boolean getIsPlanned();

	/**
	 * Defines a new isPlanned
	 * @param newValue the new isPlanned to set
	 * 
	 */
	public void setIsPlanned(Boolean newValue);


	/**
	 * @return the isSynchronizedWithSource
	 * 
	 */
	public Boolean getIsSynchronizedWithSource();

	/**
	 * Defines a new isSynchronizedWithSource
	 * @param newValue the new isSynchronizedWithSource to set
	 * 
	 */
	public void setIsSynchronizedWithSource(Boolean newValue);


	/**
	 * @return the isRepeatable
	 * 
	 */
	public Boolean getIsRepeatable();

	/**
	 * Defines a new isRepeatable
	 * @param newValue the new isRepeatable to set
	 * 
	 */
	public void setIsRepeatable(Boolean newValue);


	/**
	 * @return the isOngoing
	 * 
	 */
	public Boolean getIsOngoing();

	/**
	 * Defines a new isOngoing
	 * @param newValue the new isOngoing to set
	 * 
	 */
	public void setIsOngoing(Boolean newValue);


	/**
	 * @return the isEventDriven
	 * 
	 */
	public Boolean getIsEventDriven();

	/**
	 * Defines a new isEventDriven
	 * @param newValue the new isEventDriven to set
	 * 
	 */
	public void setIsEventDriven(Boolean newValue);




	/**
	 * Init the linkToPredecessor
	 * @param settings settings for the linkToPredecessor ReferencesTable 
	 */
	public void initLinkToPredecessor(ReferencesTableSettings settings);

	/**
	 * Update the linkToPredecessor
	 * @param newValue the linkToPredecessor to update
	 * 
	 */
	public void updateLinkToPredecessor();

	/**
	 * Adds the given filter to the linkToPredecessor edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLinkToPredecessor(ViewerFilter filter);

	/**
	 * Adds the given filter to the linkToPredecessor edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLinkToPredecessor(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the linkToPredecessor table
	 * 
	 */
	public boolean isContainedInLinkToPredecessorTable(EObject element);




	/**
	 * Init the linkToSuccessor
	 * @param settings settings for the linkToSuccessor ReferencesTable 
	 */
	public void initLinkToSuccessor(ReferencesTableSettings settings);

	/**
	 * Update the linkToSuccessor
	 * @param newValue the linkToSuccessor to update
	 * 
	 */
	public void updateLinkToSuccessor();

	/**
	 * Adds the given filter to the linkToSuccessor edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLinkToSuccessor(ViewerFilter filter);

	/**
	 * Adds the given filter to the linkToSuccessor edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLinkToSuccessor(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the linkToSuccessor table
	 * 
	 */
	public boolean isContainedInLinkToSuccessorTable(EObject element);


	/**
	 * @return the task
	 * 
	 */
	public EObject getTask();

	/**
	 * Init the task
	 * @param settings the combo setting
	 */
	public void initTask(EObjectFlatComboSettings settings);

	/**
	 * Defines a new task
	 * @param newValue the new task to set
	 * 
	 */
	public void setTask(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTaskButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the task edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTask(ViewerFilter filter);

	/**
	 * Adds the given filter to the task edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTask(ViewerFilter filter);




	/**
	 * Init the usedQualification
	 * @param settings settings for the usedQualification ReferencesTable 
	 */
	public void initUsedQualification(ReferencesTableSettings settings);

	/**
	 * Update the usedQualification
	 * @param newValue the usedQualification to update
	 * 
	 */
	public void updateUsedQualification();

	/**
	 * Adds the given filter to the usedQualification edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToUsedQualification(ViewerFilter filter);

	/**
	 * Adds the given filter to the usedQualification edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToUsedQualification(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the usedQualification table
	 * 
	 */
	public boolean isContainedInUsedQualificationTable(EObject element);




	/**
	 * Init the selectedStep
	 * @param settings settings for the selectedStep ReferencesTable 
	 */
	public void initSelectedStep(ReferencesTableSettings settings);

	/**
	 * Update the selectedStep
	 * @param newValue the selectedStep to update
	 * 
	 */
	public void updateSelectedStep();

	/**
	 * Adds the given filter to the selectedStep edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSelectedStep(ViewerFilter filter);

	/**
	 * Adds the given filter to the selectedStep edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSelectedStep(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the selectedStep table
	 * 
	 */
	public boolean isContainedInSelectedStepTable(EObject element);


	/**
	 * @return the preCondition
	 * 
	 */
	public String getPreCondition();

	/**
	 * Defines a new preCondition
	 * @param newValue the new preCondition to set
	 * 
	 */
	public void setPreCondition(String newValue);


	/**
	 * @return the postCondition
	 * 
	 */
	public String getPostCondition();

	/**
	 * Defines a new postCondition
	 * @param newValue the new postCondition to set
	 * 
	 */
	public void setPostCondition(String newValue);





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
