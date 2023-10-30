package Task15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

public class BookCompareTest {

    public Book[] swap(Book[] array, int indA, int indB){
        Book temp = array[indA];
        array[indA] = array[indB];
        array[indB] = temp;
        return array;
    }

    public Book[] sort(Book[] values){
        int i = 0;
        while(i<values.length-1){
            if(values[i].compareTo(values[i+1])<=0){
                i++;
            } else if (values[i].compareTo(values[i+1])>0) {
                values = swap(values, i, i+1);
                if(i!=0){
                    i--;
                }
            }
        }
        return values;
    }

    Book[] testShelf = new Book[]{new Book("Tolstoy", "War and peace", 20, 15, 2),
                                  new Book("Tolstoy", "War and War", 54, 23, 2),
                                  new Book("Toy", "Peace", 34, 9, 2),
                                  new Book("Tol", "And", 10, 6, 2)};

    @Test
    public void sortFuncTest() {
        Assertions.assertArrayEquals(new Book[]{
                new Book("Tol", "And", 10, 6, 2),
                new Book("Toy", "Peace", 34, 9, 2),
                new Book("Tolstoy", "War and peace", 20, 15, 2),
                new Book("Tolstoy", "War and War", 54, 23, 2)}, sort(testShelf));

    }

}