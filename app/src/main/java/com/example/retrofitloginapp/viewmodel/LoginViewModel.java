package com.example.retrofitloginapp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.retrofitloginapp.models.LoginRequest;
import com.example.retrofitloginapp.models.LoginResponse;
import com.example.retrofitloginapp.data.repository.AuthRepository;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class LoginViewModel extends ViewModel {
    private final AuthRepository repository;
    private final MutableLiveData loginResult = new MutableLiveData<>();
    private final MutableLiveData isLoading = new MutableLiveData<>();

    public LoginViewModel(AuthRepository repository) {
        this.repository = repository;
    }

    public LiveData<String> getLoginResult() {
        return loginResult;
    }

    public LiveData<Boolean> getIsLoading() {
        return isLoading;
    }

    public void login(String email, String password) {
        if (email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            loginResult.setValue("Email or password cannot be empty");
            return;
        }

        isLoading.setValue(true);
        LoginRequest request = new LoginRequest(email, password);
        Call<LoginResponse> call = repository.login(request);

        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                isLoading.setValue(false);
                if (response.isSuccessful()) {
                    LoginResponse loginResponse = response.body();
                    loginResult.setValue("Login successful: " + (loginResponse != null ? loginResponse.toString() : "null"));
                } else {
                    loginResult.setValue("Login failed: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                isLoading.setValue(false);
                loginResult.setValue("Error: " + t.getMessage());
            }
        });
    }
}
