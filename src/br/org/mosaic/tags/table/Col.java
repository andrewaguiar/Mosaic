package br.org.mosaic.tags.table;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Col extends HTMLComponent {
	@Override
	public String tagName() {
		return "col";
	}

	public Col align(Align align) {
		addProperty(new Property("align", align.name().toLowerCase()));
		return this;
	}

	public Col char_(char c) {
		addProperty(new Property("char", new String(new char[] { c })));
		return this;
	}

	public Col charoff(int charoff) {
		addProperty(new Property("charoff", String.valueOf(charoff)));
		return this;
	}

	public Col valign(VerticalAlign valign) {
		addProperty(new Property("valign", valign.name().toLowerCase()));
		return this;
	}

	public Col width(String width) {
		addProperty(new Property("width", width));
		return this;
	}

	public Col span(int span) {
		addProperty(new Property("span", String.valueOf(span)));
		return this;
	}
}