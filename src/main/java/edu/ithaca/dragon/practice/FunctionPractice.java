package edu.ithaca.dragon.practice;

import java.util.List;
import java.util.Collections;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first <= 0 || second <= 0 || third <= 0) {
            throw new IllegalArgumentException("number cannot be negative");
        }
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > second) {
            max = third;
        }
        return max;
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        double finalPrice = (originalPrice - (originalPrice * discountPercent)) + salesTax;
        return finalPrice;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (fetchedThePaperToday == false) {
            if (daysSinceShoesChewed <= 5) {
                return false;
            }
        }
        return true;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.size() == 0) {
            return -1;
        }
        else {
            int max = Collections.max(numbers);
            return numbers.indexOf(max);
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.size() == 0) {
            return -1;
        }
        else {
            int max = Collections.max(numbers);
            return numbers.lastIndexOf(max);
        }
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){           // need help with this method
        for (int i = 0; i < words.size(); i++ ){
            if (words.get(i))
        }
    }


}
