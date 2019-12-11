<%-- 
    Document   : MostrarZonas
    Created on : 11-19-2019, 01:36:16 PM
    Author     : jose.cortezusam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro || Zonas</title>  
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="container">
            <div class="col-md-12">
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    REGISTRO DE ZONAS</font>
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
                                <td>Nombre De La Zona</td>
                                <td>Extension Territorial</td>
                                <td>ID De La Especie</td>
                                <td>Acciones</td>
                                <td></td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${lista}" var="v">
                                <tr>
                                    <td>${v.idzonas}</td>
                                    <td>${v.nombre_zona}</td>
                                    <td>${v.extension_territorial}</td>
                                    <td>${v.idespecie}</td>
                                    <td>
                                        <a href="/zoologico/zonas?action=eliminar&idzonas${v.idzonas}" class="btn btn-danger">Eliminar</a>
                                        <a href="/zoologico/zonas?action=consultarById&idzonas${v.idzonas}" class="btn btn-success">Modificar</a> 
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
