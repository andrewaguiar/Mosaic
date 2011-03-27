package br.org.mosaic.tags.table;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class THead extends HTMLComponent {
	@Override
	public String tagName() {
		return "thead";
	}

	public THead trs(TR... trs) {
		add(trs);
		return this;
	}

	public THead align(Align align) {
		addProperty(new Property("align", align.name().toLowerCase()));
		return this;
	}

	public THead char_(char c) {
		addProperty(new Property("char", new String(new char[] { c })));
		return this;
	}

	public THead charoff(int charoff) {
		addProperty(new Property("charoff", String.valueOf(charoff)));
		return this;
	}

	public THead valign(VerticalAlign valign) {
		addProperty(new Property("valign", valign.name().toLowerCase()));
		return this;
	}
}