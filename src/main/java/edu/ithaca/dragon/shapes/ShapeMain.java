package edu.ithaca.dragon.shapes;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class ShapeMain {
    
    public static void main(String[] args){
       List<Shape> shapeList = new ArrayList<Shape>();
       List<String> shapeOptions = new ArrayList<>();
       shapeOptions.add("circle", "rectangle", "triangle");
       Random random = new Random();
       while (shapeList.size() < 10) {
           Integer aShapeIndex = random.nextInt(4);
           String theShape = shapeOptions.get(aShapeIndex);
           if (theShape == "circle") {
                shapeList.add(new Circle(5)); 
           }
           if (theShape == "rectangle") {
            shapeList.add(new Rectangle(5,6)); 
           }
           if (theShape == "triangle") {
            shapeList.add(new Triangle(2,4)); 
           }
       }
       Scanner scanner2 = new Scanner(System.in);     // test 
       System.out.println(shapeList);
       scanner2.close();

        
        
        
        
        
        
        
        
        List<Rectangle> aList = new ArrayList<Rectangle>();
        aList.add(new Rectangle(10,4));
        aList.add(new Rectangle(7,3));
        aList.add(new Rectangle(1,3));
        aList.add(new Rectangle(25,10));
        aList.add(new Rectangle(5,8));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i).calcArea());
            System.out.println(aList.get(i).longestLineWithin());
        for (int x = 0; x < aList.size(); x++) {
            System.out.println("choose a rectangle index 0-4");
            int index = Integer.parseInt(scanner.nextLine());
            aList.get(index).doubleSize();
            for (int i2 = 0; i2 < aList.size(); i2++) {
                System.out.println(aList.get(i2).calcArea());
                System.out.println(aList.get(i2).longestLineWithin());
        }
        
        }
        
        scanner.close();

        }

    }
}

