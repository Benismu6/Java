public class Sphere implements Shape3D {
 private double radius;
 public Sphere() {
   radius = 1.0;
 }
 
 public Sphere(double r) {
   radius = r;
 }
  
 public double getRadius() {
   return radius;
 }
  
 public double getArea() {
 return 4 * Math.PI * Math.pow(radius, 2);
 }
  
 public double getVolume() {
 return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
 }
  
 public String toString() {
   return "Sphere of radius " + radius;
 }
  
 public boolean equals(Object obj) {
   if (obj instanceof Sphere) {
     Sphere s = (Sphere)obj;
     return radius == s.radius;
   } 
   return false;
  }
}