/**
 * 
 */
package org.obeonetwork.dsl.spem.properties.presentation;

import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.obeonetwork.dsl.spem.presentation.SpemEditor;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class SpemEEFEditor extends SpemEditor implements ITabbedPropertySheetPageContributor  {

	private static final String SPEM_EDITOR_CONTRIBUTOR_ID = "org.obeonetwork.dsl.spem.properties";

	protected TabbedPropertySheetPage propertySheetPage;

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor#getContributorId()
	 */
	public String getContributorId() {
		return SPEM_EDITOR_CONTRIBUTOR_ID;
	}

	@Override
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new TabbedPropertySheetPage(this);
		}
		return propertySheetPage;
	}
	
	

}
