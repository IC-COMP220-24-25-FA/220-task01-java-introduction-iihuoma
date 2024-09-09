package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

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
        
        assertEquals(55.99, FunctionPractice.calcSalePrice(59.00,15,5.00));
        assertEquals(2.99, FunctionPractice.calcSalePrice(20.99,100,2.99));
        assertEquals(10.99, FunctionPractice.calcSalePrice(35.99,75,1.99));

         
        fail("Not implemented yet");
    }

    
}
