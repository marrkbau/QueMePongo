package ar.edu.utn.frba.dds;

/**
 * This is a Javadoc.com
 */
public class Aspecto {

  private final Color colorPrimario;
  private final Color colorSecundario;
  private Trama trama;
  private final Material material;

  /**
   * This is a Javadoc.com
   */
  public Aspecto(Color colorPrimario, Color colorSecundario, Trama trama, Material material) {

    this.trama = trama;
    if (colorPrimario == null) {
      throw new IllegalArgumentException("El color primario es obligatorio");
    }
    if (trama == null) {
      this.trama = Trama.LISA;
    }
    if (material == null) {
      throw new IllegalArgumentException("El tipo de material es obligatoria");
    }

    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.material = material;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public Trama getTrama() {
    return trama;
  }

  public Material getMaterial() {
    return material;
  }
}
