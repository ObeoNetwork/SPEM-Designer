/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.obeonetwork.dsl.spem.uma.providers.ArtifactPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.CapabilityPatternPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.CapabilityPatternPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.CategoryPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.ChecklistPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.ConceptPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.ConfigurationPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.CustomCategoryPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.DeliverablePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.DeliveryProcessPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.DeliveryProcessPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.DisciplineGroupingPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.DisciplinePackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.DisciplinePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.DomainPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.DomainPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.EstimatingConsiderationPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.ExamplePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.GuidancePackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.GuidelinePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.IterationPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.OutcomePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.PhasePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.PracticePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.ProcessComponentPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.ProcessPlanningTemplatePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.ProcessPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.QualificationPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.ReportPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.ReusableAssetPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.RoadmapPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.RoleDefinitionPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.RoleSetPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.RoleSetPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.SupportingMaterialPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.TaskDefinitionPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.TemplatePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.TermDefinitionPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.ToolDefinitionPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.ToolMentorPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.WhitepaperPropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.WorkProductDefinitionPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.providers.WorkProductKindPackagePropertiesEditionProvider;
import org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory;


/**
 * 
 * 
 */
public class UmaEEFAdapterFactory extends UmaAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createWorkProductUseAdapter()
	 * 
	 */
	public Adapter createWorkProductUseAdapter() {
		return new WorkProductUsePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createArtifactAdapter()
	 * 
	 */
	public Adapter createArtifactAdapter() {
		return new ArtifactPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createActivityAdapter()
	 * 
	 */
	public Adapter createActivityAdapter() {
		return new ActivityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createProcessAdapter()
	 * 
	 */
	public Adapter createProcessAdapter() {
		return new ProcessPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createCapabilityPatternAdapter()
	 * 
	 */
	public Adapter createCapabilityPatternAdapter() {
		return new CapabilityPatternPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createGuidanceAdapter()
	 * 
	 */
	public Adapter createGuidanceAdapter() {
		return new GuidancePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createChecklistAdapter()
	 * 
	 */
	public Adapter createChecklistAdapter() {
		return new ChecklistPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createConceptAdapter()
	 * 
	 */
	public Adapter createConceptAdapter() {
		return new ConceptPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createMethodContentPackageAdapter()
	 * 
	 */
	public Adapter createMethodContentPackageAdapter() {
		return new MethodContentPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createCategoryPackageAdapter()
	 * 
	 */
	public Adapter createCategoryPackageAdapter() {
		return new CategoryPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createCategoryAdapter()
	 * 
	 */
	public Adapter createCategoryAdapter() {
		return new CategoryPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createCustomCategoryAdapter()
	 * 
	 */
	public Adapter createCustomCategoryAdapter() {
		return new CustomCategoryPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createDeliverableAdapter()
	 * 
	 */
	public Adapter createDeliverableAdapter() {
		return new DeliverablePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createDeliveryProcessAdapter()
	 * 
	 */
	public Adapter createDeliveryProcessAdapter() {
		return new DeliveryProcessPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createDisciplineAdapter()
	 * 
	 */
	public Adapter createDisciplineAdapter() {
		return new DisciplinePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createDisciplineGroupingAdapter()
	 * 
	 */
	public Adapter createDisciplineGroupingAdapter() {
		return new DisciplineGroupingPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createDomainAdapter()
	 * 
	 */
	public Adapter createDomainAdapter() {
		return new DomainPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createEstimatingConsiderationAdapter()
	 * 
	 */
	public Adapter createEstimatingConsiderationAdapter() {
		return new EstimatingConsiderationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createExampleAdapter()
	 * 
	 */
	public Adapter createExampleAdapter() {
		return new ExamplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createIterationAdapter()
	 * 
	 */
	public Adapter createIterationAdapter() {
		return new IterationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createOutcomeAdapter()
	 * 
	 */
	public Adapter createOutcomeAdapter() {
		return new OutcomePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createPhaseAdapter()
	 * 
	 */
	public Adapter createPhaseAdapter() {
		return new PhasePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createPracticeAdapter()
	 * 
	 */
	public Adapter createPracticeAdapter() {
		return new PracticePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createProcessPlanningTemplateAdapter()
	 * 
	 */
	public Adapter createProcessPlanningTemplateAdapter() {
		return new ProcessPlanningTemplatePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createReportAdapter()
	 * 
	 */
	public Adapter createReportAdapter() {
		return new ReportPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createReusableAssetAdapter()
	 * 
	 */
	public Adapter createReusableAssetAdapter() {
		return new ReusableAssetPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createRoadmapAdapter()
	 * 
	 */
	public Adapter createRoadmapAdapter() {
		return new RoadmapPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createTemplateAdapter()
	 * 
	 */
	public Adapter createTemplateAdapter() {
		return new TemplatePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createTermDefinitionAdapter()
	 * 
	 */
	public Adapter createTermDefinitionAdapter() {
		return new TermDefinitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createToolMentorAdapter()
	 * 
	 */
	public Adapter createToolMentorAdapter() {
		return new ToolMentorPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createWhitepaperAdapter()
	 * 
	 */
	public Adapter createWhitepaperAdapter() {
		return new WhitepaperPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createGuidelineAdapter()
	 * 
	 */
	public Adapter createGuidelineAdapter() {
		return new GuidelinePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createSupportingMaterialAdapter()
	 * 
	 */
	public Adapter createSupportingMaterialAdapter() {
		return new SupportingMaterialPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createRoleDefinitionPackageAdapter()
	 * 
	 */
	public Adapter createRoleDefinitionPackageAdapter() {
		return new RoleDefinitionPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createTaskDefinitionPackageAdapter()
	 * 
	 */
	public Adapter createTaskDefinitionPackageAdapter() {
		return new TaskDefinitionPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createWorkProductDefinitionPackageAdapter()
	 * 
	 */
	public Adapter createWorkProductDefinitionPackageAdapter() {
		return new WorkProductDefinitionPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createGuidancePackageAdapter()
	 * 
	 */
	public Adapter createGuidancePackageAdapter() {
		return new GuidancePackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createDisciplinePackageAdapter()
	 * 
	 */
	public Adapter createDisciplinePackageAdapter() {
		return new DisciplinePackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createDomainPackageAdapter()
	 * 
	 */
	public Adapter createDomainPackageAdapter() {
		return new DomainPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createWorkProductKindPackageAdapter()
	 * 
	 */
	public Adapter createWorkProductKindPackageAdapter() {
		return new WorkProductKindPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createRoleSetPackageAdapter()
	 * 
	 */
	public Adapter createRoleSetPackageAdapter() {
		return new RoleSetPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createToolDefinitionPackageAdapter()
	 * 
	 */
	public Adapter createToolDefinitionPackageAdapter() {
		return new ToolDefinitionPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createConfigurationPackageAdapter()
	 * 
	 */
	public Adapter createConfigurationPackageAdapter() {
		return new ConfigurationPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createProcessPackageAdapter()
	 * 
	 */
	public Adapter createProcessPackageAdapter() {
		return new ProcessPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createCapabilityPatternPackageAdapter()
	 * 
	 */
	public Adapter createCapabilityPatternPackageAdapter() {
		return new CapabilityPatternPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createDeliveryProcessPackageAdapter()
	 * 
	 */
	public Adapter createDeliveryProcessPackageAdapter() {
		return new DeliveryProcessPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createRoleSetAdapter()
	 * 
	 */
	public Adapter createRoleSetAdapter() {
		return new RoleSetPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createQualificationPackageAdapter()
	 * 
	 */
	public Adapter createQualificationPackageAdapter() {
		return new QualificationPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.spem.uma.util.UmaAdapterFactory#createProcessComponentPackageAdapter()
	 * 
	 */
	public Adapter createProcessComponentPackageAdapter() {
		return new ProcessComponentPackagePropertiesEditionProvider();
	}

}
