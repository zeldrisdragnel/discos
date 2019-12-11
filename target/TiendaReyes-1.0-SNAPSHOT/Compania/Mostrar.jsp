

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro || Compañia</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="container">
            <div class="col-md-12">
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    REGISTRO DE COMPAÑIAS</font>
                </p>
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    TIENDA DE DISCOS MUSICALES 'REYES'</font>
                </p>
            </div>
            <br>
            <div class="row">
                <div class="col-md-12">
                    <table class="table table-hover table-dark">
                        <thead>
                            <tr>
                                <td>Codigo</td>
                                <td>Nombre de la Compañia</td>
                                <td>Direccion de la Compañia</td>
                                <td>Sede Compañia</td>
                                <td>Acciones</td>
                                <td></td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${lista}" var="ver">
                                <tr>
                                    <td>${ver.id_compania}</td>
                                    <td>${ver.nombre_compania}</td>
                                    <td>${ver.direccion}</td>
                                    <td>${ver.sede}</td>
                                    <td>
                                        <a href="Compania?action=eliminar&id_compania=${ver.id_compania}" class="btn btn-danger">Eliminar</a>
                                        <a href="Compania?action=consultarById&id_compania=${ver.id_compania}" class="btn btn-success">Modificar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    ${msg}
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>
