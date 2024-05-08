/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

public class UndeclaredThrowableExceptionExample {
    public static class MyClass {
        public void myMethod() throws Exception {
            throw new Exception("Excepción declarada");
        }
    }

    public static void main(String[] args) {
        try {
            MyClass obj = new MyClass();
            Method method = MyClass.class.getMethod("myMethod");
            method.invoke(obj);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof UndeclaredThrowableException) {
                System.out.println("Se ha producido una UndeclaredThrowableException: " + cause.getMessage());
            } else {
                System.out.println("Error al invocar el método: " + cause.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
}
