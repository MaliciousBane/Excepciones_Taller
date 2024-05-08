/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.xml.crypto.dsig.XMLSignatureException;

public class XMLSignatureExceptionExample {
    public static void main(String[] args) {
        try {
            throw new XMLSignatureException("Error al verificar la firma XML");
        } catch (XMLSignatureException e) {
            System.out.println("Se ha producido una XMLSignatureException: " + e.getMessage());
        }
    }
}
