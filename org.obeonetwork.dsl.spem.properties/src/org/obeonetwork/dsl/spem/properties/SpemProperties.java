package org.obeonetwork.dsl.spem.properties;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SpemProperties extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.obeonetwork.dsl.spem.properties"; //$NON-NLS-1$

	// The shared instance
	private static SpemProperties plugin;
	
	/**
	 * The constructor
	 */
	public SpemProperties() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static SpemProperties getDefault() {
		return plugin;
	}

}
