package ar.edu.utn.frba.dds;


public class Main {
  public static void main(String[] args) {

    Material algodon = new Material(TramaDeTela.LISA);

    Material poliester = new Material(TramaDeTela.RAYADA);

    Prenda remeraAzul = new Prenda(TipoPrenda.REMERA, Color.AZUL, null,
        algodon);
    Prenda remeraAmarillaRallada = new Prenda(TipoPrenda.REMERA, Color.AMARILLO, Color.BLANCO,
        poliester);

    System.out.println(remeraAzul.toString());
    System.out.println(remeraAmarillaRallada.toString());
  }

}