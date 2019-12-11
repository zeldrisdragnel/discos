<%-- 
    Document   : Itinerarios
    Created on : 11-22-2019, 10:27:17 AM
    Author     : jose.cortezusam
--%>

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
            <div class="col-md-12">
                <p class="text-center">
                    <font face="impact" size="8" color="white">
                    ZOOLOGICO NACIONAL DE EL SALVADOR</font>
                </p>
                <p class="text-center">
                    <font face="impact" size="6" color="white">
                    ITINERARIOS</font>
                </p>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <img src="../Imagenes/plano_ma.jpg" class="img-fluid rounded mx-auto d-block" alt="Responsive image"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <br>
                    <p class="text-white">Desarrollamos programas educativos dirigidos a concienciar y sensibilizar a 
                        nuestros visitantes motivándolos a cuidar y conservar la biodiversidad. Pero sobre todo hemos creado un itinerario con el objetivo de
                        disfrutar de un día magnífico en contacto con la naturaleza. Así también se aprende a querer y amar a los animales.</p>
                    <p class="text-center">
                        <font face="impact" size="6" color="white">
                        ACA TE PRESENTAMOS UN EJEMPLO DE ITINERARIO</font>
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <img src="../Imagenes/55.jpg" class="img-fluid rounded mx-auto d-block" alt="Responsive image"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-8">
                    <br>
                    <p>
                        <font face="impact" size="6" color="white">
                        Ingresa Tu Intinerario</font>
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <form action="/zoologico/itinerarios?action=insertar" method="POST">
                        <p class="text-white">
                            <label>Duracion Del Recorrido</label>
                            <input type="text" name="duracion_recorrido" class="form-control" placeholder="Digite la duracion del recorrido">
                            <label>Longitud Del Itinerario</label>
                            <input type="number" name="longitud_itinerario" class="form-control" placeholder="Digite la longitud del itinerario">
                            <label>Numero De Visitantes</label>
                            <input type="number" name="numero_visitantes" class="form-control" placeholder="Digite la cantidad de visitantes">
                            <label>Numero De Especies</label>
                            <input type="number" name="numero_especies" class="form-control" placeholder="Digite la cantidad de especies">
                            <label>ID De Las Especies</label>
                            <input type="number" name="idespecies" class="form-control" placeholder="Digite el ID de las especies">
                        </p>
                        <br>
                        <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                        <a href="/zoologico/itinerarios?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                    </form>
                    ${msg}
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>
