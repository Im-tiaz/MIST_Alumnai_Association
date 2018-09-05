package com.example.imtiaz.mistalumnai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {

    Button bButton, pButton, dButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        bButton = findViewById(R.id.blockbtn);
        pButton = findViewById(R.id.passbtn);
        dButton = findViewById(R.id.deletebtn);

        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Main9Activity.class);
                startActivity(i);
            }
        });

        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Main10Activity.class);
                startActivity(i);
            }
        });
    }
}
