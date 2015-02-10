package com.example.antonio.androiddevelopment;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    Button btnGreen;
    Button btnBlue;
    LinearLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (LinearLayout) findViewById(R.id.background);
        btnGreen = (Button) findViewById(R.id.btnGreen);
        btnBlue = (Button) findViewById(R.id.btnBlue);

        btnGreen.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#00ff00"));
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#006699"));
            }
        });
    }
}
