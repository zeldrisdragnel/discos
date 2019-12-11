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
public class SolistaGrupoBean {
    private int id_artista;
    private int id_grupo;
    private int id_solista;
    private int id_compania;

    public SolistaGrupoBean(int id_artista) {
        this.id_artista = id_artista;
    }

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public int getId_solista() {
        return id_solista;
    }

    public void setId_solista(int id_solista) {
        this.id_solista = id_solista;
    }

    public int getId_compania() {
        return id_compania;
    }

    public void setId_compania(int id_compania) {
        this.id_compania = id_compania;
    }
    
    
}
