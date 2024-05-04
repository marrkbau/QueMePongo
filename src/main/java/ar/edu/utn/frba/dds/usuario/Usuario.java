package ar.edu.utn.frba.dds.usuario;

import ar.edu.utn.frba.dds.motor.MotorDeSugerencias;
import ar.edu.utn.frba.dds.prenda.Prenda;
import java.util.List;

public class Usuario {

  List<Prenda> prendas;
  Integer edad;
  MotorDeSugerencias motorDeSugerencias;

  public Usuario(Integer edad, MotorDeSugerencias motorDeSugerencias) {
    this.edad = edad;
    this.motorDeSugerencias = motorDeSugerencias;
  }


  public void setPrendas(List<Prenda> prendas) {
    this.prendas = prendas;
  }
}
