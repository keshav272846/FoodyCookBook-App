package com.example.readingrightfoodapp;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Route;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
   private static  Retrofit retrofit;
   private static final String BASEURL = "https://www.themealdb.com/api/json/v1/1/" ;

   public static Retrofit getRetrofit() {
      if(retrofit == null){
         retrofit = new Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build();
      }
      return retrofit;
   }
}
