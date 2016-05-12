/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgs.geoip.modelo;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.City;
import com.maxmind.geoip2.record.Country;
import com.maxmind.geoip2.record.Location;
import com.maxmind.geoip2.record.Postal;
import com.maxmind.geoip2.record.Subdivision;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author juang
 */
public class GeoInformacion {
    
    private Country country;
    private Subdivision subdivision;
    private City city;
    private Postal postal;
    private Location location;
    
    public GeoInformacion(String ip) throws IOException, GeoIp2Exception {
        File database = new File(Globales.DATABASE_CITY_PATH);
        DatabaseReader reader = new DatabaseReader.Builder(database).build();
        InetAddress ipAddress = InetAddress.getByName(ip);
        CityResponse response = reader.city(ipAddress);

        country = response.getCountry();
        subdivision = response.getMostSpecificSubdivision();
        city = response.getCity();
        postal = response.getPostal();
        location = response.getLocation();
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Subdivision getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(Subdivision subdivision) {
        this.subdivision = subdivision;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Postal getPostal() {
        return postal;
    }

    public void setPostal(Postal postal) {
        this.postal = postal;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }    
}
