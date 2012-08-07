/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.spem.gen.doc.services.files;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Display;
import org.obeonetwork.dsl.spem.gen.doc.services.Activator;
import org.obeonetwork.dsl.spem.gen.doc.services.files.utils.FilesUtils;
import org.obeonetwork.dsl.spem.gen.doc.wizard.Gendoc2WizardPage;

import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.DSemanticDecorator;
import fr.obeo.dsl.viewpoint.DSemanticDiagram;
import fr.obeo.dsl.viewpoint.business.api.dialect.DialectManager;
import fr.obeo.dsl.viewpoint.business.api.session.Session;
import fr.obeo.dsl.viewpoint.business.api.session.SessionManager;
import fr.obeo.dsl.viewpoint.ui.tools.api.actions.export.ExportAction;
import fr.obeo.dsl.viewpoint.ui.tools.api.dialogs.ImageFileFormat;

public class SpemServices {

	/** Image file format use for aird diagram images. */
	private static final ImageFileFormat IMAGE_FILE_FORMAT = ImageFileFormat.JPG;

	/** Image file extension use for aird diagram images. */
	private static final String IMAGE_FILE_EXTENSION = "."
			+ IMAGE_FILE_FORMAT.getName().toLowerCase();

	private static Session session;

	private static IPath targetPath;

	public Session getSession() {
		if (session == null) {
			final IPath airdModelPath = new Path(getAirdDiagramPath());
			final IResource airdWorkspaceResource = ResourcesPlugin
					.getWorkspace().getRoot().getFileForLocation(airdModelPath);
			URI uri = URI.createPlatformResourceURI(airdWorkspaceResource
					.getFullPath().toOSString(), true);
			session = SessionManager.INSTANCE.getSession(uri);
		}
		return session;

	}

	public IPath getTargetPath() {
		if (targetPath == null) {
			targetPath =  new Path(FilesUtils.createTempDirAndDeleteOnShutdown().getAbsolutePath());
		}
		return targetPath;
	}
			
	/**
	 * Get the aird diagram path filled in the wizard dialog page.
	 * 
	 * @return the aird diagram path filled in the wizard dialog page.
	 */
	private String getAirdDiagramPath() {
		return Gendoc2WizardPage.getAirdDiagramPath();
	}

	/**
	 * Check if the given EObject has an existing Representation in the aird
	 * file.
	 * 
	 * @param object
	 *            the given EObject.
	 * @return true if the given EObject has an existing Representation in the
	 *         aird file, false otherwise.
	 */
	public boolean hasDiagram(EObject object) {

		for (DRepresentation dRepresentation : DialectManager.INSTANCE
				.getAllRepresentations(getSession())) {
			if (dRepresentation instanceof DSemanticDiagram) {
				EObject target = ((DSemanticDiagram) dRepresentation)
						.getTarget();
				if (EcoreUtil.equals(target, object)) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * Return the diagram name of the diagram associated to the given EObject.
	 * 
	 * @param object
	 *            the given EObject.
	 * @return the diagram name of the diagram associated to the given EObject.
	 */
	public String getDiagramName(EObject object) {

		for (DRepresentation dRepresentation : DialectManager.INSTANCE
				.getAllRepresentations(getSession())) {
			if (dRepresentation instanceof DSemanticDiagram) {
				EObject target = ((DSemanticDiagram) dRepresentation)
						.getTarget();
				if (EcoreUtil.equals(target, object)) {
					return dRepresentation.getName();
				}
			}
		}

		return "";
	}

	/**
	 * Generate the image of the diagram associated to the given EObject and
	 * return the diagram image path.
	 * 
	 * @param object
	 *            the given EObject
	 * @return the diagram image path.
	 */
	public String getDiagramImagePath(EObject object) {

		String diagramPath = null;

		final IPath airdModelPath = new Path(getAirdDiagramPath());
		final IResource airdWorkspaceResource = ResourcesPlugin.getWorkspace()
				.getRoot().getFileForLocation(airdModelPath);

		final List<DRepresentation> representations = new ArrayList<DRepresentation>();

		boolean diagramFound = false;

		for (DRepresentation dRepresentation : DialectManager.INSTANCE
				.getAllRepresentations(getSession())) {
			if (dRepresentation instanceof DSemanticDiagram) {
				final DSemanticDecorator semanticDiagram = (DSemanticDiagram) dRepresentation;
				if (!diagramFound
						&& EcoreUtil
								.equals(semanticDiagram.getTarget(), object)) {
					diagramPath = getTargetPath().toOSString() + File.separator
							+ dRepresentation.getName() + IMAGE_FILE_EXTENSION;
					representations.add(dRepresentation);
					diagramFound = true;
				}
			}
		}
		if (diagramFound) {

			URI uri = URI.createPlatformResourceURI(airdWorkspaceResource
					.getFullPath().toOSString(), true);
			final Map<URI, List<DRepresentation>> representationsPerFile = new HashMap<URI, List<DRepresentation>>();
			representationsPerFile.put(uri, representations);

			final ExportAction exportAction = new ExportAction();

			exportAction
					.setData(new ExportAction.DataForSelectedRepresentations(
							getTargetPath(), IMAGE_FILE_FORMAT, null,
							representationsPerFile));

			Display.getDefault().syncExec(new Runnable() {

				public void run() {
					try {
						exportAction.run(new NullProgressMonitor());
					} catch (Exception e) {
						final IStatus message = new Status(Status.ERROR,
								Activator.PLUGIN_ID, e.getMessage());
						Activator.getLogger().log(message);
					}
				}
			});
		}

		return diagramPath;

	}

	/**
	 * Technical method. (Reinit the session variable).
	 */
	public String finishGeneration(EObject object) {
		session = null;
		targetPath = null;
		return "";
	}
}
