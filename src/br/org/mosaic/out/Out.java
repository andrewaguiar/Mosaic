package br.org.mosaic.out;

import java.io.IOException;

/** Represents the Out of the html script.
 * @see StringBuilderOut
 * @see OutputStreamOut
 * @author andrew */
public interface Out 
{
	void write(String c) throws IOException;
}