



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro || Solistas</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="container">
            <div class="col-md-12">
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    REGISTRO DE SOLISTAS</font>
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
                                <td>Codigo Solista</td>
                                <td>Nombre del Solista</td>
                                <td>Pais</td>
                                <td>Genero</td>
                                <td>Acciones</td>
                                <td></td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${lista}" var="v">
                                <tr>
                                    <td>${v.id_solista}</td>
                                    <td>${v.nombre_solista}</td>
                                    <td>${v.pais}</td>
                                    <td>${v.genero}</td>
                                    <td>
                                        <a href="/Solista/Solista.jsp?action=eliminar&id_solista=${v.id_solista}" class="btn btn-danger">Eliminar</a>
                                        <a href="/Solista/Solista.jsp?action=consultarById&id_solista=${v.id_solista}" class="btn btn-success">Modificar</a>
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
