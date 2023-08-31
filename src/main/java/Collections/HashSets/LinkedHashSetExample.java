package Collections.HashSets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
  public static void main(String[] args) {
    LinkedHashSet<String> coins = new LinkedHashSet<String>();

    // Adding element to LinkedHashSet
    coins.add("5");
    coins.add("10");
    coins.add("20");
    coins.add("50");
    coins.add("100");

    // Adding a duplicate would result in no addition of the element
    coins.add("5");
    // Adding another coin value
    coins.add("75");

    System.out.println("Size of the list = " +
        coins.size());
    System.out.println("Original LinkedHashSet:" + coins);
    System.out.println("Removing 75 from LinkedHashSet: " +
        coins.remove("75"));
    System.out.println("Checking if 50 is present=" +
        coins.contains("50"));
    System.out.println("Updated LinkedHashSet: " + coins);
  }
}