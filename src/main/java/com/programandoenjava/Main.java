package com.programandoenjava;

import com.programandoenjava.parte1.Parte1;
import com.programandoenjava.parte3.LibroDigital;

public class Main {

    public static void main(String[] args) {

        String cadena = "Hola Mundo";

        Parte1 parte1 = new Parte1();

        String resultado = parte1.invertirPalabras(cadena);

        System.out.println(resultado);
    }
}