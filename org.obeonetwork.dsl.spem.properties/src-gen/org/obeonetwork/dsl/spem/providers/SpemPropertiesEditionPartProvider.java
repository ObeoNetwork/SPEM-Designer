/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.obeonetwork.dsl.spem.parts.SpemViewsRepository;
import org.obeonetwork.dsl.spem.parts.forms.ActivityPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.CategoryPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.CompositeRolePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.Default_ResponsibilityAssignmentPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.Default_TaskDefinitionParameterPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.Default_TaskDefinitionPerformerPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.GuidancePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.KindPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.MethodConfigurationPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.MethodContentPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.MethodLibraryPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.MethodPluginPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.MetricPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.MilestonePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.PlanningDataPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.ProcessComponentPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.ProcessComponentUsePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.ProcessPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.ProcessParameterPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.ProcessPerformerPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.ProcessResponsibilityAssignmentPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.QualificationPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.RoleDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.RoleUsePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.StepPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.TaskDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.TaskUsePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.TeamProfilePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.ToolDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.WorkDefinitionParameterPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.WorkProductDefinitionPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.WorkProductDefinitionRelationshipPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.WorkProductPortConnectorPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.WorkProductPortPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.WorkProductUsePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.WorkProductUseRelationshipPropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.forms.WorkSequencePropertiesEditionPartForm;
import org.obeonetwork.dsl.spem.parts.impl.ActivityPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.CategoryPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.CompositeRolePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.Default_ResponsibilityAssignmentPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.Default_TaskDefinitionParameterPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.Default_TaskDefinitionPerformerPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.GuidancePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.KindPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.MethodConfigurationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.MethodContentPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.MethodLibraryPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.MethodPluginPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.MetricPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.MilestonePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.PlanningDataPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.ProcessComponentPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.ProcessComponentUsePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.ProcessPackagePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.ProcessParameterPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.ProcessPerformerPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.ProcessResponsibilityAssignmentPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.QualificationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.RoleDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.RoleUsePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.StepPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.TaskDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.TaskUsePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.TeamProfilePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.ToolDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.WorkDefinitionParameterPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.WorkProductDefinitionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.WorkProductDefinitionRelationshipPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.WorkProductPortConnectorPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.WorkProductPortPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.WorkProductUsePropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.WorkProductUseRelationshipPropertiesEditionPartImpl;
import org.obeonetwork.dsl.spem.parts.impl.WorkSequencePropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class SpemPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == SpemViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == SpemViewsRepository.Kind.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new KindPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new KindPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.WorkDefinitionParameter.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new WorkDefinitionParameterPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new WorkDefinitionParameterPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.WorkSequence.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new WorkSequencePropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new WorkSequencePropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.Activity.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new ActivityPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new ActivityPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.ProcessPerformer.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new ProcessPerformerPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new ProcessPerformerPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.RoleUse.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new RoleUsePropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new RoleUsePropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.ProcessResponsibilityAssignment.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new ProcessResponsibilityAssignmentPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new ProcessResponsibilityAssignmentPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.WorkProductUse.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new WorkProductUsePropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new WorkProductUsePropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.WorkProductUseRelationship.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new WorkProductUseRelationshipPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new WorkProductUseRelationshipPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.ProcessParameter.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new ProcessParameterPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new ProcessParameterPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.Milestone.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new MilestonePropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new MilestonePropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.Category.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new CategoryPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new CategoryPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.Guidance.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new GuidancePropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new GuidancePropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.Metric.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new MetricPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new MetricPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.ToolDefinition.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new ToolDefinitionPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new ToolDefinitionPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.TaskDefinition.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new TaskDefinitionPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new TaskDefinitionPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.Step.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new StepPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new StepPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.WorkProductDefinition.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new WorkProductDefinitionPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new WorkProductDefinitionPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.RoleDefinition.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new RoleDefinitionPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new RoleDefinitionPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.WorkProductDefinitionRelationship.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new WorkProductDefinitionRelationshipPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new WorkProductDefinitionRelationshipPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.Default_TaskDefinitionPerformer.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new Default_TaskDefinitionPerformerPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new Default_TaskDefinitionPerformerPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.Default_ResponsibilityAssignment.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new Default_ResponsibilityAssignmentPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new Default_ResponsibilityAssignmentPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.Default_TaskDefinitionParameter.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new Default_TaskDefinitionParameterPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new Default_TaskDefinitionParameterPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.Qualification.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new QualificationPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new QualificationPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.MethodContentPackage.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new MethodContentPackagePropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new MethodContentPackagePropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.ProcessPackage.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new ProcessPackagePropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new ProcessPackagePropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.PlanningData.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new PlanningDataPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new PlanningDataPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.TaskUse.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new TaskUsePropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new TaskUsePropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.CompositeRole.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new CompositeRolePropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new CompositeRolePropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.TeamProfile.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new TeamProfilePropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new TeamProfilePropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.ProcessComponent.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new ProcessComponentPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new ProcessComponentPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.ProcessComponentUse.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new ProcessComponentUsePropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new ProcessComponentUsePropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.MethodConfiguration.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new MethodConfigurationPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new MethodConfigurationPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.MethodPlugin.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new MethodPluginPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new MethodPluginPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.MethodLibrary.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new MethodLibraryPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new MethodLibraryPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.WorkProductPort.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new WorkProductPortPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new WorkProductPortPropertiesEditionPartForm(component);
		}
		if (key == SpemViewsRepository.WorkProductPortConnector.class) {
			if (kind == SpemViewsRepository.SWT_KIND)
				return new WorkProductPortConnectorPropertiesEditionPartImpl(component);
			if (kind == SpemViewsRepository.FORM_KIND)
				return new WorkProductPortConnectorPropertiesEditionPartForm(component);
		}
		return null;
	}

}
