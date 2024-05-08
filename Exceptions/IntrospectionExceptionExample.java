/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class IntrospectionExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar obtener los descriptores de propiedades de una clase con un método getter inválido
            PropertyDescriptor[] descriptors = Introspector.getBeanInfo(InvalidClass.class).getPropertyDescriptors();

            // Mostrar los descriptores de propiedades
            for (PropertyDescriptor descriptor : descriptors) {
                System.out.println("Propiedad: " + descriptor.getName());
            }
        } catch (IntrospectionException e) {
            System.out.println("Se ha producido una IntrospectionException: " + e.getMessage());
        }
    }

    static class InvalidClass {
        private int value;

        // Método getter inválido (no sigue la convención de nombre)
        public int getTheValue() {
            return value;
        }
    }
}
