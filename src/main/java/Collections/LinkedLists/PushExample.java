package Collections.LinkedLists;

import java.util.LinkedList; 
  
public class PushExample { 
    // Main method 
    public static void main(String[] args) 
    { 
        LinkedList<String> animals = new LinkedList<>(); 
  
        animals.push("Elephant"); 
  
        animals.push("Tiger"); 
  
        animals.push("Lion"); 
  
        // Printing the complete stack. 
        System.out.println(animals); 
    } 
}