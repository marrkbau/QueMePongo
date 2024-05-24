package ar.edu.utn.frba.dds.usuario.atuendos;

import ar.edu.utn.frba.dds.prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Atuendo {

  private Prenda prendaTorso;
  private Prenda prendaPiernas;
  private Prenda prendaPies;

  public Atuendo(Prenda prendaTorso, Prenda prendaPiernas, Prenda prendaPies) {
    this.prendaTorso = prendaTorso;
    this.prendaPiernas = prendaPiernas;
    this.prendaPies = prendaPies;
  }

}
