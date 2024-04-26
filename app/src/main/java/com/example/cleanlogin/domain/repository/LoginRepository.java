package com.example.cleanlogin.domain.repository;

import com.example.cleanlogin.data.model.Root;

import io.reactivex.Observable;

public interface LoginRepository {

    public Observable<Root> login(String username, String password);

}
