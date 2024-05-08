/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Error;
public class VirtualMachineErrorExample {
    public static void main(String[] args) {
        try {
            createLargeArray();
        } catch (VirtualMachineError e) {
            System.out.println("Se ha producido un VirtualMachineError: " + e.getMessage());
            cleanupResources();
        } finally {
            System.out.println("Finalizando la aplicación...");
        }
    }

    private static void createLargeArray() {
        try {
            int[] largeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            throw new VirtualMachineError("No hay suficiente memoria para crear el array") {
                @Override
                public synchronized Throwable fillInStackTrace() {
                    return this; 
                }
            };
        }
    }

    private static void cleanupResources() {
        System.out.println("Limpiando recursos...");
    }
}
