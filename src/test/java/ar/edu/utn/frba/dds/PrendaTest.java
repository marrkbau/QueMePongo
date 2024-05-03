package ar.edu.utn.frba.dds;

import static org.junit.jupiter.api.Assertions.assertThrows;

import ar.edu.utn.frba.dds.exceptions.ColorPrimarioObligatorioException;
import ar.edu.utn.frba.dds.exceptions.MaterialObligatorioException;
import ar.edu.utn.frba.dds.exceptions.TipoPrendaObligatorioException;
import ar.edu.utn.frba.dds.material.Color;
import ar.edu.utn.frba.dds.material.Trama;
import ar.edu.utn.frba.dds.prenda.Categoria;
import ar.edu.utn.frba.dds.prenda.Prenda;
import ar.edu.utn.frba.dds.material.TipoMaterial;
import ar.edu.utn.frba.dds.prenda.TipoPrenda;
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

  @Test
  public void prendaSinTipoMaterial() {
    assertThrows(MaterialObligatorioException.class, () -> {
      new Prenda(TipoPrenda.PANTALON, null, Color.NEGRO, null, null);
    });
  }

  @Test
  public void prendaSinColorPrimario() {
    assertThrows(ColorPrimarioObligatorioException.class, () -> {
      new Prenda(TipoPrenda.PANTALON, TipoMaterial.POLIESTER, null, null, null);
    });
  }

  @Test
  public void prendaSinTipoDePrenda() {
    assertThrows(TipoPrendaObligatorioException.class, () -> {
      new Prenda(null, TipoMaterial.POLIESTER, Color.BLANCO, null, null);
    });
  }


}
