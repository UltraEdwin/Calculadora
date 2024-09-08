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
public class OperacionesBasicas {
    public static void Sumar(Leer leer){
        System.out.println("ingrese el primer numero");
        int x = leer.leerInt();
        System.out.println("ingrese el segundo numero");
        int y = leer.leerInt();

        System.out.println("El resultado es : " + (x + y) );
    }
    
    public static void Restar(Leer leer){
        System.out.println("ingrese el primer numero");
        int x = leer.leerInt();
        System.out.println("ingrese el segundo numero");
        int y = leer.leerInt();

        System.out.println("El resultado es : " + (x - y) );
    }
    
    public static void Multiplicar(Leer leer){
        System.out.println("ingrese el primer numero");
        int x = leer.leerInt();
        System.out.println("ingrese el segundo numero");
        int y = leer.leerInt();

        System.out.println("El resultado es : " + (x * y) );
    }
    
    public static void Dividir(Leer leer){
        System.out.println("ingrese el dividendo");
        int x = leer.leerInt();
        System.out.println("ingrese el divisor (recuerde que no puede ser 0)");
        int y = leer.leerInt();
        while(y == 0){
          System.out.println("recuerde que el divisor no puede ser 0, ingrese otro numero");
          y = leer.leerInt();
        }

        System.out.println("El resultado es : " + (x/y) );

    }
}
