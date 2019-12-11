/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import Modelo.GrupoBean;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cesar.reyesusam
 */
public class GrupoDao {
    Conexion conn;
    
public GrupoDao(Conexion conn){
    this.conn = conn;
    
   }
public boolean insertar (GrupoBean gb){
  String sql = "insert into grupo values(?,?,?,?)";
        try {
           PreparedStatement ps = conn.conectar().prepareStatement(sql);
           ps.setInt(1, gb.getId_grupo());
           ps.setString(2, gb.getNombre_grupo());
           ps.setInt(3, gb.getIntegrantes());
           ps.setString(4,gb.getNombre_integrantes());
            
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
public boolean actualizar (GrupoBean gb){
  String sql = "update grupo set nombre_grupo=?, integrantes=?, nombre_integrantes=?,  where id_grupo=?)";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
           ps.setInt(1, gb.getId_grupo());
           ps.setString(2, gb.getNombre_grupo());
           ps.setInt(3, gb.getIntegrantes());
            ps.setString(4,gb.getNombre_integrantes());
            
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
    public List<GrupoBean> consultar(){
        String sql ="select * from grupo";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            GrupoBean gb;
            ResultSet rs = ps.executeQuery();
            List<GrupoBean> lista = new LinkedList<>();
            while (rs.next()) {                
                gb = new GrupoBean(rs.getInt("id_grupo"));
                gb.setNombre_grupo(rs.getString("nombre_grupo"));
                gb.setIntegrantes(rs.getInt("integrantes"));
                gb.setNombre_integrantes(rs.getString("nombre_integrantes"));
                
                lista.add(gb);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<GrupoBean> consultarById( int id_grupo){
        String sql ="select * from grupo where id_grupo=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_grupo);
            GrupoBean gb;
            ResultSet rs = ps.executeQuery();
            List<GrupoBean> lista = new LinkedList<>();
            while (rs.next()) {                
                gb = new GrupoBean(rs.getInt("id_grupo"));
                gb.setNombre_grupo(rs.getString("solista"));
                gb.setIntegrantes(rs.getInt("integrantes"));
                gb.setNombre_integrantes(rs.getString("duracion"));
                
                lista.add(gb);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
     public boolean eliminar(int id_grupo){
        String sql ="delete from grupo where id_grupo=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_grupo);
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    }


    
    
    
    
       
       


     

