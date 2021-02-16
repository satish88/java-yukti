import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CropTypeTest {

    @Test
    public void cropSeason() {
        CropType test1 = new CropType();
        String seasonTime1 = test1.cropGrowInTheSeason("Mustard");
        assertEquals(seasonTime1, "Rabi/winter crop , November to April.", "know the crop season and month");
    }

    @Test
    public void typeWrongCropName() {
        CropType test2 = new CropType();
        String seasonTime2 = test2.cropGrowInTheSeason("mustard");
        assertEquals(seasonTime2, "Invalid crop name", "Check the crop name");
    }

}