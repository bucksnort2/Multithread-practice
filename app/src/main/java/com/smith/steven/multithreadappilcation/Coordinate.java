package com.smith.steven.multithreadappilcation;

public class Coordinate {
    private float lat;
    private float lon;

    public Coordinate(){
        lat = 0;
        lon = 0;
    }

    public Coordinate(float lat, float lon){
        this.lat = lat;
        this.lon = lon;
    }

    public void setLat(float lat){
        this.lat = lat;
    }

    public float getLat(){
        return this.lat;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLon() {
        return this.lon;
    }

    public String display(){
        return "(" + getLat() + ", " + getLon() + ")";
    }
}
