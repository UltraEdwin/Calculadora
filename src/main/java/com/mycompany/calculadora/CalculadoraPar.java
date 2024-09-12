/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import Util.Leer;
/**
 *La clase {CalculadoraPar} proporciona un menú principal para una calculadora que permite
 * seleccionar diferentes tipos de operaciones aritméticas, binarias, relacionales, incrementales, booleanas
 * y de cadenas. La selección de la operación redirige al usuario al menú correspondiente para realizar
 * la operación deseada.
 * 
 * La clase utiliza la clase {Leer} para manejar la entrada de datos desde la entrada estándar
 * (generalmente el teclado).
 * @author andre
 */
public class CalculadoraPar {
    /**
     * Muestra el menú principal de la calculadora y permite al usuario seleccionar el tipo de operaciones
     * que desea realizar. Dependiendo de la selección del usuario, se redirige al menú correspondiente
     * para realizar la operación deseada. El menú se sigue mostrando hasta que el usuario selecciona
     * la opción de salir (opción 7).
     * 
     * @param leer Una instancia de la clase {@code Leer} utilizada para leer la entrada del usuario.
     */
 public static void menuPrincipal(Leer leer){
     int x;
     x = 0;
     while(x!=7){
            System.out.println("------------Calculadora-------------");
            System.out.println("bienvenido que tipo de operadores desea usar");
            System.out.println("1.Aritmeticos\n2.Binarios\n3.Relacionales\n4.Incrementales y Aritmeticos\n5.Booleanos \n6.Cadenas\n7.Salir");
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
                    OperadoresIncrementales.menu(leer);
                    break;
                case 5:
                    OperadoresBooleanos.menu(leer);
                    break;
                case 6:
                    OperadoresCadenas.menu(leer);
                    break;
                case 7:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("escribio un numero incorrecto vuelva a intentar");
            }
         }
 }
    /**
     * El punto de entrada principal del programa. Crea una instancia de {Leer} y llama al método
     * {menuPrincipal} para iniciar la calculadora.
     */
    public static void main(String[] args) {
       Leer leer = new Leer();
        menuPrincipal(leer);
    }
}
