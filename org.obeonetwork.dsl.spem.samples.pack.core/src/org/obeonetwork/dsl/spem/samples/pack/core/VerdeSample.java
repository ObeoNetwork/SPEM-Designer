/*
 * Copyright (c) 2007-2008-2009-2010 Obeo
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.spem.samples.pack.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.obeonetwork.dsl.spem.samples.wizards.SpemSample;
import org.obeonetwork.dsl.spem.samples.pack.core.l10n.Messages;

/**
 * 
 * @author Stephane Drapeau - Obeo
 * 
 */
public class VerdeSample extends SpemSample {

	/**
	 * @throws MalformedURLException
	 */
	public VerdeSample() throws MalformedURLException {
		super(
				new URL(CoreSamplePlugin.getDefault().getZipURL()
						+ "examples/verde.zip"), //$NON-NLS-1$
				Messages.SpemVerdeSample_title,
				Messages.SpemVerdeSample_desc,
				0,
				CoreSamplePlugin
						.getDefault()
						.findImageDescriptor(
								"/org.obeonetwork.dsl.spem.samples.pack.core/images/verde-logo.png")); //$NON-NLS-1$
	}

}
