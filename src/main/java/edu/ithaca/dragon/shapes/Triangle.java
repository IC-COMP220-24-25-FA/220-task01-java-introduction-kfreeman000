package edu.ithaca.dragon.shapes;

public class Triangle {
    private double length;
    private double width;
    

    public Triangle(double length, double width){
        if (length <=0 || width <=0) {
            throw new IllegalArgumentException("Length and width must be positive");
        }
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        
    }

    public void doubleSize(){
        

    }

    public double longestLineWithin(){
        
    }
    
}
