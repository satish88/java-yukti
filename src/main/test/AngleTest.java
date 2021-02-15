import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AngleTest {
    @Test
    public void findTheAngleName() {
        Angle test1 = new Angle();
        String angleName1 = test1.angleName(264);
        assertEquals(angleName1, "Reflex angle.", "finding the angle name of 264 degree.");
    }

    @Test
    public void findTheAngleIfTheDegreeIsInNegative() {
        Angle test2 = new Angle();
        String angleName2 = test2.angleName(-180);
        assertEquals(angleName2, "invalid degree.", "enter the value of positive degree");
    }

    @Test
    public void angleNameIfValueIsZero() {
        Angle test3 = new Angle();
        String angleName3 = test3.angleName(0);
        assertEquals(angleName3, "Zero angle.", "find the name of zero degree angle");
    }


}