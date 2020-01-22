package com.example.cryptocompareclone.ui.watchlist;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocompareclone.R;
import com.example.cryptocompareclone.di.application.ViewModelProviderFactory;
import com.example.cryptocompareclone.models.watchlist.CurrencyResponsePage;
import com.example.cryptocompareclone.models.watchlist.Datum;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

public class WatchListFragment extends DaggerFragment implements WatchlistAdapter.WatchlistAdapterInterface {

    private WatchlistViewModel watchlistViewModel;

    @Inject
    ViewModelProviderFactory viewModelProviderFactory;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_watchlist, container, false);

        final RecyclerView recyclerView = rootView.findViewById(R.id.watchlist_recyclerview);
        watchlistViewModel = ViewModelProviders.of(this, viewModelProviderFactory)
                .get(WatchlistViewModel.class);
        watchlistViewModel.getCurrencyResponse();
        watchlistViewModel.observeCurrencyResponse().observe(this,
                new Observer<CurrencyResponsePage>() {
            @Override
            public void onChanged(CurrencyResponsePage currencyResponsePage) {
                if (currencyResponsePage != null) {
                    Log.d("tag", "" + currencyResponsePage.getData().get(0).getCoinInfo().getName());
                    WatchlistAdapter adapter = new WatchlistAdapter(WatchListFragment.this);
                    adapter.setCoinData(currencyResponsePage.getData());
                    recyclerView.setAdapter(adapter);
                    LinearLayoutManager manager = new LinearLayoutManager(recyclerView.getContext(), LinearLayoutManager.VERTICAL, false);
                    recyclerView.setLayoutManager(manager);
                } else {
                    Log.d("tag", "null");
                }
            }
        });
        return rootView;
    }

    @Override
    public void goToCoinDetail(Datum datum) {
        Intent intent = new Intent(getActivity(), WatchlistDetailActivity.class);
        intent.putExtra("datum", (Parcelable) datum);
        startActivity(intent);
    }
}