package com.comapny.Figures;

public class Circle extends Figure {
    private double radius;//radius circle

    public double area() {
        return Math.PI * radius * radius;
    }

    public double length() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
