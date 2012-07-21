package br.org.mosaic.tags.text;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HtmlInLineElement;

/**
 * @author andrew
 */
public class H extends HTMLComponent implements HtmlInLineElement {
	public enum Level {
		H1, H2, H3, H4, H5, H6
	};

	private Level	level;

	public H(Level level) {
		this.level = level;
	}

	@Override
	public String tagName() {
		return level.name().toLowerCase();
	}
}