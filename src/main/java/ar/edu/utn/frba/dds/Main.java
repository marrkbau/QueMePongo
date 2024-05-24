package ar.edu.utn.frba.dds;


import ar.edu.utn.frba.dds.weather.AccuWeatherAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * This is a Javadoc.com
 */
public class Main {

  /**
   * This is a Javadoc.com
   */
  public static void main(String[] args) {

    AccuWeatherAPI accuWeatherAPI = new AccuWeatherAPI();

    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");


    System.out.println(condicionesClimaticas.get(0).get("PrecipitationProbability"));
    System.out.println(condicionesClimaticas.get(0).get("Temperature"));

  }

}