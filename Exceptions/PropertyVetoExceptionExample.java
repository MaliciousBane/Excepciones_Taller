/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertyVetoExceptionExample {
    private String name;
    private PropertyChangeSupport propertyChangeSupport;

    public PropertyVetoExceptionExample(String name) {
        this.name = name;
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void setName(String newName) throws PropertyVetoException {
        String oldName = this.name;
        this.name = newName;
        propertyChangeSupport.firePropertyChange("name", oldName, newName);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public static void main(String[] args) {
        PropertyVetoExceptionExample example = new PropertyVetoExceptionExample("John");

        // Agregar un listener que veta los cambios de nombre
        example.addPropertyChangeListener(evt -> {
            if ("name".equals(evt.getPropertyName()) && "Bob".equals(evt.getNewValue())) {
                try {
                    throw new PropertyVetoException("No se permite cambiar el nombre a Bob", evt);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(PropertyVetoExceptionExample.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        try {
            example.setName("Bob"); // Lanzará una PropertyVetoException
        } catch (PropertyVetoException e) {
            System.out.println("Se ha producido un PropertyVetoException: " + e.getMessage());
        }

        System.out.println("Nombre actual: " + example.name);
    }
}