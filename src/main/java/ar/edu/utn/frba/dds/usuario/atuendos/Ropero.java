package ar.edu.utn.frba.dds.usuario.atuendos;

import ar.edu.utn.frba.dds.prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Ropero {


  private List<Prenda> prendas;
  private List<Propuesta> propuestas;

  public Ropero() {
    this.prendas = new ArrayList<Prenda>();
  }

  public List<Prenda> prendasDelRopero() {
    return this.prendas;

  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }

  public void agregarPropuesta(Propuesta propuesta) {
    this.propuestas.add(propuesta);
  }

  public void eliminarPropuesta(Propuesta propuesta) {
    this.propuestas.remove(propuesta);
  }

  public List<Propuesta> mostrarPropuestas() {
    return this.propuestas;
  }

  public List<Propuesta> mostrarPropuestasAgregar() {
    return this.mostrarPropuestas().stream().filter(Propuesta::isAgregar).toList();
  }

  public List<Propuesta> mostrarPropuestasEliminar() {
    return this.mostrarPropuestas().stream().filter(Propuesta::isAgregar).toList();
  }

  public void aceptarPropuesta(Propuesta propuesta) {
    if (propuesta.isAgregar()) {
      this.agregarPrenda(propuesta.getPrenda());
    } else {
      this.quitarPrenda(propuesta.getPrenda());
    }
  }


}
