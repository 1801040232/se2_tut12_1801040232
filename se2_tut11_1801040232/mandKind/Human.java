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
public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        
        char ch = firstName.charAt(0);
        if(Character.isUpperCase(ch) && firstName.length()>4) 
            this.firstName =firstName;
        else System.out.println("Invalid firstName");
        
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        char ch = lastName.charAt(0);
        if(Character.isUpperCase(ch) && lastName.length()>3) 
            this.lastName =lastName;
        else System.out.println("Invalid lastName");
    }
    
}
