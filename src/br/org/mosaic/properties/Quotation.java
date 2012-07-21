package br.org.mosaic.properties;

public enum Quotation 
{
	SINGLE("'", "\\'"),
	DOUBLE("\"", "\\\"");

	private String q;
	private String fixedValueQ;

	private Quotation(String q, String fixedValueQ) {
		this.q = q;
		this.fixedValueQ = fixedValueQ;
	}

	public String getQ() {
		return q;
	}

	public CharSequence getFixedValueQ() {
		return fixedValueQ;
	}
}