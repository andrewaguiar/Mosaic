package br.org.mosaic.tags.form;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Label extends HTMLComponent {
	public Label(final String text) {
		this.text(text);
	}

	@Override
	public String tagName() {
		return "label";
	}

	public Label for_(final String for_) {
		this.addProperty(new Property("for", for_));
		return this;
	}
}