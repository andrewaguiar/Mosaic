package br.org.mosaic.tags.image;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HTMLUtil;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Area extends HTMLComponent {
	public enum Shape {
		DEFAULT, RECT, CIRCLE, POLY
	}

	@Override
	public String tagName() {
		return "area";
	}

	public Area alt(String alt) {
		addProperty(new Property("alt", alt));
		return this;
	}

	public Area coords(int... coords) {
		addProperty(new Property("coords", HTMLUtil.createCoords(coords)));
		return this;
	}

	public Area href(String href) {
		addProperty(new Property("href", href));
		return this;
	}

	public Area nohref(boolean b) {
		if (b) {
			addProperty(new Property("nohref", "nohref"));
		}
		return this;
	}

	public Area shape(Shape shape) {
		addProperty(new Property("shape", shape.name().toLowerCase()));
		return this;
	}

	public Area target(String target) {
		addProperty(new Property("target", target));
		return this;
	}
}