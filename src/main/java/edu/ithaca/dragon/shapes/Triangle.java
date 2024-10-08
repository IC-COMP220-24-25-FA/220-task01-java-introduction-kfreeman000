package edu.ithaca.dragon.shapes;

import java.awt.Shape;

public class Triangle implements Shape {
    private double height;
    private double base;
    

    public Triangle(double h, double b){
        if (h <=0 || b <=0) {
            throw new IllegalArgumentException("base and height must be positive");
        }
        height = h;
        base = b;
    }

    public String toString() {
        return "height = " + height + "and base = " + base;
    }

    public double calcArea(){
        return ((base * height) * 0.5);
    }

    public void doubleSize(){
        base = base * 2;
        height = height * 2;

    }

    public double longestLineWithin(){
        return height;
    }
    
}
