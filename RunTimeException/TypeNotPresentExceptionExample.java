/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.AnnotatedTypeVariable;
import java.lang.reflect.Type;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    Class<?> value();
}

public class TypeNotPresentExceptionExample {
    @MyAnnotation(value = NonExistentClass.class)
    public static void processAnnotation() {
        try {
            AnnotatedElement element = TypeNotPresentExceptionExample.class.getMethod("processAnnotation");
            AnnotatedType annotatedType = element.getAnnotatedReturnType();
            Type type = annotatedType.getType();
            if (type instanceof AnnotatedTypeVariable) {
                AnnotatedTypeVariable typeVariable = (AnnotatedTypeVariable) type;
                typeVariable.getAnnotatedBounds();
            }
        } catch (TypeNotPresentException e) {
            System.out.println("Se ha producido una TypeNotPresentException: " + e.getMessage());
        } catch (AnnotationFormatError e) {
            System.out.println("Error de formato de anotación: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("Método no encontrado: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        processAnnotation();
