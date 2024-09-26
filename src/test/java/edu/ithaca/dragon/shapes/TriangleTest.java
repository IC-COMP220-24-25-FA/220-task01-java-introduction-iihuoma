package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void calcAreaTest() throws Exception{
        Triangle myTriangle = new Triangle(6, 8);
        assertEquals(24, myTriangle.calcArea());

        myTriangle = new Triangle(45.7, 90);
        assertEquals(2056.5, myTriangle.calcArea(),0.1);

        myTriangle = new Triangle(22.5,15.87);
        assertEquals(178.54, myTriangle.calcArea(),0.01);


    
     
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-5,67));
    
    }

    @Test
    public void longestLineWithinTest(){
        Triangle myTriangle = new Triangle(9,4.23);
        assertEquals(9.944, myTriangle.longestLineWithin(),0.001);

        myTriangle = new Triangle(56, 12);
        assertEquals(57.27, myTriangle.longestLineWithin(),0.01);

        myTriangle = new Triangle(45.67, 33.55);
        assertEquals(56.67, myTriangle.longestLineWithin(),0.01);


    }
}
