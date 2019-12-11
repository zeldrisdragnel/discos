/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.Conexion;
import Modelo.PistaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cesar.reyesusam
 */

    public class PistaDao {
    Conexion conn;
    
public PistaDao(Conexion conn){
    this.conn = conn;
    
   }
public boolean insertar (PistaBean pb){
  String sql = "insert into pista values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
           ps.setInt(1, pb.getId_pista());
           ps.setInt(2, pb.getNumero());
           ps.setString(3, pb.getTitulo());
            ps.setString(4,pb.getDuracion());
            ps.setInt(5,pb.getId_cd());
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
public boolean actualizar (PistaBean pb){
  String sql = "update pista set numero=?, titulo=?, duracion=?, id_cd=?, where id_pista=?)";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
           ps.setInt(1, pb.getId_pista());
           ps.setInt(2, pb.getNumero());
           ps.setString(3, pb.getTitulo());
            ps.setString(4,pb.getDuracion());
            ps.setInt(4,pb.getId_cd());
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
    public List<PistaBean> consultar(){
        String sql ="select * from pista";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            PistaBean pb;
            ResultSet rs = ps.executeQuery();
            List<PistaBean> lista = new LinkedList<>();
            while (rs.next()) {                
                pb = new PistaBean(rs.getInt("id_pista"));
                pb.setNumero(rs.getInt("numero"));
                pb.setTitulo(rs.getString("titulo"));
                pb.setDuracion(rs.getString("duracion"));
                pb.setId_cd(rs.getInt("id_cd"));
                lista.add(pb);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<PistaBean> consultarById( int id_pista){
        String sql ="select * from pista where id_pista=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_pista);
            PistaBean pb;
            ResultSet rs = ps.executeQuery();
            List<PistaBean> lista = new LinkedList<>();
            while (rs.next()) {                
                pb = new PistaBean(rs.getInt("id_pista"));
                pb.setNumero(rs.getInt("numero"));
                pb.setTitulo(rs.getString("titulo"));
                pb.setDuracion(rs.getString("duracion"));
                pb.setId_cd(rs.getInt("id_cd"));
                lista.add(pb);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
     public boolean eliminar(int id_pista){
        String sql ="delete from pista where id_pista=?";
        try {
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, id_pista);
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    }


    
    
    
    
       
       


    