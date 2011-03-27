package br.org.mosaic.tags.page;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;
import br.org.mosaic.tags.CSSCodeElement;

/**
 * @author andrew
 */
public class Style extends HTMLComponent {
	public Style() {
		this("text/css");
	}

	public Style(String type) {
		addProperty(new Property("type", type));
	}

	@Override
	public String tagName() {
		return "style";
	}

	public Style media(Media media) {
		addProperty(new Property("media", media.name().toLowerCase()));
		return this;
	}

	public Style code(String... lines) {
		add(new CSSCodeElement(lines));
		return this;
	}
}