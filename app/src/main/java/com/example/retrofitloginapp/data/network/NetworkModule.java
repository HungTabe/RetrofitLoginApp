package com.example.retrofitloginapp.data.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.example.retrofitloginapp.api.ApiService;


public class NetworkModule {
    private static final String BASE_URL = "https://mailmatebe-akg9fhe2fddfhrbt.canadacentral-01.azurewebsites.net/";

    private static ApiService apiService;

    public static ApiService getApiService() {
        if (apiService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            apiService = retrofit.create(ApiService.class);
        }
        return apiService;
    }
}
