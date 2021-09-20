package com.example.readingrightfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class StartPage extends AppCompatActivity {
    TextView heading,cook,book;
    ImageView photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        heading = findViewById(R.id.heading);
        photo = findViewById(R.id.photo);
        cook = findViewById(R.id.cook);
        book = findViewById(R.id.book);

        heading.setTranslationY(-500);
        cook.setTranslationY(400);
        book.setTranslationY(400);
        heading.animate().translationY(0).alpha(1).setDuration(1500).setStartDelay(400).start();
        cook.animate().translationY(0).alpha(1).setDuration(2000).setStartDelay(400).start();
        book.animate().translationY(0).alpha(1).setDuration(2000).setStartDelay(400).start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(StartPage.this,SplashScreen.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}