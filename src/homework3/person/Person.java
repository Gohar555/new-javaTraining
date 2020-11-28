package homework3.person;

public class Person {
    private int age;
    private String name;
    private Address address;
    private Job job;

    public Person(int age, String name, Address address, Job job) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.job = job;
    }

    public String getCompanyName() {
        return job.getCompany().getName();
    }

    public String toString() {
        return String.format("%d, %s, %s, %s,", age, name, address, job);
    }
}
