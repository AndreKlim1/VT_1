package Task15;

public class Book implements Comparable<Book> {
    private String author;
    private String title;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String author, String title, int price, int isbn, int edition){
        this.author = author;
        this.title = title;
        this.price = price;
        Book.edition = edition;
        this.isbn = isbn;
    }

    public int getIsbn() {return isbn;}
    public String getAuthor() {return author;}
    public String getTitle() {return title;}
    public int getPrice() {return price;}
    public int getEdition() {return edition;}

    @Override
    public boolean equals(Object obj){
        if(getClass() != obj.getClass()){
            return false;
        }
        Book book = (Book) obj;
        return (getAuthor().equals(book.getAuthor()) && getTitle().equals(book.getTitle()) && getPrice()==book.getPrice());
    }

    @Override
    public int hashCode(){
        int result = getTitle()==null ? 0 : getTitle().hashCode();
        result =29*result + (getAuthor()==null ? 0 : getAuthor().hashCode());
        result= 29*result + getPrice();
        result = 29*result + getEdition();
        return result;
    }

    @Override
    public Object clone(){
        return new Task14.Book(getAuthor(), getTitle(), getPrice(), getEdition());
    }

    @Override
    public String toString(){
        return"Book{"
                + "author = '" + getAuthor() + '\''
                + "title = '" + getTitle() + '\''
                + "price = '" + getPrice() + '\''
                + "edition = '" + getEdition()
                + "}";
    }

    @Override
    public int compareTo(Book o) {
        return getIsbn() - o.getIsbn();
    }
}
