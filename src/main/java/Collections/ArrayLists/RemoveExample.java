package Collections.ArrayLists;

import java.util.*;

public class RemoveExample {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<String>();

    animals.add("Elephant");
    animals.add("Tiger");
    animals.add("Lion");

    animals.remove(1);

    for (int i = 0; i < animals.size(); i++)
      System.out.println(i + ": " + animals.get(i));

  }
}