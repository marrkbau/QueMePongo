package ar.edu.utn.frba.dds;

public class Material {

  TramaDeTela trama;

  public Material(TramaDeTela tramaDeTela) {
    if (tramaDeTela == null) {
      throw new IllegalArgumentException("La trama del material es obligatorio");
    }

    this.trama = tramaDeTela;
  }

  public TramaDeTela getTrama() {
    return trama;
  }
}
