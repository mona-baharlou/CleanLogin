package com.example.cleanlogin.data.api;


import com.example.cleanlogin.data.model.Root;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestApi {

    @GET("file/d/1g6zfDMcOeWYHPE6NtTL0LQsdA9W_rJF3/view?usp=sharing\n")
    Observable<Root> login(@Query("username") String username, @Query("password") String password);
}