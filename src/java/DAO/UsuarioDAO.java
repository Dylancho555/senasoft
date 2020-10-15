/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.Conexion;
import Util.Crud;
import VO.UsuarioVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SENA
 */
public class UsuarioDAO extends Conexion implements Crud {

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private String idusuario = "", idtipodedocumento = "", idrol = "", nombre = "", apellido = "", telefono = "", numerodedocumento = "", direccion = "", correo = "", fechadenaciminto = "", clave = "";

    private boolean operacion = false;
    private String sql;

    public UsuarioDAO(UsuarioVO usuVO) {

        super();

        try {
            conexion = this.obtenerConexion();
            idusuario = usuVO.getIdusuario();
            idtipodedocumento = usuVO.getIdtipodedocumento();
            idrol = usuVO.getIdrol();
            nombre = usuVO.getNombre();
            apellido = usuVO.getApellido();
            telefono = usuVO.getTelefono();
            numerodedocumento = usuVO.getNumerodedocumento();
            direccion = usuVO.getDireccion();
            correo = usuVO.getCorreo();
            fechadenaciminto = usuVO.getFechadenaciminto();
            clave = usuVO.getClave();

        } catch (Exception e) {

            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "insert into usuario values(null,?,?,?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idusuario);
            puente.setString(2, idtipodedocumento);
            puente.setString(3, idrol);
            puente.setString(4, nombre);
            puente.setString(5, telefono);
            puente.setString(6, numerodedocumento);
            puente.setString(7, direccion);
            puente.setString(8, correo);
            puente.setString(9, fechadenaciminto);
            puente.setString(10, clave);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }
        return operacion;

    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "update usuario set idtipodedocumento=?, idrol =?, nombre=?, telefono=?, numerodedocumento=?, direccion=?, correo=? , fechadenaciminto=?, clave=?  where usuid=?";
            puente = conexion.prepareStatement(sql);
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idusuario);
            puente.setString(2, idtipodedocumento);
            puente.setString(3, idrol);
            puente.setString(4, nombre);
            puente.setString(5, telefono);
            puente.setString(6, numerodedocumento);
            puente.setString(7, direccion);
            puente.setString(8, correo);
            puente.setString(9, fechadenaciminto);
            puente.setString(10, clave);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        try {
            sql = "delete from usuario where usuid=?";
            sql = "delete from usuario where usuid=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idusuario);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {

            }

        }
        return operacion;

    }

    public boolean inicioSesion(String usuario, String password) {

        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuario where correo=? and clave=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, correo);
            puente.setString(2, clave);
            mensajero = puente.executeQuery();
            if (mensajero.next()) {
                operacion = true;

            }

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }

        return operacion;
    }

}
