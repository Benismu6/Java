/**
 * Benis Munezero, Alexander Roth, and Legendre Cooper
 * COSC 237 Sec 001
 * Assignment 2, Task 1, Client for Complex Number
 */
import java.util.Scanner;
public class ComplexClient {
  public static final int OPTMAX = 6;
  public static final int OPTMIN = 0;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int option;
    int commandNum = 1;
    
    do {
      option = menu(OPTMAX, OPTMIN);
      if (option == 0) {
        break;
      }
      
      switch(option){
        case 1:
            Complex c1 = new Complex();
            c1.read(sc, "Enter complex number (real imaginary): ");

            Complex c2 = new Complex();
            c2.read(sc, "Enter complex number (real imaginary): ");

            Complex add = c1.add(c2);
          
            System.out.println("First complex number is : " + c1.toString() + "\nSecond complex number is: " + c2.toString() + "\nResult: " + c1.toString() + " - " + c2.toString() + " = " + add.toString());
          
          break;
          
        case 2:
            Complex c3 = new Complex();
            c3.read(sc, "Enter Complex number (real imaginary): ");

            Complex c4 = new Complex();
            c4.read(sc, "Enter Complex number (real imaginary): ");
          
            Complex subtraction = c3.subtract(c4);
          
            System.out.println("First complex number is: " + c3.toString() + "\nSecond complex number is: " + c4.toString() + "\nResult: " + c3.toString() + " - " + c4.toString() + " = " + subtraction.toString());     
          
          break;
          
        case 3:
            Complex c5 = new Complex();
            c5.read(sc, "Enter Complex number (real imaginary): ");
          
            Complex c6 = new Complex();
            c6.read(sc, "Enter Complex number (real imaginary): ");
          
            Complex multiply = c5.multiply(c6);

            System.out.println("First complex number is: " + c5.toString() + "\nSecond complex number is: " + c6.toString() + "\nResult: " + c5.toString() + " * " + c6.toString() + " = " + multiply.toString());


          break;
          
        case 4:
            Complex c7 = new Complex();
            c7.read(sc, "Enter Complex number (real imaginary): ");

            Complex c8 = new Complex();
            c8.read(sc, "Enter Complex number (real imaginary): ");
          
            Complex divide = c7.divide(c8);
          
            System.out.println("First complex number is: " + c7.toString() + "\nSecond complex number is: " + c8.toString() + "\nResult: " +  c7.toString() + " / " + c8.toString() + " = " + divide.toString());


          break;
          
        case 5:
            Complex c9 = new Complex(); 
            c9.read(sc, "Enter Complex number (real imaginary): ");

            double absValue = c9.cAbs();
          
            System.out.printf("The Complex number is: %s \nResult: |%s| = %.2f", c9.toString(), c9.toString(), absValue);

          break;
          
        case 6:
            Complex c10 = new Complex();
            c10.read(sc, "Enter Complex number (real imaginary): ");

            Complex c11 = new Complex();
            c11.read(sc, "Enter Complex number (real imaginary): ");
          
            System.out.println("First complex number is: " + c10.toString() + "\nSecond complex number is: " + c11.toString());
          
            boolean equal = c10.equals(c11);
            if (equal) {
              System.out.println("The complex numbers are equal."); 
            }
              else {
                System.out.println("The complex numbers are not equal.");
              }
          break;
    
        default:
            System.out.println("Invalid option! Try again");
          break;
     }
      System.out.println("     Command " + commandNum++ + " completed\n");
    } while (true);
    System.out.println("\n      Testing Completed!");
  }


  //Prints menu options
  public static int menu(int max, int min) {
    System.out.println("Your options for Complex arithmetic are: \n----------------------------------------" +
        "\n 1) Add 2 complex numbers \n 2) Subtract 2 complex numbers \n 3) Multiply 2 complex numbers \n 4) Divide 2 complex numbers \n 5) Absolute value of a complex number \n 6) Compare 2 complex numbers \n 0) Exit ");
    Scanner sc = new Scanner(System.in);
            int option;
            do {
              option = getInt(sc, "Please enter your option:");
              if (option < min || option > max) {
              System.out.println("Invalid option! ");
              }
            } while (option < min || option > max);
        return option;
    
  }
  
    public static int getInt(Scanner sc, String prompt) {
          System.out.println(prompt);
          while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Not an integer! try again: ");
          }
          return sc.nextInt();

    }
  
}