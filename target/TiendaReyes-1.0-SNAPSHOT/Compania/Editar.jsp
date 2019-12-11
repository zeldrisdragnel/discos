

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compañia</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="container">
            <div class="col-md-12">
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    TIENDA DE DISCOS REYES</font>
                </p>
                <p class="text-center">
                    <font face="impact" size="6" color="white">
                    EDITAR COMPAÑIA</font>
                </p>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <c:forEach items="${lista}" var="v">
                        <form action="/TiendaReyes/Compania?action=actualizar&id_compania=${v.id_compania}" method="POST">
                            <p class="text-white">
                                <label>Codigo</label>
                                <input type="number" name="id_compania" class="form-control" placeholder="Digite el codigo de la compania" value="${v.id_compania}">
                                <label>Nombre De La Compañia</label>
                                <input type="text" name="nombre_compania" class="form-control" placeholder="Digite el nombre en español de la compania" value="${v.nombre_compania}">
                                <label>Direccion</label>
                                <input type="text" name="direccion" class="form-control" placeholder="Digite direccion de la compania" value="${v.direccion}">
                                <label>Sede</label>
                                <input type="text" name="sede" class="form-control" placeholder="Digite la Sede" value="${v.sede}">
                            </p>
                            <br>
                            <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                            <a href="/TiendaReyes/Compania?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                        </c:forEach>
                    </form>
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>
