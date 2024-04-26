package com.example.cleanlogin.di.login;

import androidx.lifecycle.ViewModel;

import com.example.cleanlogin.di.ViewModelKey;
import com.example.cleanlogin.ui.login.LoginViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class LoginViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    public abstract ViewModel bindLoginViewModel(LoginViewModel viewModel);

}
