package factory;

// Create the Computer class that extends Course abstract class 
class Computer extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print
	// value
	public void getDuration() {
		duration = 3;
		System.out.println("Duration: " + duration + " months");
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific fee and print
	// value
	public void getFeePerSemester() {
		fee = 2000;
		System.out.println("Fee: " + fee + " $");
	}
}
