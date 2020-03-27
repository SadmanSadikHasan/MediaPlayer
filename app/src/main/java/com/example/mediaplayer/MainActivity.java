package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button canon_c, canon_d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        canon_c = findViewById(R.id.canon_c);
        canon_d = findViewById(R.id.canon_d);

        canon_c.setOnClickListener(this);
        canon_d.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.canon_c){
            Intent c = new Intent(MainActivity.this,canon_c.class);
            startActivity(c);
        }

        if(v.getId() == R.id.canon_d){
            Intent d = new Intent(MainActivity.this,canon_d.class);
            startActivity(d);
        }

    }
}
