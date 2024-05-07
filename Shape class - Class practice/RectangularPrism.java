public class RectangularPrism implements Shape3D {
 private double length;
 private double width;
 private double height;
  
 public RectangularPrism() {
   length = 1.0;
   width = 1.0;
   height = 1.0;
 }
  
 public RectangularPrism(double l, double w, double h) {
   length = l;
   width = w;
   height = h;
 }
  
 public double getLength() { 
   return length; 
 }
  
 public double getWidth() {
   return width;
 }
  
 public double getHeight() {
   return height;
 }
  
 public double getArea() {
 return 2 * (length * width + width * height + length * height);
 }
  
 public double getVolume() {
 return length * width * height;
 }
  
 public String toString() {
   return "RectangularPrism [length = " + length + ", width = " + width + ", height = " + height + "]";
 }
  
 public boolean equals(Object obj) {
   if (obj instanceof RectangularPrism) {
     RectangularPrism r = (RectangularPrism)obj;
     return (length == r.length) && (width == r.width) && (height == r.height);
 }
   return false;
 }
}