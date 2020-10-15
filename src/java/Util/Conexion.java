/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *1.
 * @author DELL
 */
public class Conexion {

    private String driver, urlBD, user, password, bd;
    private Connection conexion;

    public Conexion() {
        driver = "com.mysql.jdbc.Driver";
        bd = "medicalhelp";
        urlBD = "jdbc:mysql://localhost:3306/" + bd;
        user = "root";
        password = "";
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(urlBD, user, password);
            System.out.println("Conexión OK");
        } catch (Exception e) {
            System.out.println("Error al conectar la BD" + e);
            
        }

    }

    public Connection obtenerConexion() {
        return conexion;
    }

    public Connection cerrarConexion() throws SQLException {
        conexion.close();
        conexion = null;
        return conexion;
    }
    public static void main(String[] args){
    new Conexion();
    }

}
