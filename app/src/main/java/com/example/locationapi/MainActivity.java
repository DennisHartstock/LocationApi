package com.example.locationapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button startLocationUpdates;
    private Button stopLocationUpdates;
    private TextView locationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startLocationUpdates = findViewById(R.id.startLocationUpdatesButton);
        stopLocationUpdates = findViewById(R.id.stopLocationUpdatesButton);
        locationTextView = findViewById(R.id.locationTextView);
    }
}