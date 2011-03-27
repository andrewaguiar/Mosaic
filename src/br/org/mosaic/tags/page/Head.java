package br.org.mosaic.tags.page;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;
import br.org.mosaic.tags.link.Link;

/**
 * @author andrew
 */
public class Head extends HTMLComponent {
	@Override
	public String tagName() {
		return "head";
	}

	public Head profile(String profile) {
		addProperty(new Property("profile", profile));
		return this;
	}

	public Head addTitle(String title) {
		add(new Title(title));
		return this;
	}

	public Head addMetas(Meta... metas) {
		add(metas);
		return this;
	}

	public Head addScripts(Script... scripts) {
		add(scripts);
		return this;
	}

	public Head addStyles(Style... styles) {
		add(styles);
		return this;
	}

	public Head addLinks(Link... links) {
		add(links);
		return this;
	}

	public Head addBases(Base... bases) {
		add(bases);
		return this;
	}
}