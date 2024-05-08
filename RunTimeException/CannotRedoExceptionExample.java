/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;

public class CannotRedoExceptionExample {
    public static void main(String[] args) {
        UndoManager undoManager = new UndoManager();

        try {
            undoManager.redo();
        } catch (CannotRedoException e) {
            System.out.println("No se puede rehacer la operación: " + e.getMessage());
        }

        undoManager.undo();
        undoManager.redo(); 

        System.out.println("Número de operaciones en el historial: " + undoManager.getRedoPresentationName());
    }
}
