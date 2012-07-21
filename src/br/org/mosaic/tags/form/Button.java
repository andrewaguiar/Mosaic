package br.org.mosaic.tags.form;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.EventProperty;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Button extends HTMLComponent {
	public enum Type {
		BUTTON, RESET, SUBMIT
	}

	@Override
	public String tagName() {
		return "button";
	}

	public Button disabled(boolean disabled) {
		if (disabled) {
			addProperty(new Property("disabled", "disabled"));
		}
		return this;
	}

	public Button name(String name) {
		addProperty(new Property("name", name));
		return this;
	}

	public Button value(String value) {
		addProperty(new Property("value", value));
		return this;
	}

	public Button type(Type type) {
		addProperty(new Property("type", type.name().toLowerCase()));
		return this;
	}

	public HTMLComponent onblur(String func) {
		addProperty(EventProperty.onblur(func));
		return this;
	}

	public HTMLComponent onfocus(String func) {
		addProperty(EventProperty.onfocus(func));
		return this;
	}
}