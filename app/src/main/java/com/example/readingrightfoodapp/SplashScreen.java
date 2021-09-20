package com.example.readingrightfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    TextView foody,cook,book,description1,description2,button;
    ImageView imageView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_scren);


        foody = findViewById(R.id.foody);
        cook = findViewById(R.id.cook2);
        book = findViewById(R.id.book2);
        description1 = findViewById(R.id.des1);
        description2 = findViewById(R.id.des2);
        imageView = findViewById(R.id.imageView);
         button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}