
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Albunes</title>
    </head>
    <body>
        <%@include file="../Bootstrap/Navbar.jsp" %>
        <%@include file="../Bootstrap/Modal.jsp" %>
        <div class="container">
            <div class="col-md-12">
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    Tienda de discos 'Reyes'</font>
                </p>
                <p class="text-center">
                    <font face="impact" size="6" color="white">
                    Cd's</font>
                </p>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <br>
                    
                    Variedad de cds?</font>
                    </p>
                    
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
                        Ingresa Cd's</font>
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-8">
                    <form action="/TiendaReyes/Cd?action=insertar" method="POST">
                        <p class="text-white">
                            <label>Asignacion</label>
                            <input type="text" name="asignacion" class="form-control" placeholder="Digite Asignacion">
                            <label>Nombre del Cd</label>
                            <input type="text" name="nombre_cd" class="form-control" placeholder="Digite el Cd">
                            <label>Precio</label>
                            <input type="text" name="precio" class="form-control" placeholder="Digite el precio del cd">
                            <label>codigo compañia</label>
                            <input type="text" name="id_compania" class="form-control" placeholder="Digite codigo compania">
                        </p>
                        <br>
                        <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                        <a href="/TiendaReyes/Cd?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                    </form>
                    ${msg}
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>    
    </body>
</html>
