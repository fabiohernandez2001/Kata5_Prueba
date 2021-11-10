/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5_prueba;

import static kata5_prueba.Crear_Tabla.createNewTable;

/**
 *
 * @author Entrar
 */
public class Kata5_Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InsertarDatosTabla idt = new InsertarDatosTabla();
        // Se insertar 3 nuevas líneas
        idt.insert("abc@ulpgc.es");
        idt.insert("xyz@ull.es");
        idt.insert("def123@gmail.com");
    }
}
