import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ColorTypeTest {

    @Test
    public void findTheColorType() {
        ColorType test1 = new ColorType();
        String colorType1 = test1.primeColor("Red");
        assertEquals(colorType1, "Prime Color", "write the prime color");
    }

    @Test
    public void writeTheNonPrimeColor() {
        ColorType test2 = new ColorType();
        String colorType2 = test2.primeColor("Green");
        assertEquals(colorType2, "Invalid input! This not prime color.", "write any prime color");
    }

    @Test
    public void resultOfTwoColor() {
        ColorType test4 = new ColorType();
        String colorType4 = test4.secondaryColor("Green", "Blue");
        assertEquals(colorType4, "No Color Available", "add two prime colors");
    }


}