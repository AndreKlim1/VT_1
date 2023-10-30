package Task13;

import Task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public String getLanguage() {return language;}
    public int getLevel() {return level;}


    public ProgrammerBook(String author, String title, int price, int edition, String language, int level){
        super(author, title, price, edition);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj){
        if(getClass() != obj.getClass()){
            return false;
        }
        ProgrammerBook book = (ProgrammerBook) obj;
        return (getAuthor().equals(book.getAuthor()) && getTitle().equals(book.getTitle()) &&
                getPrice()==book.getPrice() && getLanguage().equals(book.getLanguage()) &&
                getLevel()==book.getLevel());
    }

    @Override
    public int hashCode(){
        int result = getTitle()==null ? 0 : getTitle().hashCode();
        result =29*result + (getAuthor()==null ? 0 : getAuthor().hashCode());
        result =29*result + (getLanguage()==null ? 0 : getLanguage().hashCode());
        result= 29*result + getLevel();
        result= 29*result + getPrice();
        result = 29*result + getEdition();
        return result;
    }

    @Override
    public String toString(){
        return"ProgrammerBook{"
                + "author = '" + getAuthor() + '\''
                + "title = '" + getTitle() + '\''
                + "price = '" + getPrice() + '\''
                + "edition = '" + getEdition() + '\''
                + "language = '" + getLanguage() + '\''
                + "level = '" + getLevel()
                + "}";
    }
}
