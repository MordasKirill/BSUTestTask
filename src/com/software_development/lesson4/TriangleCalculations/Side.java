package com.software_development.lesson4.TriangleCalculations;

public class Side {
    private Point a;
    private Point b;

    public Side(Point a, Point b){
        this.a = a;
        this.b = b;
    }
    public Point getA(){
        return a;
    }
    public Point getB(){
        return b;
    }
    public double calculateSide(){
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }

}
