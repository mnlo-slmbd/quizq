package Generics.UpperWildCardMethods;

import java.util.*;

public class Main {

    // create a method of sumList that takes a list
    public static double sumList(List<? extends Number> list) {
        // create a variable double sum with value
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        // create a return statement
        return sum;
    }

    // create a main method
    public static void main(String[] args) {

        // instantiate inlist
        List<Integer> intList = new ArrayList<>();
        // set and add values
        intList.add(1);
        intList.add(2);
        intList.add(3);

        double sum = sumList(intList);
        System.out.println("Sum of integers: " + sum);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);

        sum = sumList(doubleList);
        System.out.println("Sum of doubles: " + sum);
    }
}
