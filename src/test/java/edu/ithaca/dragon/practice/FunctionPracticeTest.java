package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import edu.ithaca.dragon.shapes.Circle;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        //This test is important because it tests the function returns the largest num when it's the second int
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        //This test is important because it tests the function returns the largest num when it's the first int 
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        //This test is important because it test the function returns the largest num when it's the third int
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        //This test is importnt because it test a set of ints that are all the same so they are all the "largest num"
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        // These tests are important because it tests that an error should be thrown when any int is negative
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        
        assertEquals(55.15, FunctionPractice.calcSalePrice(59.00,15,5.00));
        assertEquals(2.99, FunctionPractice.calcSalePrice(20.99,100,2.99));
        assertEquals(10.99, FunctionPractice.calcSalePrice(35.99,75,1.99),0.01);

         
        //fail("Not implemented yet");
    }

    @Test
    public void isGoodDogTest(){
        assertEquals(true, FunctionPractice.isGoodDog(4, 8, true));
        assertEquals(false, FunctionPractice.isGoodDog(5, 0, true));
        assertEquals(true, FunctionPractice.isGoodDog(5, 3, true));

    }

    @Test
    public void findFirstLargest(){
        List<Integer>numbers;
        numbers = new ArrayList<Integer>();
        numbers.add(6);
        numbers.add(35);
        numbers.add(12);
        numbers.add(35);
        assertEquals(1, FunctionPractice.findFirstLargest(numbers));
        List<Integer>oneNumbers;
        oneNumbers = new ArrayList<Integer>();
        oneNumbers.add(187);
        oneNumbers.add(187);
        assertEquals(0, FunctionPractice.findFirstLargest(oneNumbers));
        List<Integer>twoNumbers;
        twoNumbers = new ArrayList<Integer>();
        assertEquals(-1, FunctionPractice.findFirstLargest(twoNumbers));

    }

    @Test
    public void findLastLargestTest(){
        List<Integer>numbers;
        numbers = new ArrayList<Integer>();
        numbers.add(6);
        numbers.add(35);
        numbers.add(12);
        numbers.add(35);
        assertEquals(3, FunctionPractice.findLastLargest(numbers));
        List<Integer>oneNumbers;
        oneNumbers = new ArrayList<Integer>();
        oneNumbers.add(187);
        oneNumbers.add(187);
        assertEquals(1, FunctionPractice.findLastLargest(oneNumbers));
        List<Integer>twoNumbers;
        twoNumbers = new ArrayList<Integer>();
        assertEquals(-1, FunctionPractice.findLastLargest(twoNumbers));

    }

    @Test
    public void findFirstMostOccurencesOfLetterTest(){
        List<String>words;
        words = new ArrayList<String>();
        words.add("hello");
        words.add("limp");
        words.add("sheep");
        words.add("help");
        assertEquals("hello", FunctionPractice.findFirstMostOccurencesOfLetter(words,'l'));
        List<String>moreWords;
        moreWords = new ArrayList<String>();
        moreWords.add("need");
        moreWords.add("necessary");
        moreWords.add("keepsake")
        assertEquals("keepsake", FunctionPractice.findFirstMostOccurencesOfLetter(moreWords,'e'));
        List<String>newWords;
        newWords = new ArrayList<String>();

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.findFirstMostOccurencesOfLetter(newWords,'j'));
    }


    

    

    
}
