/**
 * Benis Munezero
 * COSC 237 Sec 001
 * Lab 5 Task 1, class Point
 */

public class Point {
  private int x;
  private int y;

  public Point() {
    x = 0;
    y = 0;
  }
  
  public Point(int initialX, int initialY) {
    x = initialX;
    y = initialY;
  }
  
  public int getX() {
    return x;
  }
  
  public int getY() {
    return y;
  }
  
  public void setPoint(int initialX, int initialY) {
    x = (initialX > 0)? initialX : 0;
    y = (initialY > 0)? initialY : 0;
  }
  
  public void printP(int initialX, int initialY) {
    System.out.println("(" + initialX + "," + initialY + ")");
  }
  
  public String toString(){
    return "(" + x + "," + y + ")";
  }

  public boolean equals(Point p) {
    return (p.x == x && p.y == y);
  }    

  public boolean equals(Object o) {
    if (o instanceof Point) {
      Point p = (Point) o;
      return (p.x == x && p.y == y);
    }
    return false;
  }

  public void copy(Point p) {
    x = p.x;
    y = p.y;
  }

  public Point getCopy() {
    return new Point (x, y);
  }

  public double distanceFromOrigin(Point p) {
    return Math.sqrt((p.x - 0) * (p.x - 0) + (p.y - 0) * (p.y - 0));
  }

  public double distance(Point p) {
    return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
  }

  public Point translate(int moveX, int moveY) {
    if (moveY < 0) {
      y -= Math.abs(moveY);
    
    } else {
        y += moveY;
      }
    if (moveX < 0) {
        x -= Math.abs(moveX);
    } else {
        x += moveX;
      }
      return new Point(x, y);
  }

  public boolean isHorizontal(Point p) {
    if (y == p.y) {
      return true;
    } else {
        return false;
      }
  }

  public boolean isVertical(Point p) {
    if (x == p.x) {
      return true;
    } else {
        return false;
      }
  }

  public double slope(Point p) {
    return (p.y - y) / (p.x - x);
  }  

}