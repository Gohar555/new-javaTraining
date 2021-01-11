package homework7;

/**
 * Created by Gohar Farmanyan
 */
public class Asignee {

    private final String name;
    private final String surname;
    private final String position;

    public Asignee(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        Asignee asignee = (Asignee) o;
        if (position.equals(Asignee.position) &&
                name.equals(Asignee.name) &&
                surname.equals(Asignee.surname)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("{ name: %s,surname: %s, age: %s}", name, surname, position);
    }
}
