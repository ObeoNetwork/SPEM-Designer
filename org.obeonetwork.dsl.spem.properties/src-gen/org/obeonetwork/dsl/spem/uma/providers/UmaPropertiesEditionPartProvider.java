/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.uma.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.obeonetwork.dsl.spem.uma.parts.UmaViewsRepository;
import org.obeonetwork.dsl.spem.uma.parts.forms.ArtifactPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.CapabilityPatternPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.CapabilityPatternPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.CategoryPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.ChecklistPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.ConceptPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.ConfigurationPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.CustomCategoryPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.DeliverablePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.DeliveryProcessPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.DeliveryProcessPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.DisciplineGroupingPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.DisciplinePackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.DisciplinePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.DomainPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.DomainPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.EstimatingConsiderationPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.ExamplePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.GuidancePackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.GuidelinePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.IterationPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.OutcomePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.PhasePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.PracticePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.ProcessComponentPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.ProcessPlanningTemplatePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.ProcessPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.QualificationPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.ReportPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.ReusableAssetPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.RoadmapPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.RoleDefinitionPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.RoleSetPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.RoleSetPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.RootPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.SupportingMaterialPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.TaskDefinitionPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.TemplatePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.TermDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.ToolDefinitionPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.ToolMentorPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.WhitepaperPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.WorkProductDefinitionPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.forms.WorkProductKindPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.uma.parts.impl.ArtifactPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.CapabilityPatternPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.CapabilityPatternPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.CategoryPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.ChecklistPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.ConceptPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.ConfigurationPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.CustomCategoryPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.DeliverablePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.DeliveryProcessPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.DeliveryProcessPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.DisciplineGroupingPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.DisciplinePackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.DisciplinePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.DomainPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.DomainPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.EstimatingConsiderationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.ExamplePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.GuidancePackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.GuidelinePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.IterationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.OutcomePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.PhasePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.PracticePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.ProcessComponentPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.ProcessPlanningTemplatePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.ProcessPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.QualificationPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.ReportPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.ReusableAssetPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.RoadmapPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.RoleDefinitionPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.RoleSetPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.RoleSetPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.RootPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.SupportingMaterialPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.TaskDefinitionPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.TemplatePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.TermDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.ToolDefinitionPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.ToolMentorPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.WhitepaperPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.WorkProductDefinitionPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.uma.parts.impl.WorkProductKindPackagePropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class UmaPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == UmaViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == UmaViewsRepository.Artifact.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ArtifactPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ArtifactPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.CapabilityPattern.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new CapabilityPatternPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new CapabilityPatternPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Checklist.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ChecklistPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ChecklistPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Concept.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ConceptPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ConceptPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.CategoryPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new CategoryPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new CategoryPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.CustomCategory.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new CustomCategoryPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new CustomCategoryPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Deliverable.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new DeliverablePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new DeliverablePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Process.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ProcessPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ProcessPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.DeliveryProcess.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new DeliveryProcessPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new DeliveryProcessPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Discipline.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new DisciplinePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new DisciplinePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.DisciplineGrouping.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new DisciplineGroupingPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new DisciplineGroupingPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Root.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new RootPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new RootPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Domain.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new DomainPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new DomainPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.EstimatingConsideration.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new EstimatingConsiderationPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new EstimatingConsiderationPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Example.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ExamplePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ExamplePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Iteration.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new IterationPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new IterationPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Outcome.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new OutcomePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new OutcomePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Phase.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new PhasePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new PhasePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Practice.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new PracticePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new PracticePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.ProcessPlanningTemplate.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ProcessPlanningTemplatePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ProcessPlanningTemplatePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Report.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ReportPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ReportPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.ReusableAsset.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ReusableAssetPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ReusableAssetPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Roadmap.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new RoadmapPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new RoadmapPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Template.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new TemplatePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new TemplatePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.TermDefinition.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new TermDefinitionPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new TermDefinitionPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.ToolMentor.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ToolMentorPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ToolMentorPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Whitepaper.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new WhitepaperPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new WhitepaperPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.Guideline.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new GuidelinePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new GuidelinePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.SupportingMaterial.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new SupportingMaterialPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new SupportingMaterialPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.RoleDefinitionPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new RoleDefinitionPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new RoleDefinitionPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.TaskDefinitionPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new TaskDefinitionPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new TaskDefinitionPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.WorkProductDefinitionPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new WorkProductDefinitionPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new WorkProductDefinitionPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.GuidancePackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new GuidancePackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new GuidancePackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.DisciplinePackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new DisciplinePackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new DisciplinePackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.DomainPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new DomainPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new DomainPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.WorkProductKindPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new WorkProductKindPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new WorkProductKindPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.RoleSetPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new RoleSetPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new RoleSetPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.ToolDefinitionPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ToolDefinitionPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ToolDefinitionPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.ConfigurationPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ConfigurationPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ConfigurationPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.CapabilityPatternPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new CapabilityPatternPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new CapabilityPatternPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.DeliveryProcessPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new DeliveryProcessPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new DeliveryProcessPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.RoleSet.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new RoleSetPropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new RoleSetPropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.QualificationPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new QualificationPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new QualificationPackagePropertiesEditionPartForm(component);
		}
		if (key == UmaViewsRepository.ProcessComponentPackage.class) {
			if (kind == UmaViewsRepository.SWT_KIND)
				return new ProcessComponentPackagePropertiesEditionPartImpl(component);
			if (kind == UmaViewsRepository.FORM_KIND)
				return new ProcessComponentPackagePropertiesEditionPartForm(component);
		}
		return null;
	}

}
