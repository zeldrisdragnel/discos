package Controlador;

import Conexion.Conexion;
import Dao.CompaniaDao;
import Modelo.CompaniaBean;
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
public class CompaniaServlet extends HttpServlet {
    Conexion conn = new Conexion();
    CompaniaDao cd = new CompaniaDao(conn);
    String msg;
    boolean respuestas;
    RequestDispatcher rd;
    List<CompaniaBean> lista;
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

    private void insertar(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException {
        String nombre_compania = request.getParameter("nombre_compania");
        String direccion = request.getParameter("direccion");
        String sede = request.getParameter("sede");
        
        CompaniaBean cb = new CompaniaBean(0);
        cb.setNombre_compania(nombre_compania);
        cb.setDireccion(direccion);
        cb.setSede(sede);

        respuestas = cd.insertar(cb);

        if (respuestas) {
            msg = "Registro guardado con exito";
        } else {
            msg = "No se guardo el registro";
        }
        response.sendRedirect(request.getContextPath() + "/Compania/Compania.jsp");
    }

    private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        int id_compania = Integer.parseInt(request.getParameter("id_compania"));
        String nombre_compania = request.getParameter("nombre_compania");
        String direccion = request.getParameter("direccion");
        String sede = request.getParameter("sede");
        
        CompaniaBean cb = new CompaniaBean(id_compania);
        cb.setNombre_compania(nombre_compania);
        cb.setDireccion(direccion);
        cb.setSede(sede);
        respuestas = cd.actualizar(cb);
        
        lista =cd.consultar();
        if (respuestas) {
            msg="Guardado";
        } else {
            msg="No Guardado";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Compania/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        lista =cd.consultar();
        request.setAttribute("lista", lista);
        rd = request.getRequestDispatcher("/Compania/Mostrar.jsp");
        rd.forward(request, response);
    }

    private void consultarById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         int id_compania = Integer.parseInt(request.getParameter("id_compania"));
         lista = cd.consultarById(id_compania);
        
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Compania/Editar.jsp");
        rd.forward(request, response);

    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_compania = Integer.parseInt(request.getParameter("id_compania"));
         respuestas = cd.eliminar(id_compania);
        
        lista = cd.consultar();
        if (respuestas) {
            msg="Compania eliminada";
        }else{
            msg="Compania no eliminada";
        }
        request.setAttribute("lista", lista);
        request.setAttribute("msg", msg);
        rd = request.getRequestDispatcher("/Compania/Mostrar.jsp");
        rd.forward(request, response);
        
        
        

    }

}
