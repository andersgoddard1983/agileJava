package sis.studentinfo;

import java.util.*;

/**
* Provides a representation of a single-semester
* session of a specific university course.
* @author Anders
*/

public class CourseSession {
	private String department;
	private String number;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Date startDate;
	private static int count;
	
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
		students.add(student);
	}
	
	public ArrayList<Student> getAllStudents() {
		return students;
	}
	
	String getDepartment(){
		return department;
	}
	
	String getNumber(){
		return number;
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
	
	static void resetCount(){
		count = 0;
	}
	
	static int getCount(){
		return count;
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