package ar.edu.utn.frba.dds.motor;

import ar.edu.utn.frba.dds.prenda.Formalidad;
import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.sugerencia.Sugerencia;
import java.util.List;

public class MotorDeSugerenciasFormal extends MotorDeSugerencias {


  public List<Sugerencia> generarSugerenciasFormalesCon(List<Prenda> prendas, Integer edad, Double temperature) {
    return generarSugerenciasCon(prendasValidas(prendas, edad), edad, temperature);
  }

  private List<Prenda> prendasValidas(List<Prenda> prendas, Integer edad) {
    return edad > 55 ? prendas.stream().filter(p -> p.getFormalidad() == Formalidad.FORMAL).toList() : prendas;
  }

}
