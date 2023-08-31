package Collections.ArrayLists;

import java.util.*;

public class IteratorExample {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<String>();

    animals.add("Elephant");
    animals.add("Tiger");
    animals.add("Lion");

    Iterator<String> iterator = animals.iterator();

    while (iterator.hasNext())
      System.out.println(iterator.next());
  }
}