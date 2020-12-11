package com.software_development.lesson4.TriangleCalculations;

import java.util.Locale;

public class Triangle {
    private Side A;
    private Side B;
    private Side C;

    private Triangle(Side a, Side b, Side c) {
        A = a;
        B = b;
        C = c;
    }

    private static Triangle createTriangle(Point a, Point b, Point c) {
        Side A = new Side(a, b);
        Side B = new Side(b, c);
        Side C = new Side(a, c);
        return new Triangle(A, B, C);
    }

    private double calculatePerimeter(){
        return A.calculateSide() + B.calculateSide() + C.calculateSide();
    }

    private double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - A.calculateSide()) * (p - B.calculateSide()) * (p - C.calculateSide()));
    }

    private Point pointMedianIntersection() {
        double x = (A.getA().getX() + A.getB().getX() + B.getB().getX()) / 3;
        double y = (A.getA().getY() + A.getB().getY() + B.getB().getY()) / 3;
        return new Point(x, y);
    }


    public static void main(String[] args) {
        Point a = new Point(-1,-6);
        Point b = new Point(4,9);
        Point c = new Point(5,3);
        System.out.println("Triangle points are: A (" +a.getX() + "; " + a.getY()+ "), B ("+ b.getX() + "; " + b.getY()+"), C ("+c.getX() + "; " + c.getY()+")");

        Triangle triangle = createTriangle(a, b, c);

        double perimeter = triangle.calculatePerimeter();
        System.out.println("Perimeter of the triangle:" + perimeter);

        double area = triangle.calculateArea();
        System.out.println("Area of a triangle: " + area);

        Point o = triangle.pointMedianIntersection();
        System.out.print("Median intersection point: H (" + o.getX() + "; " + o.getY() + ")");
    }
}
