package rit;
/**
 * This Object holds an RGB color definition.
 * 
 * WHAT PRICIPLE IS VIOLATED?
 * <<your answer here>>
 */
public class Color {
  public int red;
  public int green;
  public int blue;
  
  public String getCssCode() {
    return "#"
        + Integer.toHexString(red)
        + Integer.toHexString(green)
        + Integer.toHexString(blue);
  }
}