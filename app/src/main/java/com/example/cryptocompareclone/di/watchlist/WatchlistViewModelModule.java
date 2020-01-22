package com.example.cryptocompareclone.di.watchlist;

import androidx.lifecycle.ViewModel;

import com.example.cryptocompareclone.di.main.ViewModelKey;
import com.example.cryptocompareclone.ui.watchlist.WatchlistViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class WatchlistViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(value = WatchlistViewModel.class)
    public abstract ViewModel bindNewsViewModel(WatchlistViewModel newsViewModel);
}

