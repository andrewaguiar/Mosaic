package br.org.mosaic.tags.form;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HtmlInLineElement;

/**
 * @author andrew
 */
public class Legend extends HTMLComponent implements HtmlInLineElement {
	public Legend(String text) {
		text(text);
	}

	@Override
	public String tagName() {
		return "legend";
	}
}