package Task14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookCloneTest {

    Book testBook = new Book("Tolstoy", "War and peace", 20, 2);

    @Test
    public void cloneFuncTest() {
        Book test1 = (Book)testBook.clone();
        Assertions.assertEquals(testBook, test1);
    }

}