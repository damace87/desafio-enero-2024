package com.programandoenjava.parte1;

public class Parte1 {

    private final String letras = "aábcdeéfghiíjklmnñoópqrstuúvwxyz";

    /**
     * Escribe un programa en Java que reciba una cadena de texto y devuelva la
     * misma cadena pero con cada palabra invertida. Por ejemplo, para la entrada "Hola Mundo",
     * la salida debería ser "aloH odluM".
     * @param cadena cadena de entrada
     * @return cadena invertida
     */
    public String invertirPalabras(final String cadena) {;

        StringBuilder resultado = new StringBuilder();
        if (cadena != null) {
            String palabra = "";
            for(int i = 0; i < cadena.length(); i++) {
                if (letras.contains(String.valueOf(cadena.toLowerCase().charAt(i)))) {
                    palabra += cadena.charAt(i);
                    if (cadena.length() == (i+1)) {
                        resultado.append(invertir(palabra));
                    }
                } else {
                    if (!palabra.isEmpty()){
                        resultado.append(invertir(palabra));
                        palabra = "";
                    }
                    resultado.append(cadena.charAt(i));
                }
            }
        }
        return resultado.toString();
    }
    private String invertir (String cadena) {
        StringBuilder resultado = new StringBuilder();
        for(int i = cadena.length()-1; i >= 0; i--){
            resultado.append(cadena.charAt(i));
        }
        return resultado.toString();
    }
}
