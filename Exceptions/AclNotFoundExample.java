/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.io.File;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;

public class AclNotFoundExample {
    public static void main(String[] args) {
        try {
         
            Path path = Paths.get("/path/to/file");

        
            AclFileAttributeView aclView = Files.getFileAttributeView(path, AclFileAttributeView.class);

    
            List<AclEntry> aclEntries = aclView.getAcl();

          
            for (AclEntry entry : aclEntries) {
                System.out.println(entry);
            }
        } catch (AccessDeniedException e) {
            System.out.println("No tienes permisos para acceder al archivo o directorio.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}