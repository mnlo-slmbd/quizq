package Generics.GenericsMethods;

public class Person {
    // add attributes
    private String lastname, firstname, middlename;

    // add constructors
    Person(String lastname, String firstname, String middlename) {

        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
    }

    // get and set using setters and getters
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    // use toString to return a string presentation of an object
    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + this.middlename;

    }
}
