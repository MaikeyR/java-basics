package Inheritance;

public class InheritanceExample {

    public static void main(String[] args) {
        Point point = new ColoredPoint(2, 4, "red");

        if (point instanceof ColoredPoint) {
            ColoredPoint coloredPoint = (ColoredPoint) point;
            System.out.println("the color of the point is: " + coloredPoint.getColorName());
            System.out.println("with coordinates x=" + coloredPoint.getX() + " y=" + coloredPoint.getY());
        }
    }
}