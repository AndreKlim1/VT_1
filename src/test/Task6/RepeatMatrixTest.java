package Task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepeatMatrixTest {

    @Test
    public void simpleSeqTest() {
        RepeatMatrix test1 = new RepeatMatrix(new double[]{1, 2, 3, 4});
        Assertions.assertArrayEquals(new double[][]{{1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2}, {4, 1, 2, 3}}, test1.makeMatrix());
    }

}