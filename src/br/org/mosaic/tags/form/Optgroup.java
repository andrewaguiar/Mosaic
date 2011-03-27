package br.org.mosaic.tags.form;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Optgroup extends HTMLComponent {
	@Override
	public String tagName() {
		return "optgroup";
	}

	public Optgroup label(String label) {
		addProperty(new Property("label", label));
		return this;
	}

	public Optgroup disabled(boolean disabled) {
		if (disabled) {
			addProperty(new Property("disabled", "disabled"));
		} else {
			removeProperty("disabled");
		}
		return this;
	}
}