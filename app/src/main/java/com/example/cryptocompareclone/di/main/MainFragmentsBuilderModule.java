package com.example.cryptocompareclone.di.main;

import com.example.cryptocompareclone.ui.news.NewsFragment;
import com.example.cryptocompareclone.ui.watchlist.WatchListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentsBuilderModule {

    @ContributesAndroidInjector
    abstract NewsFragment contributeNewsFragment();
    @ContributesAndroidInjector
    abstract WatchListFragment contibuteWatchlistFragment();
}
