package br.org.mosaic.tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import br.org.mosaic.tags.page.Div;

public class TestingHTMLEvents extends TestCase {
	private static final String func = "void();";

	public void testElementWithEvent_onblur() {
		final Div d = (Div) new Div().onblur(TestingHTMLEvents.func);
		Assert.assertEquals("<div onblur='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_onchange() {
		final Div d = (Div) new Div().onchange(TestingHTMLEvents.func);
		Assert.assertEquals("<div onchange='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_onclick() {
		final Div d = (Div) new Div().onclick(TestingHTMLEvents.func);
		Assert.assertEquals("<div onclick='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_ondblclick() {
		final Div d = (Div) new Div().ondblclick(TestingHTMLEvents.func);
		Assert.assertEquals("<div ondblclick='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_onkeydown() {
		final Div d = (Div) new Div().onkeydown(TestingHTMLEvents.func);
		Assert.assertEquals("<div onkeydown='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_onkeypress() {
		final Div d = (Div) new Div().onkeypress(TestingHTMLEvents.func);
		Assert.assertEquals("<div onkeypress='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_onkeyup() {
		final Div d = (Div) new Div().onkeyup(TestingHTMLEvents.func);
		Assert.assertEquals("<div onkeyup='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_onhelp() {
		final Div d = (Div) new Div().onhelp(TestingHTMLEvents.func);
		Assert.assertEquals("<div onhelp='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_onmousedown() {
		final Div d = (Div) new Div().onmousedown(TestingHTMLEvents.func);
		Assert.assertEquals("<div onmousedown='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_onmousemove() {
		final Div d = (Div) new Div().onmousemove(TestingHTMLEvents.func);
		Assert.assertEquals("<div onmousemove='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_onmouseout() {
		final Div d = (Div) new Div().onmouseout(TestingHTMLEvents.func);
		Assert.assertEquals("<div onmouseout='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_onmouseover() {
		final Div d = (Div) new Div().onmouseover(TestingHTMLEvents.func);
		Assert.assertEquals("<div onmouseover='void();' ></div>", d.toString());
	}

	public void testElementWithEvent_onmouseup() {
		final Div d = (Div) new Div().onmouseup(TestingHTMLEvents.func);
		Assert.assertEquals("<div onmouseup='void();' ></div>", d.toString());
	}
}
