/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
public class ScriptExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una ScriptException
            throw new ScriptException("Error al ejecutar el script");
        } catch (ScriptException e) {
            System.out.println("Se ha producido una ScriptException: " + e.getMessage());
        }
    }
}
