package com.example.readingrightfoodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiInterface apiInterface;
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    apiInterface = RetrofitInstance.getRetrofit().create(ApiInterface.class);
    recyclerView = findViewById(R.id.recyclerView);
    apiInterface.getJson().enqueue(new Callback<PostPjojo>() {
        @Override
        public void onResponse(Call<PostPjojo> call, Response<PostPjojo> response) {
            List<PostPjojo> postPjojos = (List<PostPjojo>) response.body();
           Adapter adapter = new Adapter(MainActivity.this,postPjojos);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(adapter);
        }

        @Override
        public void onFailure(Call<PostPjojo> call, Throwable t) {
            Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
        }
    });
    }
}