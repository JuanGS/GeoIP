/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgs.geoip.actions;

import com.jgs.geoip.modelo.GeoInformacion;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;

/**
 *
 * @author juang
 */
public class GeoInformacionAction extends ActionSupport {

    private String ip;
    private GeoInformacion geoInformacion;
    
    @Override
    public String execute() {
        String navegacion = "success";
        
        try {
            geoInformacion = new GeoInformacion(ip);
        } catch (IOException | GeoIp2Exception ex) {
            navegacion = "error";
            System.out.println("Error al obtener geolocalizacion: " + ex);
        }      
        
        return navegacion;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public GeoInformacion getGeoInformacion() {
        return geoInformacion;
    }

    public void setGeoInformacion(GeoInformacion geoInformacion) {
        this.geoInformacion = geoInformacion;
    }    
}