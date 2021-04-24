/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se2_tut11.Person;

import java.util.Scanner;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Child extends Person {

	public Child(String name, int age) {
		super(name, age);
		
		if (age > 15) {
			throw new IllegalArgumentException("Child's age must be lesser than 15!");
		}
	}

	public void setAge(int age) throws IllegalArgumentException {
		if (age > 15) {
			throw new IllegalArgumentException("Child's age must be lesser than 15!");
		}
		super.setAge(age);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int age = Integer.valueOf(scanner.nextLine());
		try {
			Child child = new Child(name, age);
			System.out.println(child.toString());
			String personClassName = Person.class.getSimpleName();
			String childClassName = Child.class.getSimpleName();
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage());
		}
	}
}
