package com.java;

import com.d1_CollegeInformation.College;
import com.d1_CollegeInformation.Student;

public class Sowpriya extends College {
	public static void main(String[] args) {
		System.out.println("Name:Sowpriya");
		System.out.println("Father's Name:Selvam");
		System.out.println("Mother's Name:Roja");
		System.out.println("Address:Jittandahalli,Palacode,Dharmapuri,Tamilnadu-636 805");
		System.out.println("Educational Qualification:BPT");
		System.out.println("Launguages Known:Tamil'English,Kannada");
		System.out.println("Gender:Female");

		System.out.println("*************************");

		Student.main(true);
		System.out.println("*************************");

		College.main('S');

		System.out.println("*****************************");

		Student.Studentname();
	}
}