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
public class Worker extends Human {
    private String lastName;
    private String salary;
    private int workingHours;
    public Worker(String firstName, String lastName) {
        super(firstName, lastName);
    }
    @Override
    public void setLastName(String lastName){
        if(lastName.length()>3) this.lastName = lastName;
        else System.out.println("Expected length more than 3: lastName");
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        if(salary.length()>10)
        this.salary = salary;
        else System.out.println("invalid salary");
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        String s = String.valueOf(workingHours);
        if(s.length()>=1 && s.length()<=12)
        this.workingHours = workingHours;
        else System.out.println("Invalid working hours");
    }

 
    
}
