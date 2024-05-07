/*
 * Benis Munezero
 * COSC 327.001
 * Lab 6, inheritance - Class person
 */

import java.util.Scanner;

public class Person {
  private String firstName;
  private String lastName;

  public Person () {
    firstName = " ";
    lastName = " ";
  }

  public Person (String fName, String lName) {
    firstName = fName;
    lastName = lName;
  }

  public String getFirstName () {
    return firstName;
  }

  public String getLastName(){
    return lastName;
  }

  public void setName( String fName, String lName ) {
    firstName = fName;
    lastName = lName;
  }
  
  public void printLastFirst(){
    System.out.print(lastName + "," + firstName);
  }

  public void print() {
    System.out.print(firstName  + " " + lastName);
  }
  
  public String toString(){
    return firstName + " " + lastName;
  }

  public boolean equals(Object o) {
    if (o instanceof Person) {
      Person p = (Person) o;
      return (firstName == p.firstName && lastName == p.lastName);
    }
    else
      return false;
  }

  public void copy(Person p){
    firstName = p.firstName;
    lastName = p.lastName;
  }
  
  public Person getCopy(){
    return new Person (firstName, lastName);
  }
  
}
   