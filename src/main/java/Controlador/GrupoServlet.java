/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Dao.GrupoDao;
import Modelo.GrupoBean;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cesar.reyesusam
 */
public class GrupoServlet extends HttpServlet {

    Conexion conn = new Conexion();
    GrupoDao gd = new GrupoDao(conn);
    String msg;
    boolean respuestas;
    RequestDispatcher rd;
    List<GrupoBean> lista;
    private boolean respuesta;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        String action = request.getParameter("action");
        switch (action) {
            case "insertar":
                insertar(request, response);
                break;
            case "actualizar":
                actualizar(request, response);
                break;
            case "consultar":
                consultar(request, response);
                break;
            case "consultarById":
                consultarById(request, response);
                break;
            case "eliminar":
                eliminar(request, response);
                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            
        }
    }

    private void insertar(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException, ServletException {
        String nombre_grupo = (request.getParameter("nombre_grupo"));
        int integrantes = Integer.parseInt(request.getParameter("integrantes"));
        String nombre_integrantes = (request.getParameter("nombre_integrantes"));
        
        
        GrupoBean gb = new GrupoBean(0);
        gb.setNombre_grupo(nombre_grupo);
        gb.setIntegrantes(integrantes);
        gb.setNombre_integrantes(nombre_integrantes);
        

        respuestas = gd.insertar(gb);

        if (respuestas) {
            msg = "Registro guardado con exito";
        } else {
            msg = "No se guardo el registro";
        }
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Grupo/Grupo.jsp");
        rd.forward(request, response);
        
    }

    private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        int id_grupo = Integer.parseInt(request.getParameter("id_grupo"));
        String nombre_grupo = request.getParameter("nombre_grupo");
        int integrantes =  Integer.parseInt(request.getParameter("integrantes"));
        String nombre_integrantes = (request.getParameter("nombre_integrantes"));
        
        GrupoBean gb = new GrupoBean(id_grupo);
        gb.setNombre_grupo(nombre_grupo);
        gb.setIntegrantes(integrantes);
        gb.setNombre_integrantes(nombre_integrantes);
        
        respuestas = gd.actualizar(gb);
        
        lista =gd.consultar();
        if (respuestas) {
            msg="Guardado";
        } else {
            msg="No Guardado";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Grupo/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        lista =gd.consultar();
        request.setAttribute("lista", lista);
        rd = request.getRequestDispatcher("/Grupo/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultarById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         int id_grupo = Integer.parseInt(request.getParameter("id_grupo"));
         lista = gd.consultar();
        
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Grupo/Editar.jsp");
        rd.forward(request, response);

    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_grupo = Integer.parseInt(request.getParameter("id_grupo"));
         respuestas = gd.eliminar(id_grupo);
        
        lista = gd.consultar();
        if (respuestas) {
            msg="Cd eliminado";
        }else{
            msg="Cd no eliminado";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Grupo/Mostrar.jsp");
        rd.forward(request, response);
        
        
        

    }

}