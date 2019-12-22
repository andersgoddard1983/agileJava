import junit.framework.TestSuite;

public class AllTests {
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(chess.AllTests.suite());
		suite.addTest(pieces.AllTests.suite());
		return suite;
	}
}