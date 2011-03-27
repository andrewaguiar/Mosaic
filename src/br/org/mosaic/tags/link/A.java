package br.org.mosaic.tags.link;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HTMLUtil;
import br.org.mosaic.HtmlInLineElement;
import br.org.mosaic.properties.Property;
import br.org.mosaic.tags.image.Area.Shape;
import br.org.mosaic.tags.text.RelationBetween;

/**
 * @author andrew
 */
public class A extends HTMLComponent implements HtmlInLineElement {
	@Override
	public String tagName() {
		return "a";
	}

	public A href(String href) {
		addProperty(new Property("href", href));
		return this;
	}

	public A charset(String charset) {
		addProperty(new Property("charset", charset));
		return this;
	}

	public A hreflang(String hreflang) {
		addProperty(new Property("hreflang", hreflang));
		return this;
	}

	public A target(String target) {
		addProperty(new Property("target", target));
		return this;
	}

	public A framename(String framename) {
		addProperty(new Property("framename", framename));
		return this;
	}

	public A coords(int... coords) {
		addProperty(new Property("coords", HTMLUtil.createCoords(coords)));
		return this;
	}

	public A shape(Shape shape) {
		addProperty(new Property("shape", shape.name().toLowerCase()));
		return this;
	}

	public A rev(RelationBetween r) {
		addProperty(new Property("rev", r.name().toLowerCase()));
		return this;
	}

	public A rel(RelationBetween r) {
		addProperty(new Property("rel", r.name().toLowerCase()));
		return this;
	}
}