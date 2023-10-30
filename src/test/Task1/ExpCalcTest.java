package Task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ExpCalcTest {

    @Test
    public void zeroTest() {
        ExpCalc test1 = new ExpCalc(0, 0);
        Assertions.assertEquals(0.5, test1.completeSolution(), 0.01);
    }

    @Test
    public void numTest() {
        ExpCalc test2 = new ExpCalc(2, 0);
        Assertions.assertEquals(2.46, test2.completeSolution(), 0.1);
    }
}