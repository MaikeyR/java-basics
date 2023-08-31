package Collections.HashSets;

import java.util.HashSet; 
  
public class ContainsExample { 
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
        HashSet<String> animals = new HashSet<>(); 
  
        animals.add("Elephant"); 
        animals.add("Tiger"); 
        animals.add("Lion"); 
  
        // Displaying the HashSet 
        System.out.println("HashSet: " + animals); 
  
        // Checking for "Lion" in the hash set
        System.out.println("Does the HashSet contain 'Lion'? " + animals.contains("Lion")); 
  
        // Checking for "Elephant" in the hash set
        System.out.println("Does the HashSet contain 'Elephant'? " + animals.contains("Elephant")); 
  
        // Checking for "Tiger" in the hash set
        System.out.println("Does the HashSet contain 'Tiger'? " + animals.contains("Tiger")); 

        // Checking for "Chicken" in the hash set 
        System.out.println("Does the HashSet contain 'Chicken'? " + animals.contains("Chicken")); 
    } 
}