/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class DestroyFailedException extends Exception {
    public DestroyFailedException() {
        super();
    }

    public DestroyFailedException(String message) {
        super(message);
    }

    public DestroyFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public DestroyFailedException(Throwable cause) {
        super(cause);
    }
}
