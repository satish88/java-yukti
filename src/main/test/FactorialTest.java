import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {
    @Test
    public static void testForCalculatingPositiveNumberFactorial() {
        Factorial factorial = new Factorial();
        long result = Factorial.calculateFactorial(4);
        assertEquals(result, 24, "value of 4!");
    }

    @Test
    public static void testForCalculatingZeroFactorial() {
        Factorial factorial = new Factorial();
        long result = Factorial.calculateFactorial(0);
        assertEquals(result, 1, "value of 0!");
    }

    @Test
    public static void testForCalculatingNegativeNumberFactorial() {
        Factorial factorial = new Factorial();
        long result = Factorial.calculateFactorial(-4);
        assertEquals(result, 0, "value of -4!");
    }

}