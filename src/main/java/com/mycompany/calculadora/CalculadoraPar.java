/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import Util.Leer;
/**
 *
 * @author andre
 */
public class CalculadoraPar {
 public static void menuPrincipal(Leer leer){
     int x;
     x = 0;
     while(x!=5){
            System.out.println("------------Calculadora-------------");
            System.out.println("bienvenido que tipo de operadores desea usar");
            System.out.println("1.aritmeticos\n2.binarios\n3.relacionales\n4.incrementales y aritmeticos\n5.booleanos \n6.cadenas\n7.salir");
                x = leer.leerInt("");
            switch(x){
                case 1:
                    OperacionesBasicas.menu(leer);
                    break;
                case 2:
                    OperadoresBinarios.menu(leer);
                    break;
                case 3:
                    OperadoresRelacionales.menu(leer);
                    break;
                case 4:
                    //OperacionesIncrementales.menu(leer);
                    break;
                case 5:
                    OperadoresBooleanos.menu(leer);
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                default:
                    System.out.println("escribio un numero incorrecto vuelva a intentar");
            }
         }
 }

    public static void main(String[] args) {
       Leer leer = new Leer();
        menuPrincipal(leer);
    }
}
