package ar.edu.utn.frba.dds.usuario;

import ar.edu.utn.frba.dds.motor.MotorDeSugerencias;
import ar.edu.utn.frba.dds.motor.MotorDeSugerenciasBasico;
import ar.edu.utn.frba.dds.motor.MotorDeSugerenciasFormal;
import ar.edu.utn.frba.dds.motor.MotorUsado;
import ar.edu.utn.frba.dds.prenda.Formalidad;
import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.sugerencia.Sugerencia;
import ar.edu.utn.frba.dds.usuario.atuendos.Atuendo;
import ar.edu.utn.frba.dds.usuario.atuendos.Ropero;
import ar.edu.utn.frba.dds.weather.AccuWeatherAPI;
import ar.edu.utn.frba.dds.weather.ServicioMetereologico;

import java.time.Duration;
import java.util.List;

public class Usuario {

  Ropero ropero;
  Integer edad;
  MotorDeSugerenciasFormal motorDeSugerenciasFormalidad;

  MotorDeSugerenciasBasico motorDeSugerenciasBasico;
  private ServicioMetereologico servicioMetereologico;

  public Usuario(Integer edad, String ciudad) {
    this.edad = edad;
    this.servicioMetereologico =
        new ServicioMetereologico(new AccuWeatherAPI(), ciudad, Duration.ofHours(3));
  }


  public void setAtuendo(Ropero ropero) {
    this.ropero = ropero;
  }

  public List<Sugerencia> generarSugerenciasConRopero(Ropero ropero, Formalidad formalidad, ServicioMetereologico servicioMetereologico) {
    if (formalidad == Formalidad.FORMAL) {
      return this.motorDeSugerenciasFormalidad
          .generarSugerenciasCon(ropero.prendasDelRopero(), this.edad,
              servicioMetereologico.getTemperature());
    }
    return motorDeSugerenciasBasico
        .generarSugerenciasCon(ropero.prendasDelRopero(), this.edad,
            servicioMetereologico.getTemperature());
  }

}
