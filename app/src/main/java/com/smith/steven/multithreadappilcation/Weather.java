package com.smith.steven.multithreadappilcation;

public class Weather {
    Coordinate coord;
    WeatherType[] weather;
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
        weather = new WeatherType[1];
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

    public Weather(Coordinate coord, WeatherType weather[], String base, Readings main, float visibility, Wind wind, Clouds clouds, float dt, Information sys, int id, String name, int cod){
        this.coord = coord;
        this.weather = weather;
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
        String output = "Location: "
                + getName()
                + "\nCoordinates: "
                + coord.display()
                + "\nWeather: "
                + weather[0].getMain()
                + "\nDescription: "
                + weather[0].getDescription();
        return output;
    }
}
