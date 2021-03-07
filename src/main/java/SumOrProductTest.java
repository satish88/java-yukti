import org.testng.annotations.Test;

import static org.testng.Assert.*;
@Test
public class SumOrProductTest {
    public void testForCalculatingProductOfPositiveNumberSeries(){
        SumOrProduct test = new SumOrProduct();
        long result = test.calculateSumOrProductOfANumberSeries(4, "product");
        assertEquals(result, 24, "product of 1 to 4");
    }

    public void testForCalculatingSumOfPositiveNumberSeries() {
        SumOrProduct test = new SumOrProduct();
        long result = test.calculateSumOrProductOfANumberSeries(4, "sum");
        assertEquals(result, 10, "product of 1 to 4");
    }
}