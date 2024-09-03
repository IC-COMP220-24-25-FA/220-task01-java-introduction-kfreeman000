package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Triangle tri1 = new Triangle(3,4);
        assertEquals(6, tri1.calcArea());
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0,0));
    }

    @Test
    public void longestLineWithinTest(){
       Triangle tri1 = new Triangle(10,5);
       assertEquals(10, tri1.longestLineWithin());
    }

    @Test
    public void doubleSizeTest(){
       
    }



    
}

