package com.example.fragmentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("data", "main activity: onCreate before set contentview!!");
        setContentView(R.layout.activity_main);
        Log.d("data", "main activity: onCreate after set contentview!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("data", "main activity: on resume!!");
    }


}