package Collections.HashMaps;

import java.util.HashMap;

public class HashMapExample {
  public static void main(String[] args) {
    HashMap<String, String> animals = new HashMap<String, String>();
    
    // putting a key-value pairs within a HashMap
    // animal -> name
    animals.put("Elephant", "Dicky");
    animals.put("Tiger", "Sammy");
    animals.put("Lion", "Sim");

    System.out.println(animals); 

    // accessing an item using get()
    // gives back the value to the specified key, which means it will return back "Sim"
    System.out.println("The name of 'Lion' is: " + animals.get("Lion"));

    // removing an item using remove()
    animals.remove("Elephant");

    // getting the size of the hash map
    System.out.println("The size of the hash map before clearing: " + animals.size());

    // clearing/deleting a whole hash map using clear()
    animals.clear();

    // getting the size of the hash map
    System.out.println("The size of the hash map after clearing: " + animals.size());
  }
}