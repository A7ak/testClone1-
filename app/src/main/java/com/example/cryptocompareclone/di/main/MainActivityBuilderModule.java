package com.example.cryptocompareclone.di.main;

import com.example.cryptocompareclone.MainActivity;
import com.example.cryptocompareclone.di.news.NewsViewModelModule;
import com.example.cryptocompareclone.di.watchlist.WatchlistViewModelModule;
import com.example.cryptocompareclone.ui.watchlist.WatchlistViewModel;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityBuilderModule {

    @ContributesAndroidInjector(
            modules = {NewsViewModelModule.class,WatchlistViewModelModule.class, MainFragmentsBuilderModule.class}
    )
    abstract MainActivity contributeNewsFragment();

}