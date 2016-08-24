package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Antony on 8/24/2016.
 */
public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //getIntent mengambil intent yang memulai atau menjalan activity ini
        Intent intent = getIntent();
        //getStringExtra untuk mengambil data yang dikirim dari activity pertama
        String message = intent.getStringExtra("MESSAGE");
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        //tambahkan text view kedalam layout
        ViewGroup layout = (ViewGroup)findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}
