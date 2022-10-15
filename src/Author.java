public class Author {

    private String firstName;
    private String secondName;

    public Author (String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    // ДЗ по методам объектов (1.10)

    @Override
    public String toString () {
        return ("Author: " + firstName + " " + secondName);
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author2 = (Author) other;
        return secondName.equals(author2.secondName) &&
                firstName.equals(author2.firstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(secondName);
    }
}
