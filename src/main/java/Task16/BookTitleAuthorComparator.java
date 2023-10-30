package Task16;

public class BookTitleAuthorComparator implements Comparator<Book>{
    @Override
    public int compare(Book a, Book b) {
        if(a.getTitle().compareTo(b.getTitle())==0) {
            return a.getAuthor().compareTo(b.getAuthor());
        }
        else{
            return a.getTitle().compareTo(b.getTitle());
        }
    }
}
