/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class ProfileDataException extends Exception {
    public ProfileDataException(String message) {
        super(message);
    }

    public static void processProfileData(String profileData) throws ProfileDataException {
        if (profileData == null || profileData.isEmpty()) {
            throw new ProfileDataException("Los datos de perfil proporcionados están vacíos o nulos");
        } else {
            System.out.println("Procesando datos de perfil: " + profileData);
        }
    }

    public static void main(String[] args) {
        try {
            processProfileData(""); // Simular datos de perfil vacíos
        } catch (ProfileDataException e) {
            System.out.println("Se ha producido una ProfileDataException: " + e.getMessage());
        }
    }
}
