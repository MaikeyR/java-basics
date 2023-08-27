package Encapsulation;

public class Car {

  int currentSpeed;
  String name;

  public Car(String name) {
    this.name = name;
  }

  public void accelerate() {
    // add 10 miles per hour to current speed
    currentSpeed = currentSpeed + 10;
  }

  public void park() {
    // set current speed to zero
    currentSpeed = 0;
  }

  public void printCurrentSpeed() {
    // display the current speed of this car
    System.out.println("The current speed of " + name + " is " + currentSpeed + " mpH");
  }

  public int getCurrentSpeed() {
    return currentSpeed;
  }
}