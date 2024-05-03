package ar.edu.utn.frba.dds.borrador;

import ar.edu.utn.frba.dds.material.Color;
import ar.edu.utn.frba.dds.material.TipoMaterial;
import ar.edu.utn.frba.dds.material.Trama;
import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.prenda.TipoPrenda;

/**
 * This is a Javadoc.com
 */
public class Borrador {

  private TipoMaterial material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama = Trama.LISA;
  private TipoPrenda tipoPrenda;


  public TipoMaterial getMaterial() {
    return material;
  }

  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  public void setTipoPrenda(TipoPrenda tipoPrenda) {

    if (tipoPrenda == null) {
      throw new IllegalArgumentException("El tipo de prenda es obligatorio");
    }
    this.tipoPrenda = tipoPrenda;
  }

  public void setMaterial(TipoMaterial material) {

    if (material ==  null) {
      throw new IllegalArgumentException("El material es obligatorio");
    }
    this.material = material;
  }

  public void setColorPrimario(Color colorPrimario) {

    if (colorPrimario == null) {
      throw new IllegalArgumentException("El color primario es obligatorio");
    }
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setTrama(Trama trama) {

    this.trama = trama;

    if (trama == null) {
      this.trama = Trama.LISA;
    }
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

  /**
   * This is a Javadoc.com
   */
  public Prenda buildPrenda() {

    if (this.colorPrimario == null) {
      throw new IllegalArgumentException("Faltó definir el color primario");
    }

    if (this.material == null) {
      throw new IllegalArgumentException("Faltó definir el material de la prenda");
    }

    if (this.tipoPrenda == null) {
      throw new IllegalArgumentException("Faltó definir el tipo de prenda");
    }

    return new Prenda(this.tipoPrenda, this.material, this.colorPrimario,
        this.colorSecundario, this.trama);
  }

}


//Podría no existir esta clase aspecto, ya que en ningún momento me
// pide hacer otra clase, si no que se trata de un orden,
//eso va a ser algo relacionado a la interfaz gráfica. Así que por ahora
// se ignora la idea de primero y segundo
