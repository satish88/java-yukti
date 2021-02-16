import org.testng.Assert;
import org.testng.annotations.Test;

public class DynastyTest {

    @Test
    public void yearCommonInMoreThanOneDynasty() {
        Dynasty result = new Dynasty();
        String dynasty = result.dynastyTimeline(1947);
        Assert.assertEquals(dynasty, " British Raj Independent India");
    }

    @Test
    public void yearLessThanZeroShouldGiveNoInformationAvailable() {
        Dynasty result = new Dynasty();
        String dynasty = result.dynastyTimeline(-1);
        Assert.assertEquals(dynasty, "no Information. Invalid yr");
    }

}