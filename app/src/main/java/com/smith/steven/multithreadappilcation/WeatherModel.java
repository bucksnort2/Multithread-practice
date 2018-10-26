package com.smith.steven.multithreadappilcation;

import android.os.Looper;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.URL;

import java.util.concurrent.ExecutorService;

public class WeatherModel {


    private Weather w = new Weather();

    public void getCurrentWeather(ExecutorService threadPool, Runnable updater){
        threadPool.execute(()->{
            Looper.prepare();
            try {
                Gson json = new Gson();

                URL weatherURL = new URL("http://api.openweathermap.org/data/2.5/weather?zip=83440,us&APPID=54ceecec4515fe96e33c6a5e5aa1a7fb");
                HttpURLConnection theConnection = (HttpURLConnection) weatherURL.openConnection();

                BufferedReader in = new BufferedReader(new InputStreamReader(theConnection.getInputStream()));

                String inputLine;
                StringBuilder resultBuilder = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    if (Thread.interrupted()) {
                        return;
                    }
                    resultBuilder.append(inputLine);
                }
                in.close();

                w = json.fromJson(resultBuilder.toString(), Weather.class);

                if (updater != null) {
                    if (Thread.interrupted()) {
                        return;
                    }
                    updater.run();
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        });
    }

    public Weather getWeather(){
        return w;
    }
}
