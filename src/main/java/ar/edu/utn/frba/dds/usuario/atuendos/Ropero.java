package ar.edu.utn.frba.dds.usuario.atuendos;

import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Ropero {

  private Usuario duenio;
  private List<Prenda> prendas;
  private List<Propuesta> propuestasPendientes;

  private List<Propuesta> propuestasAceptadas;

  public Ropero() {
    this.prendas = new ArrayList<Prenda>();
    this.propuestasAceptadas = new ArrayList<>();
    this.propuestasPendientes = new ArrayList<>();
  }

  public List<Prenda> prendasDelRopero() {
    return this.prendas;

  }

  public void agregarAceptadas(Propuesta propuesta) {
    propuestasAceptadas.add(propuesta);
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }

  public void agregarPropuesta(Propuesta propuesta) {
    this.propuestasPendientes.add(propuesta);
  }

  public void quitarPropuestaPendiente(Propuesta propuesta) {
    this.propuestasPendientes.remove(propuesta);
  }

  public List<Propuesta> mostrarPropuestas() {
    return this.propuestasPendientes;
  }

  public void quitarPropuestaAceptada(Propuesta propuesta) {
    this.propuestasAceptadas.remove(propuesta);
  }





}
