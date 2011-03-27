package br.org.mosaic.tags.form;

import br.org.mosaic.HTMLComponent;

/**
 * @author andrew
 */
public class Fieldset extends HTMLComponent {
	@Override
	public String tagName() {
		return "fieldset";
	}

	public Fieldset legend(String text) {
		add(new Legend(text));
		return this;
	}
}