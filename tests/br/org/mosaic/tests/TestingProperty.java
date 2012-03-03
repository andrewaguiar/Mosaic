package br.org.mosaic.tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import br.org.mosaic.properties.EventProperty;
import br.org.mosaic.properties.Property;
import br.org.mosaic.properties.Quotation;

public class TestingProperty extends TestCase {

	public void testCreatingSimpleProperty() {
		final Property p = new Property("TESTE", "VALUE");

		Assert.assertEquals("TESTE='VALUE' ", p.toString());
	}

	public void testCreatingSimplePropertyWithEmptyValue() {
		final Property p = new Property("TESTE", "");

		Assert.assertEquals("TESTE='' ", p.toString());
	}

	public void testShouldntAllowCreateAPropertyUnamed() {
		boolean errorOccurred = false;
		try {
			new Property("", "value");
		} catch (final IllegalArgumentException e) {
			errorOccurred = true;
		}

		Assert.assertTrue(errorOccurred);
	}

	public void testShouldntAllowCreateAPropertyUnamedWithNameNull() {
		boolean errorOccurred = false;
		try {
			new Property(null, "value");
		} catch (final IllegalArgumentException e) {
			errorOccurred = true;
		}

		Assert.assertTrue(errorOccurred);
	}

	public void testShouldntAllowCreateAPropertyUnamedWithNameBlanked() {
		boolean errorOccurred = false;
		try {
			new Property("   ", "value");
		} catch (final IllegalArgumentException e) {
			errorOccurred = true;
		}

		Assert.assertTrue(errorOccurred);
	}

	public void testSingleQuotation() {
		final Property p = new Property("quotation", "single");
		p.setQuotation(Quotation.SINGLE);

		Assert.assertEquals("quotation='single'", p.toString());
	}

	public void testDoubleQuotation() {
		final Property p = new Property("quotation", "double");
		p.setQuotation(Quotation.DOUBLE);

		Assert.assertEquals("quotation=\"double\"", p.toString());
	}

	public void testSingleQuotationWithValue() {
		final Property p = new Property("quotation", "single's");
		p.setQuotation(Quotation.SINGLE);

		Assert.assertEquals(" quotation='single\\'s'", p.toString());
	}

	public void testDoubleQuotationWithValue() {
		final Property p = new Property("quotation", "double\"s");
		p.setQuotation(Quotation.DOUBLE);

		Assert.assertEquals(" quotation=\"double\\\"s\"", p.toString());
	}

	public void testCreatingEventProperty() {
		final EventProperty p = EventProperty.onmousedown("function(){teste();}");

		Assert.assertEquals(" onmousedown='function(){teste();}'", p.toString());
	}
}
