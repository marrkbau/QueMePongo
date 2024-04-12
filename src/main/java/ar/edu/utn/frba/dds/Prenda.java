package ar.edu.utn.frba.dds;

import java.util.Objects;

public class Prenda {

    private String material;
    private TipoPrenda tipo;
    private ColorRGB color;

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

    public ColorRGB getColor() {
        return color;
    }

    public void setColor(ColorRGB color) {
        this.color = color;
    }

    protected Prenda(TipoPrenda tipoDePrenda, String material, ColorRGB colorRGB) {
        this.tipo = Objects.requireNonNull(tipoDePrenda, "El tipo de prenda no debe estar vacio");
        this.material = Objects.requireNonNull(material, "Debe ingresar un material");
        this.color = colorRGB;

    }
}
