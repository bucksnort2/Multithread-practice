package com.smith.steven.multithreadappilcation;

public class Wind {
    private float speed;
    private float deg;
    private float gust;

    public Wind(){
        speed = 0;
        deg = 0;
        gust = 0;
    }

    public Wind(float speed, float deg, float gust){
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }

    public float getDeg() {
        return deg;
    }

    public float getGust() {
        return gust;
    }

    public float getSpeed() {
        return speed;
    }

    public void setDeg(float deg) {
        this.deg = deg;
    }

    public void setGust(float gust) {
        this.gust = gust;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
