package Collections;

import java.util.*;

public class isEmptyExample {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<String>();

    System.out.println("Case 0:" + animals.isEmpty());

    animals.add("Tiger");
    System.out.println("Case 1:" + animals.isEmpty());

    animals.clear();
    System.out.println("Case 2:" + animals.isEmpty());
  }
}