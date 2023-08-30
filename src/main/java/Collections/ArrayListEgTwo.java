package Collections;

import java.util.*;

public class ArrayListEgTwo {

  public static void main(String[] args) {
    // Create an ArrayList that consists of Strings
    ArrayList<String> animals = new ArrayList<String>();

    // Capacity starts at 10, but size starts at 0
    System.out.println("initial size: " + animals.size());

    // Populating some of the arraylist
    animals.add("Elephant");
    animals.add("Tiger");
    animals.add("Lion");
    System.out.println("new size: " + animals.size());
  }
}