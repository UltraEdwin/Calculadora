/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andruw.calculadorapar;
import Util.Leer;

/**
 *
 * @author Usuario
 */
public class OperacionesBasicas {
    public static void Sumar(Leer leer){
        System.out.println("Bienvenido a la suma");
        int num;
        int j;
        j = 0;
        System.out.println("Cuantos numeros desea operar");
        num = leer.leerInt("");
         for(int i = 1; i<= num; i++){
             int cant;
             System.out.println("Ingrese el numero "+i);
             cant = leer.leerInt("Ingrese el número");
             j = j + cant;
             if (i == num){
                System.out.println("El resultado de la suma es: "+j); 
             }
             
         }
         
    }
    
    public static void Restar(Leer leer){
       System.out.println("Bienvenido a la Resta");
        int num;
        System.out.println("Cuantos numeros desea operar");
        num = leer.leerInt("");
        System.out.println("Ingrese el número 1:");
        int resultado = leer.leerInt("");
        for (int i = 2; i <= num; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int cant = leer.leerInt("");
            resultado -= cant;
             
         }
         System.out.println("El resultado de la resta es: " + resultado);
    }
    
    public static void Multiplicar(Leer leer){
        System.out.println("Bienvenido a la Multiplicación");
        System.out.println("Cuántos números desea operar:");
        int num = leer.leerInt("");
        int resultado = 1;
    
        for (int i = 1; i <= num; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int cant = leer.leerInt("");
            resultado *= cant;  
        }   
        System.out.println("El resultado de la multiplicación es: " + resultado);
             
         
    }
    
    public static void Dividir(Leer leer){
        System.out.println("Ingrese el dividendo");
        double x = leer.leerInt("");
        System.out.println("ingrese el divisor (recuerde que no puede ser 0)");
        double y = leer.leerInt("");
        while(y == 0){
            System.out.println("recuerde que el divisor no puede ser 0, ingrese otro numero");
          y = leer.leerInt("");
        }

        System.out.println("El resultado es : " + (x/y) );

    }
    public static void Modulo(Leer leer){
    System.out.println("Bienvenido al Módulo");
    
    System.out.println("Cuántos números desea operar (mínimo 2):");
    int num = leer.leerInt("");
    
    if (num < 2) {
        System.out.println("Error: Debe haber al menos 2 números para calcular el módulo.");
        return;  // Salimos de la función si hay menos de 2 números
    }
    System.out.println("Ingrese el número 1:");
    int resultado = leer.leerInt("");
    for (int i = 2; i <= num; i++) {
        System.out.println("Ingrese el número " + i + ":");
        int cant = leer.leerInt("");
        if (cant == 0) {
            System.out.println("Error: No se puede calcular el módulo con divisor cero.");
            return; 
        }
        resultado %= cant; 
    }
    System.out.println("El resultado del módulo es: " + resultado);
}

}