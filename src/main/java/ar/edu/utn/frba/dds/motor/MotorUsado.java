package ar.edu.utn.frba.dds.motor;

public class MotorUsado {

  MotorDeSugerencias motorDeSugerencias;

  static MotorUsado INSTANCE;

  public static MotorUsado getInstance() {
    return INSTANCE;
  }

  public MotorDeSugerencias getMotorDeSugerencias() {
    return motorDeSugerencias;
  }

  public void setMotorDeSugerencias(MotorDeSugerencias motorDeSugerencias) {
    this.motorDeSugerencias = motorDeSugerencias;
  }
}
