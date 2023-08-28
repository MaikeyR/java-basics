package Interfaces;

public class WoodsSurvival {

  public static void main(String[] args) {
    // create an array of type FoundObject
    FoundObject backpack[] = new FoundObject[3];

    // create the objects we found in the woods
    FoundObject apple = new Apple("apple");
    FoundObject stone = new Stone("stone");
    FoundObject raspberry = new Raspberry("raspberry");

    // add the found objects to the backpack
    backpack[0] = apple;
    backpack[1] = stone;
    backpack[2] = raspberry;

    // iterate over the found objects
    for (int i = 0; i < backpack.length; i++) {
      FoundObject currentObject = backpack[i];
      // check if object is eatable
      if (currentObject instanceof Eatable) {
        // cast the object to eatable and execute eat method
        ((Eatable) currentObject).eat();
      } else {
        System.out.println("The " + currentObject.getName() + " is not eatable.");
      }
    }
  }
}