/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgs.geoip.modelo;

/**
 *
 * @author juang
 */
public class Globales {
    // Country Data.
//    public static final String DATABASE_COUNTRY_PATH = "C:/Users/juang/Documents/Programas/Java/GeoIP/GeoLite2-Country.mmdb";  
    public static final String DATABASE_COUNTRY_PATH = System.getProperty("catalina.base") + "/webapps/geolite2/GeoLite2-Country.mmdb";    
    // City Data.
//    public static final String DATABASE_CITY_PATH = "C:/Users/juang/Documents/Programas/Java/GeoIP/GeoLite2-City.mmdb";
    public static final String DATABASE_CITY_PATH = System.getProperty("catalina.base") + "/webapps/geolite2/GeoLite2-City.mmdb";       
}
