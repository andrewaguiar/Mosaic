package br.org.mosaic.tags.form;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.EventProperty;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Textarea extends HTMLComponent {
	public Textarea(int cols, int rows) {
		cols(cols);
		rows(rows);
	}

	@Override
	public String tagName() {
		return "textarea";
	}

	public Textarea readonly(boolean readonly) {
		if (readonly) {
			addProperty(new Property("readonly", "readonly"));
		} else {
			removeProperty("readonly");
		}
		return this;
	}

	public Textarea rows(int rows) {
		addProperty(new Property("rows", String.valueOf(rows)));
		return this;
	}

	public Textarea cols(int cols) {
		addProperty(new Property("cols", String.valueOf(cols)));
		return this;
	}

	public Textarea disabled(boolean disabled) {
		if (disabled) {
			addProperty(new Property("disabled", "disabled"));
		} else {
			removeProperty("disabled");
		}
		return this;
	}

	public Textarea name(String name) {
		addProperty(new Property("name", name));
		return this;
	}

	public HTMLComponent onblur(String func) {
		addProperty(EventProperty.onblur(func));
		return this;
	}

	public HTMLComponent onchange(String func) {
		addProperty(EventProperty.onchange(func));
		return this;
	}

	public HTMLComponent onfocus(String func) {
		addProperty(EventProperty.onfocus(func));
		return this;
	}

	public HTMLComponent onselect(String func) {
		addProperty(EventProperty.onselect(func));
		return this;
	}
}