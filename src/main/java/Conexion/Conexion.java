/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesar.reyesusam
 */
public class Conexion {
     private String user = "root";
    private String pass = "root";
    private String url = "jdbc:mysql://localhost:3306/tienda_reyes?useSSL=false";
    private Connection conn = null;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");            
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Exito");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Fallo de conexion :)");
            System.out.println(e.getMessage());
        }
    }
    
    public Connection conectar(){
        return conn;
    }
    
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

    

