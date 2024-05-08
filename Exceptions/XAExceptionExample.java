/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.transaction.xa.XAException;

public class XAExceptionExample {
    public static void main(String[] args) {
        try {
            throwXAException();
        } catch (XAException e) {
            System.out.println("Se ha producido una XAException. Código de error: " + e.errorCode);
        }
    }

    private static void throwXAException() throws XAException {
        XAException xaException = new XAException("Error en la transacción");
        xaException.errorCode = XAException.XAER_RMFAIL; 
        throw xaException;
    }
}
