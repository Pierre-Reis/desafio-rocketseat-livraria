package enitities;

import java.time.LocalDate;
import java.util.Objects;

public class Author {

    private static int idCounter = 0;

    private Integer id;
    private String name;
    private LocalDate birthdate;

    public Author(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.id = idCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) && Objects.equals(name, author.name) && Objects.equals(birthdate, author.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthdate);
    }
}
