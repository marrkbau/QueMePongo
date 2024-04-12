package ar.edu.utn.frba.dds;

import static ar.edu.utn.frba.dds.ColorRgb.amarillo;
import static ar.edu.utn.frba.dds.TipoPrenda.CAMISA;

public class Main {
  public static void main(String[] args) {
    Prenda camisaAmarilla = new Prenda(CAMISA, "algodón", amarillo);
    System.out.println(camisaAmarilla.toString());
  }
}