package com.kodilla.testing.shape;

class Triangle implements Shape {

    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {

        return "Triangle";
    }

    public double getArea() {

        return 0.5 * a * h;

    }
}
