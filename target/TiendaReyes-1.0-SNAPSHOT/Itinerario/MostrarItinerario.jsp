<%-- 
    Document   : MostrarItinerario
    Created on : 11-22-2019, 10:27:36 AM
    Author     : jose.cortezusam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro || Itinirarios</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="container">
            <div class="col-md-12">
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    REGISTRO DE ITINERARIOS</font>
                </p>
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    ZOOLOGICO NACIONAL DE EL SALVADOR</font>
                </p>
            </div>
            <br>
            <div class="row">
                <div class="col-md-12">
                    <table class="table table-hover table-dark">
                        <thead>
                            <tr>
                                <td>Codigo</td>
                                <td>Duracion Del Recorrido</td>
                                <td>Longitud Del Itinerario</td>
                                <td>Numero De Visitantes</td>
                                <td>Numero De Especies</td>
                                <td>ID De Las Especies</td>
                                <td>Acciones</td>
                                <td></td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${lista}" var="v">
                                <tr>
                                    <td>${v.iditinerarios}</td>
                                    <td>${v.duracion_recorrido}</td>
                                    <td>${v.longitud_itinerario}</td>
                                    <td>${v.numero_visitantes}</td>
                                    <td>${v.numero_especies}</td>
                                    <td>${v.idespecies}</td>
                                    <td>
                                        <a href="/zoologico/itinerarios?action=eliminar&iditinerarios=${v.iditinerarios}" class="btn btn-danger">Eliminar</a>
                                        <a href="/zoologico/itinerarios?action=consultarById&iditinerarios=${v.iditinerarios}" class="btn btn-success">Modificar</a>
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
