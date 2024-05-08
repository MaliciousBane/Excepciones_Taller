/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.lang.reflect.Field;

public class NoSuchFieldExceptionExample {
    public static void main(String[] args) {
        try {
  
            Class<?> myClass = ExampleClass.class;

       
            Field field = myClass.getDeclaredField("nonExistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("Se ha producido una NoSuchFieldException: " + e.getMessage());
        }
    }
}

class ExampleClass {
    private int number;
    private String text;
}
