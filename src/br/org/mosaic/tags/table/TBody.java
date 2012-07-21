package br.org.mosaic.tags.table;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class TBody extends HTMLComponent {
	@Override
	public String tagName() {
		return "tbody";
	}

	public TBody trs(TR... trs) {
		add(trs);
		return this;
	}

	public TBody align(Align align) {
		addProperty(new Property("align", align.name().toLowerCase()));
		return this;
	}

	public TBody char_(char c) {
		addProperty(new Property("char", new String(new char[] { c })));
		return this;
	}

	public TBody charoff(int charoff) {
		addProperty(new Property("charoff", String.valueOf(charoff)));
		return this;
	}

	public TBody valign(VerticalAlign valign) {
		addProperty(new Property("valign", valign.name().toLowerCase()));
		return this;
	}
}