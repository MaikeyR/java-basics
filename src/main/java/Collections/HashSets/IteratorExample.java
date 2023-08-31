package Collections.HashSets;

import java.util.HashSet;
import java.util.Iterator; 
  
public class IteratorExample { 
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
        HashSet<String> animals = new HashSet<>(); 
  
        animals.add("Elephant"); 
        animals.add("Tiger"); 
        animals.add("Lion"); 

        // Displaying the HashSet 
        System.out.println("HashSet: " + animals); 
  
        // Creating an iterator 
        Iterator<String> iterator = animals.iterator(); 
  
        // Displaying the values after iterating through the set 
        System.out.println("The iterator values are: "); 
        while (iterator.hasNext()) { 
            System.out.println(iterator.next()); 
        } 
    } 
}