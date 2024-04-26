package com.example.cleanlogin.di;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.cleanlogin.ui.login.LoginViewModel;

import javax.inject.Inject;
import javax.inject.Provider;

public class ViewModelFactory implements ViewModelProvider.Factory {
    private  Provider<LoginViewModel> loginViewModelProvider;

    @Inject
    public ViewModelFactory(Provider<LoginViewModel> loginViewModelProvider) {
        loginViewModelProvider = loginViewModelProvider;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        ViewModel viewModel;
        if (modelClass == LoginViewModel.class) {
            viewModel = loginViewModelProvider.get();
        } else {
            throw new RuntimeException("unsupported view model class: " + modelClass);
        }
        return (T) viewModel;
    }

}
