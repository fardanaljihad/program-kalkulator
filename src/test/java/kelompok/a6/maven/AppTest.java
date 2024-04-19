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

    //Test for module main
    //Test for module validateInput
    //Test for module Calculate
    @Test
    public void testKalkulasiOperatorTambah() {
        assertEquals(11, App.calculate(10, 1, '+'));
    }

    @Test
    public void testKalkulasiOperatorKurang() {
        assertEquals(11, App.calculate(21, 10, '-'));
    }

    @Test
    public void testKalkulasiOperatorKali() {
        assertEquals(14, App.calculate(7, 2, '*'));
    }

    @Test
    public void testKalkulasiOperatorBagi() {
        assertEquals(2, App.calculate(8, 4, '/'));
    }

}
