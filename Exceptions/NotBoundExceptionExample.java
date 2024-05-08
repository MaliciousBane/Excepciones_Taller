/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class NotBoundExceptionExample {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            Object remoteObject = registry.lookup("NonExistentObject");
        } catch (RemoteException | NotBoundException e) {
            System.out.println("Se ha producido una NotBoundException: " + e.getMessage());
        }
    }
}
