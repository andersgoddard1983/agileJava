public class StudentTest extends junit.framework.TestCase {
	public void testCreate() {
		final String firstStudentName = "Jane Doe";
		Student firstStudent = new Student(firstStudentName);
		assertEquals(firstStudentName, firstStudent.getName());
		
		final String secondStudentName = "John Doe";		
		Student secondStudent = new Student(secondStudentName);
		assertEquals(secondStudentName, secondStudent.getName());

		assertEquals(firstStudentName, firstStudent.getName());
	}
}