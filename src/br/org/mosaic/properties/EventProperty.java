package br.org.mosaic.properties;

/**
 * @author andrew
 */
public class EventProperty extends Property {
	public static EventProperty onclick(String func) {
		return new EventProperty("onclick", func);
	}

	public static EventProperty ondblclick(String func) {
		return new EventProperty("ondblclick", func);
	}

	public static EventProperty onhelp(String func) {
		return new EventProperty("onhelp", func);
	}

	public static EventProperty onkeypress(String func) {
		return new EventProperty("onkeypress", func);
	}

	public static EventProperty onkeydown(String func) {
		return new EventProperty("onkeydown", func);
	}

	public static EventProperty onkeyup(String func) {
		return new EventProperty("onkeyup", func);
	}

	public static EventProperty onmousedown(String func) {
		return new EventProperty("onmousedown", func);
	}

	public static EventProperty onmousemove(String func) {
		return new EventProperty("onmousemove", func);
	}

	public static EventProperty onmouseout(String func) {
		return new EventProperty("onmouseout", func);
	}

	public static EventProperty onmouseover(String func) {
		return new EventProperty("onmouseover", func);
	}

	public static EventProperty onmouseup(String func) {
		return new EventProperty("onmouseup", func);
	}

	public static Property onselect(String func) {
		return new EventProperty("onselect", func);
	}

	public static Property onfocus(String func) {
		return new EventProperty("onfocus", func);
	}

	public static Property onchange(String func) {
		return new EventProperty("onchange", func);
	}

	public static Property onblur(String func) {
		return new EventProperty("onblur", func);
	}

	public EventProperty(String name, String func) {
		super(name, func);
	}
}