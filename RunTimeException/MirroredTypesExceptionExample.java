/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import javax.lang.model.type.MirroredTypesException;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation {
    Class<?>[] value() default {};
}

public class MirroredTypesExceptionExample {
    @MyAnnotation({String.class, Integer.class})
    public static void processAnnotation() {
        try {
            MyAnnotation annotation = MirroredTypesExceptionExample.class.getDeclaredMethod("processAnnotation")
                    .getAnnotation(MyAnnotation.class);
            Class<?>[] mirroredTypes = annotation.value(); 
        } catch (MirroredTypesException e) {
            System.out.println("Se ha producido una MirroredTypesException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al acceder a los tipos reflejados: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        processAnnotation();
    }
}
