package fir;

import java.util.*;
import java.util.Scanner;

public class Employee {
	private static String employeeid;
	private static double salary;
	private static String[] certification;
	private static int rating;
	
	public Employee(){}
	
	public static String getEmployeeid() {
		return employeeid;
	}
	public static void setEmployeeid(String employeeid) {
		Employee.employeeid = employeeid;
	}
	public static double getSalary() {
		return salary;
	}
	public static void setSalary(double salary) {
		Employee.salary = salary;
	}
	public static String[] getCertification() {
		return certification;
	}
	public static void setCertification(String[] certification) {
		Employee.certification = certification;
	}
	public static int getRating() {
		return rating;
	}
	public static void setRating(int rating) {
		Employee.rating = rating;
	}

	static void findrating(String[] cert) {
		int i=0;
		String company[]= {"JAVA","ORACLE","GCUX","CCNA","AWS"};
		for(String str:cert) {
			for(String c:company) {
				if(str.equals(c)) {
					i++;
				}
			}
		}
		setRating(i);
	}

public static double calculateincrement(double salary){
	rating = Employee.getRating();
	double increment = 0;
	float per;
	switch(rating) {
	case 1: 
		per = 2;
		break;
	case 2: 
		per = 3.5f;
		break;
	case 3:
		per = 5;
		break;
	case 4:
		per = 7.5f;
		break;
	case 5:
		per = 10;
		break;
	default:
		per = 0;
		break;
	}
	increment = per*salary/100;
	return increment;
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the employee id:");
	setEmployeeid(scan.nextLine());
	System.out.println("Enter the salary:");
	setSalary(scan.nextDouble());
	System.out.println("Enter the no. of certification complete:");
	int len=scan.nextInt();
	System.out.println("Enter the Certification names:");
	String[] certificates = new String[len]; 
	
	for(int i=0;i<len;i++) {
		certificates[i] = scan.next();
	}
	
	findrating(certificates);
	
	double increment1 = Employee.calculateincrement(salary);
	System.out.println(Arrays.toString(certificates));
	System.out.println("Your rating is "+rating);
	System.out.println("Your Increment is "+increment1);
	System.out.println("Current salary "+(salary+increment1));
}
}