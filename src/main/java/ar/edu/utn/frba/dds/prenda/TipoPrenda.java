package ar.edu.utn.frba.dds.prenda;

/**
 * This is a Javadoc.com
 */
public enum TipoPrenda {

  REMERA(Categoria.PARTE_SUPERIOR),
  BUZO(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR),
  ZAPATOS(Categoria.CALZADO);

  private final Categoria categoria;

  TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }

}
