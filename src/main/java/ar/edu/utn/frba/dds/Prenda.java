package ar.edu.utn.frba.dds;


public class Prenda {

  //Primer requerimiento: especificar el tipo de prenda que estoy cargando
  TipoPrenda tipoPrenda;

  //Segundo requerimiento: indicar el color de prenda principal
  Color colorPrendaPrimario;

  Color colorPrendaSecundario;

  Material material;

  public Prenda(TipoPrenda tipo, Color colorPrimario, Color colorSecundario, Material material) {

    if (colorPrimario == null) {
      throw new IllegalArgumentException("El color primario es obligatorio");
    }
    if (tipo == null) {
      throw new IllegalArgumentException("El tipo de prenda es obligatorio");
    }
    if (material == null) {
      throw new IllegalArgumentException("El material es obligatorio");
    }

    this.material = material;
    this.tipoPrenda = tipo;
    this.colorPrendaPrimario = colorPrimario;
    this.colorPrendaSecundario = colorSecundario;

  }

  @Override
  public String toString() {

    if (this.colorPrendaSecundario == null) {
      return "Prenda{"
          +
          "tipoPrenda=" + tipoPrenda
          +
          ", categoria=" + tipoPrenda.categoria
          +
          ", colorPrendaPrimario=" + colorPrendaPrimario
          +
          ", material=" + material
          +
          '}';
    }

    return "Prenda{"
        +
        "tipoPrenda=" + tipoPrenda
        +
        ", categoria=" + tipoPrenda.categoria
        +
        ", colorPrendaPrimario=" + colorPrendaPrimario
        +
        ", colorPrendaSecundario=" + colorPrendaSecundario
        +
        ", material=" + material
        +
        '}';
  }
}
