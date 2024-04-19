package ar.edu.utn.frba.dds;


public class Main {
  public static void main(String[] args) {

    Prenda remeraAzul = new Prenda(TipoPrenda.REMERA, Color.AZUL, null,
        Material.ALGODON);
    Prenda remeraAmarillaRallada = new Prenda(TipoPrenda.REMERA, Color.AMARILLO, Color.BLANCO,
        Material.POLIESTER);

    System.out.println(remeraAzul.toString());
    System.out.println(remeraAmarillaRallada.toString());
  }

}