package com.example.cleanlogin.data.api;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class RestApi {

    @GET("file/d/1g6zfDMcOeWYHPE6NtTL0LQsdA9W_rJF3/view?usp=sharing\n")
    Observable<Root> getLogin(@Query("username") String username, @Query("password") String password);
}
