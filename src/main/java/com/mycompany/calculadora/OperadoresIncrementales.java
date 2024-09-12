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
public class OperadoresIncrementales {
   public static void sumatoriaAritmetica(Leer leer) {
       int primerTermino;
       int sumatoria;
       sumatoria = 0;
       int d;
       int n;
       System.out.println("Bienvenido a la sumatoria aritmetica");
       System.out.println("ingrese el primer termino de su progresion");
       primerTermino = leer.leerInt("");
       System.out.println("ingrese la diferencia entre terminos de su progresion");
       d = leer.leerInt("");
       System.out.println("ingrese la cantidad de terminos  que quiere para la sumatoria");
       n = leer.leerInt("");
       
        for (int i = 0; i < n; i++) {
            sumatoria += primerTermino;  
            primerTermino += d;          
        }

       System.out.println("la sumatoria total de sus "+ n +"terminos es: "+ sumatoria);
    }
   
   
    public static void sumatoriaGeometrica(Leer leer) {
       int primerTermino;
       int sumatoria;
       sumatoria = 0;
       int r;
       int n;
       System.out.println("Bienvenido a la sumatoria geometrica");
       System.out.println("ingrese el primer termino de su progresion");
       primerTermino = leer.leerInt("");
       System.out.println("ingrese la razon entre terminos de su progresion");
       r = leer.leerInt("");
       System.out.println("ingrese la cantidad de terminos  que quiere para la sumatoria");
       n = leer.leerInt("");

        // Ciclo que recorre n términos de la serie
        for (int i = 0; i < n; i++) {
            sumatoria += primerTermino;  // Incrementa la sumatoria con el término actual
            primerTermino *= r;          // Incrementa el término multiplicando por la razón r
        }

        System.out.println("la sumatoria total de sus "+ n +"terminos es: "+ sumatoria);
    }
    
    public static void menu(Leer leer){
        int x;
        x = 0;
        while(x!=3){
            System.out.println("------------Calculadora Operadores incrementales-------------");
            System.out.println("bienvenido que operacion desea hacer");
            System.out.println("1.Sumatoria aritmetica\n2.sumatoria Geometrica\n3.salir");
                x = leer.leerInt("");
            switch(x){
                case 1:
                   sumatoriaAritmetica(leer);
                    break;
                case 2:
                    sumatoriaGeometrica(leer);
                    break;
                case 3:
                    System.out.println("Hasta pronto");
                default:
                    System.out.println("escribio un numero incorrecto vuelva a intentar");
            }
         }
    
}
}
