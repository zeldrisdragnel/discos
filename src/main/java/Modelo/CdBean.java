/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author cesar.reyesusam
 */
public class CdBean {
    private int id_cd;
    private int asignacion;
    private String nombre_cd;
    private Double  precio;
    private int id_compania;

    public CdBean(int id_cd) {
        this.id_cd = id_cd;
    }

    public int getId_cd() {
        return id_cd;
    }

    public void setId_cd(int id_cd) {
        this.id_cd = id_cd;
    }

    public int getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(int asignacion) {
        this.asignacion = asignacion;
    }

    public String getNombre_cd() {
        return nombre_cd;
    }

    public void setNombre_cd(String nombre_cd) {
        this.nombre_cd = nombre_cd;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getId_compania() {
        return id_compania;
    }

    public void setId_compania(int id_compania) {
        this.id_compania = id_compania;
    }

 
      
      
    
    
    
}
