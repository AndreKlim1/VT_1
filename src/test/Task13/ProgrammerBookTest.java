package Task13;

import Task12.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgrammerBookTest {

    ProgrammerBook testBook = new ProgrammerBook("Tolstoy", "War and peace", 20, 2, "Russian", 3);

    @Test
    public void equalsFuncTest() {
        ProgrammerBook test1 = new ProgrammerBook("Tolstoy", "War and peace", 20, 2, "English", 4);
        Assertions.assertEquals(false, test1.equals(testBook));
    }

    @Test
    public void hashCodeFuncTest() {
        ProgrammerBook test2 = new ProgrammerBook("Tolstoy", "War and peace", 20, 2, "Russian", 3);
        Assertions.assertEquals(testBook.hashCode(), test2.hashCode());
    }

    @Test
    public void toStringFuncTest() {
        Assertions.assertEquals("ProgrammerBook{"
                + "author = '" + "Tolstoy" + '\''
                + "title = '" + "War and peace" + '\''
                + "price = '" + "20" + '\''
                + "edition = '" + "2" + '\''
                + "language = '" + "Russian" + '\''
                + "level = '" + "3"
                + "}", testBook.toString());
    }
}