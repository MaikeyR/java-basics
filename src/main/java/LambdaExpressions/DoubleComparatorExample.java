package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DoubleComparatorExample {
    public static void main(String[] args) {
        // Create a list of Double values
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.5);
        doubleList.add(1.2);
        doubleList.add(5.8);
        doubleList.add(2.7);
        doubleList.add(4.1);

        // Print the sorted list
        System.out.println("List (No Order):");
        for (Double value : doubleList) {
            System.out.println(value);
        }

        Comparator<Double> lambdaComparator = (x, y) -> x.compareTo(y);

        // Sort the list using the lambdaComparator
        Collections.sort(doubleList, lambdaComparator);
        

        // Print the sorted list
        System.out.println("Sorted List (Ascending Order):");
        for (Double value : doubleList) {
            System.out.println(value);
        }

        // Sort the list using the lambdaComparator
        Collections.sort(doubleList, lambdaComparator.reversed());

        // Print the sorted list
        System.out.println("Sorted List (Descending Order):");
        for (Double value : doubleList) {
            System.out.println(value);
        }
    }
}
