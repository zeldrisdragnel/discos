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
public class PersonalBean {
    private int id_personal;
    private int nombre;
    private int apellido;
    
    public int getId_personal(){
        return id_personal;
        
    }

    public PersonalBean(int id_personal) {
        this.id_personal = id_personal;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getApellido() {
        return apellido;
    }

    public void setApellido(int apellido) {
        this.apellido = apellido;
    }
  
        
    }
    

