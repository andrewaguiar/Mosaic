package br.org.mosaic.tags.page;

import br.org.mosaic.HTMLCompleteTag;
import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;
import br.org.mosaic.tags.CodeElement;

/**
 * @author andrew
 */
public class Script extends HTMLComponent implements HTMLCompleteTag {
	public Script() {
		this("text/javascript");
	}

	public Script(final String type) {
		this.addProperty(new Property("type", type));
	}

	@Override
	public String tagName() {
		return "script";
	}

	public Script charset(final String charset) {
		this.addProperty(new Property("charset", charset));
		return this;
	}

	public Script src(final String src) {
		this.addProperty(new Property("src", src));
		return this;
	}

	public Script defer(final boolean d) {
		if (d) {
			this.addProperty(new Property("defer", "defer"));
		} else {
			this.removeProperty("defer");
		}
		return this;
	}

	public Script code(final String... lines) {
		this.add(new CodeElement(lines));
		return this;
	}
}