package br.org.mosaic.tags.page;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.EventProperty;

/**
 * @author andrew
 */
public class Body extends HTMLComponent {
	@Override
	public String tagName() {
		return "body";
	}

	public Body onload(String func) {
		addProperty(new EventProperty("onload", func));
		return this;
	}

	public Body onunload(String func) {
		addProperty(new EventProperty("onunload", func));
		return this;
	}
}