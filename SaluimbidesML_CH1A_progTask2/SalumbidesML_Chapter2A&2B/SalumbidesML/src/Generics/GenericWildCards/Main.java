package Generics.GenericWildCards;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // instantiate arrayList
        ArrayList<Integer> al = new ArrayList<>();

        // using unbound wildcards
        al.add(1);
        al.add(2);
        al.add(3);

        printlist(al);

        // instantiate arrayList
        ArrayList<String> alist = new ArrayList<>();

        alist.add("ONE");
        alist.add("TWO");
        alist.add("THREE");

        printlist(alist);

    }

    // create a method
    static void printlist(ArrayList<?> alist) {

        System.out.println(alist);

    }

}
