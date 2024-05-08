/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class EnumConstantNotPresentExceptionExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args) {
        try {

            Day day = Day.valueOf("FRIDAY");
            System.out.println("Día seleccionado: " + day);
        } catch (EnumConstantNotPresentException e) {
            System.out.println("Se ha producido una EnumConstantNotPresentException: " + e.getMessage());
        }
    }
}
