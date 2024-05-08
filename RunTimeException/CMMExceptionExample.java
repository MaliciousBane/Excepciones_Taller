/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.awt.color.CMMException;
import java.awt.color.ICC_Profile;

public class CMMExceptionExample {
    public static void main(String[] args) {
        try {
            byte[] invalidProfileData = new byte[10];
            ICC_Profile.getInstance(invalidProfileData);
        } catch (CMMException e) {
            System.out.println("Se ha producido una CMMException: " + e.getMessage());
        }
    }
}
