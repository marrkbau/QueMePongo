package ar.edu.utn.frba.dds.motor;

import ar.edu.utn.frba.dds.prenda.Categoria;
import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.sugerencia.Sugerencia;
import com.google.common.collect.Lists;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class MotorDeSugerencias {


  List<Sugerencia> generarSugerenciasCon(List<Prenda> prendas, Integer edad) {

    List<Prenda> prendasSuperiores = prendas.stream()
        .filter(prenda -> prenda.getTipoPrenda().getCategoria() == Categoria.PARTE_SUPERIOR)
        .toList();

    List<Prenda> prendasInferiores = prendas.stream()
        .filter(prenda -> prenda.getTipoPrenda().getCategoria() == Categoria.PARTE_INFERIOR)
        .toList();

    List<Prenda> calzados = prendas.stream()
        .filter(prenda -> prenda.getTipoPrenda().getCategoria() == Categoria.CALZADO)
        .toList();


    List<List<Prenda>> combinacionesDePrendas = Lists
        .cartesianProduct(prendasSuperiores, prendasInferiores, calzados);


    return combinacionesDePrendas.stream()
        .map(combinacion ->
            new Sugerencia(combinacion.get(0), combinacion.get(1), combinacion.get(2))).toList();
  }
}
