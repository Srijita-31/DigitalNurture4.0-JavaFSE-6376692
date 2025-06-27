import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up Calculator for a new test...");
    }

    @Test
    public void testAdd() {
        int result = calculator.add(5, 3);
        assertEquals(8, result);
        System.out.println("testAdd passed. Result: " + result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
        System.out.println("testSubtract passed. Result: " + result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(7, 2);
        assertEquals(14, result);
        System.out.println("testMultiply passed. Result: " + result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(10.0, 2.0);
        assertEquals(5.0, result, 0.001);
        System.out.println("testDivide passed. Result: " + result);
    }

    @Test(expected = IllegalArgumentException.class) // <--- Change this line
    public void testDivideByZero() {
                calculator.divide(10.0, 0.0);
        System.out.println("testDivideByZero passed (expected exception was thrown).");
    }
}