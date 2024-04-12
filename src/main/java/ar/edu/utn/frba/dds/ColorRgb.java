package ar.edu.utn.frba.dds;



public class ColorRgb {

  private final int red;
  private final int green;
  private final int blue;

  public ColorRgb(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;

  }

  static ColorRgb amarillo = new ColorRgb(255, 255, 0);

  public int getRed() {
    return red;
  }

  public int getGreen() {
    return green;
  }

  public int getBlue() {
    return blue;
  }
}
