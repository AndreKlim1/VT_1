package Task16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookComparatorTest {

    BookTitleComparator btc = new BookTitleComparator();
    BookAuthorTitleComparator batc = new BookAuthorTitleComparator();
    BookTitleAuthorComparator btac = new BookTitleAuthorComparator();
    BookAuthorTitlePriceComparator batpc = new BookAuthorTitlePriceComparator();

    public Book[] swap(Book[] array, int indA, int indB){
        Book temp = array[indA];
        array[indA] = array[indB];
        array[indB] = temp;
        return array;
    }

    public Book[] sort(Book[] values, Comparator comparator){
        int i = 0;
        while(i<values.length-1){
            if(comparator.compare(values[i], values[i+1])<=0){
                i++;
            } else if (comparator.compare(values[i], values[i+1])>0) {
                values = swap(values, i, i+1);
                if(i!=0){
                    i--;
                }
            }
        }
        return values;
    }

    Book[] testShelf = new Book[]{new Book("Tolstoy", "War and peace", 20, 2),
                                  new Book("Tolstoy", "War and War", 54, 2),
                                  new Book("Toy", "Peace", 34, 2),
                                  new Book("Tol", "And", 10, 2)};

    @Test
    public void titleCompTest() {
        Assertions.assertArrayEquals(new Book[]{
                new Book("Tol", "And", 10,  2),
                new Book("Toy", "Peace", 34,  2),
                new Book("Tolstoy", "War and War", 54,  2),
                new Book("Tolstoy", "War and peace", 20,  2)}, sort(testShelf, btc));

    }

    @Test
    public void authorTitleCompTest2() {
        Assertions.assertArrayEquals(new Book[]{
                new Book("Tol", "And", 10,  2),
                new Book("Tolstoy", "War and War", 54,  2),
                new Book("Tolstoy", "War and peace", 20,  2),
                new Book("Toy", "Peace", 34,  2)}, sort(testShelf, batc));

    }

    @Test
    public void titleAuthorTest() {
        Assertions.assertArrayEquals(new Book[]{
                new Book("Tol", "And", 10,  2),
                new Book("Toy", "Peace", 34,  2),
                new Book("Tolstoy", "War and War", 54,  2),
                new Book("Tolstoy", "War and peace", 20,  2)}, sort(testShelf, btac));

    }

    @Test
    public void authorTitlePriceTest() {
        Assertions.assertArrayEquals(new Book[]{
                new Book("Tol", "And", 10,  2),
                new Book("Tolstoy", "War and War", 54,  2),
                new Book("Tolstoy", "War and peace", 20,  2),
                new Book("Toy", "Peace", 34,  2)}, sort(testShelf, batpc));

    }

}