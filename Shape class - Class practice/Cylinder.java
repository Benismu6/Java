public class Cylinder extends CircularShapeWithHeight {
 public Cylinder() {
   super();
 }
  
 public Cylinder(double radius, double height) {
   super(radius, height);
 }
 public double getArea() {
 return getCrossSectionPerimeter() * getHeight() + 2 * getCrossSectionArea();
 }
 public double getVolume() {
 return getCrossSectionArea() * getHeight();
 }
 public String toString() {
   return "Cylinder: radius = " + getRadius() + ", height = " + getHeight();
 }
 public boolean equals(Object obj) {
   if (obj instanceof Cylinder) {
     Cylinder other = (Cylinder) obj;
     return getRadius() == other.getRadius() && getHeight() == other.getHeight();
 } else 
     return false;
 }
}
