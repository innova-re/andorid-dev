package com.example.antonio.androiddevelopment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    Button btnGreen;
    Button btnBlue;
    LinearLayout background;
    public final static String EXTRA_MESSAGE = "com.example.antonio.android-development";

    public void sendMessage(View view) {

        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.edit_message);

        String message = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }

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
