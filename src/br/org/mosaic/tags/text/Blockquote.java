package br.org.mosaic.tags.text;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Blockquote extends HTMLComponent {
	@Override
	public String tagName() {
		return "blockquote";
	}

	public Blockquote cite(String url) {
		addProperty(new Property("cite", url));
		return this;
	}
}