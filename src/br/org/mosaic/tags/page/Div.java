package br.org.mosaic.tags.page;

import br.org.mosaic.HTMLCompleteTag;
import br.org.mosaic.HTMLComponent;

/**
 * @author andrew
 */
public class Div extends HTMLComponent implements HTMLCompleteTag {
	@Override
	public String tagName() {
		return "div";
	}
}