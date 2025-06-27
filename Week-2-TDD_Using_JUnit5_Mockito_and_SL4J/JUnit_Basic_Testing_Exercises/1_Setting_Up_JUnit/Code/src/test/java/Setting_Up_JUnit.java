
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Setting_Up_JUnit {

    @Test
    public void testAddition() {
        int sum = 2 + 3;
        assertEquals(5, sum);
        System.out.println("The sum of 2 + 3 is: " + sum);
    }
}
