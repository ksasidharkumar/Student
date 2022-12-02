package com.interview;

public class StudentApp {

	
	String name;
	int rollnum;
	String course;
	String email;
	long mobile;
	String address;
	char gender;
	int yearofjoining;
	public void printStudent() {
		System.out.println("Student Name:"+name);
		System.out.println("Student Rollnum:"+rollnum);
		System.out.println("Student Course:"+course);
		System.out.println("Student Email:"+email);
		System.out.println("Student MobileNumber:"+mobile);
		System.out.println("Student Gender:"+gender);
		System.out.println("Student Year of Joining:"+yearofjoining);
		
	}
	class StudentManager{
		public static void main(String[]args) {
			StudentApp sasi=new StudentApp();
			sasi.name="sasi";
			sasi.rollnum=1;
			sasi.course="java";
			sasi.email="sasi@gmail.com";
			sasi.mobile=8523072899l;
			sasi.address="hyderabad";
			sasi.gender='m';
			sasi.yearofjoining=2022;
		}
		
		
		
	}
}
