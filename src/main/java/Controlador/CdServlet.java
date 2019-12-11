/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Dao.CdDao;
import Modelo.CdBean;
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
public class CdServlet extends HttpServlet {

    Conexion conn = new Conexion();
    CdDao cdd = new CdDao(conn);
    String msg;
    boolean respuestas;
    RequestDispatcher rd;
    List<CdBean> lista;
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
        int asignacion = Integer.parseInt(request.getParameter("asignacion"));
        String nombre_cd = request.getParameter("nombre_cd");
        Double precio = Double.parseDouble(request.getParameter("precio"));
        int id_compania = Integer.parseInt(request.getParameter("id_compania"));
        
        CdBean cdb = new CdBean(0);
        cdb.setAsignacion(asignacion);
        cdb.setNombre_cd(nombre_cd);
        cdb.setPrecio(precio);
        cdb.setId_compania(id_compania);

        respuestas = cdd.insertar(cdb);

        if (respuestas) {
            msg = "Registro guardado con exito";
        } else {
            msg = "No se guardo el registro";
        }
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Cd/Cd.jsp");
        rd.forward(request, response);
        
    }

    private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        int id_cd = Integer.parseInt(request.getParameter("id_cd"));
        int asignacion = Integer.parseInt(request.getParameter("asignacion"));
        String nombre_cd = request.getParameter("nombre_cd");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int id_compania = Integer.parseInt(request.getParameter("id_compania"));
        
        CdBean cdb = new CdBean(id_cd);
        cdb.setAsignacion(asignacion);
        cdb.setNombre_cd(nombre_cd);
        cdb.setPrecio(precio);
        cdb.setId_compania(id_compania);
        respuestas = cdd.actualizar(cdb);
        
        lista =cdd.consultar();
        if (respuestas) {
            msg="Guardado";
        } else {
            msg="No Guardado";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Cd/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        lista =cdd.consultar();
        request.setAttribute("lista", lista);
        rd = request.getRequestDispatcher("/Cd/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultarById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         int id_cd = Integer.parseInt(request.getParameter("id_cd"));
         lista = cdd.consultar();
        
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Cd/Editar.jsp");
        rd.forward(request, response);

    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_cd = Integer.parseInt(request.getParameter("id_cd"));
         respuestas = cdd.eliminar(id_cd);
        
        lista = cdd.consultar();
        if (respuestas) {
            msg="Cd eliminado";
        }else{
            msg="Cd no eliminado";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Compania/Mostrar.jsp");
        rd.forward(request, response);
        
        
        

    }

}