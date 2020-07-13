package de.tum.in.ase.eist;

public class Student {

    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName.replaceAll("[^A-Za-z]", "");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName.replaceAll("[^A-Za-z]", "");
        this.lastName = lastName;
    }

}
