package br.org.mosaic.tags.frame;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HTMLUtil;
import br.org.mosaic.properties.EventProperty;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Frameset extends HTMLComponent {
	@Override
	public String tagName() {
		return "frameset";
	}

	public Frameset cols(String... cols) {
		addProperty(new Property("cols", HTMLUtil.createList(cols, ",")));
		return this;
	}

	public Frameset rows(String... rows) {
		addProperty(new Property("rows", HTMLUtil.createList(rows, ",")));
		return this;
	}

	public Frameset onload(String func) {
		addProperty(new EventProperty("onload", func));
		return this;
	}

	public Frameset onunload(String func) {
		addProperty(new EventProperty("onunload", func));
		return this;
	}
}