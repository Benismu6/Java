/*
 * Client for Employee class
 */

import java.util.Scanner;
public class ClientEmployee {
  public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  String last, first, dept;
  double pay_rate;
  int hours;
  Employee prof = new Employee("John", "Doe", 25.50, 50, "COSC"); 
  System.out.println( prof.toString());
  //create some Person objects 
  Person person1 = new Person("Alice", "Smith");
  Person person2 = new Person("John", "Lamb");

    //print out the Person objects
    System.out.println(person1.getFirstName() + " " + person1.getLastName());
    System.out.println(person2.getFirstName() + " " + person2.getLastName());

    //create some employee objects
    Employee employee1 = new Employee("Marc", "Rain", 20.0, 45.0, "IT");
    Employee employee2 = new Employee("Lucas", "Lorenzo", 22.12, 50.0, "HR");
    System.out.println();
    
    //print earnings of employees - directly using caculatepay method
    System.out.printf("%s's earnings $%.2f\n", employee1.getLastName(), employee1.calculatePay());
    System.out.printf("%s's earnings $%.2f\n", employee2.getFirstName(), employee2.calculatePay());

    // test setting names changed first employee name
    employee1.setName("Marcus", "Johnson");
    employee2.setName("John", "Lamb");

    //print out changed employee names
    employee1.print();
    employee2.print();
    System.out.println();
    
    //check if employee 1 is the same as employee 2
    if (employee1.equals(employee2))
      System.out.println("Employees are the same");
    else
      System.out.println("Couldn't find an employee with same record.");

    //create a new employee object and copy employee 1 into new employee object 
    Employee employee3 = new Employee();

    employee3.copy(employee1);
    System.out.println(employee3.toString());

    // check if new employee object is the same as employee 1 that it was copied from
     if (employee1.equals(employee3))
      System.out.println("Employees are the same");
    else
      System.out.println("Couldn't find an employee with same record.");

    
  last = getString(sc, "\nCreate your own employee!\nEnter employee last name: ");
  first = getString(sc, "Enter employee first name: ");
  dept = getString(sc, "Enter department: ");
  pay_rate = getDouble(sc, "Enter pay rate: ");
  hours = getInt(sc, "Enter hours worked: ");

  
  Employee newEmp = new Employee(); 
    newEmp.setAll(first, last, pay_rate, hours, dept);
  System.out.println(newEmp.toString());

  }
  public static String getString(Scanner sc, String prompt) {
    System.out.println(prompt);
    while (!sc.hasNext()) {
      sc.nextLine();
      System.out.print("Invalid name! Try again");
    }
    return sc.nextLine();
  }

  public static double getDouble(Scanner sc, String prompt) {
    System.out.println(prompt);
    while (!sc.hasNextDouble()) {
      sc.next();
      System.out.print("Invalid number! Try again");
    }
    return sc.nextDouble();
  }

  public static int getInt(Scanner sc, String prompt) {
    System.out.println(prompt);
    while (!sc.hasNextInt()) {
      sc.next();
     System.out.println("Invalid number! Try again");
    }
    return sc.nextInt();
  }
}