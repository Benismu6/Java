public abstract class CircularShapeWithHeight extends CircularShape {
 private double height;
 public CircularShapeWithHeight() {
   super();
   height = 1;
 }
  
 public CircularShapeWithHeight(double radius, double h) {
   super(radius);
   height = h;
 }
  
 public double getHeight() {
   return height;  
 }
}
