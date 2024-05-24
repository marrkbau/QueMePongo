package ar.edu.utn.frba.dds.usuario.atuendos;

import ar.edu.utn.frba.dds.prenda.Prenda;

public class Propuesta {

  private Prenda prenda;
  private boolean agregar;

  public Propuesta(Prenda prenda, boolean agregar) {
    this.prenda = prenda;
    this.agregar = agregar;
  }

  public Prenda getPrenda() {
    return prenda;
  }

  public boolean isAgregar() {
    return agregar;
  }

}
