package homework3.person;

public class PersonMain {
    public static Person[] data = new Person[3];

    static {
        Address address = new Address("Armenia", "Yerevan", "Israyelyan 21", 1505);
        Address workAddress = new Address("Armenia", "Yerevan", "Armenakyan 2/5", 1505);
        Company company = new Company("Webbfontaine", workAddress);
        Job job = new Job();
        Person person = new Person(18, "Hamo", address, job);

        data[0] = new Person(10, "Gohar", address, job);
        data[1] = new Person(20, "Vardan", address, job);
        data[2] = new Person(30, "Garik", address, job);
    }
}

