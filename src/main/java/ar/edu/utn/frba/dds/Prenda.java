package ar.edu.utn.frba.dds;

import java.util.Objects;

public class Prenda {

  private String material;
  private TipoPrenda tipo;
  private ColorRgb color;

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public TipoPrenda getTipo() {
    return tipo;
  }

  public void setTipo(TipoPrenda tipo) {
    this.tipo = tipo;
  }

  public ColorRgb getColor() {
    return color;
  }

  public void setColor(ColorRgb color) {
    this.color = color;
  }

  protected Prenda(TipoPrenda tipoDePrenda, String material, ColorRgb colorRgb) {
    this.tipo = Objects.requireNonNull(tipoDePrenda, "El tipo de prenda no debe estar vacio");
    this.material = Objects.requireNonNull(material, "Debe ingresar un material");
    this.color = colorRgb;

  }

  @Override
  public String toString() {
    return "Prenda{" + "material='"
     + material + '\'' + ", tipo=" + tipo.Categoria() + ", color=" +
     color.getRed() + " " + color.getGreen() + " " + color.getBlue()  + '}';
  }
}
