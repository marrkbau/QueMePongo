package ar.edu.utn.frba.dds;

import static ar.edu.utn.frba.dds.ColorRGB.amarillo;
import static ar.edu.utn.frba.dds.TipoPrenda.CAMISA;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

       Prenda camisaAmarilla = new Prenda(CAMISA, "algodón", amarillo);


        System.out.println(camisaAmarilla.getMaterial());
        System.out.println(camisaAmarilla.getTipo().categoria.toString());
        System.out.println("color en rgb: " + camisaAmarilla.getColor().getRed() + " " +
                camisaAmarilla.getColor().getGreen() + " " + camisaAmarilla.getColor().getBlue());

    }
}