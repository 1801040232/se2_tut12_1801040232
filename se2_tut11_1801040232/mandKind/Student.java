/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se2_tut11.mandKind;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Student extends Human{
    private int facultyNumber;
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public Student(String firstName, String lastName, int facultyNumber){
        super(firstName,lastName);
        this.facultyNumber = facultyNumber;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        String check = String.valueOf(facultyNumber);
        if(check.length()>=5 && check.length()<=10)
        this.facultyNumber = facultyNumber;
        else System.out.println("Invalid facultyNumber");
    }
  
}
