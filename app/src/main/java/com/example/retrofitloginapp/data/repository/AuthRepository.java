package com.example.retrofitloginapp.data.repository;

import com.example.retrofitloginapp.models.LoginRequest;
import com.example.retrofitloginapp.models.LoginResponse;
import com.example.retrofitloginapp.api.ApiService;
import retrofit2.Call;

public class AuthRepository {
    private final ApiService apiService;

    public AuthRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public Call<LoginResponse> login(LoginRequest request) {
        return apiService.login(request);
    }

}
