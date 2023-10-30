package Task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrTest {

    @Test
    public void sortSeqTest() {
        SortArr test1 = new SortArr(new double[]{1, 6, 3, 8, 9, 4, 2, 5});
        Assertions.assertArrayEquals(new double[]{1, 2, 3, 4, 5, 6, 8, 9}, test1.sort());
    }
}