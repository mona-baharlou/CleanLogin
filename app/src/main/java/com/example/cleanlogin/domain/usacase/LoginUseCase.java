package com.example.cleanlogin.domain.usacase;


import com.example.cleanlogin.data.model.Root;
import com.example.cleanlogin.domain.repository.LoginRepository;

import javax.inject.Inject;

import io.reactivex.Observable;

public class LoginUseCase {

    private final LoginRepository repository;

    @Inject
    public LoginUseCase(LoginRepository repository) {
        this.repository = repository;
    }

    public Observable<Root> login(String username, String password) {
        Observable<Root> result = repository.login(username, password);
        return result;
    }
}
