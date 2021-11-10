/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5_prueba;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Entrar
 */
public class Crear_BD {
    public static void createNewDatabase(String fileName) {
        String url = "jdbc:sqlite:" + fileName;
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("El driver es " + meta.getDriverName());
                System.out.println("Se ha creado una nueva BD.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            }
    }
}
        
        
