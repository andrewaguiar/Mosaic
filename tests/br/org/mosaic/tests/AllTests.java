package br.org.mosaic.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	public static Test suite() {
		final TestSuite suite = new TestSuite("Test for default package");
		//$JUnit-BEGIN$
		suite.addTestSuite(TestingHTMLUtil.class);
		suite.addTestSuite(TestingProperty.class);
		suite.addTestSuite(TestingStyleProperty.class);
		suite.addTestSuite(TestingHTMLEvents.class);
		suite.addTestSuite(TestingHTMLElements.class);
		//$JUnit-END$
		return suite;
	}
}
