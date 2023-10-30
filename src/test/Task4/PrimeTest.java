package Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PrimeTest {

    @Test
    public void simpleArrTest() {
        Prime test1 = new Prime(new int[]{5, 2, 8, 1, 7, 3, 9, 12});
        Assertions.assertArrayEquals( new int[]{0, 1, 4, 5}, test1.primeSearch());
    }

    @Test
    public void sameElemArrTest() {
        Prime test2 = new Prime(new int[]{1, 1, 1, 1, 1, 1});
        Assertions.assertArrayEquals(new int[]{}, test2.primeSearch());
    }
}