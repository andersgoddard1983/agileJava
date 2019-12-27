package sis.studentinfo;

import java.util.*;

/**
* Provides a representation of a single-semester
* session of a specific university course.
* @author Anders
*/

public class CourseSession implements Comparable<CourseSession> {
	private String department;
	private String number;
	private List<Student> students = new LinkedList<Student>();
	private Date startDate;
	private static int count;
	private int numberOfCredits;
	
	static final String NEWLINE = System.getProperty("line.separator");
	final static String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "-----" + NEWLINE;
	final static String ROSTER_REPORT_FOOTER = NEWLINE + "# students = ";
		
	/**
	* Constructs a CourseSession starting on a specific date
	*
	* @param startDate the date on which the CourseSession begins
	*/
	private CourseSession(String department, String number, Date startDate){
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}
	
	public static CourseSession create(String department, String number, Date startDate){
		incrementCount();
		return new CourseSession(department, number, startDate);
	}
	
	public void enroll(Student student){
		student.addCredits(numberOfCredits);
		students.add(student);
	}
	
	public List<Student> getAllStudents() {
		return students;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public String getNumber(){
		return number;
	}
	
	public int compareTo(CourseSession that){
		int compare = this.getDepartment().compareTo(that.getDepartment());
		if (compare == 0)
			compare = this.getNumber().compareTo(that.getNumber());
		return compare;
	}
	
	static void resetCount(){
		count = 0;
	}
	
	static int getCount(){
		return count;
	}
	
	void setNumberOfCredits(int numberOfCredits){
		this.numberOfCredits = numberOfCredits;
	}
	
	int getNumberOfStudents(){
		return students.size();
	}
	
	Student get(int index){
		return students.get(index);
	}
	
	Date getStartDate(){
		return startDate;
	}
	
	/**
	*
	* @return Date the last date of the course session
	*
	*/
	Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		final int sessionLength = 16;
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday; 
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}
	
	private static void incrementCount(){
		count += 1;
	}
}