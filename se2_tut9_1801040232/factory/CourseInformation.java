package factory;

import java.io.IOException;
import java.util.Scanner;

/* Create the CourseInformation class to generate information about the duration 
 * and fee of the course by using the Admission class to get the object of 
 * sub-classes by passing the required information like the course being applied for */
class CourseInformation {
	public static void main(String args[]) throws IOException {
		//TO-DO: Create new Admission object
		Admission ad = new Admission();
		//TO-DO: Get user's input for the course's name
		System.out.println("Input the course name: ");
		try (Scanner scan = new Scanner(System.in)) {
			String name = scan.nextLine();
			//TO-DO: Create new course with created Admission
			Course c = ad.admittingCourse(name);
			
			//TO-DO: Display the require duration in semesters, required fee per semester and for whole course
			System.out.println("Number of semester: ....");
			c.getDuration();
			c.getFeePerSemester();
			c.calculateTotalFee();
		}
 
	}
}  