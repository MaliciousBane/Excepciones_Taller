/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class KeySelectorExceptionExample {
    public static void main(String[] args) {
        try {
            throw new KeySelectorException("Error al seleccionar la clave");
        } catch (KeySelectorException e) {
            System.out.println("Se ha producido una KeySelectorException: " + e.getMessage());
        }
    }
}