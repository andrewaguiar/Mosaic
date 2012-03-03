package br.org.mosaic.properties;

/** A Style property of HTML tag
 * @author andrew */
public class StyleProperty extends Property {

	public StyleProperty(final String... value) {
		super("style", StyleProperty.formatValue(value));
	}

	public static String formatValue(final String... ss) {
		final StringBuilder sb = new StringBuilder();
		for (final String s : ss) {
			final String name = s.substring(0, s.indexOf(':')).trim();
			final String value = s.substring(s.indexOf(':') + 1, s.length()).trim();
			sb.append(name);
			sb.append(':');
			sb.append(value);
			sb.append(';');
		}
		return sb.toString();
	}

	public static String style(final StyleName property, final String value) {
		return new StringBuilder().append(property.getName()).append(":").append(value).toString() + "@";
	}
}