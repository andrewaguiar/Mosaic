package br.org.mosaic.tags.table;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class TR extends HTMLComponent {
	@Override
	public String tagName() {
		return "tr";
	}

	public TR tds(TD... tds) {
		add(tds);
		return this;
	}

	public TR align(Align align) {
		addProperty(new Property("align", align.name().toLowerCase()));
		return this;
	}

	public TR char_(char c) {
		addProperty(new Property("char", new String(new char[] { c })));
		return this;
	}

	public TR charoff(int charoff) {
		addProperty(new Property("charoff", String.valueOf(charoff)));
		return this;
	}

	public TR valign(VerticalAlign valign) {
		addProperty(new Property("valign", valign.name().toLowerCase()));
		return this;
	}
}