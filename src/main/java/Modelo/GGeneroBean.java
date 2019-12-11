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
public class GGeneroBean {
    private int id_grupo_genero;
    private int id_genero;
    private int id_solista;

    public GGeneroBean(int id_grupo_genero) {
        this.id_grupo_genero = id_grupo_genero;
    }

    public int getId_grupo_genero() {
        return id_grupo_genero;
    }

    public void setId_grupo_genero(int id_grupo_genero) {
        this.id_grupo_genero = id_grupo_genero;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public int getId_solista() {
        return id_solista;
    }

    public void setId_solista(int id_solista) {
        this.id_solista = id_solista;
    }
    
    
    
}
