package ar.edu.utn.frba.dds;

import java.util.Objects;

public class ColorRGB {

    private int red, green, blue;

    public ColorRGB(int red, int green, int blue){

        this.red = red;
        this.green = green;
        this.blue = blue;

    }

    static ColorRGB amarillo = new ColorRGB(255, 255, 0);

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
