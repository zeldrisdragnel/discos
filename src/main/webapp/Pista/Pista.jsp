%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pistas</title>
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
                    Pistas</font>
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
                        Ingrese Pistas</font>
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <form action="/TiendaReyes/Pista?action=insertar" method="POST">
                        <p class="text-white">
                            <label>No.Pista</label>
                            <input type="text" name="numero" class="form-control" placeholder="Digite el numero de la pista">
                            <label>Titulo</label>
                            <input type="text" name="titulo" class="form-control" placeholder="Digite Titulo de la cancion">
                            <label>Duracion</label>
                            <input type="text" name="duracion" class="form-control" placeholder="Digite la Duracion de la pista">
                            <label>Codigo CD</label>
                            <input type="text" name="id_cd" class="form-control" placeholder="Digite codigo del cd">
                        </p>
                        <br>
                        <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                        <a href="/TiendaReyes/Pista?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                    </form>
                    ${msg}
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>
