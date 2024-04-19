package ar.edu.utn.frba.dds;

public class Aspecto {

  public Color colorPrimario;
  public Color colorSecundario;
  public TramaDeTela trama;
  public Material material;

  public Aspecto(Color colorPrimario, Color colorSecundario, TramaDeTela trama, Material material) {

    this.trama = trama;
    if (colorPrimario == null) {
      throw new IllegalArgumentException("El color primario es obligatorio");
    }
    if (trama == null) {
      this.trama = TramaDeTela.LISA;
    }
    if (material == null) {
      throw new IllegalArgumentException("El tipo de material es obligatoria");
    }

    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.material = material;
  }



}
