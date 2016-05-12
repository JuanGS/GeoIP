<%-- 
    Document   : success
    Created on : 12-may-2016, 10:32:41
    Author     : juang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <title>Geolocalización IP</title>
        
        <link rel="stylesheet" href="css/mapa.css"/>
    </head>
    <body>
        <h1>Informacion IP</h1>
        <div>
            <s:label value="Country:"/>
            <s:property value="geoInformacion.country.name"/>
            <br/>
            <s:label value="Subdivision:"/>        
            <s:property value="geoInformacion.subdivision.name"/>
            <br/>
            <s:label value="City:"/>     
            <s:property value="geoInformacion.city.name"/>
            <br/>        
            <s:label value="Postal:"/>
            <s:property value="geoInformacion.postal.code"/>     
            <br/>
            <s:label value="Location:"/>
            <s:property value="geoInformacion.location.latitude"/>
            <s:property value="geoInformacion.location.longitude"/>
            <s:hidden id="latitud" name="geoInformacion.location.latitude"/>
            <s:hidden id="longitud" name="geoInformacion.location.longitude"/>
        </div>
        <div id="mapa">
        </div>
        <br/>
        
        <script src="js/jquery-1.12.3.min.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBbi591ga6dGPD4c4k2sSfyeOTjiQJ8HA4" type="text/javascript"></script>        
        <script src="js/gmaps.js"></script>  
        <script src="js/funcionesMapa.js"></script>        
    </body>
</html>
