import org.testng.annotations.Test;

import static org.testng.Assert.*;
@Test
public class SumOfDivisibleNumberThreeOrFiveTest {

    public void testForPositiveNumberSeries(){
        SumOfDivisibleNumberThreeOrFive sum = new SumOfDivisibleNumberThreeOrFive();
        int result = sum. solutionOfProblemFive(5,10);
        assertEquals(result, 30, "sum of divisible of 3 & 5 in number series 5 to 10");
    }

    public void testForNegativeNumberSeries(){
        SumOfDivisibleNumberThreeOrFive sum = new SumOfDivisibleNumberThreeOrFive();
        int result = sum. solutionOfProblemFive(1,-5);
        assertEquals(result, -8, "sum of divisible of 3 & 5 in number series 1 to -5");


    }



}