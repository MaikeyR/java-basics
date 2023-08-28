package Interfaces;

public class Stone implements FoundObject {

  private String name;
  
  public Stone(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}