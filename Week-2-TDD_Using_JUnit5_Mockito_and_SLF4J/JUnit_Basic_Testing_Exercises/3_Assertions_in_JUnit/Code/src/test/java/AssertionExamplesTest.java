import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*; // Importing all static assertion methods

public class AssertionExamplesTest {

    private AssertionExamples examples; // Declaring an AssertionExamples instance

    @Before
    public void setUp() {
        // Initializing the AssertionExamples object before each test method runs
        examples = new AssertionExamples();
        System.out.println("Setting up AssertionExamples for a new test...");
    }

    @Test
    public void testConcatenateStrings() {
        String result = examples.concatenateStrings("Hello", "World");
        assertEquals("HelloWorld", result); // Checks if two strings are equal
        System.out.println("testConcatenateStrings passed. Result: " + result);
    }

    @Test
    public void testGetNumbersArray() {
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] actualArray = examples.getNumbersArray();
        assertArrayEquals(expectedArray, actualArray); // Checks if two arrays are equal
        System.out.println("testGetNumbersArray passed. Array: " + java.util.Arrays.toString(actualArray));
    }

    @Test
    public void testIsPositiveTrue() {
        boolean result = examples.isPositive(10);
        assertTrue(result); // Checks if a condition is true
        System.out.println("testIsPositiveTrue passed. Result: " + result);
    }

    @Test
    public void testIsPositiveFalse() {
        boolean result = examples.isPositive(-5);
        assertFalse(result); // Checks if a condition is false
        System.out.println("testIsPositiveFalse passed. Result: " + result);
    }

    @Test
    public void testGetNullObject() {
        Object obj = examples.getNullObject();
        assertNull(obj); // Checks if an object is null
        System.out.println("testGetNullObject passed. Object: " + obj);
    }

    @Test
    public void testGetNonNullObject() {
        Object obj = examples.getNonNullObject();
        assertNotNull(obj); // Checks if an object is not null
        System.out.println("testGetNonNullObject passed. Object: " + obj);
    }

    @Test
    public void testCalculateSum() {
        int sum = examples.calculateSum(5, 7);
        assertEquals(12, sum); // Checks if two integers are equal
        System.out.println("testCalculateSum passed. Sum: " + sum);
    }

    @Test
    public void testCalculateInterest() {
        double interest = examples.calculateInterest(1000.0, 0.05, 2);
        assertEquals(100.0, interest, 0.001); // Checks if two doubles are equal within a delta
        System.out.println("testCalculateInterest passed. Interest: " + interest);
    }
}