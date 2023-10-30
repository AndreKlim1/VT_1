package Task16;

public class BookAuthorTitlePriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book a, Book b) {
        if(a.getAuthor().compareTo(b.getAuthor())==0) {
            if(a.getTitle().compareTo(b.getTitle())==0){
                return a.getPrice() - b.getPrice();
            }
            else{
                return a.getTitle().compareTo(b.getTitle());
            }

        }
        else{
            return a.getAuthor().compareTo(b.getAuthor());
        }
    }
}