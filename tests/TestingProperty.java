import br.org.mosaic.properties.EventProperty;
import br.org.mosaic.properties.Property;
import br.org.mosaic.properties.Quotation;
import junit.framework.TestCase;

public class TestingProperty extends TestCase 
{
	public void testCreatingSimpleProperty(){
		Property p = new Property("TESTE", "VALUE");

		assertEquals("TESTE='VALUE'", p.toString());
	}

	public void testCreatingSimplePropertyWithEmptyValue(){
		Property p = new Property("TESTE", "");

		assertEquals("TESTE=''", p.toString());
	}

	public void testShouldntAllowCreateAPropertyUnamed(){
		boolean errorOccurred = false;
		try{
			new Property("", "value");
		}catch (IllegalArgumentException e) {
			errorOccurred = true;
		}

		assertTrue(errorOccurred);
	}

	public void testShouldntAllowCreateAPropertyUnamedWithNameNull(){
		boolean errorOccurred = false;
		try{
			new Property(null, "value");
		}catch (IllegalArgumentException e) {
			errorOccurred = true;
		}

		assertTrue(errorOccurred);
	}

	public void testShouldntAllowCreateAPropertyUnamedWithNameBlanked(){
		boolean errorOccurred = false;
		try{
			new Property("   ", "value");
		}catch (IllegalArgumentException e) {
			errorOccurred = true;
		}

		assertTrue(errorOccurred);
	}

	public void testSingleQuotation(){
		Property p = new Property("quotation", "single");
		p.setQuotation(Quotation.SINGLE);

		assertEquals("quotation='single'", p.toString());
	}

	public void testDoubleQuotation(){
		Property p = new Property("quotation", "double");
		p.setQuotation(Quotation.DOUBLE);

		assertEquals("quotation=\"double\"", p.toString());
	}

	public void testSingleQuotationWithValue(){
		Property p = new Property("quotation", "single's");
		p.setQuotation(Quotation.SINGLE);

		assertEquals("quotation='single\\'s'", p.toString());
	}

	public void testDoubleQuotationWithValue(){
		Property p = new Property("quotation", "double\"s");
		p.setQuotation(Quotation.DOUBLE);

		assertEquals("quotation=\"double\\\"s\"", p.toString());
	}
	
	public void testCreatingEventProperty(){
		EventProperty p = EventProperty.onmousedown("function(){teste();}");
		
		assertEquals("onmousedown='function(){teste();}'", p.toString());
	}
}
