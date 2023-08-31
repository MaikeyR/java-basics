package Collections.HashSets;

import java.util.HashSet;
import java.util.Set;

class EnhancedForLoopExample{ 
  public static void main(String[] args) {
     Set<String> animals = new HashSet<>();
 
     //add elements to HashSet
     animals.add("Elephant");
     animals.add("Tiger");
     animals.add("Lion");
 
     for (String animal : animals) {
        System.out.println(animal);
     }
  }
}