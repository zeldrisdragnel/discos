/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import Modelo.SolistaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cesar.reyesusam
 */
public class SolistaDao {
   
    Conexion conn;
    
public SolistaDao(Conexion conn){
    this.conn = conn;
    
   }
public boolean insertar (SolistaBean sb){
  String sql = "insert into solista values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
           ps.setInt(1, sb.getId_solista());
           ps.setString(2, sb.getNombre_solista());
           ps.setString(3, sb.getPais());
            ps.setString(4,sb.getGenero());
            
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
public boolean actualizar (SolistaBean sb){
  String sql = "update solista set nombre_solista=?, pais=?, genero=?,  where id_solista=?)";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
           ps.setInt(1, sb.getId_solista());
           ps.setString(2, sb.getNombre_solista());
           ps.setString(3, sb.getPais());
            ps.setString(4,sb.getGenero());
            
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
    public List<SolistaBean> consultar(){
        String sql ="select * from solista";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            SolistaBean sb;
            ResultSet rs = ps.executeQuery();
            List<SolistaBean> lista = new LinkedList<>();
            while (rs.next()) {                
                sb = new SolistaBean(rs.getInt("id_solista"));
                sb.setNombre_solista(rs.getString("nombre_solista"));
                sb.setPais(rs.getString("pais"));
                sb.setGenero(rs.getString("genero"));
                
                lista.add(sb);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<SolistaBean> consultarById( int id_solista){
        String sql ="select * from solista where id_solista=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_solista);
            SolistaBean sb;
            ResultSet rs = ps.executeQuery();
            List<SolistaBean> lista = new LinkedList<>();
            while (rs.next()) {                
                sb = new SolistaBean(rs.getInt("id_solista"));
                sb.setNombre_solista(rs.getString("solista"));
                sb.setPais(rs.getString("pais"));
                sb.setGenero(rs.getString("duracion"));
                
                lista.add(sb);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
     public boolean eliminar(int id_solista){
        String sql ="delete from solista where id_solista=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_solista);
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    }


    
    
    
    
       
       


    