package br.org.mosaic.tags.page;

import java.io.IOException;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.out.Out;

/**
 * @author andrew
 */
public class Html extends HTMLComponent {
	private final DocType	docType;

	public Html(final DocType docType) {
		this.docType = docType;
	}

	@Override
	public String tagName() {
		return "html";
	}

	@Override
	protected void printPreTag(final Out out) throws IOException {
		out.write(this.docType.toString());
		out.write("\n");
	}

	public Html head(final Head head) {
		this.add(head);
		return this;
	}

	public Html body(final Body body) {
		this.add(body);
		return this;
	}
}