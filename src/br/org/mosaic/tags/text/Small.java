package br.org.mosaic.tags.text;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HtmlInLineElement;

/**
 * @author andrew
 */
public class Small extends HTMLComponent implements HtmlInLineElement {
	@Override
	public String tagName() {
		return "small";
	}
}