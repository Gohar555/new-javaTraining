package homework6;

/**
 * Created by Gohar Farmanyan
 */
public class Authors {
    private final String name;
    private final String surname;
    private final int age;

    public Authors(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        Authors author = (Authors) o;
        if (age == author.age &&
                name.equals(author.name) &&
                surname.equals(author.surname)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("{ name: %s,surname: %s, age: %d}", name, surname, age);
    }
}
