package Collections.LinkedLists;

import java.util.LinkedList; 
  
public class ContainsExample { 
   public static void main(String args[]) { 
      LinkedList<String> animals = new LinkedList<String>(); 
  
      animals.add("Elephant"); 
      animals.add("Tiger"); 
      animals.add("Lion"); 
    
      System.out.println("\nIs 'Lion' in the linkedlist: " + animals.contains("Lion")); 
      System.out.println("Is'Cat' in the linkedlist: " + animals.contains("Cat")); 
   } 
}