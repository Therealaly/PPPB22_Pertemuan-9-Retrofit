package com.example.retrofityt.retrofit;

import com.example.retrofityt.MainModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {
    @GET("data.php")
    Call<MainModel> getData();
}
