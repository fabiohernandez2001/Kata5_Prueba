/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5_prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Entrar
 */
public class Crear_Tabla {
    public static void createNewTable() {
        // Cadena de conexión SQLite
        String url = "jdbc:sqlite:mail.db";
        // Instrucción SQL para crear nueva tabla
        String sql = "CREATE TABLE IF NOT EXISTS direcc_email (\n"
        + " id integer PRIMARY KEY AUTOINCREMENT,\n"
        + " direccion text NOT NULL);";
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()) {
            // Se crea la nueva tabla
            stmt.execute(sql);
            System.out.println("Tabla creada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
