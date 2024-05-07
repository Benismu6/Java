/*
 * Benis Munezero
 * COSC 237.001
 * Lab 8, Polymorphism, 3D shapes
 */


public class SquarePyramid implements Shape3D {
 private double length;
 private double height;
  
 public SquarePyramid() {
 length = 0;
 height = 0;
 }
  
 public SquarePyramid(double l, double h) {
   length = l;
   height = h;
 }
  
 public double getLength() {
   return length;
 }
 public double getHeight() {
   return height;
 }
 public double getArea() {
   return length * (length + Math.sqrt(length * length + 4 * height * height));
 }
  
 public double getVolume() {
   return length * length * height / 3.0;
 }
  
 public String toString() {
   return "Square Pyramid: length = " + length + "width = x" + height;
 }
  
 public boolean equals(Object obj) {
   if (obj instanceof SquarePyramid) {
     SquarePyramid other = (SquarePyramid) obj;
     return (length == other.length) && (height == other.height);
   } else 
     return false;
  }
 
}