package ar.edu.utn.frba.dds.motor;

import ar.edu.utn.frba.dds.prenda.Categoria;
import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.sugerencia.Sugerencia;
import com.google.common.collect.Lists;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class MotorDeSugerencias {


  public List<Sugerencia> generarSugerenciasCon(List<Prenda> prendas, Integer edad, Double temperatura) {

    List<Prenda> prendasSuperiores = filtrarPrendasPorTipo(prendas, Categoria.PARTE_SUPERIOR);
    List<Prenda> prendasInferiores = filtrarPrendasPorTipo(prendas, Categoria.PARTE_INFERIOR);
    List<Prenda> prendasCalzados = filtrarPrendasPorTipo(prendas, Categoria.CALZADO);


    List<Prenda> prendasSuperioresAdecuadas =
        filtrarPrendasPorTemperatura(prendasSuperiores, temperatura);
    List<Prenda> prendasInferioresAdecuadas =
        filtrarPrendasPorTemperatura(prendasInferiores, temperatura);
    List<Prenda> prendasCalzadosAdecuadas =
        filtrarPrendasPorTemperatura(prendasCalzados, temperatura);
    List<List<Prenda>> combinacionesDePrendas = Lists.cartesianProduct(prendasSuperioresAdecuadas,
        prendasInferioresAdecuadas, prendasCalzadosAdecuadas);

    return combinacionesDePrendas.stream().map(combinacion ->
        new Sugerencia(combinacion.get(0), combinacion.get(1), combinacion.get(2))).toList();
  }

  private List<Prenda> filtrarPrendasPorTipo(List<Prenda> prendas, Categoria categoria) {
    return prendas.stream().filter(p -> p.getTipoPrenda().getCategoria() == categoria).toList();
  }

  private List<Prenda> filtrarPrendasPorTemperatura(List<Prenda> prendas, Double temperature) {
    return prendas.stream().filter(p -> p.getTemperaturaMaximaAdecuada() >= temperature).toList();
  }


}
