package com.smith.steven.multithreadappilcation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    private ExecutorService threadPool = Executors.newCachedThreadPool();
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
        threadPool.execute(()->{
            try {
                URL byuiURL = new URL("http://www.byui.edu");
                HttpURLConnection theConnection = (HttpURLConnection)byuiURL.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(theConnection.getInputStream()));
                String inputLine;
                StringBuilder resultBuilder = new StringBuilder();
                while((inputLine = in.readLine()) != null){
                    if (Thread.interrupted()){
                        return;
                    }
                    resultBuilder.append(inputLine);
                }
                in.close();

                EditText displayToUse = (EditText)displayReference.get();
                if(displayToUse != null){
                    if (Thread.interrupted()){
                        return;
                    }
                    displayToUse.post(()->{
                       displayToUse.setText(resultBuilder.toString());
                    });
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}