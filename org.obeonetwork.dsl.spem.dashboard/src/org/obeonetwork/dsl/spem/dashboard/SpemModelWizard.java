/**
 * @author Ali Koudri - ali.koudri@thalesgroup.com
 */

package org.obeonetwork.dsl.spem.dashboard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.obeonetwork.dsl.spem.MethodContentPackage;
import org.obeonetwork.dsl.spem.MethodLibrary;
import org.obeonetwork.dsl.spem.MethodPlugin;
import org.obeonetwork.dsl.spem.ProcessPackage;
import org.obeonetwork.dsl.spem.SpemFactory;
import org.obeonetwork.dsl.spem.SpemPackage;
import org.obeonetwork.dsl.spem.uma.CapabilityPatternPackage;
import org.obeonetwork.dsl.spem.uma.CategoryPackage;
import org.obeonetwork.dsl.spem.uma.ConfigurationPackage;
import org.obeonetwork.dsl.spem.uma.DeliveryProcessPackage;
import org.obeonetwork.dsl.spem.uma.DisciplinePackage;
import org.obeonetwork.dsl.spem.uma.DomainPackage;
import org.obeonetwork.dsl.spem.uma.GuidancePackage;
import org.obeonetwork.dsl.spem.uma.ProcessComponentPackage;
import org.obeonetwork.dsl.spem.uma.QualificationPackage;
import org.obeonetwork.dsl.spem.uma.RoleDefinitionPackage;
import org.obeonetwork.dsl.spem.uma.RoleSetPackage;
import org.obeonetwork.dsl.spem.uma.TaskDefinitionPackage;
import org.obeonetwork.dsl.spem.uma.ToolDefinitionPackage;
import org.obeonetwork.dsl.spem.uma.UmaFactory;
import org.obeonetwork.dsl.spem.uma.UmaPackage;
import org.obeonetwork.dsl.spem.uma.WorkProductDefinitionPackage;
import org.obeonetwork.dsl.spem.uma.WorkProductKindPackage;

public class SpemModelWizard extends Wizard implements INewWizard {
	
	protected SpemPackage spem = SpemPackage.eINSTANCE;
	protected UmaPackage uma = UmaPackage.eINSTANCE;
	protected SpemFactory spemFactory = spem.getSpemFactory();
	protected UmaFactory umaFactory = uma.getUmaFactory();
	private IStructuredSelection selection;
	private SpemModelWizardCreationPage creationPage;

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		setWindowTitle("SPEM model wizard");
	}

	@Override
	public void addPages() {
		creationPage = new SpemModelWizardCreationPage("Model name", selection);
		creationPage.setTitle("Name of the process model");
		creationPage.setTitle("Set the name of your SPEM model");
		addPage(creationPage);
	}
	
	protected MethodLibrary createInitialModel()
	{
		MethodLibrary lib = spemFactory.createMethodLibrary();
		MethodPlugin plugin = spemFactory.createMethodPlugin();
		plugin.setName(creationPage.getFileName());
		lib.getOwnedMethodPlugin().add(plugin);
		//Method Content Package
		MethodContentPackage mp = spemFactory.createMethodContentPackage();
		mp.setName("Method Content");
		plugin.getOwnedMethodContentPackage().add(mp);
		RoleDefinitionPackage rdp = umaFactory.createRoleDefinitionPackage();
		rdp.setName("Roles");
		mp.getOwnedMethodContentMember().add(rdp);
		TaskDefinitionPackage tdp = umaFactory.createTaskDefinitionPackage();
		tdp.setName("Tasks");
		mp.getOwnedMethodContentMember().add(tdp);
		WorkProductDefinitionPackage wdp = umaFactory.createWorkProductDefinitionPackage();
		wdp.setName("Work Products");
		mp.getOwnedMethodContentMember().add(wdp);
		GuidancePackage gp = umaFactory.createGuidancePackage();
		gp.setName("Guidances");
		mp.getOwnedMethodContentMember().add(gp);
		CategoryPackage standard = umaFactory.createCategoryPackage();
		standard.setName("Standard Categories");
		mp.getOwnedMethodContentMember().add(standard);
		CategoryPackage custom = umaFactory.createCategoryPackage();
		custom.setName("Custom Categories");
		mp.getOwnedMethodContentMember().add(custom);
		DisciplinePackage dp = umaFactory.createDisciplinePackage();
		dp.setName("Disciplines");
		standard.getOwnedMethodContentMember().add(dp);
		DomainPackage domP = umaFactory.createDomainPackage();
		domP.setName("Domains");
		standard.getOwnedMethodContentMember().add(domP);
		WorkProductKindPackage wkp = umaFactory.createWorkProductKindPackage();
		wkp.setName("Work Product Kinds");
		standard.getOwnedMethodContentMember().add(wkp);
		QualificationPackage qp = umaFactory.createQualificationPackage();
		qp.setName("Qualifications");
		standard.getOwnedMethodContentMember().add(qp);
		RoleSetPackage rsp = umaFactory.createRoleSetPackage();
		rsp.setName("Role Sets");
		standard.getOwnedMethodContentMember().add(rsp);
		ToolDefinitionPackage tooldp = umaFactory.createToolDefinitionPackage();
		tooldp.setName("Tools");
		standard.getOwnedMethodContentMember().add(tooldp);
		//Process Package
		ProcessPackage pp = spemFactory.createProcessPackage();
		pp.setName("Processes");
		plugin.getOwnedProcessPackage().add(pp);
		CapabilityPatternPackage cpp = umaFactory.createCapabilityPatternPackage();
		cpp.setName("Capability Patterns");
		pp.getOwnedProcessMember().add(cpp);
		ProcessComponentPackage pcp = umaFactory.createProcessComponentPackage();
		pcp.setName("Process Components");
		pp.getOwnedProcessMember().add(pcp);
		DeliveryProcessPackage dpp = umaFactory.createDeliveryProcessPackage();
		dpp.setName("Delivery Processes");
		pp.getOwnedProcessMember().add(dpp);
		//Configuration Package
		ConfigurationPackage confp = umaFactory.createConfigurationPackage();
		confp.setName("Configurations");
		lib.setConfigurationPackage(confp);
		return lib;
	}

	@Override
	public boolean performFinish() {
		final IFile modelFile = creationPage.getModelFile();
		if (modelFile == null)
			return false;
		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException,
					InvocationTargetException, InterruptedException {
				ResourceSet rset = new ResourceSetImpl();
				URI fURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
				Resource r = rset.createResource(fURI);
				MethodLibrary lib = createInitialModel();
				if (lib != null)
					r.getContents().add(lib);
				try {
					r.save(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		try {
			getContainer().run(false, false, op);
			//TODO: launch OD on the created model
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

}
