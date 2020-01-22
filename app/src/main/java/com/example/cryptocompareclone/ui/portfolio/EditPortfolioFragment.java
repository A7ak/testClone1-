package com.example.cryptocompareclone.ui.portfolio;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cryptocompareclone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EditPortfolioFragment extends Fragment {


    public EditPortfolioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_edit_portfolio, container, false);
        String[] currencyArray ={String.valueOf(R.array.currency_abbreviation)};

        RecyclerView currencyRecyclerView = rootView.findViewById(R.id.currency_unit_recycler_view);
        CurrencyAdapter currencyAdapter = new CurrencyAdapter(currencyArray);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(currencyRecyclerView
                .getContext(), RecyclerView.HORIZONTAL,false);
        currencyRecyclerView.setAdapter(currencyAdapter);
        currencyRecyclerView.setLayoutManager(linearLayoutManager);

/*
        WatchlistAdapter adapter = new WatchlistAdapter(WatchListFragment.this);
        adapter.setCoinData(currencyResponsePage.getData());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(recyclerView.getContext(),
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
  */
    return rootView;
    }

}
