public class CircularCone extends CircularShapeWithHeight {
  
 public CircularCone() {
 }
  
 public CircularCone(double radius, double height) {
   super(radius, height);
 }
  
 public double getArea() {
   double r = getRadius();
   double h = getHeight();
 return Math.PI * r * Math.sqrt(r * r + h * h); 
 } 
  
 public double getVolume() {
 return getCrossSectionArea() * getHeight() / 3.0;
 }
 public String toString() {
   return "CircularCone radius = " + super.getRadius() + " height " + super.getHeight();
 }
 public boolean equals(Object obj) {
   if (obj instanceof CircularCone) {
     CircularCone c = (CircularCone)obj;
     return super.equals(c) && getHeight() == c.getHeight();
   }
   return false;
 }
}