package ar.edu.utn.frba.dds;

/**
 * This is a Javadoc.com
 */
public class Prenda {

  TipoPrenda tipoPrenda;
  Aspecto aspecto;

  /**
   * This is a Javadoc.com
   */
  public Prenda(TipoPrenda tipo, Aspecto aspecto) {

    if (tipo == null) {
      throw new IllegalArgumentException("El tipo de prenda es obligatorio");
    }
    this.tipoPrenda = tipo;
    this.aspecto = aspecto;
  }

  @Override
  public String toString() {

    if (aspecto.getColorSecundario() ==  null) {
      return "Prenda{"
          +
          "tipoPrenda: " + tipoPrenda
          +
          ", categoria: " + tipoPrenda.getCategoria()
          +
          ", material: " + aspecto.getMaterial()
          +
          ", tramado: " + aspecto.getTrama()
          +
          ", color primario: " + aspecto.getColorPrimario()
          +
          '}';
    }

    return "Prenda{"
        +
        "tipoPrenda: " + tipoPrenda
        +
        ", categoria: " + tipoPrenda.getCategoria()
        +
        ", material: " + aspecto.getMaterial()
        +
        ", tramado: " + aspecto.getTrama()
        +
        ", color primario: " + aspecto.getColorPrimario()
        +
        ", color secundario: " + aspecto.getColorSecundario()
        +
        '}';
  }
}
