package br.org.mosaic.tags.object;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class EmbeddedObject extends HTMLComponent {
	@Override
	public String tagName() {
		return "object";
	}

	public EmbeddedObject archive(String archive) {
		addProperty(new Property("archive", archive));
		return this;
	}

	public EmbeddedObject border(int border) {
		addProperty(new Property("border", String.valueOf(border)));
		return this;
	}

	public EmbeddedObject classid(String classid) {
		addProperty(new Property("classid", classid));
		return this;
	}

	public EmbeddedObject codebase(String codebase) {
		addProperty(new Property("codebase", codebase));
		return this;
	}

	public EmbeddedObject codetype(String codetype) {
		addProperty(new Property("codetype", codetype));
		return this;
	}

	public EmbeddedObject data(String data) {
		addProperty(new Property("data", data));
		return this;
	}

	public EmbeddedObject declare(boolean d) {
		if (d) {
			addProperty(new Property("declare", "declare"));
		}
		return this;
	}

	public EmbeddedObject height(int height) {
		addProperty(new Property("height", String.valueOf(height)));
		return this;
	}

	public EmbeddedObject hspace(int hspace) {
		addProperty(new Property("hspace", String.valueOf(hspace)));
		return this;
	}

	public EmbeddedObject name(String name) {
		addProperty(new Property("name", name));
		return this;
	}

	public EmbeddedObject standby(String standby) {
		addProperty(new Property("standby", standby));
		return this;
	}

	public EmbeddedObject type(String type) {
		addProperty(new Property("type", type));
		return this;
	}

	public EmbeddedObject usemap(String usemap) {
		addProperty(new Property("usemap", usemap));
		return this;
	}

	public EmbeddedObject vspace(int vspace) {
		addProperty(new Property("vspace", String.valueOf(vspace)));
		return this;
	}

	public EmbeddedObject width(int width) {
		addProperty(new Property("width", String.valueOf(width)));
		return this;
	}

	public EmbeddedObject params(Param... params) {
		add(params);
		return this;
	}
}