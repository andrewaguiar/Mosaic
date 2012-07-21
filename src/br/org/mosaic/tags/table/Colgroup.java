package br.org.mosaic.tags.table;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Colgroup extends HTMLComponent {
	@Override
	public String tagName() {
		return "colgroup";
	}

	public Colgroup align(Align align) {
		addProperty(new Property("align", align.name().toLowerCase()));
		return this;
	}

	public Colgroup char_(char c) {
		addProperty(new Property("char", new String(new char[] { c })));
		return this;
	}

	public Colgroup charoff(int charoff) {
		addProperty(new Property("charoff", String.valueOf(charoff)));
		return this;
	}

	public Colgroup valign(VerticalAlign valign) {
		addProperty(new Property("valign", valign.name().toLowerCase()));
		return this;
	}

	public Colgroup width(String width) {
		addProperty(new Property("width", width));
		return this;
	}

	public Colgroup span(int span) {
		addProperty(new Property("span", String.valueOf(span)));
		return this;
	}
}