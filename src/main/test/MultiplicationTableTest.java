import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

@Test
public class MultiplicationTableTest {

    public void forListResult() {

        MultiplicationTable test = new MultiplicationTable();
        List<Integer> result = MultiplicationTable.multiplicationTable(3, 0);
        List<Integer> expected = Arrays.asList(0);
        assertEquals(result, expected);
    }
}