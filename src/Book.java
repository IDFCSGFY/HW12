import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publishingYear;

    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Book o = (Book) other;
        return name.equals(o.name) && author.equals(o.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author.getName(), author.getLastname());
    }

    @Override
    public String toString() {
        return "\"" + name + "\"(" + publishingYear + ") " + author;
    }
}
