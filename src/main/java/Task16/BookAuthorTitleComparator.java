package Task16;

public class BookAuthorTitleComparator implements Comparator<Book>{
    @Override
    public int compare(Book a, Book b) {
        if(a.getAuthor().compareTo(b.getAuthor())==0) {
            return a.getTitle().compareTo(b.getTitle());
        }
        else{
            return a.getAuthor().compareTo(b.getAuthor());
        }
    }

}
