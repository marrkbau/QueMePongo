package ar.edu.utn.frba.dds.usuario;

import ar.edu.utn.frba.dds.motor.MotorDeSugerenciasBasico;
import ar.edu.utn.frba.dds.motor.MotorDeSugerenciasFormal;
import ar.edu.utn.frba.dds.prenda.Formalidad;
import ar.edu.utn.frba.dds.sugerencia.Sugerencia;
import ar.edu.utn.frba.dds.usuario.atuendos.Propuesta;
import ar.edu.utn.frba.dds.usuario.atuendos.Ropero;
import ar.edu.utn.frba.dds.weather.AccuWeatherAPI;
import ar.edu.utn.frba.dds.weather.ServicioMetereologico;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

  private List<Ropero> roperos;

  private Ropero roperoDelQueSoyDuenio;

  Integer edad;
  MotorDeSugerenciasFormal motorDeSugerenciasFormalidad;

  MotorDeSugerenciasBasico motorDeSugerenciasBasico;
  private ServicioMetereologico servicioMetereologico;

  public Usuario(Integer edad, String ciudad) {
    this.edad = edad;
    this.servicioMetereologico =
        new ServicioMetereologico(new AccuWeatherAPI(), ciudad, Duration.ofHours(3));
    this.roperos = new ArrayList<Ropero>();
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




  public void cancelarPropuesta(Propuesta propuesta, Ropero ropero) {
    ropero.mostrarPropuestas().remove(propuesta);
  }

  public List<Propuesta> verPropuestas(Ropero ropero) {
    return ropero.mostrarPropuestas();
  }




}
