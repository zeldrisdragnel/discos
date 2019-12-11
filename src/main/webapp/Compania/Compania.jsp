

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
        <%@include file="../Bootstrap/Modal.jsp" %>
        <div class="container">
            <div class="col-md-12">
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    Tienda de discos 'Reyes'</font>
                </p>
                <p class="text-center">
                    <font face="impact" size="6" color="white">
                    Compañias</font>
                </p>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <br>
                    <p class="text-white">Nuestras compañias son varias de diferentes generos musicales e internacionales</p>
                    <p class="text-white">Muchos de nuestra compañias nos van actualizando el nuevo material musical que van sacando sus artistas para tenernos informados dia a dia para tener nuestros mejores productos </p>
                    <p class="text-center">
                        <font face="impact" size="4" color="black">
                        Variedades De Compañias</font>
                    </p>
                    <p class="text-white">Contamos con mas de 50 compañias musicales para tener la mejor variedad musical</p>
                    <p class="text-white">Entre nuestras compañias estan tanto de la vieja generacion y de la nueva generacion alcanzo asi diferente estilos para nuestra variedad en productos</p>
                    
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <img src="../Imagenes/fondo.jpg" class="img-fluid rounded mx-auto d-block" alt="Responsive image"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-8">
                    <br>
                    <p>
                        <font face="impact" size="6" color="red">
                        Ingresa Datos De La Compañia</font>
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <form action="/TiendaReyes/Compania?action=insertar" method="POST">
                        <p class="text-white">
                            <label>Nombre De La Compañia</label>
                            <input type="text" name="nombre_compania" class="form-control" placeholder="Digite el nombre de la compania">
                            <label>Direccion</label>
                            <input type="text" name="direccion" class="form-control" placeholder="Digite la direccion de la compania">
                            <label>Sede</label>
                            <input type="text" name="sede" class="form-control" placeholder="Digite la sede">
                        </p>
                        <br>
                        <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                        <a href="/TiendaReyes/Compania?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                    </form>
                    ${msg}
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>    
    </body>
</html>
