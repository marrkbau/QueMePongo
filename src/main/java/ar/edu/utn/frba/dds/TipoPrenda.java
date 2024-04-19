package ar.edu.utn.frba.dds;

public enum TipoPrenda {

  REMERA(Categoria.PARTE_SUPERIOR),
  BUZO(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR);

  final Categoria categoria;

  TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }

}
