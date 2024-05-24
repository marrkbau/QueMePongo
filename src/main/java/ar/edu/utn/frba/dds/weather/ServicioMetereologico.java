package ar.edu.utn.frba.dds.weather;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ServicioMetereologico {

  private Map<String, Object> ultimaRespuesta;
  private LocalDate proximaExpiracion;
  private AccuWeatherAPI api;

  private Duration expiracion;

  private String direccion;
  public ServicioMetereologico(AccuWeatherAPI api, String direccion, Duration fechaExpiracion) {
    this.api = api;
    this.expiracion = fechaExpiracion;
    this.direccion = direccion;
  }

  public Map<String, Object> consultarApi(String direccion) {
    return this.api.getWeather(direccion).get(0);
  }

  public Map<String, Object> obtenerCondicionesClimaticas() {
    if (this.ultimaRespuesta == null || this.expiro()) {
      this.ultimaRespuesta = consultarApi(this.direccion);
      this.proximaExpiracion = LocalDate.now().plus(this.expiracion);
    }

    return this.ultimaRespuesta;
  }

  private boolean expiro() {
    return proximaExpiracion.isAfter(LocalDate.now());
  }

  public Double getTemperature() {
    this.api = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = api.getWeather(this.direccion);
    return (Double) condicionesClimaticas.get(0).get("Temperature");
  }

  public Double getPrecipitation() {
    this.api = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = api.getWeather(this.direccion);
    return (Double) condicionesClimaticas.get(0).get("PrecipitationProbability");
  }





}
