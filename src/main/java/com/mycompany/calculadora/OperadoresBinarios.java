/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import Util.Leer;

/**
 *
 * @author andre
 */
public class OperadoresBinarios {
    public int binarioADecimal(String binario) {
    // Convertimos la cadena binaria a un número decimal utilizando parseInt
    return Integer.parseInt(binario, 2);
    }
    public String decimalABinario(int decimal) {
    // Convertimos el número decimal a binario utilizando el método toBinaryString
    return Integer.toBinaryString(decimal);
    }
    
      public int bitwiseAnd(int a, int b) {
        return a & b;
    }

    public int bitwiseOr(int a, int b) {
        return a | b;
    }

    public int bitwiseXor(int a, int b) {
        return a ^ b;
    }

    public int bitwiseNot(int a) {
        return ~a;
    }
   
    public int leftShift(int a, int positions) {
        return a << positions;
    }

    public int rightShift(int a, int positions) {
        return a >> positions;
    }
    
       public static void menu(Leer leer) {
        OperadoresBinarios ob = new OperadoresBinarios();
        int opcion = 0;

        while (opcion != 8) {
            System.out.println("\n------------ Operaciones Binarias ------------");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir Decimal a Binario");
            System.out.println("2. Convertir Binario a Decimal");
            System.out.println("3. Operación AND entre dos números");
            System.out.println("4. Operación OR entre dos números");
            System.out.println("5. Operación XOR entre dos números");
            System.out.println("6. Desplazamiento a la izquierda");
            System.out.println("7. Desplazamiento a la derecha");
            System.out.println("8. Salir");
            opcion = leer.leerInt("Ingresa un valor");

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese un número decimal:");
                    int decimal = leer.leerInt("");
                    System.out.println("Binario: " + ob.decimalABinario(decimal));
                }
                case 2 -> {
                    System.out.println("Ingrese un número binario:");
                    String binario = leer.leerString("");
                    System.out.println("Decimal: " + ob.binarioADecimal(binario));
                }
                case 3 -> {
                    System.out.println("Ingrese el primer número:");
                    int a = leer.leerInt("");
                    System.out.println("Ingrese el segundo número:");
                    int b = leer.leerInt("");
                    System.out.println("Resultado de AND: " + ob.bitwiseAnd(a, b));
                }
                case 4 -> {
                    System.out.println("Ingrese el primer número:");
                    int a = leer.leerInt("");
                    System.out.println("Ingrese el segundo número:");
                    int b = leer.leerInt("");
                    System.out.println("Resultado de OR: " + ob.bitwiseOr(a, b));
                }
                case 5 -> {
                    System.out.println("Ingrese el primer número:");
                    int a = leer.leerInt("");
                    System.out.println("Ingrese el segundo número:");
                    int b = leer.leerInt("");
                    System.out.println("Resultado de XOR: " + ob.bitwiseXor(a, b));
                }
                case 6 -> {
                    System.out.println("Ingrese un número:");
                    int a = leer.leerInt("");
                    System.out.println("Ingrese el número de posiciones:");
                    int posiciones = leer.leerInt("");
                    System.out.println("Resultado del desplazamiento a la izquierda: " + ob.leftShift(a, posiciones));
                }
                case 7 -> {
                    System.out.println("Ingrese un número:");
                    int a = leer.leerInt("");
                    System.out.println("Ingrese el número de posiciones:");
                    int posiciones = leer.leerInt("");
                    System.out.println("Resultado del desplazamiento a la derecha: " + ob.rightShift(a, posiciones));
                }
                case 8 -> {
                    System.out.println("Saliendo del menú de operaciones binarias...");
                }
                default -> System.out.println("Opción inválida, por favor intente de nuevo.");
            }
        }
    }
    
}
    

