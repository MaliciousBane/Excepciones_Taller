/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class MalformedParametersExceptionExample {
    public static void processData(String data) throws MalformedParametersException {
        if (data == null || data.isEmpty()) {
            throw new MalformedParametersException("El dato proporcionado está mal formado");
        } else {
            System.out.println("Procesando dato: " + data);
        }
    }

    public static void main(String[] args) {
        try {
            processData("");
        } catch (MalformedParametersException e) {
            System.out.println("Se ha producido una MalformedParametersException: " + e.getMessage());
        }
    }
}

class MalformedParametersException extends Exception {
    public MalformedParametersException(String message) {
        super(message);
    }
}