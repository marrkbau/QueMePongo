package ar.edu.utn.frba.dds.motor;

import ar.edu.utn.frba.dds.prenda.Formalidad;
import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.sugerencia.Sugerencia;
import java.util.List;

public class MotorDeSugerenciasFormal extends MotorDeSugerencias {

  @Override
  List<Sugerencia> generarSugerenciasCon(List<Prenda> prendas, Integer edad) {

    List<Prenda> prendasValidas = edad < 55 ? prendas.stream()
          .filter(prenda -> !(prenda.getFormalidad() == Formalidad.FORMAL)).toList() : prendas;

    return super.generarSugerenciasCon(prendasValidas, edad);
  }

}
