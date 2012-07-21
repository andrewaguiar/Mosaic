package br.org.mosaic.tags.frame;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Frame extends HTMLComponent {
	public enum Scrolling {
		YES, NO, AUTO
	}

	@Override
	public String tagName() {
		return "frame";
	}

	public Frame frameborder(boolean frameborder) {
		if (frameborder) {
			addProperty(new Property("frameborder", "1"));
		} else {
			addProperty(new Property("frameborder", "0"));
		}
		return this;
	}

	public Frame longdesc(String longdesc) {
		addProperty(new Property("longdesc", longdesc));
		return this;
	}

	public Frame marginheight(int marginheight) {
		addProperty(new Property("marginheight", String.valueOf(marginheight)));
		return this;
	}

	public Frame marginwidth(int marginwidth) {
		addProperty(new Property("marginwidth", String.valueOf(marginwidth)));
		return this;
	}

	public Frame name(String name) {
		addProperty(new Property("name", name));
		return this;
	}

	public Frame noresize(boolean noresize) {
		if (noresize) {
			addProperty(new Property("noresize", "noresize"));
		}
		return this;
	}

	public Frame scrolling(Scrolling scrolling) {
		addProperty(new Property("scrolling", scrolling.name().toLowerCase()));
		return this;
	}

	public Frame src(String src) {
		addProperty(new Property("src", src));
		return this;
	}
}