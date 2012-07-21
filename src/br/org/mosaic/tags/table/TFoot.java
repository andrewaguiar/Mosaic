package br.org.mosaic.tags.table;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class TFoot extends HTMLComponent {
	@Override
	public String tagName() {
		return "tfoot";
	}

	public TFoot trs(TR... trs) {
		add(trs);
		return this;
	}

	public TFoot align(Align align) {
		addProperty(new Property("align", align.name().toLowerCase()));
		return this;
	}

	public TFoot char_(char c) {
		addProperty(new Property("char", new String(new char[] { c })));
		return this;
	}

	public TFoot charoff(int charoff) {
		addProperty(new Property("charoff", String.valueOf(charoff)));
		return this;
	}

	public TFoot valign(VerticalAlign valign) {
		addProperty(new Property("valign", valign.name().toLowerCase()));
		return this;
	}
}