/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import Util.Leer;

/**
 *
 * @author Usuario
 */
public class OperadoresCadenas {
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }
    public int length(String str) {
        return str.length();
    }
    public String substring(String str, int start, int end) {
        return str.substring(start, end);
    }
    public boolean contains(String str1, String str2) {
        return str1.contains(str2);
    }
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
    public boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }
    public String replace(String str, String target, String replacement) {
        return str.replace(target, replacement);
    }
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
