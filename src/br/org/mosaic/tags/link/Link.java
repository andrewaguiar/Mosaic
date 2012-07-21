package br.org.mosaic.tags.link;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;
import br.org.mosaic.tags.page.Media;
import br.org.mosaic.tags.text.RelationBetween;

/**
 * @author andrew
 */
public class Link extends HTMLComponent {
	@Override
	public String tagName() {
		return "link";
	}

	public Link charset(String charset) {
		addProperty(new Property("charset", charset));
		return this;
	}

	public Link href(String href) {
		addProperty(new Property("href", href));
		return this;
	}

	public Link hreflang(String hreflang) {
		addProperty(new Property("hreflang", hreflang));
		return this;
	}

	public Link media(Media media) {
		addProperty(new Property("media", media.name().toLowerCase()));
		return this;
	}

	public Link rev(RelationBetween r) {
		addProperty(new Property("rev", r.name().toLowerCase()));
		return this;
	}

	public Link rel(RelationBetween r) {
		addProperty(new Property("rel", r.name().toLowerCase()));
		return this;
	}

	public Link target(String target) {
		addProperty(new Property("target", target));
		return this;
	}

	public Link type(String type) {
		addProperty(new Property("type", type));
		return this;
	}
}