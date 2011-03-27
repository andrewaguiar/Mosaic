package br.org.mosaic.tags.page;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Meta extends HTMLComponent {
	public enum MetaName {
		AUTHOR, DESCRIPTION, KEYWORDS, GENERATOR, REVISED, OTHERS
	}

	public enum HttpEquiv {
		CONTENT_TYPE, CONTENT_STYLE_TYPE, EXPIRES, REFRESH, SET_COOKIE, CONTENT_LANGUAGE
	}

	public Meta(final HttpEquiv httpEquiv, final String content) {
		this.httpequiv(httpEquiv).content(content);
	}

	public Meta(final MetaName name, final String content) {
		this.name(name).content(content);
	}

	@Override
	public String tagName() {
		return "meta";
	}

	public Meta content(final String content) {
		this.addProperty(new Property("content", content));
		return this;
	}

	public Meta httpequiv(final HttpEquiv httpequiv) {
		this.addProperty(new Property("http-equiv", httpequiv.name().toLowerCase().replace('_', '-')));
		return this;
	}

	public Meta name(final MetaName name) {
		this.addProperty(new Property("name", name.name().toLowerCase()));
		return this;
	}

	public Meta scheme(final String scheme) {
		this.addProperty(new Property("scheme", scheme));
		return this;
	}
}