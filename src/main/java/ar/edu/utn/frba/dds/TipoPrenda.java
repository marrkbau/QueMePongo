package ar.edu.utn.frba.dds;


import java.util.Objects;

import static ar.edu.utn.frba.dds.Categoria.PARTE_SUPERIOR;

public class TipoPrenda {



  //  static String REMERA = "remera";
    static String PANTALON = "pantalon";
    static String POLLERA = "pollera";
    static String CAMISA_MANGA_CORTA = "camisa-manga-corta";
    static String BLUSA = "blusa";


    Categoria categoria;

    public TipoPrenda(Categoria categoria){
        this.categoria = Objects.requireNonNull(categoria, "Categoria no debe ser nula");

    }

    public Categoria Categoria(){
        return categoria;
    }

    static TipoPrenda CAMISA = new TipoPrenda(PARTE_SUPERIOR);
}
