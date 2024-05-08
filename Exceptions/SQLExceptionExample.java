/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una SQLException
            throw new SQLException("Error al conectarse a la base de datos");
        } catch (SQLException e) {
            System.out.println("Se ha producido una SQLException: " + e.getMessage());
        }
    }
}
