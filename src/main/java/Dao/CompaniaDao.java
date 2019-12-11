/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import Modelo.CompaniaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cesar.reyesusam
 */
public class CompaniaDao {

    Conexion conn;

    public CompaniaDao(Conexion conn) {
        this.conn = conn;

    }

    public boolean insertar(CompaniaBean cb) {
        String sql = "insert into compania values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, cb.getId_compania());
            ps.setString(2, cb.getNombre_compania());
            ps.setString(3, cb.getDireccion());
            ps.setString(4, cb.getSede());
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean actualizar(CompaniaBean cb) {
        String sql = "update compania set nombre_compania=?, direccion=?, sede=? where id_compania=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setString(1, cb.getNombre_compania());
            ps.setString(2, cb.getDireccion());
            ps.setString(3, cb.getSede());
            ps.setInt(4, cb.getId_compania());
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<CompaniaBean> consultar() {
        String sql = "select * from compania";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            CompaniaBean cb;
            ResultSet rs = ps.executeQuery();
            List<CompaniaBean> lista = new LinkedList<>();
            while (rs.next()) {
                cb = new CompaniaBean(rs.getInt("id_compania"));
                cb.setNombre_compania(rs.getString("nombre_compania"));
                cb.setDireccion(rs.getString("direccion"));
                cb.setSede(rs.getString("sede"));
                lista.add(cb);
            }
            return lista;
        } catch (SQLException e) {
            return null;
        }
    }

    public List<CompaniaBean> consultarById(int id_compania) {
        String sql = "select * from compania where id_compania=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_compania);
            CompaniaBean cb;
            ResultSet rs = ps.executeQuery();
            List<CompaniaBean> lista = new LinkedList<>();
            while (rs.next()) {
                cb = new CompaniaBean(rs.getInt("id_compania"));
                cb.setNombre_compania(rs.getString("nombre_compania"));
                cb.setDireccion(rs.getString("direccion"));
                cb.setSede(rs.getString("sede"));
                lista.add(cb);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean eliminar(int id_compania) {
        String sql = "delete from compania where id_compania=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_compania);
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
