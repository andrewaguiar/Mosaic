package br.org.mosaic;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import br.org.mosaic.out.Out;
import br.org.mosaic.out.StringBuilderOut;

/** @author andrew */
public class HTMLComponentCollection implements HTMLElement {
	private final List<HTMLElement>	elements	= new LinkedList<HTMLElement>();
	private boolean					indented;

	public void setIndented(final boolean indented) {
		this.indented = indented;
	}

	public HTMLComponentCollection() {
	}

	public static HTMLComponentCollection create(final HTMLElement... elements) {
		return new HTMLComponentCollection().add(elements);
	}

	public HTMLComponentCollection add(final HTMLElement... elements) {
		for (final HTMLElement element : elements) {
			this.elements.add(element);
		}
		return this;
	}

	@Override
	public void draw(final Out out, final int level, final boolean indented) throws IOException {
		for (final HTMLElement element : this.elements) {
			element.draw(out, level, indented);
		}
	}

	@Override
	public String toString() {
		final StringBuilderOut out = new StringBuilderOut();
		try {
			this.draw(out, 0, this.indented);
		} catch (IOException e) {
			// Should'nt raise IOException thus StringBuilderOut does not do
			throw new RuntimeException(e.toString(), e);
		}
		return out.toString();
	}
}