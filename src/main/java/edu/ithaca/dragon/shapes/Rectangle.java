package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape {
    private double length;
    private double width;
    

    public Rectangle(double length, double width){
        if (length <=0 || width <=0) {
            throw new IllegalArgumentException("Length and width must be positive");
        }
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "length = " + length + "and width = " + width;
    }
    
    
    public double calcArea(){
        return this.length * this.width;
    }

    public void doubleSize(){
        this.length = this.length * 2;
        this.width = this.width * 2;

    }

    public double longestLineWithin(){
        double lengthSqaured = this.length * this.length;
        double widthSquared = this.width * this.width;
        return Math.sqrt(widthSquared + lengthSqaured);
    }
    
}
