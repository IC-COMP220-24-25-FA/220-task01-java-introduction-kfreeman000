package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));    // tests with the same int for all three params

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));   // tests for negative number 
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(50.55, FunctionPractice.calcSalePrice(100, 0.50, 0.55));
        assertEquals(95.25, FunctionPractice.calcSalePrice(100, 0.10, 5.25));
        assertEquals(13.05, FunctionPractice.calcSalePrice(25, 0.50, 0.55));
        assertEquals(65.55, FunctionPractice.calcSalePrice(99, 0.35, 1.20));
        assertEquals(6.547999999999997, FunctionPractice.calcSalePrice(29.99, 0.80, 0.55));
        
    }
    @Test
    public void isGoodDogTest(){
        assertEquals(true, FunctionPractice.isGoodDog(5, 31, true));
        assertEquals(false, FunctionPractice.isGoodDog(1, 0, false));
        assertEquals(false, FunctionPractice.isGoodDog(5, 5, false));
        assertEquals(true, FunctionPractice.isGoodDog(12, 500, true));
    }
}
