/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
public class BadBinaryOpValueExpException extends Exception {
    public BadBinaryOpValueExpException() {
        super();
    }

    public BadBinaryOpValueExpException(String message) {
        super(message);
    }

    public BadBinaryOpValueExpException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadBinaryOpValueExpException(Throwable cause) {
        super(cause);
    }
}
