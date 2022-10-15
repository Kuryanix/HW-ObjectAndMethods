public class Book {

    private String name;
    private final Author author;
    private int year;

    public Book (String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // ДЗ по методам объектов (1.10)

    @Override
    public String toString() {
        return ("Name: " + name + ", " + author + ", Year: " + year);
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != this.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        return name.equals(book2.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
