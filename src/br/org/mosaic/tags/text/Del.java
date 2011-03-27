package br.org.mosaic.tags.text;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.org.mosaic.HTMLComponent;
import br.org.mosaic.HtmlInLineElement;
import br.org.mosaic.properties.Property;

/**
 * @author andrew
 */
public class Del extends HTMLComponent implements HtmlInLineElement {
	@Override
	public String tagName() {
		return "del";
	}

	public Del cite(String url) {
		addProperty(new Property("cite", url));
		return this;
	}

	public Del datetime(Date date) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZZZZ");
		addProperty(new Property("datetime", f.format(date)));
		return this;
	}
}