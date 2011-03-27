package br.org.mosaic.tags.page;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Base extends HTMLComponent {
	@Override
	public String tagName() {
		return "base";
	}

	public Base href(String href) {
		addProperty(new Property("href", href));
		return this;
	}

	public Base target(String target) {
		addProperty(new Property("target", target));
		return this;
	}
}