<%-- 
    Document   : Zonas
    Created on : 11-19-2019, 01:32:40 PM
    Author     : jose.cortezusam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Zonas</title>
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
                    ZONAS</font>
                </p>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <br>
                    <p class="text-white">Las zonas del parque zoologico se dividen en cuatro bioclimas: húmedo caliente, húmedo frío, seco caliente, 
                        y seco frío, el cual determina cinco zonas: árida, sabana-pradera, bosque tropical, bosque templado, y costa, 
                        además del aviario y el herpetario. Cada una de las zonas tiene determinada extension territorial, por lo que podras disfrutar de diversidades
                        de especies durante el rrecorido</p>
                    <p class="text-white">Como dato adicional y no menos importante las casas de noche de los animales poseen eficientes mecanismos de limpieza y seguridad Diseñadas y definidas 
                        a partir de las necesidades de manejo de los especialistas que laboran en el parque, las instalaciones de servicio médico y cuidado natal 
                        tienen desde cámaras de Gesell, incubación y pediatría, rayos X, quirófanos, instrumental, farmacia y hasta zonas de cuidados intensivos
                        Un enorme cinturón verde de fresnos y truenos, a partir de un talúd, rodea el lugar para aislarlo del ruido y crear una atmósfera aún más fresca; 
                        adentro, nuevas especies de plantas han sido introducidas para imitar los nichos ecológicos de los animales</p>
                    <p class="text-center">
                        <font face="impact" size="6" color="white">
                        DISFRUTA DE TU VISITA POR LAS DIVERSAS ZONAS</font>
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <img src="../Imagenes/7.jpg" class="img-fluid rounded mx-auto d-block" alt="Responsive image"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-8">
                    <br>
                    <p>
                        <font face="impact" size="6" color="white">
                        Ingresa Datos De La Zona</font>
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <form action="/zoologico/zonas?action=insertar" method="POST">
                        <p class="text-white">
                            <label>Nombre De La Zona</label>
                            <input type="text" name="nombre_zona" class="form-control" placeholder="Digite el nombre de la zona">
                            <label>Extension Territorial</label>
                            <input type="number" name="extension_territorial" class="form-control" placeholder="Digite la extension territorial de la zona">
                            <label>ID De Las Especies</label>
                            <input type="number" name="idespecies" class="form-control" placeholder="Digite el ID de las especies">
                        </p>
                        <br>
                        <button type="submit" class="btn btn-secondary btn-lg active">Enviar</button>
                        <a href="/zoologico/zonas?action=consultar" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Consultar</a>
                    </form>
                    ${msg}
                </div>
            </div>
        </div>
        <%@include file="../Bootstrap/Footer.jsp" %>
    </body>
</html>
