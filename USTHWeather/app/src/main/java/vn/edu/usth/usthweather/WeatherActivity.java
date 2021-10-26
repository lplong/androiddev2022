package vn.edu.usth.usthweather;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Weather","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather","onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather","onDestroy");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.i("Weather","onCreate");
    }
}

