package org.obeonetwork.dsl.spem.gen.doc;

import java.net.URL;

import org.obeonetwork.dsl.spem.gen.doc.wizard.IGendoc2Template;

public class SpemRunnerDocx implements IGendoc2Template {

	/** The description associated to this kind of template */
	private String description = "MS Office docx template to generate the spem documentation";

	public String getAirdDiagramKey() {
		return "spem_aird_diagram";
	}

	public String getDescription() {
		return description;
	}

	public String getModelKey() {
		return "spem_generation_model";
	}

	public String getOutPutExtension() {
		return "docx";
	}

	public String getOutputKey() {
		return "spem_generation_output";
	}

	public URL getTemplate() {
		return Activator.getDefault().getBundle()
				.getEntry("/templates/spem_template.docx");

	}
}
