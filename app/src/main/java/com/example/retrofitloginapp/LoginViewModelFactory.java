package com.example.retrofitloginapp;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.retrofitloginapp.data.repository.AuthRepository;
import com.example.retrofitloginapp.viewmodel.LoginViewModel;
public class LoginViewModelFactory implements ViewModelProvider.Factory {
    private final AuthRepository repository;

    public LoginViewModelFactory(AuthRepository repository) {
        this.repository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(LoginViewModel.class)) {
            return (T) new LoginViewModel(repository);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }


}
