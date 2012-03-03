package br.org.mosaic.properties;

/** A property of HTML tag
 * @author andrew */
public class Property {
	private final String name;
	private final String value;
	private Quotation quotation = Quotation.SINGLE;

	public Property(final String name, final String value) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("you cannot create a unamed property");
		}
		this.name = name;
		this.value = value;
	}

	public void setQuotation(final Quotation quotation) {
		this.quotation = quotation;
	}

	@Override
	public String toString() {
		return String.format("%s=%s%s%s", this.name, this.quotation.getQ(), this.t(this.value), this.quotation.getQ());
	}

	private String t(final String s) {
		if (s == null) {
			return "";
		}
		return s.contains(this.quotation.getQ()) ? s.replace(this.quotation.getQ(), this.quotation.getFixedValueQ()) : s;
	}

	public static String toString(final Quotation quotation, final Property... ps) {
		final StringBuilder s = new StringBuilder();
		for (final Property p : ps) {
			p.setQuotation(quotation);
			s.append(' ');
			s.append(p);
		}
		if (ps.length > 0) {
			s.append(' ');
		}
		return s.toString();
	}

	public String getName() {
		return this.name;
	}

	public String getValue() {
		return this.value;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null || !(obj instanceof Property)) {
			return false;
		}
		return ((Property) obj).name.equals(this.name);
	}
}