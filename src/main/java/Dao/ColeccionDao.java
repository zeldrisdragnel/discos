/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import Modelo.ColeccionBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cesar.reyesusam
 */
public class ColeccionDao {
    Conexion conn;

    public ColeccionDao(Conexion conn) {
        this.conn = conn;
    
   }
public boolean insertar (ColeccionBean cob){
  String sql = "insert into coleccion values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
           ps.setInt(1, cob.getId_coleccion());
           ps.setString(2, cob.getNombre_coleccion());
           ps.setString(3, cob.getPromotor());
            ps.setDouble(4,cob.getPrecio());
            ps.setInt(5,cob.getId_compania());
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
public boolean actualizar (ColeccionBean cob){
  String sql = "update coleccion set nombre_coleccion=?, promotor=?, precio=?, id_compania=?, where id_coleccion=?)";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
           ps.setInt(1, cob.getId_coleccion());
           ps.setString(2, cob.getNombre_coleccion());
           ps.setString(3, cob.getPromotor());
            ps.setDouble(4,cob.getPrecio());
            ps.setInt(4,cob.getId_compania());
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
    public List<ColeccionBean> consultar(){
        String sql ="select * from coleccion";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ColeccionBean cob;
            ResultSet rs = ps.executeQuery();
            List<ColeccionBean> lista = new LinkedList<>();
            while (rs.next()) {                
                cob = new ColeccionBean(rs.getInt("id_coleccion"));
                cob.setNombre_coleccion(rs.getString("nombre_coleccion"));
                cob.setPromotor(rs.getString("promotor"));
                cob.setPrecio(rs.getDouble("precio"));
                cob.setId_compania(rs.getInt("id_compania"));
                lista.add(cob);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<ColeccionBean> consultarById( int id_coleccion){
        String sql ="select * from coleccion where id_coleccion=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_coleccion);
            ColeccionBean cob;
            ResultSet rs = ps.executeQuery();
            List<ColeccionBean> lista = new LinkedList<>();
            while (rs.next()) {                
                cob = new ColeccionBean(rs.getInt("id_coleccion"));
                cob.setNombre_coleccion(rs.getString("nombre_coleccion"));
                cob.setPromotor(rs.getString("nombre_cd"));
                cob.setPrecio(rs.getDouble("precio"));
                cob.setId_compania(rs.getInt("id_compania"));
                lista.add(cob);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
     public boolean eliminar(int id_coleccion){
        String sql ="delete from coleccion where id_coleccion=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_coleccion);
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
    
    
    
    
       
       


    