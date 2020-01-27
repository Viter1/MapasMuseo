package com.example.mimapa;

public class Museo {
    private double lat , longi;
    private String organization_name;

    public Museo(double lat, double longi, String organization_name) {
        this.lat = lat;
        this.longi = longi;
        this.organization_name = organization_name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public String getOrganization_name() {
        return organization_name;
    }

    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }
}
