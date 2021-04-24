/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se2_tut11.Person;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Person {

	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		if (age < 1) {
			throw new IllegalArgumentException("Age must be positive!!");
		}
		
		if (name.length() <= 3) {
			throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
		}
		
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws IllegalArgumentException {
		if (name.length() <= 3) {
			throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
		}
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) throws IllegalArgumentException {
		if (age < 1) {
			throw new IllegalArgumentException("Age must be positive!!");
		}
		this.age = age;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(String.format("Name: %s, Age: %d", this.getName(), this.getAge()));
		return sb.toString();
	}

}
