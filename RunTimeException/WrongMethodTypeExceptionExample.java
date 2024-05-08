/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;

import java.lang.invoke.WrongMethodTypeException;

public class WrongMethodTypeExceptionExample {
    public static void processInteger(String value) {
        System.out.println("Procesando entero: " + value);
    }

    public static void main(String[] args) {
        try {

            processInteger("Cadena");
        } catch (WrongMethodTypeException e) {
            System.out.println("Se ha producido una WrongMethodTypeException: " + e.getMessage());
        }
    }
}
