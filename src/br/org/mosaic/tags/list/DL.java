package br.org.mosaic.tags.list;

import br.org.mosaic.HTMLComponent;

/**
 * @author andrew
 */
public class DL extends HTMLComponent {
	@Override
	public String tagName() {
		return "dl";
	}

	public DL item(DT dt, DD dd) {
		add(dt, dd);
		return this;
	}
}