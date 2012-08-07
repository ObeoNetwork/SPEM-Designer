/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.spem.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;



// End of user code

/**
 * 
 * 
 */
public interface WorkDefinitionParameterPropertiesEditionPart {

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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
