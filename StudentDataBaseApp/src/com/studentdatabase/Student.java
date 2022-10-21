package com.studentdatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int tutionBalance = 0;
	private String  studentID;
	private String courses=null;
	private static  int costOfCourse = 600;
	private static int id = 1000;
	
  //constructor prompt the user to enter name and year

	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstName:");
		this.firstName = sc.nextLine();
		System.out.println("Enter lastName:");
		this.lastName = sc.nextLine();
		System.out.println("Enter gradeYear:");
		this.gradeYear = sc.nextInt();
		setstudentID();
		System.out.println(firstName+" "+lastName+" "+gradeYear+""+studentID);
  //Generate an ID
	}
	public void  setstudentID() {
		id++;
		this.studentID = gradeYear +""+id;	
		}
  //Enroll in courses
	public void enroll() {
		do {
		System.out.println("Enter courses to enroll(Q to Quit)");
		Scanner sc = new Scanner(System.in);
		String course = sc.nextLine();
		if(!course.equals("Q")) {
			courses = courses+"\n"+course;
			tutionBalance = tutionBalance+costOfCourse;	
		}
		else {
			System.out.println("Break");
			break;
		}
		}

	while(1!=0);
		
		System.out.println("Enrolled in:"+courses);
		System.out.println("Tution Balance:"+tutionBalance);
	}

	
		//view balance
	public void viewBalance() {
		System.out.println("your balance is:"+tutionBalance);
	}
		//pay tuition
	public void tutionPayment(int payment) {
		tutionBalance =tutionBalance-payment;
		System.out.println("Thanks for the payment:"+ payment);
		viewBalance();
		
	}
		//show status
	
}
