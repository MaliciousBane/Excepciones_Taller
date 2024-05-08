/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.lang.annotation.Annotation;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.AnnotatedElement;

@interface MyAnnotation {
    String value();
    int number() default 0;
}

public class IncompleteAnnotationExceptionExample {
    @MyAnnotation(value = "Example")
    public static void someMethod() {
        try {
            AnnotatedElement element = IncompleteAnnotationExceptionExample.class.getMethod("someMethod");
            Annotation annotation = element.getAnnotation(MyAnnotation.class);
            int number = ((MyAnnotation) annotation).number(); 
            System.out.println("Número de la anotación: " + number);
        } catch (IncompleteAnnotationException e) {
            System.out.println("Se ha producido una IncompleteAnnotationException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al acceder a la anotación: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        someMethod();
    }
}