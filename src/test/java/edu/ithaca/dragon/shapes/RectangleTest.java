package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(2,3);
        assertEquals(6, myRectangle.calcArea(), 0.0001);
        
        Rectangle myRectangle2 = new Rectangle(99,5);
        assertEquals(495, myRectangle2.calcArea(), 0.0001);

        Rectangle myRectangle3 = new Rectangle(15,4);
        assertEquals(60, myRectangle3.calcArea(), 0.0001);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,0));
    }

    @Test
    public void longestLineWithinTest(){
        Rectangle myRectangle = new Rectangle(2,3);
        assertEquals(3.6055, myRectangle.longestLineWithin(), 0.0001);
        
        Rectangle myRectangle2 = new Rectangle(99,5);
        assertEquals(99.1261, myRectangle2.longestLineWithin(), 0.0001);

        Rectangle myRectangle3 = new Rectangle(15,4);
        assertEquals(15.5241, myRectangle3.longestLineWithin(), 0.0001);

    }

    @Test
    public void doubleSizeTest(){
        Rectangle myRectangle = new Rectangle(2,3);
        myRectangle.doubleSize();
        assertEquals(24, myRectangle.calcArea(), 0.0001);
        
        Rectangle myRectangle2 = new Rectangle(99,5);
        myRectangle2.doubleSize();
        assertEquals(1980, myRectangle2.calcArea(), 0.0001);

        Rectangle myRectangle3 = new Rectangle(15,4);
        myRectangle3.doubleSize();
        assertEquals(240, myRectangle3.calcArea(), 0.0001);
    }



    
}

