package ar.edu.utn.frba.dds.sugerencia;

import ar.edu.utn.frba.dds.exceptions.CategoriaDePrendaYaSugeridaException;
import ar.edu.utn.frba.dds.prenda.Prenda;
import java.util.ArrayList;
import java.util.List;

public class Sugerencia {

  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;

  public Sugerencia(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaInferior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }

}
