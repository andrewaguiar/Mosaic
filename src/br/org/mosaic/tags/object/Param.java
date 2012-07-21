package br.org.mosaic.tags.object;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Param extends HTMLComponent {
	public enum ValueType {
		DATA, REF, OBJECT
	}

	@Override
	public String tagName() {
		return "param";
	}

	public Param name(String name) {
		addProperty(new Property("name", name));
		return this;
	}

	public Param type(String type) {
		addProperty(new Property("type", type));
		return this;
	}

	public Param value(String value) {
		addProperty(new Property("value", value));
		return this;
	}

	public Param valuetype(ValueType valuetype) {
		addProperty(new Property("valuetype", valuetype.name().toLowerCase()));
		return this;
	}
}