package Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Hashtable;

public class TangentTest {

    @Test
    public void compareTableTest(){
        Tangent test1 = new Tangent(1, 5, 1);
        Hashtable testTable = new Hashtable();
        testTable.put(1.0, 1.56);
        testTable.put(2.0, -2.18);
        testTable.put(3.0, -0.14);
        testTable.put(4.0, 1.16);
        testTable.put(5.0, -3.38);
        Assertions.assertEquals(testTable, test1.makeTable());

    }
}
