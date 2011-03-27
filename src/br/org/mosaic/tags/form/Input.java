package br.org.mosaic.tags.form;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.EventProperty;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Input extends HTMLComponent {
	public enum Type {
		BUTTON, CHECKBOX, FILE, HIDDEN, IMAGE, PASSWORD, RADIO, RESET, SUBMIT, TEXT
	}

	public Input(final Type type) {
		this.addProperty(new Property("type", type.name().toLowerCase()));
	}

	@Override
	public String tagName() {
		return "input";
	}

	public Input accept(final String accept) {
		this.addProperty(new Property("accept", accept));
		return this;
	}

	public Input alt(final String alt) {
		this.addProperty(new Property("alt", alt));
		return this;
	}

	public Input checked(final boolean checked) {
		if (checked) {
			this.addProperty(new Property("checked", "checked"));
		} else {
			this.removeProperty("checked");
		}
		return this;
	}

	public Input disabled(final boolean disabled) {
		if (disabled) {
			this.addProperty(new Property("disabled", "disabled"));
		} else {
			this.removeProperty("disabled");
		}
		return this;
	}

	public Input maxlength(final int maxlength) {
		this.addProperty(new Property("maxlength", String.valueOf(maxlength)));
		return this;
	}

	public Input name(final String name) {
		this.addProperty(new Property("name", name));
		return this;
	}

	public Input readonly(final boolean readonly) {
		if (readonly) {
			this.addProperty(new Property("readonly", "readonly"));
		} else {
			this.removeProperty("readonly");
		}
		return this;
	}

	public Input size(final int size) {
		this.addProperty(new Property("size", String.valueOf(size)));
		return this;
	}

	public Input value(final String value) {
		this.addProperty(new Property("value", value));
		return this;
	}

	public HTMLComponent onblur(final String func) {
		this.addProperty(EventProperty.onblur(func));
		return this;
	}

	@Override
	public HTMLComponent onchange(final String func) {
		this.addProperty(EventProperty.onchange(func));
		return this;
	}

	public HTMLComponent onfocus(final String func) {
		this.addProperty(EventProperty.onfocus(func));
		return this;
	}

	public HTMLComponent onselect(final String func) {
		this.addProperty(EventProperty.onselect(func));
		return this;
	}
}