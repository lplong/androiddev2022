package com.example.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("msg","onCreate");

        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("msg","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("msg","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("msg","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("msg","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("msg","onDestroy");
    }
}