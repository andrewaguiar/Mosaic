package br.org.mosaic.tags.table;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HTMLUtil;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class TH extends HTMLComponent {
	@Override
	public String tagName() {
		return "th";
	}

	public TH abbr(String abbr) {
		addProperty(new Property("abbr", abbr));
		return this;
	}

	public TH axis(String axis) {
		addProperty(new Property("axis", axis));
		return this;
	}

	public TH align(Align align) {
		addProperty(new Property("align", align.name().toLowerCase()));
		return this;
	}

	public TH char_(char c) {
		addProperty(new Property("char", new String(new char[] { c })));
		return this;
	}

	public TH charoff(int charoff) {
		addProperty(new Property("charoff", String.valueOf(charoff)));
		return this;
	}

	public TH valign(VerticalAlign valign) {
		addProperty(new Property("valign", valign.name().toLowerCase()));
		return this;
	}

	public TH colspan(int colspan) {
		addProperty(new Property("colspan", String.valueOf(colspan)));
		return this;
	}

	public TH rowspan(int rowspan) {
		addProperty(new Property("rowspan", String.valueOf(rowspan)));
		return this;
	}

	public TH scope(Scope scope) {
		addProperty(new Property("scope", scope.name().toLowerCase()));
		return this;
	}

	public TH headers(String... headersIds) {
		addProperty(new Property("scope", HTMLUtil.createList(headersIds, " ")));
		return this;
	}
}