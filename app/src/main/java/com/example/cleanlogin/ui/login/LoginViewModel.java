package com.example.cleanlogin.ui.login;

import androidx.lifecycle.ViewModel;

import com.example.cleanlogin.domain.usacase.LoginUseCase;

import javax.inject.Inject;

public class LoginViewModel extends ViewModel {
    private LoginUseCase useCase;

    public LoginViewModel(LoginUseCase useCase){
        this.useCase = useCase;
    }

    public void login(String username, String password){
        try{

        }
        catch (Exception ex){

        }
    }



}
