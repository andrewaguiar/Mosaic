package br.org.mosaic.tags.frame;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;
import br.org.mosaic.tags.frame.Frame.Scrolling;

/**
 * @author andrew
 */
public class IFrame extends HTMLComponent {
	@Override
	public String tagName() {
		return "iframe";
	}

	public IFrame height(String height) {
		addProperty(new Property("height", height));
		return this;
	}

	public IFrame width(String width) {
		addProperty(new Property("width", width));
		return this;
	}

	public IFrame frameborder(boolean frameborder) {
		if (frameborder) {
			addProperty(new Property("frameborder", "1"));
		} else {
			addProperty(new Property("frameborder", "0"));
		}
		return this;
	}

	public IFrame longdesc(String longdesc) {
		addProperty(new Property("longdesc", longdesc));
		return this;
	}

	public IFrame marginheight(int marginheight) {
		addProperty(new Property("marginheight", String.valueOf(marginheight)));
		return this;
	}

	public IFrame marginwidth(int marginwidth) {
		addProperty(new Property("marginwidth", String.valueOf(marginwidth)));
		return this;
	}

	public IFrame name(String name) {
		addProperty(new Property("name", name));
		return this;
	}

	public IFrame scrolling(Scrolling scrolling) {
		addProperty(new Property("scrolling", scrolling.name().toLowerCase()));
		return this;
	}

	public IFrame src(String src) {
		addProperty(new Property("src", src));
		return this;
	}
}