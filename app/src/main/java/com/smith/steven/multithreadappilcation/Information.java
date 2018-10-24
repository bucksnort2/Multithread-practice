package com.smith.steven.multithreadappilcation;

public class Information {
    private int type;
    private int id;
    private float message;
    private String country;
    private long sunrise;
    private long sunset;

    public Information(){
        type = 0;
        id = 0;
        message = 0;
        country = "";
        sunrise = 0;
        sunset = 0;
    }

    public Information(int type, int id, float message, String country, long sunrise, long sunset){
        this.type = type;
        this.id = id;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public float getMessage() {
        return message;
    }

    public int getType() {
        return type;
    }

    public long getSunrise() {
        return sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setMessage(float message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public void setType(int type) {
        this.type = type;
    }
}
