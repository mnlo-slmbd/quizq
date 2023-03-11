package Generics.GenericsMethods;

public class GenericsMethods {

    public static <T> void printValue(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {

        Person p = new Person("Salumbides", "Manuelo", "Layosa");

        printValue(p);

    }
}
