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
public interface DeliveryProcessPropertiesEditionPart {

	/**
	 * @return the preCondition
	 * 
	 */
	public EList getPreCondition();

	/**
	 * Defines a new preCondition
	 * @param newValue the new preCondition to set
	 * 
	 */
	public void setPreCondition(EList newValue);

	/**
	 * Add a value to the preCondition multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToPreCondition(Object newValue);

	/**
	 * Remove a value to the preCondition multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToPreCondition(Object newValue);


	/**
	 * @return the postCondition
	 * 
	 */
	public EList getPostCondition();

	/**
	 * Defines a new postCondition
	 * @param newValue the new postCondition to set
	 * 
	 */
	public void setPostCondition(EList newValue);

	/**
	 * Add a value to the postCondition multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToPostCondition(Object newValue);

	/**
	 * Remove a value to the postCondition multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToPostCondition(Object newValue);


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
	 * @return the useKind
	 * 
	 */
	public Enumerator getUseKind();

	/**
	 * Init the useKind
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initUseKind(EEnum eenum, Enumerator current);

	/**
	 * Defines a new useKind
	 * @param newValue the new useKind to set
	 * 
	 */
	public void setUseKind(Enumerator newValue);


	/**
	 * @return the usedActivity
	 * 
	 */
	public EObject getUsedActivity();

	/**
	 * Init the usedActivity
	 * @param settings the combo setting
	 */
	public void initUsedActivity(EObjectFlatComboSettings settings);

	/**
	 * Defines a new usedActivity
	 * @param newValue the new usedActivity to set
	 * 
	 */
	public void setUsedActivity(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setUsedActivityButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the usedActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToUsedActivity(ViewerFilter filter);

	/**
	 * Adds the given filter to the usedActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToUsedActivity(ViewerFilter filter);




	/**
	 * Init the suppressedBreakdownElement
	 * @param settings settings for the suppressedBreakdownElement ReferencesTable 
	 */
	public void initSuppressedBreakdownElement(ReferencesTableSettings settings);

	/**
	 * Update the suppressedBreakdownElement
	 * @param newValue the suppressedBreakdownElement to update
	 * 
	 */
	public void updateSuppressedBreakdownElement();

	/**
	 * Adds the given filter to the suppressedBreakdownElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSuppressedBreakdownElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the suppressedBreakdownElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSuppressedBreakdownElement(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the suppressedBreakdownElement table
	 * 
	 */
	public boolean isContainedInSuppressedBreakdownElementTable(EObject element);


	/**
	 * @return the defaultContext
	 * 
	 */
	public EObject getDefaultContext();

	/**
	 * Init the defaultContext
	 * @param settings the combo setting
	 */
	public void initDefaultContext(EObjectFlatComboSettings settings);

	/**
	 * Defines a new defaultContext
	 * @param newValue the new defaultContext to set
	 * 
	 */
	public void setDefaultContext(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDefaultContextButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the defaultContext edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDefaultContext(ViewerFilter filter);

	/**
	 * Adds the given filter to the defaultContext edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDefaultContext(ViewerFilter filter);




	/**
	 * Init the validContext
	 * @param settings settings for the validContext ReferencesTable 
	 */
	public void initValidContext(ReferencesTableSettings settings);

	/**
	 * Update the validContext
	 * @param newValue the validContext to update
	 * 
	 */
	public void updateValidContext();

	/**
	 * Adds the given filter to the validContext edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToValidContext(ViewerFilter filter);

	/**
	 * Adds the given filter to the validContext edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToValidContext(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the validContext table
	 * 
	 */
	public boolean isContainedInValidContextTable(EObject element);


	/**
	 * @return the scope
	 * 
	 */
	public String getScope();

	/**
	 * Defines a new scope
	 * @param newValue the new scope to set
	 * 
	 */
	public void setScope(String newValue);


	/**
	 * @return the usageNote
	 * 
	 */
	public EList getUsageNote();

	/**
	 * Defines a new usageNote
	 * @param newValue the new usageNote to set
	 * 
	 */
	public void setUsageNote(EList newValue);

	/**
	 * Add a value to the usageNote multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToUsageNote(Object newValue);

	/**
	 * Remove a value to the usageNote multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToUsageNote(Object newValue);


	/**
	 * @return the scale
	 * 
	 */
	public String getScale();

	/**
	 * Defines a new scale
	 * @param newValue the new scale to set
	 * 
	 */
	public void setScale(String newValue);


	/**
	 * @return the projectCharacteristics
	 * 
	 */
	public String getProjectCharacteristics();

	/**
	 * Defines a new projectCharacteristics
	 * @param newValue the new projectCharacteristics to set
	 * 
	 */
	public void setProjectCharacteristics(String newValue);


	/**
	 * @return the riskLevel
	 * 
	 */
	public Enumerator getRiskLevel();

	/**
	 * Init the riskLevel
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initRiskLevel(EEnum eenum, Enumerator current);

	/**
	 * Defines a new riskLevel
	 * @param newValue the new riskLevel to set
	 * 
	 */
	public void setRiskLevel(Enumerator newValue);


	/**
	 * @return the estimatingTechnique
	 * 
	 */
	public Enumerator getEstimatingTechnique();

	/**
	 * Init the estimatingTechnique
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initEstimatingTechnique(EEnum eenum, Enumerator current);

	/**
	 * Defines a new estimatingTechnique
	 * @param newValue the new estimatingTechnique to set
	 * 
	 */
	public void setEstimatingTechnique(Enumerator newValue);


	/**
	 * @return the projectMemberExpertise
	 * 
	 */
	public Enumerator getProjectMemberExpertise();

	/**
	 * Init the projectMemberExpertise
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initProjectMemberExpertise(EEnum eenum, Enumerator current);

	/**
	 * Defines a new projectMemberExpertise
	 * @param newValue the new projectMemberExpertise to set
	 * 
	 */
	public void setProjectMemberExpertise(Enumerator newValue);


	/**
	 * @return the typeOfContract
	 * 
	 */
	public Enumerator getTypeOfContract();

	/**
	 * Init the typeOfContract
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initTypeOfContract(EEnum eenum, Enumerator current);

	/**
	 * Defines a new typeOfContract
	 * @param newValue the new typeOfContract to set
	 * 
	 */
	public void setTypeOfContract(Enumerator newValue);




	/**
	 * Init the communicationMaterial
	 * @param settings settings for the communicationMaterial ReferencesTable 
	 */
	public void initCommunicationMaterial(ReferencesTableSettings settings);

	/**
	 * Update the communicationMaterial
	 * @param newValue the communicationMaterial to update
	 * 
	 */
	public void updateCommunicationMaterial();

	/**
	 * Adds the given filter to the communicationMaterial edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCommunicationMaterial(ViewerFilter filter);

	/**
	 * Adds the given filter to the communicationMaterial edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCommunicationMaterial(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the communicationMaterial table
	 * 
	 */
	public boolean isContainedInCommunicationMaterialTable(EObject element);




	/**
	 * Init the educationalMaterial
	 * @param settings settings for the educationalMaterial ReferencesTable 
	 */
	public void initEducationalMaterial(ReferencesTableSettings settings);

	/**
	 * Update the educationalMaterial
	 * @param newValue the educationalMaterial to update
	 * 
	 */
	public void updateEducationalMaterial();

	/**
	 * Adds the given filter to the educationalMaterial edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEducationalMaterial(ViewerFilter filter);

	/**
	 * Adds the given filter to the educationalMaterial edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEducationalMaterial(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the educationalMaterial table
	 * 
	 */
	public boolean isContainedInEducationalMaterialTable(EObject element);





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
