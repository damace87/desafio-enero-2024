package com.programandoenjava.parte3;

import java.util.Date;

public class LibroDigital extends Libro {

    private String urlDescarga;

    public LibroDigital(Long id, String titulo, String autor, Date anoPublicacion, boolean disponible, String urlDescarga) {
        super(id, titulo, autor, anoPublicacion, disponible);
        this.urlDescarga = urlDescarga;
    }

    public String getUrlDescarga() {
        return urlDescarga;
    }

    public void setUrlDescarga(String urlDescarga) {
        this.urlDescarga = urlDescarga;
    }
}
