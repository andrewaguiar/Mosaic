package br.org.mosaic.tags.page;

import br.org.mosaic.HTMLComponent;

public class DocType extends HTMLComponent {
	public static final DocType	STRICT	= new DocType("!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\n\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"");
	private final String		content;

	public DocType(final String content) {
		this.content = content;
	}

	@Override
	public String tagName() {
		return this.content;
	}
}