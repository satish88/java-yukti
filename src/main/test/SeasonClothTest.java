import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SeasonClothTest {

    @Test
    public void resultOfUnlistedClothName() {
        SeasonCloth test1 = new SeasonCloth();
        String season1 = test1.clothNameTellsSeason("Shorts");
        assertEquals(season1, "not listed cloth.");
    }


}