/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Error;
public class LinkageErrorExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar un LinkageError
            throw new LinkageError("Error de enlace durante la carga de clases");
        } catch (LinkageError e) {
            System.out.println("Se ha producido un LinkageError: " + e.getMessage());
        }
    }
}
