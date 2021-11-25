package Comparator;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int personID;


    public Person(String firstName, String lastName, int personID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personID = personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPersonID() {
        return personID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personID=" + personID +
                '}';
    }
}
