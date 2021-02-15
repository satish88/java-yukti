import org.testng.Assert;
import org.testng.annotations.Test;

public class DynastyTest {

    @Test
    public void test1() {
        Dynasty result = new Dynasty();
        String dynasty = result.dynastyTimeline(647);
        System.out.println(dynasty);
        Assert.assertEquals(dynasty, "Kushana dynasty");
    }

    @Test
    public void yearLessThanZeroShouldGiveNoInformationAvailable() {
        Dynasty result = new Dynasty();
        String dynasty = result.dynastyTimeline(-1);
        System.out.println(dynasty);
        Assert.assertEquals(dynasty, "no Information. Invalid yr");
    }

}