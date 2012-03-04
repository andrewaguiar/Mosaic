package br.org.mosaic.tags.form;

import java.io.IOException;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HtmlInLineElement;
import br.org.mosaic.out.Out;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Label extends HTMLComponent implements HtmlInLineElement {
	public Label(final String text) {
		this.text(text);
	}

	@Override
	public String tagName() {
		return "label";
	}

	public Label for_(final String for_) {
		this.addProperty(new Property("for", for_));
		return this;
	}

	@Override
	public void draw(final Out out, final int level, final boolean indented) throws IOException {
		super.draw(out, level, indented);
	}
}