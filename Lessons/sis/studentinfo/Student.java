package sis.studentinfo;

import java.util.*;

public class Student {
	
	private String name;
	private int credits;
	private String state = "";
	enum Grade {A, B, C, D, F};
	private ArrayList<Grade> grades = new ArrayList<Grade>();
	private GradingStrategy gradingStrategy = new RegularGradingStrategy();
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
	static final String IN_STATE = "CO";
	
	public Student(String name){
		this.name = name;		
		this.credits = 0;
	}
	
	public String getName(){
		return name;
	}
	
	boolean isFullTime(){
		return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
	}
	
	public int getCredits(){
		return credits;
	}
	
	public void addCredits(int credits){
		this.credits += credits;
	}
	
	boolean isInState(){
		return state.equals(Student.IN_STATE);
	} 
	
	void setState(String state){
		this.state = state;
	}
	
	void addGrade(Grade grade){
		grades.add(grade);
	}
	
	double getGpa(){
		if (grades.isEmpty())
			return 0.0;
		double total = 0.0;
		for (Grade grade: grades){
			total += gradingStrategy.getGradePointsFor(grade);
		}
		return total / grades.size();
	}
	
	void setGradingStrategy(GradingStrategy gradingStrategy){
		this.gradingStrategy = gradingStrategy;
	}
}