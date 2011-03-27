package br.org.mosaic.tags.form;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Select extends HTMLComponent {
	@Override
	public String tagName() {
		return "select";
	}

	public Select disabled(final boolean disabled) {
		if (disabled) {
			this.addProperty(new Property("disabled", "disabled"));
		}
		return this;
	}

	public Select multiple(final boolean multiple) {
		if (multiple) {
			this.addProperty(new Property("multiple", "multiple"));
		}
		return this;
	}

	public Select size(final int maxlength) {
		this.addProperty(new Property("maxlength", String.valueOf(maxlength)));
		return this;
	}

	public Select name(final String name) {
		this.addProperty(new Property("name", name));
		return this;
	}

	public Select options(final Option... options) {
		this.add(options);
		return this;
	}

	public Select value(final String value) {
		this.addProperty(new Property("value", value));
		return this;
	}
}