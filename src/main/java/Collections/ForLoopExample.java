package Collections;

import java.util.*;

public class ForLoopExample {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<String>();

    animals.add("Elephant");
    animals.add("Tiger");
    animals.add("Lion");

    for (String animal : animals)
      System.out.println(animal);
  }
}