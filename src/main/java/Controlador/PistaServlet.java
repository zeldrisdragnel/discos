/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Dao.PistaDao;
import Modelo.PistaBean;
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
public class PistaServlet extends HttpServlet {

    Conexion conn = new Conexion();
    PistaDao pd = new PistaDao(conn);
    String msg;
    boolean respuestas;
    RequestDispatcher rd;
    List<PistaBean> lista;
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
        int numero = Integer.parseInt(request.getParameter("numero"));
        String titulo = request.getParameter("titulo");
        String duracion = (request.getParameter("duracion"));
        int id_cd = Integer.parseInt(request.getParameter("id_cd"));
        
        PistaBean pb = new PistaBean(0);
        pb.setNumero(numero);
        pb.setTitulo(titulo);
        pb.setDuracion(duracion);
        pb.setId_cd(id_cd);

        respuestas = pd.insertar(pb);

        if (respuestas) {
            msg = "Registro guardado con exito";
        } else {
            msg = "No se guardo el registro";
        }
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Pista/Pista.jsp");
        rd.forward(request, response);
        
    }

    private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        int id_pista = Integer.parseInt(request.getParameter("id_pista"));
        int numero = Integer.parseInt(request.getParameter("numero"));
        String titulo = request.getParameter("titulo");
        String duracion = request.getParameter("duracion");
        int id_cd = Integer.parseInt(request.getParameter("id_cd"));
        
        PistaBean pb = new PistaBean(id_pista);
        pb.setNumero(numero);
        pb.setTitulo(titulo);
        pb.setNumero(numero);
        pb.setId_cd(id_cd);
        respuestas = pd.actualizar(pb);
        
        lista =pd.consultar();
        if (respuestas) {
            msg="Guardado";
        } else {
            msg="No Guardado";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Pista/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        lista =pd.consultar();
        request.setAttribute("lista", lista);
        rd = request.getRequestDispatcher("/Pista/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultarById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         int id_pista = Integer.parseInt(request.getParameter("id_pista"));
         lista = pd.consultar();
        
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Pista/Editar.jsp");
        rd.forward(request, response);

    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_pista = Integer.parseInt(request.getParameter("id_pista"));
         respuestas = pd.eliminar(id_pista);
        
        lista = pd.consultar();
        if (respuestas) {
            msg="Cd eliminado";
        }else{
            msg="Cd no eliminado";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Pista/Mostrar.jsp");
        rd.forward(request, response);
        
        
        

    }

}