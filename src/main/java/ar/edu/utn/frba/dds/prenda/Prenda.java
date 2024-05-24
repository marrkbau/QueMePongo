package ar.edu.utn.frba.dds.prenda;

import ar.edu.utn.frba.dds.exceptions.ColorPrimarioObligatorioException;
import ar.edu.utn.frba.dds.exceptions.MaterialObligatorioException;
import ar.edu.utn.frba.dds.exceptions.TipoPrendaObligatorioException;
import ar.edu.utn.frba.dds.material.Color;
import ar.edu.utn.frba.dds.material.TipoMaterial;
import ar.edu.utn.frba.dds.material.Trama;
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

  private Integer temperaturaMaximaAdecuada;

  private final Formalidad formalidad;


  /**
   * This is a Javadoc.com
   */
  public Prenda(TipoPrenda tipo, TipoMaterial material, Color colorPrimario, Color colorSecundario,
                Trama trama, Formalidad formalidad) {

    validarTipoPrenda(tipo);
    validarColorPrimario(colorPrimario);
    validarMaterial(material);


    this.trama = Objects.requireNonNullElse(trama, Trama.LISA);
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.material = material;
    this.tipoPrenda = tipo;
    this.formalidad = formalidad;
  }

  public void validarMaterial(TipoMaterial material) {
    if (material == null) {
      throw new MaterialObligatorioException("El tipo de material es obligatoria");
    }
  }

  public void validarColorPrimario(Color colorPrimario) {
    if (colorPrimario == null) {
      throw new ColorPrimarioObligatorioException("El color primario es obligatorio");
    }
  }

  public void validarTipoPrenda(TipoPrenda tipo) {
    if (tipo == null) {
      throw new TipoPrendaObligatorioException("El tipo de prenda es obligatorio");
    }
  }

  public Integer getTemperaturaMaximaAdecuada() {
    return this.temperaturaMaximaAdecuada;
  }

  public Formalidad getFormalidad() {
    return formalidad;
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
