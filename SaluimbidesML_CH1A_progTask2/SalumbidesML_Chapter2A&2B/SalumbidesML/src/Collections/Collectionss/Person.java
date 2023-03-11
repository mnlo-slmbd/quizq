package Collections.Collectionss;

public class Person {

    private String name;
    private char gender;
    private int age;

    Person(String name, char gender) {

        this.name = name;
        this.gender = gender;

    }

    Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String toString() {

        return "[" + this.gender + "] " + this.name + " (" + this.age + ")";

    }

}
