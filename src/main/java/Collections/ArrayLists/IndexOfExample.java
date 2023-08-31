package Collections.ArrayLists;

import java.util.*;

public class IndexOfExample {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<String>();

    animals.add("Elephant");
    animals.add("Tiger");
    animals.add("Lion");

    System.out.println("Index of 'Elephant': " + animals.indexOf("Elephant"));
    System.out.println("Index of 'Lion': " + animals.indexOf("Lion"));
  }
}