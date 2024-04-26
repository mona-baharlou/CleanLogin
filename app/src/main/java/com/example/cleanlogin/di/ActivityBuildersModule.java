package com.example.cleanlogin.di;


import com.example.cleanlogin.di.login.LoginScope;
import com.example.cleanlogin.di.login.LoginViewModelsModule;
import com.example.cleanlogin.ui.login.LoginActivity;
import com.example.cleanlogin.ui.main.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @LoginScope
    @ContributesAndroidInjector(
            modules = {LoginViewModelsModule.class})
    abstract LoginActivity contributeLoginActivity();


}
