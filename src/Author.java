public class Author {
    private String name;
    private String lastname;

    public Author(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Author o = (Author) other;
        return name.equals(o.name) && lastname.equals(o.lastname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, lastname);
    }

    @Override
    public String toString() {
        return String.join(" ", name, lastname);
    }
}
