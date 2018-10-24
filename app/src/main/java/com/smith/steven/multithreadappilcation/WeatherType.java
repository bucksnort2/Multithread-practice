package com.smith.steven.multithreadappilcation;

public class WeatherType {
    private int id;
    private String main;
    private String description;
    private String icon;

    public WeatherType(){
        id = 0;
        main = "";
        description = "";
        icon = "";
    }

    public WeatherType(int id, String main, String description, String icon){
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public int getId() {
        return this.id;
    }

    public String getMain() {
        return this.main;
    }

    public String getDescription() {
        return this.description;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMain(String main) {
        this.main = main;
    }


}
