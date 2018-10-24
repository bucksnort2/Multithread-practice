package com.smith.steven.multithreadappilcation;

import android.util.ArrayMap;

import java.util.Map;
import java.util.TreeMap;

public class Weather {
    Coordinate coord;
    String base;
    Readings main;
    float visibility;
    Wind wind;
    Clouds clouds;
    float dt;
    Information sys;
    int id;
    String name;
    int cod;
    public Weather(){
        coord = new Coordinate();
        base = "";
        main = new Readings();
        visibility = 0;
        wind = new Wind();
        clouds = new Clouds();
        dt = 0;
        sys = new Information();
        id = 0;
        name = "";
        cod = 0;
    }

    public Weather(Coordinate coord, String base, Readings main, float visibility, Wind wind, Clouds clouds, float dt, Information sys, int id, String name, int cod){
        this.coord = coord;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return this.name;
    }

    public String display(){
        String output = "Coords: " + coord.getLat() + ", " + coord.getLon();

        return output;
    }
}
