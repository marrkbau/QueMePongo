package ar.edu.utn.frba.dds;

import java.util.Objects;

/**
 * This is a Javadoc.com
 */
public class Prenda {

  private final TipoPrenda tipoPrenda;
  private final TipoMaterial material;
  private final Color colorPrimario;
  private final Color colorSecundario;
  private final Trama trama;


  /**
   * This is a Javadoc.com
   */
  public Prenda(TipoPrenda tipo, TipoMaterial material, Color colorPrimario, Color colorSecundario,
                Trama trama) {

    if (tipo == null) {
      throw new IllegalArgumentException("El tipo de prenda es obligatorio");
    }
    if (colorPrimario == null) {
      throw new IllegalArgumentException("El color primario es obligatorio");
    }

    this.trama = Objects.requireNonNullElse(trama, Trama.LISA);

    if (material == null) {
      throw new IllegalArgumentException("El tipo de material es obligatoria");
    }

    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.material = material;
    this.tipoPrenda = tipo;
  }


  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  public TipoMaterial getMaterial() {
    return material;
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
}
