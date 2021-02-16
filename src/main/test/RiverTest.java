import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RiverTest {

    @Test
    public void findTheLengthOfTheRiver() {
        River test1 = new River();
        String length1 = test1.riverName("Namrada");
        assertEquals(length1, "1312Km");
    }

    @Test
    public void resultOfUnlistedRiver() {
        River test2 = new River();
        String length2 = test2.riverName("Tapi");
        assertEquals(length2, "unlisted river");
    }
}