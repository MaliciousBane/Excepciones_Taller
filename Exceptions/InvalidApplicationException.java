/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class InvalidApplicationException extends Exception {
    public InvalidApplicationException() {
        super();
    }

    public InvalidApplicationException(String message) {
        super(message);
    }

    public InvalidApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidApplicationException(Throwable cause) {
        super(cause);
    }
}