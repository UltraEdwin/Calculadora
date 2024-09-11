/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andruw.calculadorapar;
import Util.Leer;
/**
 *
 * @author andre
 */
public class CalculadoraPar {
 public static void menu(Leer leer){
        int x;
        x = 0;
        while(x!=5){
            System.out.println("------------Calculadora-------------");
            System.out.println("bienvenido que operacion desea hacer");
            System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.salir");
                x = leer.leerInt("");
            switch(x){
                case 1:
                    OperacionesBasicas.Sumar(leer);
                    break;
                case 2:
                    OperacionesBasicas.Restar(leer);
                    break;
                case 3:
                    OperacionesBasicas.Multiplicar(leer);
                    break;
                case 4:
                    OperacionesBasicas.Dividir(leer);
                    break;
                case 5:
                    OperacionesBasicas.Modulo(leer);
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
        menu(leer);
    }
}
