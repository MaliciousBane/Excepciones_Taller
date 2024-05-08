/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.lang.annotation.*;

public class AnnotationTypeMismatchExceptionExample {
    @MyAnnotation(value = "Ejemplo", number = 10)
    public static void myMethod() {
        try {
            MyAnnotation annotation = AnnotationTypeMismatchExceptionExample.class.getMethod("myMethod").getAnnotation(MyAnnotation.class);
            int invalidNumber = annotation.number(); 
        } catch (AnnotationTypeMismatchException e) {
            System.out.println("Se ha producido una AnnotationTypeMismatchException: " + e.getMessage());
        } catch (NoSuchMethodException | SecurityException e) {
            System.out.println("Error al obtener la anotación: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
    @Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String value();
    int number();
}
}