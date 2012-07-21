package br.org.mosaic.tags.image;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Img extends HTMLComponent {
	@Override
	public String tagName() {
		return "img";
	}

	public Img src(final String src) {
		this.addProperty(new Property("src", src));
		return this;
	}

	public Img alt(final String alt) {
		this.addProperty(new Property("alt", alt));
		return this;
	}

	public Img height(final String height) {
		this.addProperty(new Property("height", height));
		return this;
	}

	public Img width(final String width) {
		this.addProperty(new Property("width", width));
		return this;
	}

	public Img ismap(final String ismap) {
		this.addProperty(new Property("ismap", ismap));
		return this;
	}

	public Img longdesc(final String longdesc) {
		this.addProperty(new Property("longdesc", longdesc));
		return this;
	}

	public Img usemap(final String usemap) {
		this.addProperty(new Property("usemap", "#" + usemap));
		return this;
	}

	public Img usemap(final Map map) {
		this.addProperty(new Property("usemap", "#" + map.getName()));
		return this;
	}
}