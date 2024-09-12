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
public class OperadoresRelacionales {
        
    public static void comparar(Leer leer){
        System.out.println("Bienvenido a la comparacion");
        int primero;
        int segundo;
        System.out.println("escriba el primer numero");
        primero = leer.leerInt("");
        System.out.println("escriba el segundo numero");
        segundo = leer.leerInt("");
        
        if(primero > segundo){
            System.out.println(primero + " es mayor que " + segundo);
        }
        if(primero < segundo){
            System.out.println(primero + " es menor que " + segundo);
        }
        if(primero == segundo){
            System.out.println(primero + " es igual que " + segundo);
        }
    }
    
    public static void menu(Leer leer){
        int x;
        x = 0;
        while(x!=2){
            System.out.println("------------Calculadora-------------");
            System.out.println("bienvenido que operacion desea hacer");
            System.out.println("1.comparar\n2.salir");
                x = leer.leerInt("");
            switch(x){
                case 1:
                    comparar(leer);
                    break;
                case 2:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("escribio un numero incorrecto vuelva a intentar");
            }
         }
    
}
    
}
