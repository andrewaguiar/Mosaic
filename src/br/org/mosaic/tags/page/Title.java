package br.org.mosaic.tags.page;

import br.org.mosaic.HTMLComponent;

/**
 * @author andrew
 */
public class Title extends HTMLComponent {
	public Title(String text) {
		text(text);
	}

	@Override
	public String tagName() {
		return "title";
	}
}