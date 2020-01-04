package sis.studentinfo;

import junit.framework.TestSuite;

public class AllTests {
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(DateUtilTest.class);
		suite.addTestSuite(BasicGradingStrategyTest.class);
		suite.addTestSuite(HonorsGradingStrategyTest.class);
		suite.addTestSuite(CourseSessionTest.class);		
		return suite;
	}
}