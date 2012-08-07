/**
 * 
 */
package org.obeonetwork.dsl.spem.gen.doc;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.obeonetwork.dsl.spem.gen.doc.wizard.IGendoc2Runner;
import org.obeonetwork.dsl.spem.gen.doc.wizard.IGendoc2Template;

/**
 * @author arichard
 * 
 */
public class SpemGendoc2Runner implements IGendoc2Runner {

	List<IGendoc2Template> myTemplates = new ArrayList<IGendoc2Template>();

	public SpemGendoc2Runner() {
		myTemplates.add(new SpemRunnerDocx());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.thalesgroup.mde.ra.gendoc2.wizard.IGendoc2Runner#
	 * getGendoc2Templates()
	 */
	public List<IGendoc2Template> getGendoc2Templates() {
		return myTemplates;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.thalesgroup.mde.ra.gendoc2.wizard.IGendoc2Runner#getLabel()
	 */
	public String getLabel() {
		return "SPEM Documentation Generation";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.thalesgroup.mde.ra.gendoc2.wizard.IGendoc2Runner#getPattern ()
	 */
	public Pattern getPattern() {
		return Pattern.compile(".*\\.spem");
	}

}
