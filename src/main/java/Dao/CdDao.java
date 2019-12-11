/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import Modelo.CdBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;




/**
 *
 * @author cesar.reyesusam
 */
public class CdDao {
    Conexion conn;
    
public CdDao(Conexion conn){
    this.conn = conn;
    
   }
public boolean insertar (CdBean cdb){
  String sql = "insert into cd values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
           ps.setInt(1, cdb.getId_cd());
           ps.setInt(2, cdb.getAsignacion());
           ps.setString(3, cdb.getNombre_cd());
            ps.setDouble(4,cdb.getPrecio());
            ps.setInt(5,cdb.getId_compania());
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
public boolean actualizar (CdBean cdb){
  String sql = "update cd set asignacion=?, nombre_cd=?, precio=?, id_compania=?, where id_cd=?)";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
           ps.setInt(1, cdb.getId_cd());
           ps.setInt(2, cdb.getAsignacion());
           ps.setString(3, cdb.getNombre_cd());
            ps.setDouble(4,cdb.getPrecio());
            ps.setInt(4,cdb.getId_compania());
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
    public List<CdBean> consultar(){
        String sql ="select * from cd";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            CdBean cdb;
            ResultSet rs = ps.executeQuery();
            List<CdBean> lista = new LinkedList<>();
            while (rs.next()) {                
                cdb = new CdBean(rs.getInt("id_cd"));
                cdb.setAsignacion(rs.getInt("asignacion"));
                cdb.setNombre_cd(rs.getString("nombre_cd"));
                cdb.setPrecio(rs.getDouble("precio"));
                cdb.setId_compania(rs.getInt("id_compania"));
                lista.add(cdb);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<CdBean> consultarById( int id_cd){
        String sql ="select * from cd where id_cd=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_cd);
            CdBean cdb;
            ResultSet rs = ps.executeQuery();
            List<CdBean> lista = new LinkedList<>();
            while (rs.next()) {                
                cdb = new CdBean(rs.getInt("id_cd"));
                cdb.setAsignacion(rs.getInt("asignacion"));
                cdb.setNombre_cd(rs.getString("nombre_cd"));
                cdb.setPrecio(rs.getDouble("precio"));
                cdb.setId_compania(rs.getInt("id_compania"));
                lista.add(cdb);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
     public boolean eliminar(int id_cd){
        String sql ="delete from cd where id_cd=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_cd);
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
    
    
    
    
       
       


    