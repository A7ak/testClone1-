package com.example.cryptocompareclone.di;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class BaseApplication extends DaggerApplication {


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerCryptoCompareComponent.builder().application(this).build();
    }
}

