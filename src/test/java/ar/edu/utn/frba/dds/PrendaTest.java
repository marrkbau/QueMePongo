package ar.edu.utn.frba.dds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrendaTest {

  private Prenda prenda;

  @BeforeEach
  public void init() {
    prenda = new Prenda(TipoPrenda.REMERA, TipoMaterial.ALGODON, Color.BLANCO, null,
        null);
  }

  @Test
  public void tipoDePrenda() {
    Assertions.assertSame(prenda.getTipoPrenda(), TipoPrenda.REMERA);
  }

  @Test
  public void categoria() {
    Assertions.assertSame(prenda.getTipoPrenda().getCategoria(), Categoria.PARTE_SUPERIOR);
  }

  @Test
  public void tramaPorDefectoLisa() {
    Assertions.assertSame(prenda.getTrama(), Trama.LISA);
  }

}
