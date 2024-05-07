/*
 * Class Employee - Subclass of Person
 */

public class Employee extends Person {
  private double payRate;
  private double hoursWorked;
  private String department;

  public final int HOURS = 40;
  public final double OVERTIME = 1.5;

  public Employee() {
    super();
    payRate = 0;
    hoursWorked = 0;
    department = " ";
  }

  public Employee (String fName, String lName, double pRate, double hWorked, String dpt) {
    super (fName, lName);
    payRate = pRate;
    hoursWorked = hWorked;
    department = dpt;
  }
  
  public String toString(){
    return "The wages for " + super.toString() + " from the " + department + " department are: $" + calculatePay(); 
  }

  public void print() {
    System.out.println("The employee " + super.toString() + " from the " + department + " department worked " + hoursWorked + " hours \nWith a pay rate of $" + payRate + ". The wages for this employee are $" + calculatePay());
  }

  public double calculatePay() {
    double regularPay, overTimePay,totalPay;
    if (hoursWorked > HOURS) {
      double overTimeHrs = hoursWorked - HOURS;
      regularPay = payRate * HOURS;
      overTimePay = overTimeHrs * OVERTIME;
      totalPay = regularPay + overTimePay;      
    
    } else {
      regularPay = payRate * hoursWorked;
      totalPay = regularPay;
    }
    
    return totalPay;
  }

  public void setAll(String fName, String lName, double pRate, double hWorked, String dpt) {
  super.setName(fName, lName);
    payRate = pRate;
    hoursWorked = hWorked;
    department = dpt;
  
  }

  public double getPayRate() {
    return payRate;
  }

  public double getHoursWorked(){
    return hoursWorked;
  }

  public String getDepartment() {
    return department;
  }

  public boolean equals(Object o) {
    if (o instanceof Employee) {
      Employee e = (Employee) o;
      return (super.equals(e) && payRate == e.payRate && hoursWorked == e.hoursWorked && department.equals(e.department));
    } else {
      return false;
    }
  }

  public void copy(Employee e){
    super.copy(e);
    payRate = e.payRate;
    hoursWorked = e.hoursWorked;
    department = e.department;
  }
  
  public Employee getCopy(){
    return new Employee(super.getFirstName(), super.getLastName(), payRate, hoursWorked, department );
  }

  
}