package org.student;

import org.department.Department;

public class Student extends Department {

	public void StudentName() {
		System.out.println(" My name is Jayasree");
	}
	
	public void StudentDept() {
		System.out.println(" My dept is B.sc Maths");
	}
	
	public void StudentId() {
		System.out.println(" My ID is 145236");
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.StudentName();
		student.StudentId();
		student.StudentDept();
	}
}
