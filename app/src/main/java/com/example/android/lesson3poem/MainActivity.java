package com.example.android.lesson3poem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    ReadStringFromAssetFile reader = new ReadStringFromAssetFile();
    TextView body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = null;
        try {
            s = reader.getStringFromAssetFile(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        body = (TextView) findViewById(R.id.body);
        body.setText(s);

    }
}