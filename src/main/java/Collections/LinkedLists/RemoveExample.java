package Collections.LinkedLists;

import java.util.LinkedList; 
  
public class RemoveExample { 
    public static void main(String args[]) 
    { 
        LinkedList<String> animals = new LinkedList<String>(); 
  
        animals.add("Elephant"); 
        animals.add("Tiger"); 
        animals.add("Lion"); 

        System.out.println("LinkedList:" + animals); 
  
        // Remove the head using remove() 
        animals.remove(); 
  
        // Print the final list 
        System.out.println("Final LinkedList:" + animals); 
    } 
} 