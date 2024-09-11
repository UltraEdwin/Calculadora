/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Leer {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public int leerInt(String mensaje){
        System.out.println();
        int dato;
        dato = 0;
        try{
            dato = Integer.parseInt(bf.readLine());
        }catch(IOException | NumberFormatException e) {
            System.out.println("Error al ingresar el numero entero, Intente de nuevo");
        }
        return dato;
    }
    
     public double leerFloat(String mensaje){
        System.out.println();
        float dato;
        dato = 0;
        try{
            dato = Integer.parseInt(bf.readLine());
        }catch(IOException | NumberFormatException e) {
            System.out.println("Error al ingresar el numero decimal, Intente de nuevo");
        }
        return dato;}
    
    
    public double leerDouble(String mensaje){
        System.out.println();
        double dato;
        dato = 0.0;
        try{
            dato = Integer.parseInt(bf.readLine());
        }catch(IOException | NumberFormatException e) {
            System.out.println("Error al ingresar el numero decimal, Intente de nuevo");
        }
        return dato;
    }
}