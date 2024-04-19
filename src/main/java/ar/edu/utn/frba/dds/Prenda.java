package ar.edu.utn.frba.dds;


public class Prenda {

  TipoPrenda tipoPrenda;
  Aspecto aspecto;

  public Prenda(TipoPrenda tipo, Aspecto aspecto) {

    if (tipo == null) {
      throw new IllegalArgumentException("El tipo de prenda es obligatorio");
    }

    this.tipoPrenda = tipo;

    this.aspecto = aspecto;
  }

  @Override
  public String toString() {

    if (aspecto.colorSecundario ==  null) {
      return "Prenda{"
          +
          "tipoPrenda=" + tipoPrenda
          +
          ", material: " + aspecto.material
          +
          ", tramado: " + aspecto.trama
          +
          " color primario: " + aspecto.colorPrimario
          +
          '}';
    }

    return "Prenda{"
        +
        "tipoPrenda=" + tipoPrenda
        +
        ", material: " + aspecto.material
        +
        ", tramado: " + aspecto.trama
        +
        " color primario: " + aspecto.colorPrimario
        +
        " color secundario: " + aspecto.colorSecundario
        +
        '}';
  }
}
