package Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DotInAreaTest {

    @Test
    public void trueStateTest() {
        DotInArea test1 = new DotInArea(2, 3 );
        Assertions.assertEquals(true, test1.checkDotsPosition());
    }

    @Test
    public void falseStateTest2() {
        DotInArea test2 = new DotInArea(-6, 2 );
        Assertions.assertEquals(false, test2.checkDotsPosition());
    }
}