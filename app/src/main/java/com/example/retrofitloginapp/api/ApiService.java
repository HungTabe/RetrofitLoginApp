package com.example.retrofitloginapp.api;

import com.example.retrofitloginapp.models.LoginRequest;
import com.example.retrofitloginapp.models.LoginResponse;
import retrofit2.Call; 
import retrofit2.http.Body; 
import retrofit2.http.POST;

public interface ApiService {
    @POST("api/auth/login") Call login(@Body LoginRequest request);
}
