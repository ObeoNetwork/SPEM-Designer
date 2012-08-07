/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface Default_TaskDefinitionParameterPropertiesEditionPart {

	/**
	 * @return the direction
	 * 
	 */
	public Enumerator getDirection();

	/**
	 * Init the direction
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initDirection(EEnum eenum, Enumerator current);

	/**
	 * Defines a new direction
	 * @param newValue the new direction to set
	 * 
	 */
	public void setDirection(Enumerator newValue);


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
	 * @return the parameterType
	 * 
	 */
	public EObject getParameterType();

	/**
	 * Init the parameterType
	 * @param settings the combo setting
	 */
	public void initParameterType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parameterType
	 * @param newValue the new parameterType to set
	 * 
	 */
	public void setParameterType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setParameterTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parameterType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParameterType(ViewerFilter filter);

	/**
	 * Adds the given filter to the parameterType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParameterType(ViewerFilter filter);


	/**
	 * @return the optionality
	 * 
	 */
	public Enumerator getOptionality();

	/**
	 * Init the optionality
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initOptionality(EEnum eenum, Enumerator current);

	/**
	 * Defines a new optionality
	 * @param newValue the new optionality to set
	 * 
	 */
	public void setOptionality(Enumerator newValue);





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
