package br.org.mosaic.out;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamOut implements Out {
	private OutputStream out;

	public OutputStreamOut(OutputStream out) {
		this.out = out;
	}

	@Override
	public void write(String s) throws IOException {
		out.write( s.getBytes() );
	}
}