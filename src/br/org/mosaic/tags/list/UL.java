package br.org.mosaic.tags.list;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HTMLElement;
import br.org.mosaic.tags.TextElement;

/**
 * @author andrew
 */
public class UL extends HTMLComponent {
	@Override
	public String tagName() {
		return "ul";
	}

	public UL li(Object... os) {
		for (Object o : os) {
			if (o instanceof HTMLElement) {
				add(new LI().add((HTMLElement) o));
			} else if (o instanceof String) {
				add(new LI().add(new TextElement((String) o)));
			} else {
				throw new IllegalArgumentException("You tried to add a '" + (o != null ? o.getClass().getName() : "null") + "', you cannot add anything but String or HTMLElement");
			}
		}
		return this;
	}
}