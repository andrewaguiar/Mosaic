package br.org.mosaic.tags.form;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Form extends HTMLComponent {
	public enum Method {
		POST, GET
	}

	public enum EncType {
		APPLICATION_X_WWW_FORM_URLENCODED("application/x-www-form-urlencoded"), MULTIPART_FORM_DATA("multipart/form-data"), TEXT_PLAIN("text/plain");

		private String	value;

		private EncType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	@Override
	public String tagName() {
		return "form";
	}

	public Form action(String action) {
		addProperty(new Property("action", action));
		return this;
	}

	public Form accept(String accept) {
		addProperty(new Property("accept", accept));
		return this;
	}

	public Form acceptcharset(String acceptcharset) {
		addProperty(new Property("accept-charset", acceptcharset));
		return this;
	}

	public Form enctype(EncType enctype) {
		addProperty(new Property("accept", enctype.getValue()));
		return this;
	}

	public Form method(Method method) {
		addProperty(new Property("method", method.name().toLowerCase()));
		return this;
	}

	public Form name(String name) {
		addProperty(new Property("name", name));
		return this;
	}

	public Form target(String target) {
		addProperty(new Property("target", target));
		return this;
	}
}