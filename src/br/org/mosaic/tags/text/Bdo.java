package br.org.mosaic.tags.text;

import br.org.mosaic.Dir;
import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HtmlInLineElement;

/**
 * @author andrew
 */
public class Bdo extends HTMLComponent implements HtmlInLineElement {
	@Override
	public String tagName() {
		return "bdo";
	}

	@Override
	public Bdo dir(Dir dir) {
		return (Bdo) super.dir(dir);
	}
}