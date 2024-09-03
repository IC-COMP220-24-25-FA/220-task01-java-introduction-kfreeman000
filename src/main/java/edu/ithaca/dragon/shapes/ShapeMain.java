package edu.ithaca.dragon.shapes;
import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        List<Rectangle> aList = new ArrayList<Rectangle>();
        aList.add(new Rectangle(10,4));
        aList.add(new Rectangle(7,3));
        aList.add(new Rectangle(1,3));
        aList.add(new Rectangle(25,10));
        aList.add(new Rectangle(5,8));
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }


    }
}
