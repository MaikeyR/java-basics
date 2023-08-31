package Collections.ArrayLists;

import java.util.*;

public class SizeExample
{
  public static void main ( String[] args)
  {
    ArrayList<String> animals = new ArrayList<String>();

    animals.add("Elephant");
    animals.add("Tiger");
    animals.add("Lion");

    System.out.println("Size of ArrayList: " + animals.size());
  }
}