package Collections.HashSets;

import java.util.HashSet; 
  
public class EmptyExample { 
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
        HashSet<String> animals = new HashSet<>(); 
  
        animals.add("Elephant"); 
        animals.add("Tiger"); 
        animals.add("Lion"); 

        // Displaying the HashSet 
        System.out.println("HashSet: " + animals); 
  
        // Check for the empty set 
        System.out.println("Is the hash set empty: " + animals.isEmpty()); 

        animals.clear(); 
  
        // Checking after we've cleared it out
        System.out.println("Is the hash set empty: " + animals.isEmpty()); 
    } 
}