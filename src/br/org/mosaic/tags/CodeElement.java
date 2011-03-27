package br.org.mosaic.tags;

import java.io.IOException;

import br.org.mosaic.HTMLElement;
import br.org.mosaic.HTMLUtil;
import br.org.mosaic.out.Out;

/** Representa um código em geral.
 * @author andrew */
public class CodeElement implements HTMLElement {
	private String[]	lines;

	public CodeElement(String... lines) {
		this.lines = lines;
	}

	@Override
	public void draw(Out out, int level, boolean indented) throws IOException {
		for (String line : lines) {
			out.write(indented ? HTMLUtil.createLevel(level) : "");
			if (!indented) {
				line = HTMLUtil.ltrim(line);
			}
			out.write(line);
		}
	}
}