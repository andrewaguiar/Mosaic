package br.org.mosaic.tags.form;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Option extends HTMLComponent {
	@Override
	public String tagName() {
		return "option";
	}

	public Option disabled(boolean disabled) {
		if (disabled) {
			addProperty(new Property("disabled", "disabled"));
		}
		return this;
	}

	public Option label(String label) {
		addProperty(new Property("label", label));
		return this;
	}

	public Option value(String value) {
		addProperty(new Property("value", value));
		return this;
	}

	public Option selected(boolean selected) {
		if (selected) {
			addProperty(new Property("selected", "selected"));
		}
		return this;
	}
}