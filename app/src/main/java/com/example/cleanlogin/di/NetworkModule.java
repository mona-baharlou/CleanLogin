package com.example.cleanlogin.di;

import android.app.Application;

import com.example.cleanlogin.data.api.RestApi;
import com.example.cleanlogin.data.repository.LoginRepositoryImpl;
import com.example.cleanlogin.domain.repository.LoginRepository;
import com.google.gson.Gson;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {
    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(Application application) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();
    }

    @Provides
    @Singleton
    public RestApi provideApi(Gson gson, OkHttpClient okHttpClient) {

        return new Retrofit.Builder()
                .baseUrl("https://drive.google.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build()
                .create(RestApi.class);
    }

    @Provides
    @Singleton
    public LoginRepository provideRepository(RestApi api){
      return new LoginRepositoryImpl(api);
    }

}
