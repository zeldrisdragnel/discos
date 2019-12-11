/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Dao.ColeccionDao;
import Modelo.ColeccionBean;
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
public class ColeccionServlet extends HttpServlet {

   Conexion conn = new Conexion();
    ColeccionDao cod = new ColeccionDao(conn);
    String msg;
    boolean respuestas;
    RequestDispatcher rd;
    List<ColeccionBean> lista;
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
        String nombre_coleccion = (request.getParameter("nombre_coleccion"));
        String promotor = request.getParameter("promotor");
        Double precio = Double.parseDouble(request.getParameter("precio"));
        int id_compania = Integer.parseInt(request.getParameter("id_compania"));
        
        ColeccionBean cob = new ColeccionBean(0);
        cob.setNombre_coleccion(nombre_coleccion);
        cob.setPromotor(promotor);
        cob.setPrecio(precio);
        cob.setId_compania(id_compania);

        respuestas = cod.insertar(cob);

        if (respuestas) {
            msg = "Registro guardado con exito";
        } else {
            msg = "No se guardo el registro";
        }
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Coleccion/Coleccion.jsp");
        rd.forward(request, response);
        
    }

    private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        int id_coleccion = Integer.parseInt(request.getParameter("id_coleccion"));
        String nombre_coleccion = (request.getParameter("nombre_coleccion"));
        String promotor = request.getParameter("promotor");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int id_compania = Integer.parseInt(request.getParameter("id_compania"));
        
        ColeccionBean cdb = new ColeccionBean(id_coleccion);
        cdb.setNombre_coleccion(nombre_coleccion);
        cdb.setPromotor(promotor);
        cdb.setPrecio(precio);
        cdb.setId_compania(id_compania);
        respuestas = cod.actualizar(cdb);
        
        lista =cod.consultar();
        if (respuestas) {
            msg="Guardado";
        } else {
            msg="No Guardado";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Coleccion/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        lista =cod.consultar();
        request.setAttribute("lista", lista);
        rd = request.getRequestDispatcher("/Coleccion/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultarById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         int id_cd = Integer.parseInt(request.getParameter("id_coleccion"));
         lista = cod.consultar();
        
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Coleccion/Editar.jsp");
        rd.forward(request, response);

    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_cd = Integer.parseInt(request.getParameter("id_coleccion"));
         respuestas = cod.eliminar(id_cd);
        
        lista = cod.consultar();
        if (respuestas) {
            msg="Cd eliminado";
        }else{
            msg="Cd no eliminado";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Coleccion/Mostrar.jsp");
        rd.forward(request, response);
        
        
        

    }

}