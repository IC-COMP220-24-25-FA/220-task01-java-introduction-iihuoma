package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void calcAreaTest() throws Exception{
        Rectangle myRectangle = new Rectangle(10, 8);
        assertEquals(80,myRectangle.calcArea());

        myRectangle = new Rectangle(90.56,56.67);
        assertEquals(5132.0352,myRectangle.calcArea(),0.0001);

        myRectangle = new Rectangle(15.78, 12.33);
        assertEquals(194.5674,myRectangle.calcArea(),0.0001);

    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,0));
    }

    @Test
    public void longestLineWithinTest(){
        Rectangle myRectangle = new Rectangle(10, 8);
        assertEquals(12.806, myRectangle.longestLineWithin(),0.001);

        myRectangle = new Rectangle(12.5, 14.3);
        assertEquals(18.993, myRectangle.longestLineWithin(),0.001);

        myRectangle = new Rectangle(16.4,13.56);
        assertEquals(21.2,myRectangle.longestLineWithin(), 0.1);

    }

}
