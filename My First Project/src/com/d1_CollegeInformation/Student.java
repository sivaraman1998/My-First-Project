package com.d1_CollegeInformation;

public class Student extends College {
	public static void Studentname() {
		System.out.println("Student Name");
	}

	public void Studentdepartment() {
		System.out.println("Student Department");
	}

	public void StudentID() {
		System.out.println("Student ID");
	}

	public static void main(boolean i) {
		Student obj1 = new Student();
		Studentname();
		obj1.Studentdepartment();
		obj1.StudentID();

		College obj = new College();
		obj.collegename();
		College.collegecode();
		obj.collegerank();
	}

}
