/**
 * Benis Munezero
 * COSC 237 Sec 001
 * Lab 5 Task 1, Client for class Point
 */

import java.util.Scanner;

class Main {
  public static final int MIN = 0;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Point p1 = new Point(0, 0);
    Point p2 = new Point(7, 13);
    Point p3 = new Point(7, 15);
    System.out.println("---After declaration, constructors invoked--- Using toString(): \nFirst point is" + p1.toString() + "\nSecond point is " + p2.toString() + "\nThird point is " + p3.toString());
  

  //check if second point lines up vertically with third point
  if (p2.isVertical(p3)) {
    System.out.println("\nSecond point " + p2.toString() + " lines up vertically with third point " + p3.toString());
  } else {
      System.out.println("Second point " + p2.toString() + " does not line up vertically with third point " + p3.toString());
    }

  //check if second point lines up horizontally with third point
  if (p2.isHorizontal(p3)) {
    System.out.println("\nSecond point " + p2.toString() + " lines up horizontally with third point " + p3.toString());
  
  } else {
      System.out.println("Second point " + p2.toString() + " does not line up horizontally with third point " + p3.toString());
    }

  //Get xcoordinate for first point
  System.out.println("\nX coordinate for first point is " + p1.getX());
    
  //Make a custom point
  int x = getInt(sc, "\nLet's make a custom point in the first quadrant!(Negative numbers will be set to 0) \nEnter the x-coordinate for the first point: ");
  int y = getInt(sc, "Enter the y-coordinate for the first point: ");

  p1.setPoint (x, y);
    System.out.println("First point is " + p1.toString());

  //Get distance from origin to first point
  System.out.printf("\nDistance from origin (0,0) to first point %s = %.2f units", p1.toString(), p1.distanceFromOrigin(p1));

  //Get distance from origin to second point
  System.out.printf("\nDistance from origin (0,0) to second point %s = %.2f units", p2.toString(), p2.distanceFromOrigin(p2));

  //Get distance between first point and second point
  System.out.printf("\nDistance between first %s and second point %s = %.2f units", p1.toString(), p2.toString(), p1.distance(p2));

    
  //Translate first point
  System.out.println("\nLets translate the first point! (negative number to shift down and shift left);");
  int x2 = getInt(sc, "Choose translation for X-coordinate: ");
  int y2 = getInt(sc, "Choose translation for Y-coordinate: ");
  System.out.println("After call to translate "+ p1.toString() + " is " + p1.translate(x2, y2));

//Test equals method
System.out.println("\n Lets test if two points are equal:\n   First point is " + p1.toString() +"\n   Second point is " + p2.toString() + "\n   Third point is " + p3.toString() +  "\nPoint 1 and point 2 are equal: " + p1.equals(p2) + "\nPoint 1 and point 3 are equal: " + p1.equals(3) + "\nPoint 2 and point 3 are eqaul: " + p2.equals(3));
p1.setPoint(7, 13);
System.out.println("Lets make point 1 equal to point 2 and then test them for equality!\nPoint 1 is " + p1.toString());
System.out.println("Point 1 is equal to point 2: " + p1.equals(p2));

//Copy point 3 into point 1 and point 2
p1.copy(p3);
p2.copy(p3);
System.out.println("\nLets copy point 3 into point 1 and point 2!\nPoint 1 is " + p1.toString() + "\nPoint 2 is " + p2.toString());








  }

  public static int getInt(Scanner in, String prompt) {
    System.out.print(prompt);
    while (!in.hasNextInt()) {
      in.next();
      System.out.println("Error! Not a positive intenger.Try again!");
    }
    return in.nextInt();
  }
  
}