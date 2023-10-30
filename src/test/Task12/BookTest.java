package Task12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    Book testBook = new Book("Tolstoy", "War and peace", 20, 2);

    @Test
    public void equalFuncTest() {
        Book test1 = new Book("Tolstoy", "War and war", 19, 2);
        Assertions.assertEquals(false, test1.equals(testBook));
    }

    @Test
    public void hashCodeFuncTest() {
        Book test2 = new Book("Tolstoy", "War and peace", 20, 2);
        Assertions.assertEquals(testBook.hashCode(), test2.hashCode());
    }

    @Test
    public void toStringFuncTest() {
        Assertions.assertEquals("Book{"
                + "author = '" + "Tolstoy" + '\''
                + "title = '" + "War and peace" + '\''
                + "price = '" + "20" + '\''
                + "edition = '" + "2"
                + "}", testBook.toString());
    }
}