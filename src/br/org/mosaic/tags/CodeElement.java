package br.org.mosaic.tags;

import java.io.IOException;

import br.org.mosaic.HTMLElement;
import br.org.mosaic.HTMLUtil;
import br.org.mosaic.out.Out;
import br.org.mosaic.out.StringBuilderOut;

/** Representa um código em geral.
 * @author andrew */
public class CodeElement implements HTMLElement {
	private String[]	lines;
	private boolean indented;

	public void setIndented(boolean indented) {
		this.indented = indented;
	}
	
	public CodeElement(String... lines) {
		this.lines = lines;
	}

	@Override
	public void draw(Out out, int level, boolean indented) throws IOException {
		for (String line : lines) {
			if(line == null){
				continue;
			}
			out.write(indented ? HTMLUtil.createLevel(level) : "");
			if (!indented) {
				line = line.trim();
			}
			out.write(line);
		}
	}

	@Override
	public String toString() {
		final StringBuilderOut out = new StringBuilderOut();
		try {
			this.draw(out, 0, this.indented);
		} catch (IOException e) {
			// Should'nt raise IOException thus StringBuilderOut does not do
			throw new RuntimeException(e.toString(), e);
		}
		return out.toString();
	}
}