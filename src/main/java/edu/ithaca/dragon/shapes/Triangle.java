package edu.ithaca.dragon.shapes;

public class Triangle {
    private double height;
    private double base;
    

    public Triangle(double h, double b){
        if (height <=0 || base <=0) {
            throw new IllegalArgumentException("Length and width must be positive");
        }
        height = h;
        base = b;
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
