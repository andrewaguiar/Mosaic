package br.org.mosaic.tags.image;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Map extends HTMLComponent {
	private String	name;

	public Map(String name) {
		addProperty(new Property("name", (this.name = name)));
	}

	@Override
	public String tagName() {
		return "map";
	}

	public Map areas(Area... os) {
		add(os);
		return this;
	}

	public String getName() {
		return name;
	}
}