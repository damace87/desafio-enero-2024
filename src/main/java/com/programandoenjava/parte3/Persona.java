package com.programandoenjava.parte3;

public class Persona {

    private Long id;
    private String nombre;
    private String edad;

    public Persona(Long id, String nombre, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void tomarPrestadoLibro(Libro libro) {

        if(libro.isDisponible()) {
            libro.setIdPersonaAsociada(this.id);
            libro.setDisponible(false);
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no está disponible.");
        }
    }

    public void devolverLibro(Libro libro){
        if (libro.getIdPersonaAsociada().equals(this.id)) {
            libro.setDisponible(true);
            libro.setIdPersonaAsociada(null);
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no pertenece a " + this.nombre);
        }
    }

}
