/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class InvalidTargetObjectTypeException extends Exception {
    public InvalidTargetObjectTypeException() {
        super();
    }

    public InvalidTargetObjectTypeException(String message) {
        super(message);
    }

    public InvalidTargetObjectTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidTargetObjectTypeException(Throwable cause) {
        super(cause);
    }
}
