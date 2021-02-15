import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AgeCalculatorTest {

    @Test
    public void calculateAge() {
        AgeCalculator test1 = new AgeCalculator();
        int age1 = test1.ageCounter(2021, 2014);
        assertEquals(age1, 7, "Birth year must be less than present year.");
    }

    @Test
    public void calculateAgeInNegativeYears() {
        AgeCalculator test2 = new AgeCalculator();
        int age2 = test2.ageCounter(-2010, -2020);
        assertEquals(age2, 0, "Impossible value");
    }

    @Test
    public void calculateAgeWithBirthYearGreaterThanPresentYear() {
        AgeCalculator test3 = new AgeCalculator();
        int age3 = test3.ageCounter(1995, 2015);
        assertEquals(age3, 0, "Impossible value");
    }

    @Test
    public void calculateAgeWhenOneYearIsNegative() {
        AgeCalculator test4 = new AgeCalculator();
        int age4 = test4.ageCounter(2020, -1999);
        assertEquals(age4, 0, "Impossible value");
    }
}