package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Arrays;
import java.util.List;

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
    @Test
    public void findFirstLargestTest(){
        List<Integer> someList = Arrays.asList(1,2,3,4,5,6,7,0);
        assertEquals(6, FunctionPractice.findFirstLargest(someList));
        List<Integer> someList1 = Arrays.asList(99,99,10,4,5,6,7,10);
        assertEquals(0, FunctionPractice.findFirstLargest(someList1));
        List<Integer> someList2 = Arrays.asList();
        assertEquals(-1, FunctionPractice.findFirstLargest(someList2));
    }
    @Test
    public void findLastLargestTest(){
        List<Integer> someList = Arrays.asList(10,2,3,4,5,6,7,10);
        assertEquals(7, FunctionPractice.findLastLargest(someList));
        List<Integer> someList1 = Arrays.asList(99,99,10,4,5,6,7,10);
        assertEquals(1, FunctionPractice.findLastLargest(someList1));
        List<Integer> someList2 = Arrays.asList();
        assertEquals(-1, FunctionPractice.findLastLargest(someList2));
    }
    @Test
    public void findFirstMostOccurencesOfLetterTest(){
        List<String> someList = Arrays.asList("a", "cat", "aaa");
        assertEquals("aaa", FunctionPractice.findFirstMostOccurencesOfLetter(someList, 'a'));
        List<String> someList1 = Arrays.asList("pig", "cat", "dog", "gorgeous");
        assertEquals("gorgeous", FunctionPractice.findFirstMostOccurencesOfLetter(someList1, 'g'));
        List<String> someList2 = Arrays.asList("lol", "like", "laugh");
        assertEquals("lol", FunctionPractice.findFirstMostOccurencesOfLetter(someList2, 'l'));
    }
}
