

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro || Pistas</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="container">
            <div class="col-md-12">
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    REGISTRO DE PISTAS</font>
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
                                <td>No.</td>
                                <td>Titulo</td>
                                <td>Duracion</td>
                                <td>Codigo Cd </td>
                                <td>Acciones</td>
                                <td></td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${lista}" var="v">
                                <tr>
                                    <td>${v.id_pista}</td>
                                    <td>${v.numero}</td>
                                    <td>${v.titulo}</td>
                                    <td>${v.duracion}</td>
                                    <td>${v.id_cd}</td>
                                    <td>
                                        <a href="/Pista/Pista.jsp?action=eliminar&id_pista=${v.id_pista}" class="btn btn-danger">Eliminar</a>
                                        <a href="/Pista/Pista.jsp?action=consultarById&id_pista=${v.id_pista}" class="btn btn-success">Modificar</a>
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
