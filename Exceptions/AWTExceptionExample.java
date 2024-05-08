/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
import java.awt.AWTException;
import java.awt.Robot;

public class AWTExceptionExample {
    public static void main(String[] args) {
        try {
           
            Robot robot = new Robot();

            
            throw new AWTException("Simulación de AWTException");
        } catch (AWTException e) {
            System.out.println("Se ha producido una AWTException: " + e.getMessage());
        }
    }
}
