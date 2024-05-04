package ar.edu.utn.frba.dds.usuario;

import ar.edu.utn.frba.dds.motor.MotorDeSugerencias;
import ar.edu.utn.frba.dds.motor.MotorUsado;
import ar.edu.utn.frba.dds.prenda.Prenda;
import java.util.List;

public class Usuario {

  List<Prenda> prendas;
  Integer edad;
  MotorUsado motorDeSugerencias;

  public Usuario(Integer edad, MotorUsado motorDeSugerencias) {
    this.edad = edad;
    this.motorDeSugerencias = motorDeSugerencias;
  }

  public MotorDeSugerencias getMotor() {
    return this.motorDeSugerencias.getMotorDeSugerencias();
  }

  public void setPrendas(List<Prenda> prendas) {
    this.prendas = prendas;
  }
}
