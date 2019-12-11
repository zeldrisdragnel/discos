

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Itinerarios</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <form action="/zoologico/itinerarios?action=insertar" method="POST">
                        <c:forEach items="${lista}" var="v">
                            <p class="text-white">
                                <label>Codigo</label>
                                <input type="number" name="iditinerarios" class="form-control" placeholder="Digite el codigo de itinerario" value="${v.iditinerarios}">
                                <label>Duracion Del Recorrido</label>
                                <input type="text" name="duracion_recorrido" class="form-control" placeholder="Digite la duracion del recorrido" value="${v.duracion_recorrido}">
                                <label>Longitud Del Itinerario</label>
                                <input type="number" name="longitud_itinerario" class="form-control" placeholder="Digite la longitud del itinerario" value="${v.longitud_itinerario}">
                                <label>Numero De Visitantes</label>
                                <input type="number" name="numero_visitantes" class="form-control" placeholder="Digite la cantidad de visitantes" value="${v.numero_visitantes}">
                                <label>Numero De Especies</label>
                                <input type="number" name="numero_especies" class="form-control" placeholder="Digite la cantidad de especies" value="${v.numero_especies}">
                                <label>ID De Las Especies</label>
                                <input type="number" name="idespecies" class="form-control" placeholder="Digite el ID de las especies" value="${v.idespecies}">
                            </p>
                            <br>
                            <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                            <a href="/zoologico/itinerarios?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                        </c:forEach>
                    </form>
                    ${msg}
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>
