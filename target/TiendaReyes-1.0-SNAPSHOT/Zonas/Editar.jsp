<%-- 
    Document   : Editar
    Created on : 11-19-2019, 02:20:31 PM
    Author     : jose.cortezusam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Zonas</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="row">
            <div class="col-md-4">
                <form action="/zoologico/zonas?action=insertar" method="POST">
                    <c:forEach items="${lista}" var="v">
                        <p class="text-white">
                            <label>Codigo</label>
                            <input type="number" name="idzonas" class="form-control" placeholder="Digite el codigo de la zona" value="${v.idzonas}">
                            <label>Nombre De La Zona</label>
                            <input type="text" name="nombre_zona" class="form-control" placeholder="Digite el nombre de la zona" value="${v.nombre_zona}">
                            <label>Extension Territorial</label>
                            <input type="number" name="extension_territorial" class="form-control" placeholder="Digite la extension territorial de la zona" value="${v.extension_territorial}">
                            <label>ID De Las Especies</label>
                            <input type="number" name="idespecies" class="form-control" placeholder="Digite el ID de las especies" value="${v.idespecies}">
                        </p>
                        <br>
                        <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                        <a href="/zoologico/zonas?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                    </c:forEach>
                </form>
                ${msg}
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>
