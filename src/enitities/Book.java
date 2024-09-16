package enitities;

import java.time.LocalDate;
import java.util.Objects;

public class Book {

    private static int idCounter = 0;

    private Integer id;
    private String title;
    private Author author;
    private Boolean available = true;
    private LocalDate registrationDate;
    private LocalDate updateDate;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.registrationDate = LocalDate.now();;
        this.updateDate = LocalDate.now();;
        this.id = idCounter++;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public void loan(Client client){
        setAvailable(false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(available, book.available) && Objects.equals(registrationDate, book.registrationDate) && Objects.equals(updateDate, book.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, available, registrationDate, updateDate);
    }
}
