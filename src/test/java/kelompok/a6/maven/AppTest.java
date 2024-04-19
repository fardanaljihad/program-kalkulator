package kelompok.a6.maven;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    //Test for module Calculate
    //Test for addition
    @Test
    public void testCalculateAddition() {
        assertEquals(11, App.calculate(10, 1, '+'));
    }

    //Test for subtraction
    @Test
    public void testCalculateSubtraction() {
        assertEquals(11, App.calculate(21, 10, '-'));
    }

    //Test for multiplication
    @Test
    public void testCalculateMultiplication() {
        assertEquals(14, App.calculate(7, 2, '*'));
    }

    //Test for division
    @Test
    public void testCalculateDivision() {
        assertEquals(2, App.calculate(8, 4, '/'));
    }

}
