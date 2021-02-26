import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumTest {
    @Test
    public static void testForCalculatingSumFromOneToNNumber() {
        Sum sum = new Sum();
        int result = Sum.sumWithOneInput(3);
        assertEquals(result,6, "sum of 1 to 3 numbers" );

    }
    @Test
    public static void testForCalculatingSumOfRandomSeriesOfForwardingNNumber() {
        Sum sum = new Sum();
        int result = Sum.sumWithTwoInput(3, 5);
        assertEquals(result,12, "sum of 3 to 5 numbers" );

    }
    @Test
    public static void testForCalculatingSumOfBackwardSeriesOfNumber() {
        Sum sum = new Sum();
        int result = Sum.sumWithTwoInput(3, -1);
        assertEquals(result,5, "sum of 3 to -1 numbers" );

    }
}