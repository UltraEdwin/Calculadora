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
    
    public static void menu(Leer leer){
        
    
}
    
}
