package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.exceptions.CategoriaDePrendaYaSugeridaException;
import ar.edu.utn.frba.dds.material.Color;
import ar.edu.utn.frba.dds.material.TipoMaterial;
import ar.edu.utn.frba.dds.material.Trama;
import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.prenda.TipoPrenda;
import ar.edu.utn.frba.dds.sugerencia.Sugerencia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SugerenciaTest {

  private Sugerencia sugerencia;

  @BeforeEach
  public void init() {
    sugerencia = new Sugerencia();
  }

  @Test
  public void agregarUnaPrendaASugerencia() {
    sugerencia.agregarPrendaSugerir(new Prenda(TipoPrenda.REMERA, TipoMaterial.ALGODON, Color.BLANCO,
        null, null));
    Assertions.assertEquals(1, sugerencia.getPrendasSugeridas().size());
  }

  @Test
  public void agregarMasDeUnaPrendaDeLaMismaCategoria() {
    Assertions.assertThrows(CategoriaDePrendaYaSugeridaException.class, () -> {
      sugerencia.agregarPrendaSugerir(new Prenda(TipoPrenda.REMERA, TipoMaterial.ALGODON, Color.BLANCO,
          null, null));
      sugerencia.agregarPrendaSugerir(new Prenda(TipoPrenda.REMERA, TipoMaterial.POLIESTER, Color.NEGRO,
          Color.AZUL, Trama.LUNARES));
    });
  }

}
