package br.org.mosaic.tags.table;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class TD extends HTMLComponent {
	@Override
	public String tagName() {
		return "td";
	}

	public TD abbr(String abbr) {
		addProperty(new Property("abbr", abbr));
		return this;
	}

	public TD axis(String axis) {
		addProperty(new Property("axis", axis));
		return this;
	}

	public TD align(Align align) {
		addProperty(new Property("align", align.name().toLowerCase()));
		return this;
	}

	public TD char_(char c) {
		addProperty(new Property("char", new String(new char[] { c })));
		return this;
	}

	public TD charoff(int charoff) {
		addProperty(new Property("charoff", String.valueOf(charoff)));
		return this;
	}

	public TD valign(VerticalAlign valign) {
		addProperty(new Property("valign", valign.name().toLowerCase()));
		return this;
	}

	public TD colspan(int colspan) {
		addProperty(new Property("colspan", String.valueOf(colspan)));
		return this;
	}

	public TD rowspan(int rowspan) {
		addProperty(new Property("rowspan", String.valueOf(rowspan)));
		return this;
	}

	public TD scope(Scope scope) {
		addProperty(new Property("scope", scope.name().toLowerCase()));
		return this;
	}
}