package br.org.mosaic.properties;

/** A Style property of HTML tag
 * @author andrew */
public class StyleProperty extends Property {

	public StyleProperty(String... value) {
		super("style", formatValue(value));
	}

	public static String formatValue(String... ss) {
		StringBuilder sb = new StringBuilder();
		for (String s : ss) {
			String name = s.substring(0, s.indexOf(':')).trim();
			String value = s.substring(s.indexOf(':') + 1, s.length()).trim();
			sb.append(name);
			sb.append(':');
			sb.append(value);
			sb.append(';');
		}
		return sb.toString();
	}

	public static String style(StyleName property, String value) {
		return new StringBuilder().append( property.getName() ).append(":").append(value).toString();
	}
}