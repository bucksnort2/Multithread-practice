package com.smith.steven.multithreadappilcation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    private ExecutorService threadPool = Executors.newCachedThreadPool();
    private WeatherModel theModel = new WeatherModel();

    private EditText display = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.textDisplayer);
    }

    @Override
    protected void onStop(){
        super.onStop();
        threadPool.shutdownNow();
    }

    public void doStuff(View view){
        WeakReference displayReference = new WeakReference(display);
        theModel.getCurrentWeather(threadPool, ()->{
            if(displayReference.get() != null){
                EditText displayToUse = (EditText) displayReference.get();
                displayToUse.setText(theModel.getWeather().display());
            }
        });
    }
}
