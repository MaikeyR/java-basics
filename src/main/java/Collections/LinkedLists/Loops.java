package Collections.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class Loops {
  public static void main(String args[]) {
    LinkedList<String> linkedList = new LinkedList<>();

    System.out.println("Push");

    for (int k = 0; k < 5; k++) {
      linkedList.push(String.valueOf(k * k));
    }

    System.out.println();
    System.out.println("Get");

    for (int i = 0; i < linkedList.size(); i++) {
      System.out.println(linkedList.get(i));
    }

    System.out.println();
    System.out.println("Enhanced for loop");

    for (String temp : linkedList) {
      System.out.println(temp);
    }

    System.out.println();
    System.out.println("Size");
    

    int j = 0;
    while (j < linkedList.size()) {
      System.out.println(linkedList.get(j));
      j++;
    }

    System.out.println();
    System.out.println("Iterator");
    

    Iterator<String> iterator = linkedList.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    
    System.out.println();
    System.out.println("For each");
    

    linkedList.forEach((temp) -> {
      System.out.println(temp);
    });
  }
}
