package kelompok.a6.maven;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    //Test for module main
    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testMainwithValidInput() {
        provideInput("1\n2\n+\n");
        App.main(new String[0]);
        assertTrue(getOutput().contains("Hasil: 3"));
    }


    @Test
    public void testMainwithInvalidOperator() {
        provideInput("7\n2\n%\n");
        App.main(new String[0]);
        assertTrue(getOutput().contains("Error: Operator tidak valid."));
    }

    @Test
    public void testMainWithDivisionByZero() {
        provideInput("7\n0\n/\n");
        App.main(new String[0]);
        assertTrue(getOutput().contains("Error: Pembagi tidak boleh nol."));
    }

    @Test
    public void testMainWithInputBeyondUpperLimit() {
        provideInput("32768\n32768\n-\n");
        App.main(new String[0]);
        assertTrue(getOutput().contains("Error: Operand harus dalam rentang -32,768 hingga 32,767."));
    }

    @Test
    public void testMainWithInputBelowLowerLimit() {
        provideInput("-32769\n1000\n+\n");
        App.main(new String[0]);
        assertTrue(getOutput().contains("Error: Operand harus dalam rentang -32,768 hingga 32,767."));
    }

    //Modul ValidInput
    @Test
    public void testValidateInputValid() {
        assertTrue(App.validateInput(7, 10, '-'));
    }

    @Test
    public void testValidateInputInvalidOperator() {
        assertFalse(App.validateInput(7, 10, '%'));
    }

    //Modul ValidInput
    @Test
    public void testValidateInputValid() {
        assertTrue(App.validateInput(7, 10, '-'));
    }

    @Test
    public void testValidateInputInvalidOperator() {
        assertFalse(App.validateInput(7, 10, '%'));
    }

    @Test
    public void testValidateInputDivisionByZero() {
        assertFalse(App.validateInput(7, 0, '/'));
    }

    @Test
    public void testValidateInputOutOfRangeUpperBound() {
        assertFalse(App.validateInput(32768, -15, '*'));
    }

    @Test
    public void testValidateInputOutOfRangeLowerBound() {
        assertFalse(App.validateInput(15, -32769, '+'));
    }

    @Test
    public void testValidateInputDivisionByZero() {
        assertFalse(App.validateInput(7, 0, '/'));
    }

    @Test
    public void testValidateInputOutOfRangeUpperBound() {
        assertFalse(App.validateInput(32768, -15, '*'));
    }

    @Test
    public void testValidateInputOutOfRangeLowerBound() {
        assertFalse(App.validateInput(15, -32769, '+'));
    }

    

    //Test for module validateInput
    //Test for module Calculate

}
