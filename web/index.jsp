<%-- 
    Document   : index
    Created on : 12-may-2016, 10:20:35
    Author     : juang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Geolocalización IP</title>
        <s:head/>
    </head>
    <body>
        <h1>Geolocalización IP</h1>
        <s:form action="/GeoInformacion">
            <s:textfield name="ip" label="IP"/>
            <s:submit value="Consultar"/>
        </s:form>
        <s:form action="/GeoInformacion">
            <s:hidden id="ipDispositivo" name="ip"/>
            <s:submit value="IP dispositivo"/>
        </s:form>
        
        <script src="js/jquery-1.12.3.min.js"></script>
        <script>
            $(document).ready(function () {
                $.get('http://jsonip.com', function (res) {
                    $('#ipDispositivo').val(res.ip);
                });
            });
        </script>
    </body>
</html>
