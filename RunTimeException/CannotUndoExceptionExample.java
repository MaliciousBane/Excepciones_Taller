/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class CannotUndoExceptionExample {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();

        try {
            undoManager.undo();
        } catch (CannotUndoException e) {
            System.out.println("No se puede deshacer la operación: " + e.getMessage());
        }

        undoManager.redo();
        undoManager.undo(); 

        System.out.println("Número de operaciones en el historial: " + undoManager.getUndoPresentationName());
    }
}
