package Library;

import java.util.Objects;

public class Book {
    private String title;
    private int numberOfChapters;
    private int numberOfPages;
    private Section section;
    private Author author;

    public Book(){

    }

    public Book(String title, int numberOfChapters, int numberOfPages, Section section, Author author){
        this.title = title;
        this.numberOfChapters = numberOfChapters;
        this.numberOfPages = numberOfPages;
        this.section = section;
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setNumberOfChapters(int numberOfChapters){
        this.numberOfChapters = numberOfChapters;
    }

    public int getNumberOfChapters(){
        return numberOfChapters;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public void setSection(Section section){
        this.section = section;
    }

    public Section getSection(){
        return section;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public Author getAuthor(){
        return author;
    }

    @Override
    public String toString() {
        return "Book : " + "title = "+ title +
                "; No. of chapters = " + numberOfChapters +
                "; No. of pages = " + numberOfPages +
                "; Section = " + section +
                "; Author = " + author + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return  numberOfChapters== book.numberOfChapters && numberOfPages == book.numberOfPages &&  Objects.equals(section, book.section) && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, numberOfChapters, numberOfPages, section);
        return result;
    }
}
