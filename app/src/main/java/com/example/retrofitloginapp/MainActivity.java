package com.example.retrofitloginapp;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.example.retrofitloginapp.data.network.NetworkModule;
import com.example.retrofitloginapp.data.repository.AuthRepository;
import com.example.retrofitloginapp.databinding.ActivityMainBinding;
import com.example.retrofitloginapp.viewmodel.LoginViewModel;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
//    private ActivityMainBinding binding;
//    private LoginViewModel viewModel;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        AuthRepository repository = new AuthRepository(NetworkModule.getApiService());
//        viewModel =
//                new ViewModelProvider (this, new LoginViewModelFactory(repository)).get(LoginViewModel.class);
//
//        setupObservers();
//        setupListeners();
//    }
//
//    private void setupObservers() {
//        viewModel.getLoginResult().observe(this, result -> {
//            Snackbar.make(binding.getRoot(), result, Snackbar.LENGTH_LONG).show();
//        });
//
//        viewModel.getIsLoading().observe(this, isLoading -> {
//            binding.progressBar.setVisibility(isLoading ? View . VISIBLE : View . GONE);
//            binding.loginButton.setEnabled(!isLoading);
//        });
//    }
//
//    private void setupListeners() {
//        binding.loginButton.setOnClickListener(v -> {
//            String email = binding . emailInput . getText ().toString().trim();
//            String password = binding . passwordInput . getText ().toString().trim();
//            viewModel.login(email, password);
//        });
//    }

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}