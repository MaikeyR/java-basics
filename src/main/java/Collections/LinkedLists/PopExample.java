package Collections.LinkedLists;

import java.util.LinkedList;

public class PopExample {
  public static void main(String args[]) { 
  
      LinkedList<String> animals = new LinkedList<>(); 
      
      // Pushing an element in the stack 
      animals.push("Elephant"); 
  
      // Pushing an element in the stack 
      animals.push("Tiger"); 
  
      // Pop an element from stack 
      String s = animals.pop(); 

      System.out.println(s);

      // Pushing an element in the stack 
      animals.push("Lion"); 
  
      // Printing the complete stack. 
      System.out.println(animals); 
   }
}