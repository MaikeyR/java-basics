package Collections.LinkedLists;

import java.util.LinkedList; 
  
public class ClearExample { 
    public static void main(String args[]) 
    { 
        LinkedList<String> animals = new LinkedList<String>(); 
  
        animals.add("Elephant"); 
        animals.add("Tiger"); 
        animals.add("Lion"); 
  
        System.out.println("Before clear:" + animals); 
  
        animals.clear(); 

        System.out.println("After clear: " + animals); 
  
        // Adding elements after clearing the list 
        animals.add("Elephant"); 
        animals.add("Tiger"); 
        animals.add("Lion"); 
  
        System.out.println("After adding elements to empty list:" + animals); 
    } 
}