package Collections.HashSets;

import java.util.HashSet; 
  
public class HashSetExample { 
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
        HashSet<String> animals = new HashSet<>(); 
  
        animals.add("Elephant"); 
        animals.add("Tiger"); 
        animals.add("Lion"); 
  
        // Displaying the HashSet 
        System.out.println("HashSet: " + animals); 
    } 
}