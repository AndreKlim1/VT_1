package Task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsArrTest {

    @Test
    public void insertionTest() {
        InsArr test1 = new InsArr(new double[]{3, 5, 6, 8}, new double[]{2, 5, 5, 7, 9});
        Assertions.assertArrayEquals(new double[]{2, 3, 5, 5, 5, 6, 7, 8, 9}, test1.combineLists());
    }

}