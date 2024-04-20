package ar.edu.utn.frba.dds;


/**
 * This is a Javadoc.com
 */
public class Main {

  /**
   * This is a Javadoc.com
   */
  public static void main(String[] args) {

    Aspecto cueroConLunares = new Aspecto(Color.AZUL, null, Trama.LUNARES, Material.CUERO);
    Aspecto poliesterLiso = new Aspecto(Color.AMARILLO, Color.BLANCO, null, Material.POLIESTER);

    Prenda remeraAzul = new Prenda(TipoPrenda.REMERA, cueroConLunares);
    Prenda remeraAmarillaRallada = new Prenda(TipoPrenda.REMERA, poliesterLiso);

    System.out.println(remeraAzul.toString());
    System.out.println(remeraAmarillaRallada.toString());
  }

}