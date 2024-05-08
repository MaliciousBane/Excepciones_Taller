/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;

import javax.lang.model.UnknownEntityException;
import org.w3c.dom.Entity;

public class UnknownEntityExceptionExample {
    private String name;

    public UnknownEntityExceptionExample(String name) {
        this.name = name;
    }

    public void process() throws UnknownEntityException {
        if (name == null || name.isEmpty()) {
            throw new UnknownEntityException("Entidad desconocida: nombre nulo o vacío");
        } else {
            System.out.println("Procesando entidad: " + name);
        }
    }

    public static void main(String[] args) {
        try {
            UnknownEntityExceptionExample entity = new UnknownEntityExceptionExample("");
            entity.process();
        } catch (UnknownEntityException e) {
            System.out.println("Se ha producido una UnknownEntityException: " + e.getMessage());
        }
    }
}
