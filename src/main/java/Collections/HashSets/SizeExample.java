package Collections.HashSets;

import java.util.HashSet; 
  
public class SizeExample { 
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
        HashSet<String> animals = new HashSet<>(); 
  
        animals.add("Elephant"); 
        animals.add("Tiger"); 
        animals.add("Lion"); 

        // Displaying the HashSet 
        System.out.println("HashSet: " + animals); 
  
        // Get the size of the hash set
        System.out.println("The size of the hash set is: " + animals.size()); 
    } 
}