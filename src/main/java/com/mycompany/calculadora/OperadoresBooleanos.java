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
public class OperadoresBooleanos {
    public static void rango(Leer leer){
        int limiteInferior;
        int limiteSuperior;
        float num;
        System.out.println("Escriba el limite inferior de su rango");
        limiteInferior = leer.leerInt("");
        System.out.println("Escriba el limite superior de su rango");
        limiteSuperior = leer.leerInt("");
        
        while(limiteSuperior < limiteInferior){
         System.out.println("El limite superior debe ser mayor a " + limiteInferior);
         System.out.println("Escriba nuevamente su limite superior");
         limiteSuperior = leer.leerInt("");  
        }
        
        System.out.println("Escriba el numero a comprobar en el rango");
        num = (float) leer.leerFloat("");
        
        if(num > limiteInferior && num <limiteSuperior ){
            System.out.println(num +"si se encuentra en el rango " + limiteInferior + "-" +limiteSuperior );
        }
        else{
            System.out.println(num +" no se encuentra en el rango " + limiteInferior + "-" +limiteSuperior );
        }
    }
    
    
    public static boolean primo(Leer leer){
        int num;
        System.out.println("Escriba el numero para comprobar si es primo");
        num = leer.leerInt("");
        int limite = (int) Math.sqrt(num);
        if (num == 2 || num == 3) {
            return true;
        }
        if (num <= 1 || num % 2 ==0 ) {
            return false;
        }
        
        for (int i = 3; i <= limite; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void menu(Leer leer){
    int x;
    x = 0;
    while(x!=3){
        System.out.println("------------Calculadora de operaciones con Booleanos-------------");
        System.out.println("bienvenido que operacion desea hacer");
        System.out.println("1.comprobar un numero en un rango\n2.comprobar si un numero es primo\n3.salir");
                x = leer.leerInt("");
            switch(x){
                case 1:
                    rango(leer);
                    break;
                case 2:
                    boolean y;
                    y = primo(leer);
                    if(y == true){
                        System.out.println("es primo");
                    }else{
                        System.out.println("no es primo");
                    }
                    break;
                case 3:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("escribio un numero incorrecto vuelva a intentar");
                    break;
            }
         }
    }
}

