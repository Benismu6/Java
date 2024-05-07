/**
 * Benis Munezero, Alexander Roth, and Legendre Cooper
 * COSC 237 Sec 001
 * Assignment 2, Task 1, Complex Number class
 */
import java.util.Scanner;
public class Complex {
    private double real;
    private double imag;
  
    public Complex() {
        real = 0;
        imag = 0;
      }
  
    public Complex(double r, double i) {
        setComplex(r, i);
    }

    //Get complex number (real and imaginary)
    public void read(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
          sc.next();
          System.out.println("Error! Not a valid double.\nPlease input a valid double!");
        }
        real = sc.nextDouble();
        while (!sc.hasNextDouble()) {
          sc.next();
          System.out.println("Error! Not a valid double.\nPlease input a valid double!");
        }
        imag = sc.nextDouble();
    } 

    //Sets complex number 
    public void setComplex(double r, double i) {
        real = (r < 0.0)? -r : r;
        imag = (i < 0.0)? -i : i;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imag;
    }

  
    public void print() {
        System.out.printf("(%.2f, %.2f) ", real, imag);
    }

    //Checks if 2 complex numbers are equal
    public boolean equals (Complex c) {
        return (real == c.real && imag == c.imag);
    } 

    public String toString() {
        return "(" + String.format("%.2f", real) + " , " + String.format("%.2f", imag) + ")";
    }

    public void copy (Complex C) {
        real = C.real;
        imag = C.imag;
    }

    public Complex getCopy() {
        return new Complex(real, imag);
    }

    //Adds two complex numbers
    public Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    //Subtracts two complex numbers
    public Complex subtract(Complex c) {
        return new Complex(real - c.real, imag - c.imag);
    }

    //Multiplies two complex numbers
    public Complex multiply(Complex c) {
        return new Complex(real * c.real - imag * c.imag, real * c.imag + imag * c.real);
    }

    //Divides two complex numbers
    public Complex divide(Complex c) {
        double denom = c.real * c.real + c.imag * c.imag;
        return new Complex((real * c.real + imag * c.imag )/denom, (imag * c.real - real * c.imag)/denom);
    }

    //Returns the absolute value of a complex number
    public double cAbs() {
        return Math.sqrt(real * real + imag * imag);
    }
    
}