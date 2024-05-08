/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
public class UserExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una UserException
            throw new UserException("Se ha producido un error del usuario");
        } catch (UserException e) {
            System.out.println("Se ha producido una UserException: " + e.getMessage());
        }
    }
}
