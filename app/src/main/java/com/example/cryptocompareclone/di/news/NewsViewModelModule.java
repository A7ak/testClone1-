package com.example.cryptocompareclone.di.news;

import androidx.lifecycle.ViewModel;

import com.example.cryptocompareclone.di.main.ViewModelKey;
import com.example.cryptocompareclone.ui.news.NewsViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

 @Module
public abstract class NewsViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(value = NewsViewModel.class)
    public abstract ViewModel bindNewsViewModel(NewsViewModel newsViewModel);
}
