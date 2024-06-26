package Seminar4;

public class User {
    protected String firstName;
    protected String secondName;
    protected String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
    return "User{" +
            " firstName = ' " + firstName + '\'' +
            ", secondName = ' " + secondName + '\'' +
            ", lastName = ' " + lastName + '\'' +
            '}';
    }
}
