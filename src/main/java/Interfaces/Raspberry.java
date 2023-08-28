package Interfaces;

public class Raspberry implements FoundObject, Eatable {

  private String name;
  
  public Raspberry(String name) {
    this.name = name;
  }
  
  @Override
  public void eat() {
    System.out.println("Yummy! you eat some " + this.name);
  }

}