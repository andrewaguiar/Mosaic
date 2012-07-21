package br.org.mosaic.tags.text;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HtmlInLineElement;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Ins extends HTMLComponent implements HtmlInLineElement {
	@Override
	public String tagName() {
		return "ins";
	}

	public Ins cite(String url) {
		addProperty(new Property("cite", url));
		return this;
	}

	public Ins datetime(Date date) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZZZZ");
		addProperty(new Property("datetime", f.format(date)));
		return this;
	}
}