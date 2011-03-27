package br.org.mosaic.tags.table;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Table extends HTMLComponent {
	public enum Frame {
		VOID, ABOVE, BELOW, HSIDES, LHS, RHS, VSIDES, BOX, BORDER
	}

	public enum Rule {
		NONE, GROUPS, ROWS, COLS, ALL
	}

	public Table thead(THead... t) {
		add(t);
		return this;
	}

	public Table tbody(TBody... t) {
		add(t);
		return this;
	}

	public Table tfoot(TFoot... t) {
		add(t);
		return this;
	}

	@Override
	public String tagName() {
		return "table";
	}

	public Table width(String width) {
		addProperty(new Property("width", width));
		return this;
	}

	public Table summary(String summary) {
		addProperty(new Property("summary", summary));
		return this;
	}

	public Table frame(Frame frame) {
		addProperty(new Property("summary", frame.name().toLowerCase()));
		return this;
	}

	public Table rules(Rule rules) {
		addProperty(new Property("rules", rules.name().toLowerCase()));
		return this;
	}

	public Table border(int border) {
		addProperty(new Property("border", String.valueOf(border)));
		return this;
	}

	public Table cellpadding(int cellpadding) {
		addProperty(new Property("cellpadding", String.valueOf(cellpadding)));
		return this;
	}

	public Table cellspacing(int cellspacing) {
		addProperty(new Property("cellspacing", String.valueOf(cellspacing)));
		return this;
	}
}