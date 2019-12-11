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
public class GrupoBean {

    private int id_grupo;
    private String nombre_grupo;
    private int integrantes;
    private String nombre_integrantes;

    public GrupoBean(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public String getNombre_grupo() {
        return nombre_grupo;
    }

    public void setNombre_grupo(String nombre_grupo) {
        this.nombre_grupo = nombre_grupo;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    public String getNombre_integrantes() {
        return nombre_integrantes;
    }

    public void setNombre_integrantes(String nombre_integrantes) {
        this.nombre_integrantes = nombre_integrantes;
    }

  
    
    
}
