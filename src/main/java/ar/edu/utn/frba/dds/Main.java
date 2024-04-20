package ar.edu.utn.frba.dds;


/**
 * This is a Javadoc.com
 */
public class Main {

  /**
   * This is a Javadoc.com
   */
  public static void main(String[] args) {

    Borrador borrador = new Borrador();

    borrador.setTipoPrenda(TipoPrenda.REMERA);
    borrador.setColorPrimario(Color.BLANCO);
    borrador.setMaterial(TipoMaterial.ALGODON);
    borrador.setColorSecundario(Color.AZUL);

    Prenda prenda = borrador.buildPrenda();

    System.out.println("Prenda creada:{\n   " + prenda.getTipoPrenda() +  "\n   "
        + prenda.getTrama() + "\n   " + prenda.getMaterial()
        + "\n   " + prenda.getColorPrimario() + "\n   " + prenda.getColorSecundario() + "\n }");

  }

}