package enitities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void showBooks(){
        System.out.println("Livros disponíveis:\n");

        for(Book book : books){
            if(book.getAvailable()){
                System.out.printf("ID %d: %s, %s \n",book.getId(), book.getTitle(), book.getAuthor().getName());
            }
        }
    }

    public Book getBookById(int id){
        for(Book book : books){
            if(book.getId() == id){
                return book;
            }
            else{
                System.out.printf("Não foi encontrado nenhum livro com o ID %d", id);
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(books, library.books) && Objects.equals(authors, library.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books, authors);
    }
}