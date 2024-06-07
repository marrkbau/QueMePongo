package ar.edu.utn.frba.dds.usuario.atuendos;

import ar.edu.utn.frba.dds.prenda.Prenda;

public class Quitar implements Propuesta {

  private Prenda prenda;

  private Estado estado;


  public Quitar(Prenda prenda) {
    this.prenda = prenda;
    this.estado = Estado.PENDIENTE;
  }

  public Prenda getPrenda() {
    return prenda;
  }

  @Override
  public void aceptar(Ropero ropero) {
    ropero.agregarPrenda(this.prenda);
    this.estado = Estado.ACEPTADA;
    ropero.agregarAceptadas(this);
  }

  @Override
  public void rechazar(Ropero ropero) {
    this.estado = Estado.RECHAZADA;
    ropero.quitarPropuestaPendiente(this);
  }

  @Override
  public void deshacer(Ropero ropero) {
    ropero.quitarPrenda(this.prenda);
    this.estado = Estado.DESHECHA;
    ropero.quitarPropuestaAceptada(this);
  }
}
