/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {

    function geolocalizar() {
        /*Comprobamos si el navegador soporta geolacalización*/
        GMaps.geolocate({
            //Si soporta
            success: function (position) {
                lat = document.getElementById('latitud').value;
                lng = document.getElementById('longitud').value;

                //Creamos un mapa				
                map = new GMaps({
                    div: '#mapa', //Indicamos el div donde queremos que se cargue
                    zoom: 16, //Nivel de zoom inicial
                    lat: lat, //Latitud inicial
                    lng: lng, //Longitud inicial
                    click: function (e) { //Funcion que se ejecutara cuando hagamos click sobre algun punto del mapa
                    },
                    tap: function (e) { //Funcion que se ejecutara cuando hagamos toquemos sobre algun punto del mapa
                    },
                    dragend: function (e) { //Funcion que se ejecutara cuando arrastremos el mapa
                    }
                });

                map.setCenter(lat, lng); //Centramos el mapa en las coordenadas

                //Añadimos una marca en el mapa con la posicion actual
                map.addMarker({
                    lat: lat,
                    lng: lng,
                    title: 'Ubicación actual',
                    infoWindow: {//Información que se ejecutara cuando hagamos click sobre la marca
                        content: '<p>Geolocalización IP</p><p>Latitd: ' + lat + '</p><p>Longitud: ' + lng + '</p>'
                    }
                });
            },
            //Si hay algun error al cargar la geolocalizacion
            error: function (error) {
                alert('Error con la geolocalización: ' + error.message);
            },
            //Si el navegador no soporta la geolocalizaciom
            not_supported: function () {
                alert("Navegador no soporta geolocalización");
            },
            //Siempre se ejecuta esta parte pase lo que pase
            always: function () {
            },
        });
    }
    ;

    geolocalizar();
});