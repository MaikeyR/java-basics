package Collections.HashSets;

import java.util.HashSet; 
  
public class CloneExample { 
    @SuppressWarnings("unchecked")
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
        HashSet<String> animals = new HashSet<>(); 
  
        animals.add("Elephant"); 
        animals.add("Tiger"); 
        animals.add("Lion"); 

        System.out.println("HashSet: " + animals); 
  
        // Creating a new set
        HashSet<String> clonedSet = new HashSet<>(); 
  
        // Cloning the set using clone() method
        
        clonedSet = (HashSet<String>)animals.clone(); 
  
        // Displaying the new hashset; 
        System.out.println("The new set: " + clonedSet); 
    } 
}