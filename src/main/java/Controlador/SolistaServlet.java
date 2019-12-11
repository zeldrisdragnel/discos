/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Dao.SolistaDao;
import Modelo.SolistaBean;
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
public class SolistaServlet extends HttpServlet {

    Conexion conn = new Conexion();
    SolistaDao sd = new SolistaDao(conn);
    String msg;
    boolean respuestas;
    RequestDispatcher rd;
    List<SolistaBean> lista;
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
        String nombre_solista = (request.getParameter("nombre_solista"));
        String pais = request.getParameter("pais");
        String genero = (request.getParameter("genero"));
        
        
        SolistaBean sb = new SolistaBean(0);
        sb.setNombre_solista(nombre_solista);
        sb.setPais(pais);
        sb.setGenero(genero);
        

        respuestas = sd.insertar(sb);

        if (respuestas) {
            msg = "Registro guardado con exito";
        } else {
            msg = "No se guardo el registro";
        }
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Solista/Solista.jsp");
        rd.forward(request, response);
        
    }

    private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        int id_solista = Integer.parseInt(request.getParameter("id_solista"));
        String nombre_solista = request.getParameter("nombre_solista");
        String pais = request.getParameter("pais");
        String genero = (request.getParameter("genero"));
        
        SolistaBean sb = new SolistaBean(id_solista);
        sb.setNombre_solista(nombre_solista);
        sb.setPais(pais);
        sb.setGenero(genero);
        
        respuestas = sd.actualizar(sb);
        
        lista =sd.consultar();
        if (respuestas) {
            msg="Guardado";
        } else {
            msg="No Guardado";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Solista/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        lista =sd.consultar();
        request.setAttribute("lista", lista);
        rd = request.getRequestDispatcher("/Solista/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultarById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         int id_solista = Integer.parseInt(request.getParameter("id_solista"));
         lista = sd.consultar();
        
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Solista/Editar.jsp");
        rd.forward(request, response);

    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_solista = Integer.parseInt(request.getParameter("id_solista"));
         respuestas = sd.eliminar(id_solista);
        
        lista = sd.consultar();
        if (respuestas) {
            msg="Cd eliminado";
        }else{
            msg="Cd no eliminado";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Solista/Mostrar.jsp");
        rd.forward(request, response);
        
        
        

    }

}