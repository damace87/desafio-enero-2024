package com.programandoenjava.parte3;

import java.util.HashMap;

public class Biblioteca {

    private HashMap<Long, Libro> libros;

    public void agregarLibro(Libro libro) {

        if (this.libros == null) {
            libros = new HashMap<>();
        }

        if (libro != null && !libros.containsKey(libro.getId())) {
            libros.put(libro.getId(), libro);
        }
    }

    public Libro buscarLibroPorId(Long id) {
        if (libros.isEmpty()) {
            return null;
        }
        return libros.get(id);
    }
}
