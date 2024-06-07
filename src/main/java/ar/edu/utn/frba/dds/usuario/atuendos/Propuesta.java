package ar.edu.utn.frba.dds.usuario.atuendos;

import ar.edu.utn.frba.dds.prenda.Prenda;

public interface Propuesta {


  void aceptar(Ropero ropero);

  void rechazar(Ropero ropero);

  void deshacer(Ropero ropero);


}
