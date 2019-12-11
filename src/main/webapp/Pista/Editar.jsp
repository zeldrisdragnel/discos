<%-- 
    Document   : Editar
    Created on : 11-15-2019, 03:31:26 PM
    Author     : jose.cortezusam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Habitats</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="row">
            <div class="col-md-4">
                <form action="/zoologico/habitats?action=actualizar" method="POST">
                    <c:forEach items="${lista}" var="v">
                        <P class="text-white">
                            <label>Codigo</label>
                            <input type="number" name="idhabitats" class="form-control" placeholder="Digite el codigo del habitat" value="${v.idhabitats}">
                            <label>Nombre Del Habitat</label>
                            <input type="text" name="nombre_habitat" class="form-control" placeholder="Digite el nombre del habitat" value="${v.nombre_habitat}">
                            <label>Clima Del Habitat</label>
                            <input type="text" name="clima_habitat" class="form-control" placeholder="Digite el habitat del habitat" value="${v.clima_habitat}">
                            <label>Vegetacion</label>
                            <input type="text" name="vegetacion" class="form-control" placeholder="Digite la vegetacion del habitat" value="${v.vegetacion}">
                            <label>Continente</label>
                            <input type="text" name="continente" class="form-control" placeholder="Digite el continente del habitat" value="${v.continente}">
                        </P>
                        <br>
                        <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                        <a href="/zoologico/habitats?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                    </c:forEach>
                </form>
                ${msg}
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>

