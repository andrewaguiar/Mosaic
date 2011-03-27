package br.org.mosaic.out;

public class StringBuilderOut implements Out {
	private StringBuilder	stringbuilder;

	public StringBuilderOut() {
		stringbuilder = new StringBuilder();
	}

	@Override
	public void write(String c) {
		stringbuilder.append(c);
	}

	@Override
	public String toString() {
		return stringbuilder.toString();
	}
}