/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class CloneNotSupportedExceptionExample {
    public static void main(String[] args) {
        try {
           
            Object obj = new Object();
            Object clone = obj.clone(); 
        } catch (CloneNotSupportedException e) {
            System.out.println("Se ha producido una CloneNotSupportedException: " + e.getMessage());
        }
    }
}
