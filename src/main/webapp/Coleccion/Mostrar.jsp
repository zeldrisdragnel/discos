<%-- 
    Document   : Mostrar
    Created on : 11-20-2019, 02:17:15 PM
    Author     : cesar.reyesusam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro || Coleccion</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="container">
            <div class="col-md-12">
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    REGISTRO DE COLECCIONES</font>
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
                                <td>Codigo Coleccion</td>
                                <td>Nombre Coleccion</td>
                                <td>Promotor</td>
                                <td>Precio </td>
                                <td>Codigo Coleccion </td>
                                <td>Acciones</td>
                                <td></td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${lista}" var="v">
                                <tr>
                                    <td>${v.id_coleccion}</td>
                                    <td>${v.nombre_coleccion}</td>
                                    <td>${v.promotor}</td>
                                    <td>${v.precio}</td>
                                    <td>${v.id_compania}</td>
                                    <td>
                                        <a href="/Coleccion/Coleccion.jsp?action=eliminar&id_coleccion=${v.id_coleccion}" class="btn btn-danger">Eliminar</a>
                                        <a href="/Coleccion/Coleccion.jsp?action=consultarById&id_coleccion=${v.id_coleccion}" class="btn btn-success">Modificar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>
