package rit;
/**
 * This Object represents all dogs.
 */
public class Dog extends Animal {
  private int numberOfLegs;

  public Dog() {
    numberOfLegs = 4;
  }

  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  @Override
  public String move() {
    return "chase my tail";
  }
}