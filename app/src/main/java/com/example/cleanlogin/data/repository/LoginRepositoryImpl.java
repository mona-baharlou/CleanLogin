package com.example.cleanlogin.data.repository;

import com.example.cleanlogin.data.api.RestApi;
import com.example.cleanlogin.data.model.Root;
import com.example.cleanlogin.domain.repository.LoginRepository;

import javax.inject.Inject;

import io.reactivex.Observable;

public class LoginRepositoryImpl implements LoginRepository {

    private final RestApi api;

    @Inject
    public LoginRepositoryImpl(RestApi api) {
        this.api = api;
    }

    @Override
    public Observable<Root> login(String username, String password) {
        return api.login(username, password);
    }
}
