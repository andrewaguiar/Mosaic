package br.org.mosaic.tests;
import junit.framework.TestCase;
import br.org.mosaic.properties.StyleName;
import br.org.mosaic.properties.StyleProperty;

public class TestingStyleProperty extends TestCase 
{
	public void testStringStyleUsingStyleName(){
		assertEquals("border-bottom-color:#0F0", StyleProperty.style(StyleName.BORDER_BOTTOM_COLOR, "#0F0"));
	}
	
	public void testCreatingSimpleStyleProperty(){
		StyleProperty p = new StyleProperty(
				StyleProperty.style(StyleName.BORDER_BOTTOM_COLOR, "#0F0")
		);
		assertEquals("style='border-bottom-color:#0F0;'", p.toString());
	}
	
	public void testCreatingSeveralStyleProperty(){
		StyleProperty p = new StyleProperty(
				StyleProperty.style(StyleName.WIDTH, "100%"),
				StyleProperty.style(StyleName.HEIGHT, "75%")
		);
		assertEquals("style='width:100%;height:75%;'", p.toString());
	}

	public void testTrimmingInStyleFormat(){
		StyleProperty p = new StyleProperty(
				StyleProperty.style(StyleName.WIDTH, "                       100%       "),
				StyleProperty.style(StyleName.HEIGHT, "75%          "),
				StyleProperty.style(StyleName.BORDER, "             2px solid #000")
		);
		assertEquals("style='width:100%;height:75%;border:2px solid #000;'", p.toString());
	}
}
