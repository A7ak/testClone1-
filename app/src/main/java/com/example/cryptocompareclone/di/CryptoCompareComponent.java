package com.example.cryptocompareclone.di;

import android.app.Application;

import com.example.cryptocompareclone.di.main.MainActivityBuilderModule;
import com.example.cryptocompareclone.di.application.ViewModelFactoryModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                CryptoCompareModule.class,
                MainActivityBuilderModule.class,
                ViewModelFactoryModule.class,
        }
)
public interface CryptoCompareComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        CryptoCompareComponent build();
    }
}
