/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.security.cert.CertificateException;

public class CertificateExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulación de una excepción al validar un certificado
            throw new CertificateException("Error al validar el certificado.");
        } catch (CertificateException e) {
            System.out.println("Se ha producido una CertificateException: " + e.getMessage());
        }
    }
}
