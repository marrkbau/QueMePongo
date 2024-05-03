package ar.edu.utn.frba.dds.sugerencia;

import ar.edu.utn.frba.dds.exceptions.CategoriaDePrendaYaSugeridaException;
import ar.edu.utn.frba.dds.prenda.Prenda;
import java.util.ArrayList;
import java.util.List;

public class Sugerencia {

  List<Prenda> prendasSugeridas = new ArrayList<>();

  public void agregarPrendaSugerir(Prenda prenda) {

    validarPrendaSugerida(prenda);


    prendasSugeridas.add(prenda);
  }

  public void validarPrendaSugerida(Prenda prenda) {

    if (prendasSugeridas.stream()
        .anyMatch(prenda1 -> prenda1.getTipoPrenda()
            .getCategoria() == prenda.getTipoPrenda().getCategoria())) {

      throw new CategoriaDePrendaYaSugeridaException("Este tipo de prendas ya sugerida");
    }
  }

  public List<Prenda> getPrendasSugeridas() {
    return prendasSugeridas;
  }

}
