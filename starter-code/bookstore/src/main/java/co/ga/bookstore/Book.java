package co.ga.bookstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Book entity to represent books in our data model. A book has a title.
 * We'll be able to search for books by title in {@link BookRepository}.
 * I won this code because I added the comments to it LOL
 *
 * @author alex
 * @author Steve $ Money
 * @version 1.0
 * @since 0.0.1
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;

    /**
     * The default constructor.
     */
    public Book() {
    }

    /**
     * Constructor with title as an argument
     * @param title the title for this book
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Gets the id of the Book object
     * @return id the id of the Book object
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id to the Book object
     * @param id the id of the Book object
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the title of the Book object
     * @return title of the Book object
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the Book object
     * @param title the title of the Book object
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the Book object
     * @return the author of the Book object
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the Book object
     * @param author the author of the Book object
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    /**
     * Outputs the object as a JSON string
     * @return a JSON object of the book object
     */
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
