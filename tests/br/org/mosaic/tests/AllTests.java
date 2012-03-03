package br.org.mosaic.tests;
import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests 
{
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		//$JUnit-BEGIN$
		suite.addTestSuite(TestingProperty.class);
		suite.addTestSuite(TestingStyleProperty.class);
		suite.addTestSuite(TestingHTMLElements.class);
		//$JUnit-END$
		return suite;
	}
}
