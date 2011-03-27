package br.org.mosaic;

import java.io.IOException;

import br.org.mosaic.out.Out;

/**
 * @author andrew
 */
public interface HTMLElement 
{
	void draw(Out out, int level, boolean indented) throws IOException;
}