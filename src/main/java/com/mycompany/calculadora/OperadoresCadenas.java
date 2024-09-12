/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import Util.Leer;

/**
 *La clase {@code OperadoresCadenas} proporciona métodos para realizar operaciones con cadenas de texto,
 * como concatenar, obtener la longitud, extraer subcadenas, buscar una cadena dentro de otra, y cambiar 
 * el formato de la cadena. Además, incluye un menú interactivo para ejecutar estas operaciones.
 * @author Usuario
 */
public class OperadoresCadenas {
     /**
     * Concadena dos cadenas de texto.
     * 
     * @param str1 La primera cadena.
     * @param str2 La segunda cadena.
     * retorna La cadena resultante de concatenar {str1} y {str2}.
     */
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }
     /**
     * Obtiene la longitud de una cadena de texto.
     * 
     * @param str La cadena de texto.
     * retorna La longitud de la cadena {str}.
     */
    public int length(String str) {
        return str.length();
    }
    /**
     * Extrae una subcadena de una cadena de texto dada una posición inicial y final.
     * 
     * @param str La cadena de texto original.
     * @param start El índice de inicio (inclusive) de la subcadena.
     * @param end El índice de fin (exclusivo) de la subcadena.
     * retorna La subcadena extraída de {str} entre {start} y {end}.
     */
    public String substring(String str, int start, int end) {
        return str.substring(start, end);
    }
    /**
     * Verifica si una cadena contiene otra cadena.
     * 
     * @param str1 La cadena principal.
     * @param str2 La cadena a buscar.
     * retorna {true} si {str1} contiene {str2}, {false} en caso contrario.
     */
    public boolean contains(String str1, String str2) {
        return str1.contains(str2);
    }
    /**
     * Convierte una cadena de texto a mayúsculas.
     * 
     * @param str La cadena de texto a convertir.
     * retorna La cadena convertida a mayúsculas.
     */
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
     /**
     * Convierte una cadena de texto a minúsculas.
     * 
     * @param str La cadena de texto a convertir.
     * retorna La cadena convertida a minúsculas.
     */
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
    /**
     * Compara dos cadenas de texto para verificar si son iguales.
     * 
     * @param str1 La primera cadena.
     * @param str2 La segunda cadena.
     * retorna @code true} si {@code str1} es igual a {@code str2}, {@code false} en caso contrario.
     */
    public boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }
    /**
     * Reemplaza todas las ocurrencias de una subcadena en una cadena por otra subcadena.
     * 
     * @param str La cadena de texto original.
     * @param target La subcadena a reemplazar.
     * @param replacement La subcadena de reemplazo.
     * retorna a cadena resultante después de reemplazar {@code target} por {@code replacement}.
     */
    public String replace(String str, String target, String replacement) {
        return str.replace(target, replacement);
    }
    /**
     * Muestra un menú interactivo para gestionar operaciones con cadenas y ejecuta la operación seleccionada
     * por el usuario.
     * 
     * @param leer La instancia de la clase {@code Leer} utilizada para la entrada del usuario.
     */
    public static void menu(Leer leer) {
        OperadoresCadenas chainsOperations = new OperadoresCadenas();
        System.out.println("\nSeleccione una opcion:");
        System.out.println("1. Concatenar cadenas");
        System.out.println("2. Longitud de una cadena");
        System.out.println("3. Subcadena de una cadena");
        System.out.println("4. Contiene una cadena");
        System.out.println("5. Convertir a mayusculas");
        System.out.println("6. Convertir a minusculas");
        System.out.println("7. Comparar cadenas");
        System.out.println("8. Reemplazar en una cadena");
        System.out.println("9. Salir");
        int opcion = leer.leerInt("");
        switch (opcion) {
            case 1 -> {
                String str1 = leer.leerString("\nIngrese la primera cadena: ");
                String str2 = leer.leerString("Ingrese la segunda cadena: ");
                System.out.println("Resultado: " + chainsOperations.concatenate(str1, str2));
            }
            case 2 -> {
                String str = leer.leerString("\nIngrese la cadena: ");
                System.out.println("Longitud: " + chainsOperations.length(str));
            }
            case 3 -> {
                String str = leer.leerString("\nIngrese la cadena: ");
                int start = leer.leerInt("Ingrese el índice de inicio: ");
                int end = leer.leerInt("Ingrese el índice de fin: ");
                System.out.println("Subcadena: " + chainsOperations.substring(str, start, end));
            }
            case 4 -> {
                String str1 = leer.leerString("\nIngrese la cadena principal: ");
                String str2 = leer.leerString("Ingrese la cadena a buscar: ");
                System.out.println("Contiene: " + chainsOperations.contains(str1, str2));
            }
            case 5 -> {
                String str = leer.leerString("\nIngrese la cadena: ");
                System.out.println("Mayusculas: " + chainsOperations.toUpperCase(str));
            }
            case 6 -> {
                String str = leer.leerString("\nIngrese la cadena: ");
                System.out.println("Minusculas: " + chainsOperations.toLowerCase(str));
            }
            case 7 -> {
                String str1 = leer.leerString("\nIngrese la primera cadena: ");
                String str2 = leer.leerString("Ingrese la segunda cadena: ");
                System.out.println("Iguales: " + chainsOperations.equals(str1, str2));
            }
            case 8 -> {
                String str = leer.leerString("\nIngrese la cadena: ");
                String target = leer.leerString("Ingrese la cadena a reemplazar: ");
                String replacement = leer.leerString("Ingrese la cadena de reemplazo: ");
                System.out.println("Resultado: " + chainsOperations.replace(str, target, replacement));
            }
            case 9 -> {
                System.out.println("\nSaliendo...");
                System.exit(0);
            }
            default -> System.out.println("\nOpcion no valida. Intente de nuevo.");
        }
    }
}
