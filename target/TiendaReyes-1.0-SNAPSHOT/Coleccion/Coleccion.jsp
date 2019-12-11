
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Coleccion</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Fondo.jsp" %>
        <div class="container">
            <div class="col-md-12">
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    Tienda De Discos 'Reyes'</font>
                </p>
                <p class="text-center">
                    <font face="impact" size="6" color="white">
                    Coleccion</font>
                </p>
            </div>
            <div class="row">
                <div class="col-md-12">
                    
                </div>
            </div>
            <div class="row">
                <
                    
            </div>
            <div class="row">
                <div class="col-md-8">
                    <br>
                    <p>
                        <font face="impact" size="6" color="white">
                        Ingresa Colecciones</font>
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <form action="/TiendaReyes/Coleccion?action=insertar" method="POST">
                        <p class="text-white">
                            <label>Nombre Coleccion</label>
                            <input type="text" name="nombre_coleccion" class="form-control" placeholder="Digite el nombre de la coleccion">
                            <label>Promotor</label>
                            <input type="text" name="promotor" class="form-control" placeholder="Digite promotor">
                            <label>Precio</label>
                            <input type="number" name="precio" class="form-control" placeholder="Digite Precio de coleccion">
                            <label>Codigo Compañia</label>
                            <input type="text" name="id_compania" class="form-control" placeholder="Digite codigo de la compañia">
                        </p>
                        <br>
                        <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                        <a href="/TiendaReyes/Coleccion?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                    </form>
                    ${msg}
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>
