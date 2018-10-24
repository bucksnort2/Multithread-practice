package com.smith.steven.multithreadappilcation;

public class Readings {
    private float temp;
    private float pressure;
    private float humidity;
    private float temp_min;
    private float temp_max;

    public Readings(){
        this.temp = 0;
        this.pressure = 0;
        this.humidity = 0;
        this.temp_max = 0;
        this.temp_min = 0;
    }

    public Readings(float temp, float pressure, float humidity, float temp_max, float temp_min){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp_max = temp_max;
        this.temp_min = temp_min;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemp() {
        return temp;
    }

    public float getTemp_max() {
        return temp_max;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }
}
