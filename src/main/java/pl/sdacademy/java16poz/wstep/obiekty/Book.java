package pl.sdacademy.java16poz.wstep.obiekty;

import java.util.Date;

/**
 * Book
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 25.05.2019 09:39
 **/
public class Book {
    String ISBN;

    public Book(String ISBN, String author, String title) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.creationDate = new Date();
    }

    public Book(String author, String title) {
        this("",author,title);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    String author;
    String title;
    Date creationDate;

    @Override
    public String toString() {
        return "Book{" +
                " title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
