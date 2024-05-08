/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Error;
public class CoderMalfunctionErrorExample {
    public static void main(String[] args) {
        try {
            performCodingTask();
        } catch (CoderMalfunctionError e) {
            System.out.println("Se ha producido un CoderMalfunctionError: " + e.getMessage());
        }
    }

    private static void performCodingTask() throws CoderMalfunctionError {
        throw new CoderMalfunctionError("El código del programador ha fallado");
    }
}
