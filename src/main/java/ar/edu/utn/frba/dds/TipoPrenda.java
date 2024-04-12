package ar.edu.utn.frba.dds;

import static ar.edu.utn.frba.dds.Categoria.PARTE_INFERIOR;
import static ar.edu.utn.frba.dds.Categoria.PARTE_SUPERIOR;

import java.util.Objects;


public class TipoPrenda {
  static TipoPrenda PANTALON = new TipoPrenda(PARTE_INFERIOR);
  static TipoPrenda POLLERA = new TipoPrenda(PARTE_INFERIOR);
  static TipoPrenda BLUSA = new TipoPrenda(PARTE_SUPERIOR);
  static TipoPrenda CAMISA = new TipoPrenda(PARTE_SUPERIOR);


  Categoria categoria;

  public Categoria Categoria() {
    return categoria;
  }

  public TipoPrenda(Categoria categoria) {
    this.categoria = Objects.requireNonNull(categoria, "Categoria no debe ser nula");
  }

}
