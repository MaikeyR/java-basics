package Collections.HashSets;

import java.util.HashSet; 
  
public class RemoveExample { 
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
        HashSet<String> animals = new HashSet<>(); 
  
        animals.add("Elephant"); 
        animals.add("Tiger"); 
        animals.add("Lion"); 

        // Displaying the HashSet 
        System.out.println("HashSet: " + animals); 

        animals.remove("Elephant"); 
        animals.remove("Lion"); 
  
        // Displaying the HashSet after removal 
        System.out.println("HashSet after removing elements: " + animals); 
    } 
}