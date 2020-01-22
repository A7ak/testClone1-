package com.example.cryptocompareclone.ui.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocompareclone.R;
import com.example.cryptocompareclone.di.application.ViewModelProviderFactory;
import com.example.cryptocompareclone.models.news.LatestNewsArticleResponsePage;
import com.example.cryptocompareclone.ui.SettingsActivity;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

//import androidx.lifecycle.ViewModelProviders;

public class NewsFragment extends DaggerFragment implements NewsAdapter.NewsInterface {


    private NewsViewModel newsViewModel;
    @Inject
    ViewModelProviderFactory viewModelProviderFactory;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_news, container, false);
        final RecyclerView newsRecyclerView = rootView.findViewById(R.id.recycler_view_news);


        newsViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(NewsViewModel.class);

        newsViewModel.getNewsResponseInPage(1);
        newsViewModel.observeLatestNews().observe(this, new Observer<LatestNewsArticleResponsePage>() {
            @Override
            public void onChanged(LatestNewsArticleResponsePage latestNewsArticleResponsePage) {
                NewsAdapter adapter = new NewsAdapter(NewsFragment.this);
                adapter.setAdapterData(latestNewsArticleResponsePage.getData());
                newsRecyclerView.setAdapter(adapter);
                LinearLayoutManager manager = new LinearLayoutManager(newsRecyclerView.getContext()
                        , LinearLayoutManager.VERTICAL, false);
                newsRecyclerView.setLayoutManager(manager);
            }
        });


        ImageView user = rootView.findViewById(R.id.user);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SettingsActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }


    @Override
    public void goToNewsPage(String newsUrl) {
        Intent intent = new Intent(getActivity(), NewsDetailActivity.class);
        intent.putExtra(NewsDetailActivity.NEWS_URL, newsUrl);
        startActivity(intent);


    }
}