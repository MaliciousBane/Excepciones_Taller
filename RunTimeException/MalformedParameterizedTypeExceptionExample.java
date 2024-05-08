/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.List;

public class MalformedParameterizedTypeExceptionExample {
    public static void main(String[] args) {
        try {
            Type type = new ParameterizedType() {
                @Override
                public Type[] getActualTypeArguments() {
                    return new Type[] { Integer.class, "invalid" }; 
                }

                @Override
                public Type getRawType() {
                    return List.class;
                }

                @Override
                public Type getOwnerType() {
                    return null;
                }
            };
        } catch (MalformedParameterizedTypeException e) {
            System.out.println("Se ha producido una MalformedParameterizedTypeException: " + e.getMessage());
        }
    }
}
