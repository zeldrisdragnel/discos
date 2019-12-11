<%-- 
    Document   : Editar
    Created on : 11-20-2019, 01:16:39 PM
    Author     : jose.cortezusam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuidadores</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <form action="/zoologico/cuidadores?action=actualizar" method="POST">
                        <c:forEach items="${lista}" var="v">
                            <p class="text-white">
                                <label>Codigo</label>
                                <input type="number" name="idcuidadores" class="form-control" placeholder="Digite el codigo del cuidador" value="${v.idcuidadores}">
                                <label>Nombre Del Cuidador</label>
                                <input type="text" name="nombre_cuidadores" class="form-control" placeholder="Digite el nombre del cuidador" value="${v.nombre_cuidadores}">
                                <label>Direccion Del Cuidador</label>
                                <input type="text" name="direccion_cuidadores" class="form-control" placeholder="Digite la direccion exacta del cuidador" value="${v.direccion_cuidadores}">
                                <label>Telefono Del Cuidador</label>
                                <input type="number" name="telefono_cuidadores" class="form-control" placeholder="Digite el telefono del cuidador" value="${v.telefono_cuidadores}">
                                <label>¿Cual Fue Su Fecha De Ingreso?</label>
                                <input name="fecha_ingreso" class="form-control" placeholder="Digite la fecha de ingreso del cuidador" value="${v.fecha_ingreso}">
                            </p>
                            <br>
                            <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                            <a href="/zoologico/cuidadores?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                        </c:forEach>
                    </form>
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>
