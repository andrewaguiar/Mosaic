package br.org.mosaic.tags;

import java.io.IOException;

import br.org.mosaic.HTMLElement;
import br.org.mosaic.HTMLUtil;
import br.org.mosaic.HtmlInLineElement;
import br.org.mosaic.out.Out;

/** Representa um Texto dentro do elemento
 * @author andrew */
public class TextElement implements HTMLElement, HtmlInLineElement {
	private final String	text;

	public TextElement(final String text) {
		this.text = text;
	}

	@Override
	public void draw(final Out out, final int level, final boolean indented) throws IOException {
		out.write((indented ? HTMLUtil.createLevel(level) : "") + this.text);
	}
}
