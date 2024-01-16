package com.programandoenjava.parte3;

import java.util.Date;

public class Libro {

    private Long id;
    private String titulo;
    private String autor;
    private Date anoPublicacion;
    private boolean disponible;
    private Long idPersonaAsociada;

    public Libro(Long id, String titulo, String autor, Date anoPublicacion, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.disponible = disponible;
        this.idPersonaAsociada = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(Date anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Long getIdPersonaAsociada() {
        return idPersonaAsociada;
    }

    public void setIdPersonaAsociada(Long idPersonaAsociada) {
        this.idPersonaAsociada = idPersonaAsociada;
    }
}
