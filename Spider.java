package rit;
/**
 * This Object represents all spiders.
 */
public class Spider extends Animal {
  private int numberOfLegs;

  public Spider() {
    numberOfLegs = 8;
  }

  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  @Override
  public String move() {
    return "climb my web";
  }
}