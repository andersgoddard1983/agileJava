import junit.framework.TestSuite;
import pieces.*;
import chess.*;

public class AllTests {
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(PawnTest.class);
		suite.addTestSuite(BoardTest.class);
		return suite;
	}
}