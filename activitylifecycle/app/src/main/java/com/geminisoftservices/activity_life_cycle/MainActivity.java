package com.geminisoftservices.activity_life_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity*********";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate InVoked");
    }

    @Override
    public void onStart(){
        super.onStart();

        Log.d(TAG, "onStart InVoked");
    }

    @Override
    public void onResume(){
        super.onResume();

        Log.d(TAG, "onResume InVoked");
    }

    @Override
    public void onPause(){
        super.onPause();

        Log.d(TAG, "onPause InVoked");
    }

    @Override
    public void onStop(){
        super.onStop();

        Log.d(TAG, "onStop InVoked");
    }

    @Override
    public void onRestart(){
        super.onRestart();

        Log.d(TAG, "onRestart InVoked");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();

        Log.d(TAG, "onDestroy InVoked");
    }


}
