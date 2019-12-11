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
public class ColeccionBean {
    private int id_coleccion;
    private String nombre_coleccion;
    private String promotor;
    private Double  precio;
    private int id_compania;

    public ColeccionBean(int id_coleccion) {
        this.id_coleccion = id_coleccion;
    }

    public int getId_coleccion() {
        return id_coleccion;
    }

    public void setId_coleccion(int id_coleccion) {
        this.id_coleccion = id_coleccion;
    }

    public String getNombre_coleccion() {
        return nombre_coleccion;
    }

    public void setNombre_coleccion(String nombre_coleccion) {
        this.nombre_coleccion = nombre_coleccion;
    }

    public String getPromotor() {
        return promotor;
    }

    public void setPromotor(String promotor) {
        this.promotor = promotor;
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
