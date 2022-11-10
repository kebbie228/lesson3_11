package com.comapny.Figures;

public class Rectangle extends Figure {
    private double a;
    private double b;//длинны сторон


    public double area() {
        return a*b;
    }

    public double length() {
        return (a+b)*2;
    }



    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }


}
