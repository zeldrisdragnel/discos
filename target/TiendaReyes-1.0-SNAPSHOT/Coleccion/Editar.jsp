<%-- 
    Document   : Editar
    Created on : 11-22-2019, 09:38:00 AM
    Author     : jose.cortezusam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guias</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <form action="/zoologico/guias?action=insertar" method="POST">
                        <c:forEach items="${lista}" var="v">
                        <p class="text-white">
                            <label>Codigo</label>
                            <input type="number" name="idguia"class="form-control" placeholder="Digite el codigo del guia" value="${v.idguia}"
                            <label>Nombre Del Guia</label>
                            <input type="text" name="nombre_guia" class="form-control" placeholder="Digite el nombre del guia" value="${v.nombre_guia}">
                            <label>Direccion Del Guia</label>
                            <input type="text" name="direccion_guia" class="form-control" placeholder="Digite la direccion del guia" value="${v.direccion_guia}">
                            <label>Telefono Del Guia</label>
                            <input type="number" name="telefono_guia" class="form-control" placeholder="Digite el telefono del guia" value="${v.telefono_guia}">
                            <label>Fecha De Contratacion Del Guia</label>
                            <input type="text" name="fecha_ingreso" class="form-control" placeholder="Digite la fecha de contratacion del guia" value="${v.fecha_ingreso}">
                        </p>
                        <br>
                        <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                        <a href="/zoologico/guias?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                        </c:forEach>
                    </form>
                    ${msg}
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>
