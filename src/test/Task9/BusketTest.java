package Task9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BusketTest {

    @Test
    public void colorAndAmountTest() {
        Busket test1 = new Busket(new Ball[] {new Ball(5.6, "Red"),
                                              new Ball(2.0, "Blue"),
                                              new Ball(3.2, "Green"),
                                              new Ball(4.1, "Blue")});
        Assertions.assertEquals(2, test1.blueAmount());
        Assertions.assertEquals(14.9, test1.wholeWeight());
    }
}