/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.security.GeneralSecurityException;

public class GeneralSecurityExceptionExample {
    public static void main(String[] args) {
        try {
           
            useInvalidAlgorithm();
        } catch (GeneralSecurityException e) {
            System.out.println("Se ha producido una GeneralSecurityException: " + e.getMessage());
        }
    }

    private static void useInvalidAlgorithm() throws GeneralSecurityException {
   
        javax.crypto.Cipher.getInstance("InvalidAlgorithm");
    }
}