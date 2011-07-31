package br.org.mosaic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import br.org.mosaic.out.Out;
import br.org.mosaic.out.StringBuilderOut;
import br.org.mosaic.properties.EventProperty;
import br.org.mosaic.properties.Property;
import br.org.mosaic.properties.Quotation;
import br.org.mosaic.properties.StyleProperty;
import br.org.mosaic.tags.TextElement;

/**
 * Define the base to all HTML tags. It follows a DSL programming style:
 * 
 * <pre>
 * new Table().id(&quot;table&quot;).addStyles(StyleProperty.BACKGROUND + &quot;:#FEFEFE&quot;).classes(&quot;report_table&quot;).add(
 * 		new THead().add(new TR().add(new TD().text(&quot;name&quot;), new TD().text(&quot;age&quot;), new TD().text(&quot;city&quot;))),
 * 		new TBody().add(new TR().add(new TD().text(&quot;Andrew&quot;), new TD().text(&quot;24&quot;), new TD().text(&quot;São Paulo&quot;)), new TR().add(new TD().text(&quot;Test&quot;), new TD().text(&quot;2000&quot;), new TD()
 * 				.text(&quot;All the world&quot;))));
 * </pre>
 * 
 * <b>Defining styles:</b> Use the method addStyle(String...) each item is
 * considered a style.
 * 
 * <b>Defining classes:</b> Use the method classes(String...) same way of
 * addStyle each item is a css class.
 * 
 * <b>Defining id:</b> Use the method id(String).
 * 
 * <b>Defining another properties:</b> for each element you can use it's own
 * methods to set some specific property. Example: With IMG class you can user
 * the method src(String), usemap(String) and etc.
 * 
 * @author andrew
 */
public abstract class HTMLComponent implements HTMLElement {
	public static Quotation DEFAULT_QUOTATION = Quotation.SINGLE;
	public static boolean DEFAULT_INDENTED = false;

	protected Set<Property> properties = new LinkedHashSet<Property>();
	protected List<HTMLElement> elements = new ArrayList<HTMLElement>();
	protected Set<String> classes = new LinkedHashSet<String>();
	protected Set<String> styles = new LinkedHashSet<String>();
	private boolean indented = HTMLComponent.DEFAULT_INDENTED;
	private Quotation quotation = HTMLComponent.DEFAULT_QUOTATION;

	public HTMLComponent() {
	}

	protected void addProperty(final Property p) {
		this.properties.add(p);
	}

	public HTMLComponent text(final String... texts) {
		for (final String text : texts) {
			this.add(new TextElement(text));
		}
		return this;
	}

	public HTMLComponent add(final HTMLElement... cs) {
		for (final HTMLElement c : cs) {
			this.elements.add(c);
		}
		return this;
	}

	@Override
	public void draw(final Out out, final int level, final boolean indented) throws IOException {
		if (!this.classes.isEmpty()) {
			this.addProperty(new Property("class", HTMLUtil.createList(this.classes.toArray(new String[0]), " ")));
		}
		if (!this.styles.isEmpty()) {
			this.addProperty(new StyleProperty(this.styles.toArray(new String[0])));
		}

		this.printPreTag(out);
		out.write(indented ? HTMLUtil.createLevel(level) : "");
		out.write("<");
		out.write(this.tagName());
		out.write(Property.toString(this.quotation, this.properties.toArray(new Property[0])));

		boolean onlyInLine = true;
		for (final HTMLElement c : this.elements) {
			if (!(c instanceof HtmlInLineElement)) {
				onlyInLine = false;
				break;
			}
		}

		if (!this.elements.isEmpty() || (this instanceof HTMLCompleteTag)) {
			out.write(">");
			for (final HTMLElement c : this.elements) {
				if (c instanceof HTMLComponent) {
					((HTMLComponent) c).setQuotation(this.quotation);
				}
				final boolean inline = c instanceof HtmlInLineElement;
				c.draw(out, inline ? -1 : level + 1, indented);
			}
			out.write(indented ? HTMLUtil.createLevel(onlyInLine ? -1 : level) : "");
			out.write("</");
			out.write(this.tagName());
			out.write(">");
		} else {
			out.write("/>");
		}
	}

	protected void printPreTag(final Out out) throws IOException {
	}

	public HTMLComponent id(final String id) {
		this.properties.add(new Property("id", id));
		return this;
	}

	public HTMLComponent classes(final String... classes) {
		for (final String c : classes) {
			this.classes.add(c);
		}
		return this;
	}

	public HTMLComponent styles(final String... styles) {
		for (final String s : styles) {
			this.styles.add(s);
		}
		return this;
	}

	public HTMLComponent lang(final String lang) {
		this.addProperty(new Property("lang", lang));
		return this;
	}

	public HTMLComponent dir(final Dir dir) {
		this.addProperty(new Property("dir", dir.name().toLowerCase()));
		return this;
	}

	public HTMLComponent title(final String s) {
		this.addProperty(new Property("title", s));
		return this;
	}

	public HTMLComponent onclick(final String func) {
		this.addProperty(EventProperty.onclick(func));
		return this;
	}

	public HTMLComponent ondblclick(final String func) {
		this.addProperty(EventProperty.ondblclick(func));
		return this;
	}

	public HTMLElement onchange(final String func) {
		this.addProperty(EventProperty.onchange(func));
		return this;
	}

	public HTMLComponent onhelp(final String func) {
		this.addProperty(EventProperty.onhelp(func));
		return this;
	}

	public HTMLComponent onkeypress(final String func) {
		this.addProperty(EventProperty.onkeypress(func));
		return this;
	}

	public HTMLComponent onkeydown(final String func) {
		this.addProperty(EventProperty.onkeydown(func));
		return this;
	}

	public HTMLComponent onkeyup(final String func) {
		this.addProperty(EventProperty.onkeyup(func));
		return this;
	}

	public HTMLComponent onblur(final String func) {
		this.addProperty(EventProperty.onblur(func));
		return this;
	}

	public HTMLComponent onmousedown(final String func) {
		this.addProperty(EventProperty.onmousedown(func));
		return this;
	}

	public HTMLComponent onmousemove(final String func) {
		this.addProperty(EventProperty.onmousemove(func));
		return this;
	}

	public HTMLComponent onmouseout(final String func) {
		this.addProperty(EventProperty.onmouseout(func));
		return this;
	}

	public HTMLComponent onmouseover(final String func) {
		this.addProperty(EventProperty.onmouseover(func));
		return this;
	}

	public HTMLComponent onmouseup(final String func) {
		this.addProperty(EventProperty.onmouseup(func));
		return this;
	}

	public abstract String tagName();

	@Override
	public String toString() {
		final StringBuilderOut out = new StringBuilderOut();
		try {
			this.draw(out, 0, this.indented);
		} catch (final IOException e) {
			// Should'nt raise IOException thus StringBuilderOut does not do
			throw new RuntimeException(e.toString(), e);
		}
		return out.toString();
	}

	public void setIndented(final boolean indented) {
		this.indented = indented;
	}

	public HTMLComponent setQuotation(final Quotation quotation) {
		this.quotation = quotation;
		return this;
	}
}