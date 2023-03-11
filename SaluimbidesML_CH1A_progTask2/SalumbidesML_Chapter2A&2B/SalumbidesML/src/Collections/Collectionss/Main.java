package Collections.Collectionss;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Arraylist");

        ArrayList<Person> alPerson = new ArrayList<>();
        alPerson.add(new Person("Jose Rizal", 'M'));

        Person p = new Person("Teodora", 'F');
        p.setAge(60);

        alPerson.add(p);
        alPerson.add(1, new Person("Juan Luna", 'M'));

        alPerson.forEach((x) -> {

            System.out.println(x);

        });

        p = alPerson.get(1);
        p.setAge(30);
        alPerson.set(0, p);

        alPerson.forEach((x) -> {

            System.out.println(x);

        });

        System.out.println("\n\nLinkedlist");

        LinkedList<Person> liPerson = new LinkedList<>();
        liPerson.add(new Person("Jose Rizal", 'M'));
        Person p1 = new Person("Teodora Alonzo ", 'F');

        p1.setAge(60);

        liPerson.add(p1);

        liPerson.add(1, new Person("Juan Luna ", 'M'));

        liPerson.forEach((x) -> {

            System.out.println(x);
        });

        while (!liPerson.isEmpty()) {

            System.out.println(liPerson.removeLast());

        }

        System.out.println("\nVEctor");

        Vector<Person> vPerson = new Vector<>();

        vPerson.addElement(new Person("Jose Rizal", 'M'));
        Person p3 = new Person("Teodora Alonzo", 'F');
        p3.setAge(60);

        vPerson.addElement(p3);
        vPerson.add(0, new Person("Juan Luna ", 'M'));

        vPerson.set(2, new Person("Andres Bonifacio", 'M'));
        vPerson.forEach((x) -> {
            System.out.println(x);

        });

        System.out.println("\nStack");

        Stack<Person> sPerson = new Stack<>();

        sPerson.push(new Person("Jose Rizal", 'M'));
        Person p4 = new Person("Teodora Alonzo", 'F');

        p4.setAge(60);

        sPerson.push(p4);

        sPerson.push(new Person("Juan Luna", 'M'));

        while (!sPerson.isEmpty()) {

            System.out.println(sPerson.pop());
        }

        System.out.println("\nHashSets");

        HashSet<String> hsNames = new HashSet<>();

        hsNames.add("joni");
        hsNames.add("ags");
        hsNames.add("marvs");
        hsNames.add("junar");
        hsNames.add("null");
        hsNames.add("ags");

        System.out.println(hsNames);

        System.out.println("\nTressSets");

        TreeSet<String> tsnames = new TreeSet<>();

        tsnames.add("Joni");
        tsnames.add("agrs");
        tsnames.add("marvs");
        tsnames.add("Junar");
        tsnames.add("args");
        tsnames.add("jay");

        System.out.println(tsnames);

        System.out.println("\nLinkedHashSets");
        LinkedHashSet<Person> hsPerson = new LinkedHashSet<>();

        hsPerson.add(new Person("Reyes Agnes", 'F'));
        hsPerson.add(new Person("Danilla, Junar", 'M'));
        hsPerson.add(new Person("MONTEAGUDO, MARVIN", 'M'));
        hsPerson.add(new Person("Reyes Agnes", 'F'));

        hsPerson.forEach((x) -> {

            System.out.println(x);

        });

        System.out.println("Hashmap class");

    }
}
