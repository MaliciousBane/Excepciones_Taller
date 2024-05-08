/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class ExpandVetoException extends Exception {
    public ExpandVetoException() {
        super();
    }

    public ExpandVetoException(String message) {
        super(message);
    }

    public ExpandVetoException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExpandVetoException(Throwable cause) {
        super(cause);
    }
}
