package com.example.cleanlogin.di;

import android.app.Application;

import com.example.cleanlogin.AndroidApp;
import com.example.cleanlogin.ui.login.LoginActivity;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityBuildersModule.class,
        NetworkModule.class,
        ViewModelFactoryModule.class
})
public interface AppComponent extends AndroidInjector<AndroidApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    //void inject(LoginActivity loginActivity);
}
