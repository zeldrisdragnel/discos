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
public class SolistaBean {

    private int id_solista;
    private String nombre_solista;
    private String pais;
    private String genero;

    public SolistaBean(int id_solista) {
        this.id_solista = id_solista;
    }

    public int getId_solista() {
        return id_solista;
    }

    public void setId_solista(int id_solista) {
        this.id_solista = id_solista;
    }

    public String getNombre_solista() {
        return nombre_solista;
    }

    public void setNombre_solista(String nombre_solista) {
        this.nombre_solista = nombre_solista;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

  
            
    
}
