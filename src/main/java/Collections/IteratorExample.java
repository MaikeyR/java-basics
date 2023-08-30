package Collections;

import java.util.*;

public class IteratorExample {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<String>();
    animals.add("Elephant");
    animals.add("Tiger");
    animals.add("Lion");

    // Initializing an iterator
    Iterator<String> iterator = animals.iterator();

    // Using the iterator to visit each element
    while (iterator.hasNext())
      System.out.println(iterator.next());
  }
}