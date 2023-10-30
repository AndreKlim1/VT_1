package Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncrSeqTest {

    @Test
    public void standartArrTest() {
        IncrSeq test1 = new IncrSeq(new int[]{1, 3, 9, 2, 5, 4, 7, 5});
        Assertions.assertEquals(4, test1.maxSequence());
    }

    @Test
    public void sameElemArrTest() {
        IncrSeq test2 = new IncrSeq(new int[]{1, 1, 1, 1, 1});
        Assertions.assertEquals(4, test2.maxSequence());
    }
}