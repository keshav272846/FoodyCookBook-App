package com.example.readingrightfoodapp;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
@GET("categories.php")
    Call<PostPjojo>  getJson();

}
