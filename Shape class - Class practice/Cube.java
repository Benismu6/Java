public class Cube extends RectangularPrism {
 public Cube() {
   super();
 }
 public Cube(double size) {
   super(size, size, size);  
 }
 
 public String toString() {
   return "Cube size = " + getLength();
 }
}
