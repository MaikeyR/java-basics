package Inheritance;

public class Point {
  // fields marking X and Y position of the point
  public int x;
  public int y;

  // one constructor
  public Point(int x, int y) {
    super();
    this.x = x;
    this.y = y;
  }

  // getter and setter methods
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}