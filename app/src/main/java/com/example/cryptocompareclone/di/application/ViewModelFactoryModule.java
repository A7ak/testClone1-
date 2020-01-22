package com.example.cryptocompareclone.di.application;

import androidx.lifecycle.ViewModelProvider;


import com.example.cryptocompareclone.di.application.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);
}
