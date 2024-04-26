package com.example.cleanlogin.ui.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cleanlogin.R;
import com.example.cleanlogin.di.ViewModelProviderFactory;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class LoginActivity extends DaggerActivity {

    private LoginViewModel viewModel;

    @Inject
    ViewModelProviderFactory providerFactory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //viewModel = ViewModelProviders.of(this, providerFactory).get(LoginViewModel.class);


    }


}