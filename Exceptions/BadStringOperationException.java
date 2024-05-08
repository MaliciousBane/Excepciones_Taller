/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;
public class BadStringOperationException extends Exception {
    public BadStringOperationException() {
        super();
    }

    public BadStringOperationException(String message) {
        super(message);
    }

    public BadStringOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadStringOperationException(Throwable cause) {
        super(cause);
    }
}
